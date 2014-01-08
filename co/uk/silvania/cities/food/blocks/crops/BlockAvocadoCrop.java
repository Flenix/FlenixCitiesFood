package co.uk.silvania.cities.food.blocks.crops;

import co.uk.silvania.cities.food.FCF_Items;

public class BlockAvocadoCrop extends BlockFCFCrop {


	public BlockAvocadoCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.avocadoSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.avocadoItem.itemID;
	}
}