package co.uk.silvania.cities.food.items.foods;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemDisabledFood extends ItemFood {

	public ItemDisabledFood(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		this.setCreativeTab(null);
	}
	
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean bool) {
		list.add(EnumChatFormatting.DARK_RED + "" + EnumChatFormatting.BOLD + "WARNING!");
		list.add("This food should not exist!");
		list.add("Please right-click while holding the food");
		list.add("to convert to it's raw counterpart.");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		if (item.itemID == Item.chickenCooked.itemID) {
			player.inventory.addItemStackToInventory(new ItemStack(Item.chickenRaw, 1, 1));
		}
		if (item.itemID == Item.porkCooked.itemID) {
			player.inventory.addItemStackToInventory(new ItemStack(Item.porkRaw, 1, 1));
		}
		if (item.itemID == Item.beefCooked.itemID) {
			player.inventory.addItemStackToInventory(new ItemStack(Item.beefRaw, 1, 1));
		}
		--item.stackSize;
		return item;
	}
}
