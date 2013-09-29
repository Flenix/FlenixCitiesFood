package co.uk.silvania.cities.food.blocks;

import java.util.HashSet;
import java.util.Set;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerVendingMachine extends Container {

	protected TileEntityVendingMachine tileEntity;
	private IInventory VendingMachineInventory;

	public ContainerVendingMachine (InventoryPlayer inventoryPlayer, TileEntityVendingMachine te) {
		tileEntity = te;
		//Main Storage
		addSlotToContainer(new Slot(tileEntity, 1, 54, 16));
		addSlotToContainer(new Slot(tileEntity, 1, 54, 38));
		addSlotToContainer(new Slot(tileEntity, 1, 54, 60));
		addSlotToContainer(new Slot(tileEntity, 1, 54, 82));
		addSlotToContainer(new Slot(tileEntity, 1, 54, 104));
		addSlotToContainer(new Slot(tileEntity, 1, 54, 126));
	}

    @Override
    public boolean canInteractWith(EntityPlayer player) {
            return tileEntity.isUseableByPlayer(player);
    }

    public static Set validItems = new HashSet();
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
            ItemStack stack = null;
            Slot slotObject = (Slot) inventorySlots.get(slot);

            if (slotObject != null && slotObject.getHasStack()) {
                    ItemStack stackInSlot = slotObject.getStack();
                    stack = stackInSlot.copy();

                    if (slot < 9) {
                            if (!this.mergeItemStack(stackInSlot, 9, 45, true)) {
                                    return null;
                            }
                    }

                    else if (!this.mergeItemStack(stackInSlot, 0, 9, false)) {
                            return null;
                    }

                    if (stackInSlot.stackSize == 10) {
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
    public IInventory getFloatingShelvesInventory()
    {
        return this.VendingMachineInventory;
    }
}