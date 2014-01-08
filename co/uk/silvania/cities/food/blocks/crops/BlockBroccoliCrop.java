package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockBroccoliCrop extends BlockFCFCrop {
	
	public BlockBroccoliCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.broccoliSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.broccoliItem.itemID;
	}
}
