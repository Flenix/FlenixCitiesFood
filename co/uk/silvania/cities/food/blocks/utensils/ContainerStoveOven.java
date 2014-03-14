package co.uk.silvania.cities.food.blocks.utensils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class ContainerStoveOven extends Container {
	
	private StoveEntity te;
	private IInventory stoveInventory;

	public ContainerStoveOven(InventoryPlayer inventory, StoveEntity tileEntity) {
		this.te = tileEntity;
		int x = 0;
		int y = 0;
		addSlotToContainer(new Slot(tileEntity, 0, x, y));
		//addSlotToContainer(new Slot(tileEntity, 1, x, y));
		//addSlotToContainer(new Slot(tileEntity, 2, x, y));
		//addSlotToContainer(new Slot(tileEntity, 3, x, y));
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return false;
	}

}
