package co.uk.silvania.cities.food.blocks.render;

import org.lwjgl.opengl.GL11;

import co.uk.silvania.cities.food.client.model.GlassFridgeModel;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;

public class FridgeItemRender implements IItemRenderer {

	private final GlassFridgeModel model;
	
	public FridgeItemRender() {
		this.model = new GlassFridgeModel();
	}

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
            switch (type)
            {
            case ENTITY:
                    renderEngine(-0.5F, 0F, -0.5F, 1.2F, item.getItemDamage());
                    return;
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            case FIRST_PERSON_MAP:
            case INVENTORY:
                    renderEngine(0F, 0F, 0F, 1F, item.getItemDamage());
                    return;
            default:
                    return;
            }
    }
   
    private void renderEngine(float x, float y, float z, float scale, int subtype)
    {
            GL11.glPushMatrix();
            GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_CULL_FACE);
            GL11.glColor3f(0.7F, 0.5F, 0.7F);

            GL11.glTranslatef((float) x, (float) y, (float) z);
            GL11.glScalef(scale, scale, scale);

            float factor = (float) (1.0 / 16.0);
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("fc_food", "textures/entities/glassfridge.png"));

            GL11.glPopAttrib();
            GL11.glPopMatrix();
    }
}