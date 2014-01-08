package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockCeleryCrop extends BlockFCFCrop {

	public BlockCeleryCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.celerySeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.celeryItem.itemID;
	}
}