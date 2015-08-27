package co.uk.silvania.cities.food.blocks.utensils;

import co.uk.silvania.cities.food.util.IFlenixFoods;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotFood extends Slot {
	
	int parent;
	IInventory inv;

	public SlotFood(IInventory inventory, int id, int x, int y, int prnt) {
		super(inventory, id, x, y);
		this.parent = prnt;
		this.inv = inventory;
	}
	
	@Override
	public boolean isItemValid(ItemStack item) {
		if (item != null) {
			if (item.getItem() instanceof IFlenixFoods) {
				if (inv.getStackInSlot(parent) != null) {
					boolean burned = item.stackTagCompound.getBoolean("burned");
					boolean mouldy = item.stackTagCompound.getBoolean("mouldy");
					boolean cooked = item.stackTagCompound.getBoolean("hasBeenCooked");
					if (burned || mouldy || cooked) {
						return false;
					}
					return true;
				}
			}
		}
		return false;
	}
}
