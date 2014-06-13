package co.uk.silvania.cities.food.blocks.utensils;

import co.uk.silvania.cities.food.util.IOvenUtensil;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotUtensilOven extends Slot {

	public SlotUtensilOven(IInventory par1iInventory, int par2, int par3, int par4) {
		super(par1iInventory, par2, par3, par4);
	}
	
	@Override
	public boolean isItemValid(ItemStack item) {
		if (item.getItem() instanceof IOvenUtensil) {
			return true;
		}
		return false;
	}
}
