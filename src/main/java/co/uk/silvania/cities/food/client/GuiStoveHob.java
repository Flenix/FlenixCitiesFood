package co.uk.silvania.cities.food.client;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import co.uk.silvania.cities.core.CityConfig;
import co.uk.silvania.cities.econ.store.container.InvisibleButton;
import co.uk.silvania.cities.food.FlenixCities_Food;
import co.uk.silvania.cities.food.blocks.utensils.ContainerStoveHob;
import co.uk.silvania.cities.food.blocks.utensils.StoveEntity;
import co.uk.silvania.cities.food.network.StovePacket;

public class GuiStoveHob extends GuiContainer {
	
	private static final ResourceLocation texture = new ResourceLocation("fc_food", "textures/gui/stovehobgui.png");
	
	public int hob1Temp = 120;
	public int hob2Temp = 120;
	public int hob3Temp = 120;
	public int hob4Temp = 120;
	
	public int fuelLevel;
	
	private final StoveEntity stoveEntity;

	public GuiStoveHob(InventoryPlayer invPlayer, StoveEntity te) {
		super(new ContainerStoveHob(invPlayer, te));
		stoveEntity = te;
		
		xSize = 202;
		ySize = 222;
		
		hob1Temp = te.hob1Setting;
		hob2Temp = te.hob2Setting;
		hob3Temp = te.hob3Setting;
		hob4Temp = te.hob4Setting;
		
		fuelLevel = te.fuelValue;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void initGui() {
		super.initGui();
		buttonList.add(new InvisibleButton(1, guiLeft + 54, guiTop + 9, 10, 16, "-"));
		buttonList.add(new InvisibleButton(2, guiLeft + 90, guiTop + 9, 10, 16, "+"));
		buttonList.add(new InvisibleButton(3, guiLeft + 102, guiTop + 9, 10, 16, "-"));
		buttonList.add(new InvisibleButton(4, guiLeft + 138, guiTop + 9, 10, 16, "+"));
		buttonList.add(new InvisibleButton(5, guiLeft + 54, guiTop + 117, 10, 16, "-"));
		buttonList.add(new InvisibleButton(6, guiLeft + 90, guiTop + 117, 10, 16, "+"));
		buttonList.add(new InvisibleButton(7, guiLeft + 102, guiTop + 117, 10, 16, "-"));
		buttonList.add(new InvisibleButton(8, guiLeft + 138, guiTop + 117, 10, 16, "+"));
	}
	
	public void actionPerformed(GuiButton button) {
		switch(button.id) {
		case 1:
			if (!(hob1Temp <= 120)) {
				hob1Temp = hob1Temp - 10;
			}
			updateTileEntity();
			break;
		case 2:
			if (!(hob1Temp >= 360)) {
				hob1Temp = hob1Temp + 10;
			}
			updateTileEntity();
			break;
		case 3:
			if (!(hob2Temp <= 120)) {
				hob2Temp = hob2Temp - 10;
			}
			updateTileEntity();
			break;
		case 4:
			if (!(hob2Temp >= 360)) {
				hob2Temp = hob2Temp + 10;
			}
			updateTileEntity();
			break;
		case 5:
			if (!(hob3Temp <= 120)) {
				hob3Temp = hob3Temp - 10;
			}
			updateTileEntity();
			break;
		case 6:
			if (!(hob3Temp >= 360)) {
				hob3Temp = hob3Temp + 10;
			}
			updateTileEntity();
			break;
		case 7:
			if (!(hob4Temp <= 120)) {
				hob4Temp = hob4Temp - 10;
			}
			updateTileEntity();
			break;
		case 8:
			if (!(hob4Temp >= 360)) {
				hob4Temp = hob4Temp + 10;
			}
			updateTileEntity();
			break;
		}
	}
	
	public void updateTileEntity() {
		FlenixCities_Food.network.sendToServer(new StovePacket(hob1Temp, hob2Temp, hob3Temp, hob4Temp));
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_LIGHTING);
		int val = Math.round(stoveEntity.getFuelValue() / 412);
		if (val > 97) { val = 97; }
		//drawTexturedModalRect(9, 117, 202, 0, 5, 97);
		drawTexturedModalRect(9, 117 + 97 - val, 202, 97 - val, 5, val);
		GL11.glPopMatrix();
		
		fontRendererObj.drawString("Stove", 5, 5, 4210752);
		fontRendererObj.drawString("" + hob1Temp + "c", 66, 13, 4210752);
		fontRendererObj.drawString("" + hob2Temp + "c", 114, 13, 4210752);
		fontRendererObj.drawString("" + hob3Temp + "c", 66, 121, 4210752);
		fontRendererObj.drawString("" + hob4Temp + "c", 114, 121, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1, 1, 1, 1);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
