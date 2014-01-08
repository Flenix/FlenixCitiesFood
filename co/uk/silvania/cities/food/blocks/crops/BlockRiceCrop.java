package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockRiceCrop extends BlockFCFCrop {

	public BlockRiceCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.riceItem.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.riceItem.itemID;
	}
}