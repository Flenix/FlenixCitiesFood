package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import net.minecraft.world.World;
import co.uk.silvania.cities.food.FlenixCities_Food;

public class BlockRedGrapeVineBare extends BlockGrapeVine {

	public BlockRedGrapeVineBare() {
		super();
		this.setTickRandomly(true);
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
	}
	
	@Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if (!par1World.isRemote && par1World.rand.nextInt(4) == 0) {
        	System.out.println("Tick! (Red Bare)");
        }
    }
}
