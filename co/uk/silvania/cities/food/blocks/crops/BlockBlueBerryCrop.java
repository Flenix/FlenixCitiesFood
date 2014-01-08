package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockBlueBerryCrop extends BlockFCFCrop {

	public BlockBlueBerryCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.blueBerrySeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.blueberryItem.itemID;
	}
}