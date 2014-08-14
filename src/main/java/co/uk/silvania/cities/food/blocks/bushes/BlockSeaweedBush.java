package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import co.uk.silvania.cities.food.FCF_Blocks;
import co.uk.silvania.cities.food.FlenixCities_Food;

public class BlockSeaweedBush extends Block {

	public BlockSeaweedBush() {
		super(Material.leaves);
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
		this.setTickRandomly(true);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		this.blockIcon = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)));
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
		if (!world.isRemote) {
			setRenderType(world, x, y, z);
			int meta = world.getBlockMetadata(x, y, z);
			System.out.println("Looks like the meta of this seaweed is " + meta);
		}
		return true;
	}
	
    private int renderType = 6;
    public void setRenderType(World world, int x, int y, int z) {
    	int meta = world.getBlockMetadata(x, y, z);
    	if (meta < 7) {
    		renderType = 6;
    	} else {
    		renderType = 6;
    	}
    }	
	
	@Override
    public int getRenderType() {
        return renderType;
    }
	
	@Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
        return null;
    }
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
    public void updateTick(World world, int x, int y, int z, Random random) {
		setRenderType(world, x, y, z);
        if (!world.isRemote && world.rand.nextInt(4) == 0) {
        	System.out.println("Ticking seaweed");
        	int meta = world.getBlockMetadata(x, y, z);
        	if ((world.getBlock(x + 1, y, z) == Blocks.water) || (world.getBlock(x + 1, y, z) == Blocks.water)) {
            	if (meta < 7) {
            		world.setBlockMetadataWithNotify(x, y, z, meta + 1, 3);
            	} else if (meta == 7) {

    				Random rand = new Random();
    				int side = rand.nextInt(3) + 1;
    				
    				if (side == 1) {
    					if ((world.getBlock(x + 1, y, z) == Blocks.water) || (world.getBlock(x + 1, y, z) == Blocks.water)) {
    						world.setBlock(x + 1, y, z, FCF_Blocks.seaweedBush);
    						world.setBlockMetadataWithNotify(x, y, z, 3, 3);
    					}
    				} else if (side == 2) {
    					if ((world.getBlock(x - 1, y, z) == Blocks.water) || (world.getBlock(x + 1, y, z) == Blocks.water)) {
    						world.setBlock(x -1 , y, z, FCF_Blocks.seaweedBush);
    						world.setBlockMetadataWithNotify(x, y, z, 3, 3);
    					}
    				} else if (side == 3) {
    					if ((world.getBlock(x, y, z + 1) == Blocks.water) || (world.getBlock(x + 1, y, z) == Blocks.water)) {
    						world.setBlock(x, y, z + 1, FCF_Blocks.seaweedBush);
    						world.setBlockMetadataWithNotify(x, y, z, 3, 3);
    					}
    				} else if (side == 4) {
    					if ((world.getBlock(x, y, z - 1) == Blocks.water) || (world.getBlock(x + 1, y, z) == Blocks.water)) {
    						world.setBlock(x, y, z - 1, FCF_Blocks.seaweedBush);
    						world.setBlockMetadataWithNotify(x, y, z, 3, 3);
    					}
    				} else
    					System.out.println("[FlenixCities][ERROR] Something with the seaweed growth went horribly wrong...");

            	} else if (meta > 8 && meta < 15) {
            		world.setBlockMetadataWithNotify(x, y, z, 0, 3);
            	}
        	} else {
        		if (meta <= 7) {
        			world.setBlockMetadataWithNotify(x, y, z, 8, 3);
        		} else if (meta < 15 && meta > 7) {
        			world.setBlockMetadataWithNotify(x, y, z, meta + 1, 3);
        		} else if (meta == 15) {
        			world.setBlockToAir(x, y, z);
        		}
        	}
        }
    }
}
