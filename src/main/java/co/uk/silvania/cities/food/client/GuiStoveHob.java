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
import co.uk.silvania.cities.food.blocks.utensils.ContainerStoveHob;
import co.uk.silvania.cities.food.blocks.utensils.StoveEntity;

public class GuiStoveHob extends GuiContainer {
	
	private static final ResourceLocation texture = new ResourceLocation("fc_food", "textures/gui/stovehobgui.png");
	
	public static int hob1Temp = 120;
	public static int hob2Temp = 120;
	public static int hob3Temp = 120;
	public static int hob4Temp = 120;

	public GuiStoveHob(InventoryPlayer invPlayer, StoveEntity te) {
		super(new ContainerStoveHob(invPlayer, te));
		
		xSize = 202;
		ySize = 222;
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
			break;
		case 2:
			if (!(hob1Temp >= 360)) {
				hob1Temp = hob1Temp + 10;
			}
		case 3:
			if (!(hob2Temp <= 120)) {
				hob2Temp = hob2Temp - 10;
			}
			break;
		case 4:
			if (!(hob2Temp >= 360)) {
				hob2Temp = hob2Temp + 10;
			}
		case 5:
			if (!(hob3Temp <= 120)) {
				hob3Temp = hob3Temp - 10;
			}
			break;
		case 6:
			if (!(hob3Temp >= 360)) {
				hob3Temp = hob3Temp + 10;
			}
		case 7:
			if (!(hob4Temp <= 120)) {
				hob4Temp = hob4Temp - 10;
			}
			break;
		case 8:
			if (!(hob4Temp >= 360)) {
				hob4Temp = hob4Temp + 10;
			}
		}
	}
	
	public void sendPacket() {
		ByteArrayOutputStream bt = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(bt);
		try {
			if (CityConfig.debugMode) {
				System.out.println("Sending Stove temperature values to server");
			}
			
			out.writeInt(hob1Temp);
			out.writeInt(hob2Temp);
			out.writeInt(hob3Temp);
			out.writeInt(hob4Temp);
					
			//TODO Packet250CustomPayload packet = new Packet250CustomPayload("FCStovePkt", bt.toByteArray());
			//TODO PacketDispatcher.sendPacketToServer(packet);
		} catch (IOException ex) {
			System.out.println("FCStovePacket Failed!");
		}
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
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
