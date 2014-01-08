package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockCucumberCrop extends BlockFCFCrop {

	public BlockCucumberCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.cucumberSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.cucumberItem.itemID;
	}
}