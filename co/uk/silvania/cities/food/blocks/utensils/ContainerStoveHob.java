package co.uk.silvania.cities.food.blocks.utensils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerStoveHob extends Container {
	
	private StoveEntity te;
	private IInventory stoveInventory;

	public ContainerStoveHob(InventoryPlayer invPlayer, StoveEntity tileEntity) {
		this.te = tileEntity;
		int x = 0;
		int y = 0;

		addSlotToContainer(new Slot(tileEntity, 0, 21, 117));
		addSlotToContainer(new Slot(tileEntity, 4, 71, 41)); //Hob 1
		addSlotToContainer(new Slot(tileEntity, 5, 115, 41)); //Hob 2
		addSlotToContainer(new Slot(tileEntity, 6, 71, 85)); //Hob 3
		addSlotToContainer(new Slot(tileEntity, 7, 115, 85)); //Hob 4
		addSlotToContainer(new Slot(tileEntity, 8, 8, 32)); //Hob 1 Slots 1-6
		addSlotToContainer(new Slot(tileEntity, 9, 26, 32));
		addSlotToContainer(new Slot(tileEntity, 10, 44, 32));
		addSlotToContainer(new Slot(tileEntity, 11, 8, 50));
		addSlotToContainer(new Slot(tileEntity, 12, 26, 50));
		addSlotToContainer(new Slot(tileEntity, 13, 44, 50));
		addSlotToContainer(new Slot(tileEntity, 14, 142, 32)); //Hob 2 Slots 1-6
		addSlotToContainer(new Slot(tileEntity, 15, 160, 32));
		addSlotToContainer(new Slot(tileEntity, 16, 178, 32));
		addSlotToContainer(new Slot(tileEntity, 17, 142, 50));
		addSlotToContainer(new Slot(tileEntity, 18, 160, 50));
		addSlotToContainer(new Slot(tileEntity, 19, 178, 50));
		addSlotToContainer(new Slot(tileEntity, 20, 8, 76)); //Hob 3 Slots 1-6
		addSlotToContainer(new Slot(tileEntity, 21, 26, 76));
		addSlotToContainer(new Slot(tileEntity, 22, 44, 76));
		addSlotToContainer(new Slot(tileEntity, 23, 8, 94));
		addSlotToContainer(new Slot(tileEntity, 24, 26, 94));
		addSlotToContainer(new Slot(tileEntity, 25, 44, 94));
		addSlotToContainer(new Slot(tileEntity, 26, 142, 76)); //Hob 4 Slots 1-6
		addSlotToContainer(new Slot(tileEntity, 27, 160, 76));
		addSlotToContainer(new Slot(tileEntity, 28, 178, 76));
		addSlotToContainer(new Slot(tileEntity, 29, 142, 94));
		addSlotToContainer(new Slot(tileEntity, 30, 160, 94));
		addSlotToContainer(new Slot(tileEntity, 31, 178, 94));
		bindPlayerInventory(invPlayer);

	}
	
	protected void bindPlayerInventory(InventoryPlayer invPlayer) {
		for (int c = 0; c < 3; c++) {
			for (int r = 0; r < 9; r++) {
				addSlotToContainer(new Slot(invPlayer, r + c * 9 + 9, 21 + r * 18, 140 + c * 18));
			}
		}
		
		for (int h = 0; h < 9; h++) {
			addSlotToContainer(new Slot(invPlayer, h, 21 + h * 18, 198));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		ItemStack stack = null;
		Slot slotObj = (Slot) inventorySlots.get(slot);
		
		if (slotObj != null && slotObj.getHasStack()) {
			ItemStack stackInSlot = slotObj.getStack();
			stack = stackInSlot.copy();
			
			if (slot < 9) {
				if (!this.mergeItemStack(stackInSlot, 9, 45, true)) {
					return null;
				}
			} else if (!(this.mergeItemStack(stackInSlot, 0, 9, false))) {
				return null;
			}
			
			if (stackInSlot.stackSize == 10) {
				slotObj.putStack(null);
			} else {
				slotObj.onSlotChanged();
			}
			if (stackInSlot.stackSize == stack.stackSize) {
				return null;
			}
			
			slotObj.onPickupFromSlot(player, stackInSlot);
		}
		return stack;
	}
	
	@Override
	public void putStackInSlot(int slot, ItemStack item) {
		this.getSlot(slot).putStack(item);
	}
	
	public IInventory getStoveInventory() {
		return this.stoveInventory;
	}

}
