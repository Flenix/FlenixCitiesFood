package co.uk.silvania.cities.food.items.foods;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemDisabledFood extends ItemFood {

	public ItemDisabledFood(int par2, float par3, boolean par4) {
		super(par2, par3, par4);
		this.setCreativeTab(null);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean bool) {
		list.add(EnumChatFormatting.DARK_RED + "" + EnumChatFormatting.BOLD + "WARNING!");
		list.add("This food should not exist!");
		list.add("Please right-click while holding the food");
		list.add("to convert to it's raw counterpart.");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		if (item.getItem() == Items.cooked_chicken) {
			player.inventory.addItemStackToInventory(new ItemStack(Items.chicken, 1, 1));
		}
		if (item.getItem() == Items.cooked_porkchop) {
			player.inventory.addItemStackToInventory(new ItemStack(Items.porkchop, 1, 1));
		}
		if (item.getItem() == Items.cooked_beef) {
			player.inventory.addItemStackToInventory(new ItemStack(Items.beef, 1, 1));
		}
		--item.stackSize;
		return item;
	}
}
