package co.uk.silvania.cities.food.blocks.utensils;

import co.uk.silvania.cities.food.util.IFlenixFoods;
import co.uk.silvania.cities.food.util.IHobUtensil;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class SlotFood extends Slot {
	
	int parent;
	IInventory inv;

	public SlotFood(IInventory te, int id, int x, int y, int parent) {
		super(te, id, x, y);
		this.parent = parent;
		this.inv = te;
	}
	
	@Override
	public boolean isItemValid(ItemStack item) {
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
		return false;
	}
}
