package co.uk.silvania.cities.food.blocks.crops;

import net.minecraft.item.Item;
import co.uk.silvania.cities.food.FCF_Items;

public class BlockBlackCurrantCrop extends BlockFCFCrop {


	public BlockBlackCurrantCrop() {
		super();
		this.setTickRandomly(true);
	}
	
	@Override
	protected Item getSeedItem() {
		return FCF_Items.blackCurrantSeed;
	}
	
	@Override
	protected Item getCropItem() {
		return FCF_Items.blackcurrantItem;
	}
}