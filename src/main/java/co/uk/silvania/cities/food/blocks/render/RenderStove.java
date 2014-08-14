package co.uk.silvania.cities.food.blocks.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import co.uk.silvania.cities.food.client.model.StoveModel;

public class RenderStove extends TileEntitySpecialRenderer {
		
	private final StoveModel model;
		
	public RenderStove() {
		this.model = new StoveModel();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
		int i = te.getBlockMetadata();
		int meta = 180;

		if (i == 0) {
			meta = 0;
		}

		if (i == 3) {
			meta = 90;
		}

		if (i == 2) {
			meta = 180;
		}

		if (i == 1) {
			meta = 270;
		}
		
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("fc_food", "textures/entities/StoveModel.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef(meta, 0.0F, 1.0F, 0.0F);
		//GL11.glRotatef(((TileEntityBarrierEntity)tile).getRotationPivot()), 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}