package co.uk.silvania.cities.food.blocks.utensils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import co.uk.silvania.cities.food.util.IFlenixFoods;
import co.uk.silvania.cities.food.util.IHobUtensil;
import co.uk.silvania.cities.food.util.IOvenUtensil;

public class ContainerStoveHob extends Container {
	
	private IInventory stoveInventory;

	public ContainerStoveHob(InventoryPlayer invPlayer, StoveEntity tileEntity) {
		int hobOffset = 0;
		int stoveOffset = 0;

		addSlotToContainer(new SlotFuel(tileEntity, 0, 21, 117)); //Fuel
		addSlotToContainer(new SlotUtensilHob(tileEntity, 1, 71, 41)); //Hob 1
		addSlotToContainer(new SlotUtensilHob(tileEntity, 2, 115, 41)); //Hob 2
		addSlotToContainer(new SlotUtensilHob(tileEntity, 3, 71, 85)); //Hob 3
		addSlotToContainer(new SlotUtensilHob(tileEntity, 4, 115, 85)); //Hob 4
		addSlotToContainer(new SlotFood(tileEntity, 5, 8, 32, 4)); //Hob 1 Slots 1-6
		addSlotToContainer(new SlotFood(tileEntity, 6, 26, 32, 4));
		addSlotToContainer(new SlotFood(tileEntity, 7, 44, 32, 4));
		addSlotToContainer(new SlotFood(tileEntity, 8, 8, 300, 4));
		addSlotToContainer(new SlotFood(tileEntity, 9, 26, 300, 4));
		addSlotToContainer(new SlotFood(tileEntity, 10, 44, 300, 4));
		addSlotToContainer(new SlotFood(tileEntity, 11, 142, 32, 5)); //Hob 2 Slots 1-6
		addSlotToContainer(new SlotFood(tileEntity, 12, 160, 32, 5));
		addSlotToContainer(new SlotFood(tileEntity, 13, 178, 32, 5));
		addSlotToContainer(new SlotFood(tileEntity, 14, 142, 300, 5));
		addSlotToContainer(new SlotFood(tileEntity, 15, 160, 300, 5));
		addSlotToContainer(new SlotFood(tileEntity, 16, 178, 300, 5));
		addSlotToContainer(new SlotFood(tileEntity, 17, 8, 76, 6)); //Hob 3 Slots 1-6
		addSlotToContainer(new SlotFood(tileEntity, 18, 26, 76, 6));
		addSlotToContainer(new SlotFood(tileEntity, 19, 44, 76, 6));
		addSlotToContainer(new SlotFood(tileEntity, 20, 8, 94, 6));
		addSlotToContainer(new SlotFood(tileEntity, 21, 26, 94, 6));
		addSlotToContainer(new SlotFood(tileEntity, 22, 44, 94, 6));
		addSlotToContainer(new SlotFood(tileEntity, 23, 142, 76, 7)); //Hob 4 Slots 1-6
		addSlotToContainer(new SlotFood(tileEntity, 24, 160, 76, 7));
		addSlotToContainer(new SlotFood(tileEntity, 25, 178, 76, 7));
		addSlotToContainer(new SlotFood(tileEntity, 26, 142, 94, 7));
		addSlotToContainer(new SlotFood(tileEntity, 27, 160, 94, 7));
		addSlotToContainer(new SlotFood(tileEntity, 28, 178, 94, 7));
		
		/*addSlotToContainer(new SlotUtensilOven(tileEntity, 29, 	0, 0)); //Grill
		addSlotToContainer(new SlotUtensilOven(tileEntity, 30,	0, 0)); //Oven 1
		addSlotToContainer(new SlotUtensilOven(tileEntity, 31, 	0, 0)); //Oven 2
		addSlotToContainer(new SlotFood(tileEntity, 32, 41, 	0, 0)); //Grill Slot 1
		addSlotToContainer(new SlotFood(tileEntity, 33, 59, 	0, 0)); //Grill Slot 2
		addSlotToContainer(new SlotFood(tileEntity, 34, 77, 	0, 0)); //Grill Slot 3
		addSlotToContainer(new SlotFood(tileEntity, 35, 95, 	0, 0)); //Grill Slot 4
		addSlotToContainer(new SlotFood(tileEntity, 36, 113, 	0, 0)); //Grill Slot 5
		addSlotToContainer(new SlotFood(tileEntity, 37, 131, 	0, 0)); //Grill Slot 6
		addSlotToContainer(new SlotFood(tileEntity, 38, 41, 	0, 0)); //Oven 1 Slot 1
		addSlotToContainer(new SlotFood(tileEntity, 39, 59, 	0, 0)); //Oven 1 Slot 2
		addSlotToContainer(new SlotFood(tileEntity, 40, 77, 	0, 0)); //Oven 1 Slot 3
		addSlotToContainer(new SlotFood(tileEntity, 41, 95, 	0, 0)); //Oven 1 Slot 4
		addSlotToContainer(new SlotFood(tileEntity, 42, 113, 	0, 0)); //Oven 1 Slot 5
		addSlotToContainer(new SlotFood(tileEntity, 43, 131, 	0, 0)); //Oven 1 Slot 6
		addSlotToContainer(new SlotFood(tileEntity, 44, 41, 	0, 0)); //Oven 2 Slot 1
		addSlotToContainer(new SlotFood(tileEntity, 45, 59, 	0, 0)); //Oven 2 Slot 2
		addSlotToContainer(new SlotFood(tileEntity, 46, 77, 	0, 0)); //Oven 2 Slot 3
		addSlotToContainer(new SlotFood(tileEntity, 47, 95, 	0, 0)); //Oven 2 Slot 4
		addSlotToContainer(new SlotFood(tileEntity, 48, 113, 	0, 0)); //Oven 2 Slot 5
		addSlotToContainer(new SlotFood(tileEntity, 49, 131, 	0, 0)); //Oven 2 Slot 6*/
		
		//Player inventory
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 21 + j * 18, 138 + i * 18));
			}
		}

		for (int i = 0; i < 9; ++i) {
			this.addSlotToContainer(new Slot(invPlayer, i, 21 + i * 18, 198));
		}
		
	}


	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		System.out.println("### SLOT " + slot + " ###");
		ItemStack item = null;
		Slot slotObject = (Slot) this.inventorySlots.get(slot);
		
		Slot hob1 = (Slot) this.inventorySlots.get(1);
		Slot hob2 = (Slot) this.inventorySlots.get(2);
		Slot hob3 = (Slot) this.inventorySlots.get(3);
		Slot hob4 = (Slot) this.inventorySlots.get(4);
		
		
		int hobStart = 0;
		int hobEnd = 28;
		int invStart = 29;
		
		if (slotObject != null && slotObject.getHasStack()) {
			ItemStack stackInSlot = slotObject.getStack();
			item = stackInSlot.copy();
			
			//Moving items from stove to inventory.
			if (slot < invStart) {
				if (!this.mergeItemStack(stackInSlot, invStart, invStart + 36, true)) {
					return null;
				}
				
				slotObject.onSlotChange(stackInSlot, item);
			} else {
				//Slot is player inventory. Lets figure out where we should put it.
				if (stackInSlot.getItem() instanceof IHobUtensil) {
					if (!this.mergeItemStack(stackInSlot, 1, 4, false)) {
						return null;
					}
				}
				if (TileEntityFurnace.isItemFuel(stackInSlot)) {
					if (!this.mergeItemStack(stackInSlot, 0, 0, false)) {
						return null;
					}
				}
				/*if (stackInSlot.getItem() instanceof IOvenUtensil) {
					if (!this.mergeItemStack(stackInSlot, 29, 31, false)) {
						return null;
					}
				}*/
				if (hob1 != null && hob1.getStack().getItem() instanceof IHobUtensil) {
					if (stackInSlot.getItem() instanceof IFlenixFoods) {
						if (!this.mergeItemStack(stackInSlot, 5, 10, false)) {
							return null;
						}
					}
				}
				if (hob2 != null && hob2.getStack().getItem() instanceof IHobUtensil) {
					if (stackInSlot.getItem() instanceof IFlenixFoods) {
						if (!this.mergeItemStack(stackInSlot, 11, 16, false)) {
							return null;
						}
					}
				}
				if (hob3 != null && hob3.getStack().getItem() instanceof IHobUtensil) {
					if (stackInSlot.getItem() instanceof IFlenixFoods) {
						if (!this.mergeItemStack(stackInSlot, 17, 22, false)) {
							return null;
						}
					}
				}
				if (hob4 != null && hob4.getStack().getItem() instanceof IHobUtensil) {
					if (stackInSlot.getItem() instanceof IFlenixFoods) {
						if (!this.mergeItemStack(stackInSlot, 23, 28, false)) {
							return null;
						}
					}
				}

				return null;
			}
			
			if (stackInSlot.stackSize == 0) {
				slotObject.putStack(null);
			} else {
				slotObject.onSlotChanged();
			}

			if (stackInSlot.stackSize == item.stackSize) {
				return null;
			}
			slotObject.onPickupFromSlot(player, stackInSlot);
		}
		return item;
	}
	
	@Override
	public void putStackInSlot(int slot, ItemStack item) {
		this.getSlot(slot).putStack(item);
	}
	
	public IInventory getStoveInventory() {
		return this.stoveInventory;
	}

}
