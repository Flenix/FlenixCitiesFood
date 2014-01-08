package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import co.uk.silvania.cities.food.FlenixCities_Food;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class BlockGreenGrapeVineBare extends BlockGrapeVine {

	public BlockGreenGrapeVineBare(int id) {
		super(id);
		this.setTickRandomly(true);
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
	}
	
	@Override
	public void registerIcons(IconRegister icon) {
		this.blockIcon = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)));
	}
	
	@Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if (!par1World.isRemote && par1World.rand.nextInt(4) == 0) {
        	System.out.println("Tick! (Green Bare)");
        }
    }
}
