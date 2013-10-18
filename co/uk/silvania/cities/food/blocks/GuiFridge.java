package co.uk.silvania.cities.food.blocks;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class GuiFridge extends GuiContainer {
	
    private static final ResourceLocation texture = new ResourceLocation("fc_food", "textures/gui/fridgegui.png");

        public GuiFridge (InventoryPlayer inventoryPlayer, TileEntityFridge tileEntity, World world, int x, int y, int z) {
        	super(new ContainerFridge(inventoryPlayer, tileEntity));
        }
        
        protected int xSize = 176;
        protected int ySize = 164;

        @Override
        protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        	fontRenderer.drawString("Fridge", 8, 6, 4210752);
        	fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, 73, 4210752);
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.mc.getTextureManager().bindTexture(texture);
                int x = (width - xSize) / 2;
                int y = (height - ySize) / 2;
                this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
        }
}