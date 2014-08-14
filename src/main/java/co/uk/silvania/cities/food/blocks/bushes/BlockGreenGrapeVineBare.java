package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import co.uk.silvania.cities.food.FlenixCities_Food;
import net.minecraft.world.World;

public class BlockGreenGrapeVineBare extends BlockGrapeVine {

	public BlockGreenGrapeVineBare() {
		super();
		this.setTickRandomly(true);
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
	}

	@Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if (!par1World.isRemote && par1World.rand.nextInt(4) == 0) {
        	System.out.println("Tick! (Green Bare)");
        }
    }
}
