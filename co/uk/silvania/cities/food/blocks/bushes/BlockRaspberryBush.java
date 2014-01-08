package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import net.minecraft.item.ItemStack;
import co.uk.silvania.cities.food.FCF_Items;

public class BlockRaspberryBush extends BlockFCFBush {

	public BlockRaspberryBush(int id) {
		super(id);
	}
	
	@Override
	public ItemStack fruitItem() {
		Random rand = new Random();
		int amount = rand.nextInt(3) + 1;
		ItemStack raspberry = new ItemStack(FCF_Items.raspberryItem, amount, 0);
		return raspberry;
	}
}
