package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockCabbageCrop extends BlockFCFCrop {

	public BlockCabbageCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.cabbageSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.cabbageItem.itemID;
	}
}
