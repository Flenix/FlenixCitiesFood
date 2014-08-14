package co.uk.silvania.cities.food.blocks.crops;

import net.minecraft.item.Item;
import co.uk.silvania.cities.food.FCF_Items;

public class BlockOnionCrop extends BlockFCFCrop {

	public BlockOnionCrop() {
		super();
		this.setTickRandomly(true);
	}
	
	@Override
	protected Item getSeedItem() {
		return FCF_Items.onionSeed;
	}
	
	@Override
	protected Item getCropItem() {
		return FCF_Items.onionItem;
	}
}