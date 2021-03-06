package co.uk.silvania.cities.food.blocks;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;


public class GuiVendingMachine extends GuiContainer {
	
    private static final ResourceLocation texture = new ResourceLocation("fc_food", "textures/gui/vendingmachine.png");

        public GuiVendingMachine (InventoryPlayer inventoryPlayer, TileEntityVendingMachine tileEntity, World world, int x, int y, int z) {
        	super(new ContainerVendingMachine(inventoryPlayer, tileEntity));
        }
        
        protected int xSize = 92;
        protected int ySize = 166;

        @Override
        protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        	fontRendererObj.drawString("Vending Machine", 48, 5, 4210752);
        	fontRendererObj.drawString("This is WIP!", 48, 145, 4210752);
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