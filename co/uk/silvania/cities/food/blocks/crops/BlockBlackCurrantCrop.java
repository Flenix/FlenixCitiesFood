package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockBlackCurrantCrop extends BlockFCFCrop {


	public BlockBlackCurrantCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.blackCurrantSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.blackcurrantItem.itemID;
	}
}