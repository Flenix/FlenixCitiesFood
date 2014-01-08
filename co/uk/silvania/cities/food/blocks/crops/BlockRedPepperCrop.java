package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockRedPepperCrop extends BlockFCFCrop {

	public BlockRedPepperCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.redPepperSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.redPepperItem.itemID;
	}
}