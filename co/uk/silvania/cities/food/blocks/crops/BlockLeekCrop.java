package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockLeekCrop extends BlockFCFCrop {


	public BlockLeekCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.leekSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.leekItem.itemID;
	}
}