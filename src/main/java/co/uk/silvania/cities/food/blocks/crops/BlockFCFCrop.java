package co.uk.silvania.cities.food.blocks.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import co.uk.silvania.cities.food.FlenixCities_Food;

public abstract class BlockFCFCrop extends BlockCrops {
	
	public IIcon[] icons;

	public BlockFCFCrop() {
		super();
		this.setTickRandomly(true);
	}
	
	@Override
    protected Item func_149866_i() {
        return getSeedItem();
    }

    @Override
    protected Item func_149865_P() {
        return getCropItem();
    }
    
    protected abstract Item getSeedItem();
    protected abstract Item getCropItem();
	
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		this.icons = new IIcon[8];
		
		for (int i = 0; i < this.icons.length; ++i) {
			this.icons[i] = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_stage_" + i);
		}
	}

	
	@Override
	public IIcon getIcon(int side, int meta) {
		if (meta < 0 || meta > 7) {
			meta = 7;
		}
		
		return this.icons[meta];
	}
}
