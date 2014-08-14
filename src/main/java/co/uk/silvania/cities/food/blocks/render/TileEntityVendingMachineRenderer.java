package co.uk.silvania.cities.food.blocks.render;

import org.lwjgl.opengl.GL11;

import co.uk.silvania.cities.food.client.model.VendingMachineModel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityVendingMachineRenderer extends TileEntitySpecialRenderer {
	
	private VendingMachineModel model;
		
	public TileEntityVendingMachineRenderer() {
		this.model = new VendingMachineModel();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale)
	{
	    int rotation = 180;
	    switch(te.getBlockMetadata() % 4) {
	        case 0:
	            rotation = 180;
	            break;
	        case 3:
	            rotation = 270;
	            break;
	        case 2:
	            rotation = 0;
	            break;
	        case 1:
	            rotation = 90;
	            break;
	    }
		
		GL11.glPushMatrix();
		int i = te.getBlockMetadata();
		if (i == 0 || i == 1 || i == 2 || i == 3) {
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("fc_food", "textures/entities/vending1.png"));
		}
		if (i == 4 || i == 5 || i == 6 || i == 7) {
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("fc_food", "textures/entities/vending2.png"));
		}
		if (i == 8 || i == 9 || i == 10 || i == 11) {
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("fc_food", "textures/entities/vending3.png"));
		}
		if (i == 12 || i == 13 || i == 14 || i == 15) {
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("fc_food", "textures/entities/vending4.png"));
		}
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);
		//GL11.glRotatef(((TileEntityBarrierEntity)tile).getRotationPivot()), 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}