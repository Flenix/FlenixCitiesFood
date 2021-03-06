package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import net.minecraft.item.ItemStack;
import co.uk.silvania.cities.food.FCF_Items;

public class BlockBlackberryBush extends BlockFCFBush {

	public BlockBlackberryBush() {
		super();
	}
	
	@Override
	public ItemStack fruitItem() {
		Random rand = new Random();
		int amount = rand.nextInt(3) + 1;
		ItemStack blackberry = new ItemStack(FCF_Items.blackberryItem, amount, 0);
		return blackberry;
	}

}
