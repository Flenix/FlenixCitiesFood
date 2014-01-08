package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockCornCrop extends BlockFCFCrop {

	public BlockCornCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.cornSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.cornItem.itemID;
	}
}