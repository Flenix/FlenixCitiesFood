package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockRapeCrop extends BlockFCFCrop {

	public BlockRapeCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.rapeSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.rapeSeed.itemID;
	}
}