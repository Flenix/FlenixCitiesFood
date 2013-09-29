package co.uk.silvania.cities.food.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;

public class BlockBroccoliCrop extends BlockCrops {
	
	public Icon[] icons;

	public BlockBroccoliCrop(int id) {
		super(id);
		this.setTickRandomly(true);
	}
	
	@Override
	public void registerIcons(IconRegister icon) {
		this.icons = new Icon[4];
		
		for (int i = 0; i < this.icons.length; ++i) {
			this.icons[i] = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_stage_" + i);
		}
	}
	
	@Override
	protected int getSeedItem() {
		return FCF_Items.broccoliSeed.itemID;
	}
	
	@Override
	protected int getCropItem() {
		return FCF_Items.broccoliItem.itemID;
	}
	
	@Override
	protected boolean canThisPlantGrowOnThisBlockID(int par1) {
		return true;
	}
	
	@Override
	public Icon getIcon(int side, int meta) {
		if (meta < 0 || meta > 3) {
			meta = 3;
		}
		
		return this.icons[meta];
	}
}
