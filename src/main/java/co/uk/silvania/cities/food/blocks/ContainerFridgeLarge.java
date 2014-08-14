package co.uk.silvania.cities.food.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerFridgeLarge extends Container {

	protected TileEntityFridgeLarge tileEntity;
	private IInventory FridgeLargeInventory;

	public ContainerFridgeLarge (InventoryPlayer inventoryPlayer, TileEntityFridgeLarge te) {
		tileEntity = te;
		//Main Storage
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				addSlotToContainer(new Slot(tileEntity, i + j, 62 + j * 18, -6 + i * 18));
			}
		}
		bindPlayerInventory(inventoryPlayer);
	}

    @Override
    public boolean canInteractWith(EntityPlayer player) {
            return tileEntity.isUseableByPlayer(player);
    }

    //Player Inventory
    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
            for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 9; n++) {
                            addSlotToContainer(new Slot(inventoryPlayer, n + m * 9 + 9, 8 + n * 18, 110 + m * 18));
                    }
            }
            //Player's hotbar
            for (int o = 0; o < 9; o++) {
                    addSlotToContainer(new Slot(inventoryPlayer, o, 8 + o * 18, 168));
            }
    }
    
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
    public IInventory getFridgeLargeInventory()
    {
        return this.FridgeLargeInventory;
    }
}