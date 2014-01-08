package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockOnionCrop extends BlockFCFCrop {

	public BlockOnionCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.onionSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.onionItem.itemID;
	}
}