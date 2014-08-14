package co.uk.silvania.cities.food.blocks.crops;

import net.minecraft.item.Item;
import co.uk.silvania.cities.food.FCF_Items;

public class BlockTomatoCrop extends BlockFCFCrop {

	public BlockTomatoCrop() {
		super();
		this.setTickRandomly(true);
	}
	
	@Override
	protected Item getSeedItem() {
		return FCF_Items.tomatoSeed;
	}
	
	@Override
	protected Item getCropItem() {
		return FCF_Items.tomatoItem;
	}
}