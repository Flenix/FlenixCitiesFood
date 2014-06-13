package co.uk.silvania.cities.food.blocks.utensils;

import co.uk.silvania.cities.food.client.GuiStoveHob;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerStoveHob extends Container {
	
	private StoveEntity te;
	private IInventory stoveInventory;
	private GuiScreen screen;

	public ContainerStoveHob(InventoryPlayer invPlayer, StoveEntity tileEntity) {
		this.te = tileEntity;
		int x = 0;
		int y = 0;
		screen = Minecraft.getMinecraft().currentScreen;
		if (screen instanceof GuiStoveHob) {
			addSlotToContainer(new SlotFuel(tileEntity, 0, 21, 117)); //Fuel
			addSlotToContainer(new SlotUtensilHob(tileEntity, 4, 71, 41)); //Hob 1
			addSlotToContainer(new SlotUtensilHob(tileEntity, 5, 115, 41)); //Hob 2
			addSlotToContainer(new SlotUtensilHob(tileEntity, 6, 71, 85)); //Hob 3
			addSlotToContainer(new SlotUtensilHob(tileEntity, 7, 115, 85)); //Hob 4
			addSlotToContainer(new SlotFood(tileEntity, 8, 8, 32, 4)); //Hob 1 Slots 1-6
			addSlotToContainer(new SlotFood(tileEntity, 9, 26, 32, 4));
			addSlotToContainer(new SlotFood(tileEntity, 10, 44, 32, 4));
			addSlotToContainer(new SlotFood(tileEntity, 11, 8, 50, 4));
			addSlotToContainer(new SlotFood(tileEntity, 12, 26, 50, 4));
			addSlotToContainer(new SlotFood(tileEntity, 13, 44, 50, 4));
			addSlotToContainer(new SlotFood(tileEntity, 14, 142, 32, 5)); //Hob 2 Slots 1-6
			addSlotToContainer(new SlotFood(tileEntity, 15, 160, 32, 5));
			addSlotToContainer(new SlotFood(tileEntity, 16, 178, 32, 5));
			addSlotToContainer(new SlotFood(tileEntity, 17, 142, 50, 5));
			addSlotToContainer(new SlotFood(tileEntity, 18, 160, 50, 5));
			addSlotToContainer(new SlotFood(tileEntity, 19, 178, 50, 5));
			addSlotToContainer(new SlotFood(tileEntity, 20, 8, 76, 6)); //Hob 3 Slots 1-6
			addSlotToContainer(new SlotFood(tileEntity, 21, 26, 76, 6));
			addSlotToContainer(new SlotFood(tileEntity, 22, 44, 76, 6));
			addSlotToContainer(new SlotFood(tileEntity, 23, 8, 94, 6));
			addSlotToContainer(new SlotFood(tileEntity, 24, 26, 94, 6));
			addSlotToContainer(new SlotFood(tileEntity, 25, 44, 94, 6));
			addSlotToContainer(new SlotFood(tileEntity, 26, 142, 76, 7)); //Hob 4 Slots 1-6
			addSlotToContainer(new SlotFood(tileEntity, 27, 160, 76, 7));
			addSlotToContainer(new SlotFood(tileEntity, 28, 178, 76, 7));
			addSlotToContainer(new SlotFood(tileEntity, 29, 142, 94, 7));
			addSlotToContainer(new SlotFood(tileEntity, 30, 160, 94, 7));
			addSlotToContainer(new SlotFood(tileEntity, 31, 178, 94, 7));
		} else {
			addSlotToContainer(new SlotFuel(tileEntity, 0, 8, 125)); //Fuel
			addSlotToContainer(new SlotUtensilOven(tileEntity, 36, 86, 54)); //Grill
			addSlotToContainer(new SlotFood(tileEntity, 37, 41, 36, 36)); //Grill Slot 1
			addSlotToContainer(new SlotFood(tileEntity, 38, 59, 36, 36)); //Grill Slot 2
			addSlotToContainer(new SlotFood(tileEntity, 39, 77, 36, 36)); //Grill Slot 3
			addSlotToContainer(new SlotFood(tileEntity, 40, 95, 36, 36)); //Grill Slot 4
			addSlotToContainer(new SlotFood(tileEntity, 41, 113, 36, 36)); //Grill Slot 5
			addSlotToContainer(new SlotFood(tileEntity, 42, 131, 36, 36)); //Grill Slot 6
			addSlotToContainer(new SlotUtensilOven(tileEntity, 43, 86, 102)); //Oven 1
			addSlotToContainer(new SlotFood(tileEntity, 44, 41, 84, 43)); //Oven 1 Slot 1
			addSlotToContainer(new SlotFood(tileEntity, 45, 59, 84, 43)); //Oven 1 Slot 2
			addSlotToContainer(new SlotFood(tileEntity, 46, 77, 84, 43)); //Oven 1 Slot 3
			addSlotToContainer(new SlotFood(tileEntity, 47, 95, 84, 43)); //Oven 1 Slot 4
			addSlotToContainer(new SlotFood(tileEntity, 48, 113, 84, 43)); //Oven 1 Slot 5
			addSlotToContainer(new SlotFood(tileEntity, 49, 131, 84, 43)); //Oven 1 Slot 6
			addSlotToContainer(new SlotUtensilOven(tileEntity, 50, 86, 142)); //Oven 2
			addSlotToContainer(new SlotFood(tileEntity, 51, 41, 124, 50)); //Oven 2 Slot 1
			addSlotToContainer(new SlotFood(tileEntity, 52, 59, 124, 50)); //Oven 2 Slot 2
			addSlotToContainer(new SlotFood(tileEntity, 53, 77, 124, 50)); //Oven 2 Slot 3
			addSlotToContainer(new SlotFood(tileEntity, 54, 95, 124, 50)); //Oven 2 Slot 4
			addSlotToContainer(new SlotFood(tileEntity, 55, 113, 124, 50)); //Oven 2 Slot 5
			addSlotToContainer(new SlotFood(tileEntity, 56, 131, 124, 50)); //Oven 2 Slot 6
		}
		bindPlayerInventory(invPlayer, screen);

	}
	
	protected void bindPlayerInventory(InventoryPlayer invPlayer, GuiScreen screen) {
		if (screen instanceof GuiStoveHob) {
			for (int c = 0; c < 3; c++) {
				for (int r = 0; r < 9; r++) {
					addSlotToContainer(new Slot(invPlayer, r + c * 9 + 9, 21 + r * 18, 140 + c * 18));
				}
			}
		
			for (int h = 0; h < 9; h++) {
				addSlotToContainer(new Slot(invPlayer, h, 21 + h * 18, 198));
			}
		} else {
			for (int c = 0; c < 3; c++) {
				for (int r = 0; r < 9; r++) {
					addSlotToContainer(new Slot(invPlayer, r + c * 9 + 9, 20 + r * 18, 174 + c * 18));
				}
			}
		
			for (int h = 0; h < 9; h++) {
				addSlotToContainer(new Slot(invPlayer, h, 20 + h * 18, 232));
			}
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		ItemStack stack = null;
        Slot slotObject = (Slot) inventorySlots.get(slot);

        //null checks and checks if the item can be stacked (maxStackSize > 1)
        if (slotObject != null && slotObject.getHasStack()) {
                ItemStack stackInSlot = slotObject.getStack();
                stack = stackInSlot.copy();

                //merges the item into player inventory since its in the tileEntity
                if (slot < 9) {
                        if (!this.mergeItemStack(stackInSlot, 0, 35, true)) {
                                return null;
                        }
                }
                //places it into the tileEntity is possible since its in the player inventory
                else if (!this.mergeItemStack(stackInSlot, 0, 4, false)) {
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
	}
	
	@Override
	public void putStackInSlot(int slot, ItemStack item) {
		this.getSlot(slot).putStack(item);
	}
	
	public IInventory getStoveInventory() {
		return this.stoveInventory;
	}

}
