//This is currently a tweaked version of the vanilla Vine, altered to allow for ground-placed vines.
package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import co.uk.silvania.cities.food.FlenixCities_Food;
import net.minecraft.block.BlockVine;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockGrapeVine extends BlockVine {
	
	public IIcon[] icons;

	public BlockGrapeVine() {
		super();
		this.setTickRandomly(true);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		this.icons = new IIcon[8];
		
		for (int i = 0; i < this.icons.length; ++i) {
			this.icons[i] = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_stage_" + i);
		}
	}
	
	@Override
    public void updateTick(World world, int x, int y, int z, Random random) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta < 15) {
			world.setBlockMetadataWithNotify(x, y, z, meta + 1, 3);
		}
        if (!world.isRemote && world.rand.nextInt(4) == 0) {
        	System.out.println("Tick! (Grape Vine) Meta:" + meta);
        }
    }
}
