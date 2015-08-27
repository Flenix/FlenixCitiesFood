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
	
	public StoveEntity te;
	private IInventory stoveInventory;

	public ContainerStoveHob(InventoryPlayer invPlayer, StoveEntity tileEntity) {
		te = tileEntity;

		addSlotToContainer(new SlotFuel(te, 0, 21, 117)); //Fuel
		addSlotToContainer(new SlotUtensilHob(te, 1, 71, 41)); //Hob 1
		addSlotToContainer(new SlotUtensilHob(te, 2, 115, 41)); //Hob 2
		addSlotToContainer(new SlotUtensilHob(te, 3, 71, 85)); //Hob 3
		addSlotToContainer(new SlotUtensilHob(te, 4, 115, 85)); //Hob 4
		addSlotToContainer(new SlotFood(te, 5, 8, 32, 1)); //Hob 1 Slots 1-6
		addSlotToContainer(new SlotFood(te, 6, 26, 32, 1));
		addSlotToContainer(new SlotFood(te, 7, 44, 32, 1));
		addSlotToContainer(new SlotFood(te, 8, 8, 50, 1));
		addSlotToContainer(new SlotFood(te, 9, 26, 50, 1));
		addSlotToContainer(new SlotFood(te, 10, 44, 50, 1));
		addSlotToContainer(new SlotFood(te, 11, 142, 32, 2)); //Hob 2 Slots 1-6
		addSlotToContainer(new SlotFood(te, 12, 160, 32, 2));
		addSlotToContainer(new SlotFood(te, 13, 178, 32, 2));
		addSlotToContainer(new SlotFood(te, 14, 142, 50, 2));
		addSlotToContainer(new SlotFood(te, 15, 160, 50, 2));
		addSlotToContainer(new SlotFood(te, 16, 178, 50, 2));
		addSlotToContainer(new SlotFood(te, 17, 8, 76, 3)); //Hob 3 Slots 1-6
		addSlotToContainer(new SlotFood(te, 18, 26, 76, 3));
		addSlotToContainer(new SlotFood(te, 19, 44, 76, 3));
		addSlotToContainer(new SlotFood(te, 20, 8, 94, 3));
		addSlotToContainer(new SlotFood(te, 21, 26, 94, 3));
		addSlotToContainer(new SlotFood(te, 22, 44, 94, 3));
		addSlotToContainer(new SlotFood(te, 23, 142, 76, 4)); //Hob 4 Slots 1-6
		addSlotToContainer(new SlotFood(te, 24, 160, 76, 4));
		addSlotToContainer(new SlotFood(te, 25, 178, 76, 4));
		addSlotToContainer(new SlotFood(te, 26, 142, 94, 4));
		addSlotToContainer(new SlotFood(te, 27, 160, 94, 4));
		addSlotToContainer(new SlotFood(te, 28, 178, 94, 4));
		
		/*addSlotToContainer(new SlotUtensilOven(te, 29, 	0, 0)); //Grill
		addSlotToContainer(new SlotUtensilOven(te, 30,	0, 0)); //Oven 1
		addSlotToContainer(new SlotUtensilOven(te, 31, 	0, 0)); //Oven 2
		addSlotToContainer(new SlotFood(te, 32, 41, 	0, 0)); //Grill Slot 1
		addSlotToContainer(new SlotFood(te, 33, 59, 	0, 0)); //Grill Slot 2
		addSlotToContainer(new SlotFood(te, 34, 77, 	0, 0)); //Grill Slot 3
		addSlotToContainer(new SlotFood(te, 35, 95, 	0, 0)); //Grill Slot 4
		addSlotToContainer(new SlotFood(te, 36, 113, 	0, 0)); //Grill Slot 5
		addSlotToContainer(new SlotFood(te, 37, 131, 	0, 0)); //Grill Slot 6
		addSlotToContainer(new SlotFood(te, 38, 41, 	0, 0)); //Oven 1 Slot 1
		addSlotToContainer(new SlotFood(te, 39, 59, 	0, 0)); //Oven 1 Slot 2
		addSlotToContainer(new SlotFood(te, 40, 77, 	0, 0)); //Oven 1 Slot 3
		addSlotToContainer(new SlotFood(te, 41, 95, 	0, 0)); //Oven 1 Slot 4
		addSlotToContainer(new SlotFood(te, 42, 113, 	0, 0)); //Oven 1 Slot 5
		addSlotToContainer(new SlotFood(te, 43, 131, 	0, 0)); //Oven 1 Slot 6
		addSlotToContainer(new SlotFood(te, 44, 41, 	0, 0)); //Oven 2 Slot 1
		addSlotToContainer(new SlotFood(te, 45, 59, 	0, 0)); //Oven 2 Slot 2
		addSlotToContainer(new SlotFood(te, 46, 77, 	0, 0)); //Oven 2 Slot 3
		addSlotToContainer(new SlotFood(te, 47, 95, 	0, 0)); //Oven 2 Slot 4
		addSlotToContainer(new SlotFood(te, 48, 113, 	0, 0)); //Oven 2 Slot 5
		addSlotToContainer(new SlotFood(te, 49, 131, 	0, 0)); //Oven 2 Slot 6*/
		
		//Player inventory
		bindPlayerInventory(invPlayer);
		
	}
	
	protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 9; j++) {
        		addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 21 + j * 18, 140 + i * 18));
        	}
        }

        for (int i = 0; i < 9; i++) {
        	addSlotToContainer(new Slot(inventoryPlayer, i, 21 + i * 18, 198));
        }
	}


	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return te.isUseableByPlayer(player);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		return null;
		/*ItemStack stack = null;
		Slot slotObject = (Slot) inventorySlots.get(slot);

		//null checks and checks if the item can be stacked (maxStackSize > 1)
		if (slotObject != null && slotObject.getHasStack()) {
            ItemStack stackInSlot = slotObject.getStack();
            stack = stackInSlot.copy();
            
            //Container slots + 1. IMPORTANT!
            int invStart = te.invSize + 1;

            //merges the item into player inventory since its in the tileEntity
            if (slot < invStart) {
            	if (!this.mergeItemStack(stackInSlot, invStart, invStart + 36, true)) {
            		return null;
            	}
            }
            //places it into the tileEntity is possible since its in the player inventory
            else if (!this.mergeItemStack(stackInSlot, 0, invStart - 1, false)) {
            	return null;
            }

            if (stackInSlot.stackSize == 0) {
                slotObject.putStack(null);
	        } else {
	        	slotObject.onSlotChanged();
	        }
	
	        if (stackInSlot.stackSize == stack.stackSize) {
	        	return null;
	        }
	        slotObject.onPickupFromSlot(player, stackInSlot);
			}
		return stack;
		/*System.out.println("### SLOT " + slot + " ###");
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
				}*//*
				if (hob1.getHasStack()) {
					if (hob1.getStack().getItem() instanceof IHobUtensil) {
						if (stackInSlot.getItem() instanceof IFlenixFoods) {
							if (!this.mergeItemStack(stackInSlot, 5, 10, false)) {
								return null;
							}
						}
					}
				}
				if (hob2.getHasStack()) {
					if (hob2.getStack().getItem() instanceof IHobUtensil) {
						if (stackInSlot.getItem() instanceof IFlenixFoods) {
							if (!this.mergeItemStack(stackInSlot, 11, 16, false)) {
								return null;
							}
						}
					}
				}
				if (hob3.getHasStack()) {
					if (hob3.getStack().getItem() instanceof IHobUtensil) {
						if (stackInSlot.getItem() instanceof IFlenixFoods) {
							if (!this.mergeItemStack(stackInSlot, 17, 22, false)) {
								return null;
							}
						}
					}
				}
				if (hob4.getHasStack()) {
					if (hob4.getStack().getItem() instanceof IHobUtensil) {
						if (stackInSlot.getItem() instanceof IFlenixFoods) {
							if (!this.mergeItemStack(stackInSlot, 23, 28, false)) {
								return null;
							}
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
		return item;*/
	}
	
	@Override
	public void putStackInSlot(int slot, ItemStack item) {
		this.getSlot(slot).putStack(item);
	}
	
	public IInventory getStoveInventory() {
		return this.stoveInventory;
	}

}
