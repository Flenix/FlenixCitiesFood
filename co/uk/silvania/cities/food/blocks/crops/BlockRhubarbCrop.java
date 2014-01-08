package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockRhubarbCrop extends BlockFCFCrop {
	
	public BlockRhubarbCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.rhubarbSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.rhubarbItem.itemID;
	}
}