package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockLettuceCrop extends BlockFCFCrop {

	public BlockLettuceCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.lettuceSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.lettuceItem.itemID;
	}
}