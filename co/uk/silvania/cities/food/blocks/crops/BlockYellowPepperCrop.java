package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockYellowPepperCrop extends BlockFCFCrop {

	public BlockYellowPepperCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.yellowPepperSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.yellowPepperItem.itemID;
	}
}