package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import net.minecraft.item.ItemStack;
import co.uk.silvania.cities.food.FCF_Items;

public class BlockStrawberryBush extends BlockFCFBush {

	public BlockStrawberryBush(int id) {
		super(id);
	}
	
	public ItemStack fruitItem() {
		Random rand = new Random();
		int amount = rand.nextInt(3) + 1;
		ItemStack strawberry = new ItemStack(FCF_Items.strawberryItem, amount, 0);
		return strawberry;
	}
}
