//This is currently a tweaked version of the vanilla Vine, altered to allow for ground-placed vines.
package co.uk.silvania.cities.food.blocks.bushes;

import co.uk.silvania.cities.food.FlenixCities_Food;
import net.minecraft.block.BlockVine;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockGrapeVine extends BlockVine {

	public BlockGrapeVine() {
		super();
		this.setTickRandomly(true);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		this.blockIcon = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)));
	}
}
