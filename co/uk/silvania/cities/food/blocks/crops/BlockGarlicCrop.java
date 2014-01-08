package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockGarlicCrop extends BlockFCFCrop {

	public BlockGarlicCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.garlicSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.garlicItem.itemID;
	}
}