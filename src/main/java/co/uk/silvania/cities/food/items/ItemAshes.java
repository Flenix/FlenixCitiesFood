package co.uk.silvania.cities.food.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemAshes extends Item {

	public ItemAshes() {
		super();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean bool) {
		list.add("The ruined remains of what was once some food.");
		list.add(EnumChatFormatting.ITALIC + "Press " + EnumChatFormatting.BOLD + "shift" + EnumChatFormatting.RESET + EnumChatFormatting.ITALIC + " for more information");
		if (player.isSneaking()) {
			list.add("");
			list.add("This is food you probably tried to cook in a Furnace.");
			list.add("A furnace is way too hot to cook food; use an oven/stove instead!");
		}
	}
}
