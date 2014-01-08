package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockTomatoCrop extends BlockFCFCrop {

	public BlockTomatoCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.tomatoSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.tomatoItem.itemID;
	}
}