package co.uk.silvania.cities.food.blocks.utensils;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerStoveOven extends Container {

	public ContainerStoveOven(InventoryPlayer inventory, StoveEntity tileEntity) {
		int x = 0;
		int y = 0;
		System.out.println("Screen: " + Minecraft.getMinecraft().currentScreen);
		addSlotToContainer(new Slot(tileEntity, 36, x, y)); //Grill
		addSlotToContainer(new Slot(tileEntity, 37, x, y)); //Grill Slot 1
		addSlotToContainer(new Slot(tileEntity, 38, x, y)); //Grill Slot 2
		addSlotToContainer(new Slot(tileEntity, 39, x, y)); //Grill Slot 3
		addSlotToContainer(new Slot(tileEntity, 40, x, y)); //Grill Slot 4
		addSlotToContainer(new Slot(tileEntity, 41, x, y)); //Grill Slot 5
		addSlotToContainer(new Slot(tileEntity, 42, x, y)); //Grill Slot 6
		addSlotToContainer(new Slot(tileEntity, 43, x, y)); //Oven 1
		addSlotToContainer(new Slot(tileEntity, 44, x, y)); //Oven 1 Slot 1
		addSlotToContainer(new Slot(tileEntity, 45, x, y)); //Oven 1 Slot 2
		addSlotToContainer(new Slot(tileEntity, 46, x, y)); //Oven 1 Slot 3
		addSlotToContainer(new Slot(tileEntity, 47, x, y)); //Oven 1 Slot 4
		addSlotToContainer(new Slot(tileEntity, 48, x, y)); //Oven 1 Slot 5
		addSlotToContainer(new Slot(tileEntity, 49, x, y)); //Oven 1 Slot 6
		addSlotToContainer(new Slot(tileEntity, 50, x, y)); //Oven 2
		addSlotToContainer(new Slot(tileEntity, 51, x, y)); //Oven 2 Slot 1
		addSlotToContainer(new Slot(tileEntity, 52, x, y)); //Oven 2 Slot 2
		addSlotToContainer(new Slot(tileEntity, 53, x, y)); //Oven 2 Slot 3
		addSlotToContainer(new Slot(tileEntity, 54, x, y)); //Oven 2 Slot 4
		addSlotToContainer(new Slot(tileEntity, 55, x, y)); //Oven 2 Slot 5
		addSlotToContainer(new Slot(tileEntity, 56, x, y)); //Oven 2 Slot 6
		addSlotToContainer(new Slot(tileEntity, 57, x, y)); //Grill output
		addSlotToContainer(new Slot(tileEntity, 58, x, y)); //Oven 1 output
		addSlotToContainer(new Slot(tileEntity, 59, x, y)); //Oven 2 output
		//addSlotToContainer(new Slot(tileEntity, 1, x, y));
		//addSlotToContainer(new Slot(tileEntity, 2, x, y));
		//addSlotToContainer(new Slot(tileEntity, 3, x, y));
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return false;
	}

}
