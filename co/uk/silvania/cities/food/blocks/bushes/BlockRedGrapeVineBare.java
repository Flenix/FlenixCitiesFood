package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Direction;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import co.uk.silvania.cities.food.FlenixCities_Food;

public class BlockRedGrapeVineBare extends BlockGrapeVine {

	public BlockRedGrapeVineBare(int id) {
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
        	System.out.println("Tick! (Red Bare)");
        }
    }
}
