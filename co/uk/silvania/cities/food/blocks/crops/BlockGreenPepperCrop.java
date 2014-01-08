package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockGreenPepperCrop extends BlockFCFCrop {

	public BlockGreenPepperCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.greenPepperSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.greenPepperItem.itemID;
	}
}