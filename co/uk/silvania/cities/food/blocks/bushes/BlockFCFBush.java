package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockFCFBush extends Block {

	public BlockFCFBush(int id) {
		super(id, Material.leaves);
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
		this.setTickRandomly(true);
	}
	
	@Override
	public void registerIcons(IconRegister icon) {
		this.blockIcon = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)));
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
		if (!world.isRemote) {
			int meta = world.getBlockMetadata(x, y, z);
			System.out.println("Looks like the meta of this block is " + meta);
			if (meta == 15) {
				System.out.println("You got some fruit! " + fruitItem());
				player.inventory.addItemStackToInventory(fruitItem());
				world.setBlockMetadataWithNotify(x, y, z, 8, 3);
			}
		}
		return true;
	}
	
	public ItemStack fruitItem() {
		return null;
	}
	
	@Override
    public int getRenderType() {
        return 6;
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
        if (!world.isRemote && world.rand.nextInt(4) == 0) {
        	int meta = world.getBlockMetadata(x, y, z);
        	if (meta < 7) {
        		world.setBlockMetadataWithNotify(x, y, z, meta + 1, 3);
        	} else if (meta > 7) {
        		world.setBlockMetadataWithNotify(x, y, z, meta + 1, 3);
        		
				Random rand = new Random();
				int chance = rand.nextInt(4);
				int side = rand.nextInt(3) + 1;
        		
				if (chance == 1) {
					if (side == 1) {
						if (world.isAirBlock(x + 1, y, z)) {
							world.setBlock(x + 1, y, z, this.blockID);
						}
					} else if (side == 2) {
						if (world.isAirBlock(x - 1, y, z)) {
							world.setBlock(x - 1, y, z, this.blockID);
						}
					} else if (side == 3) {
						if (world.isAirBlock(x, y, z + 1)) {
							world.setBlock(x, y, z + 1, this.blockID);
						}					
					} else if (side == 4) {
						if (world.isAirBlock(x, y, z - 1)) {
							world.setBlock(x, y, z - 1, this.blockID);
						}					
					} else
						System.out.println("[FlenixCities][ERROR] Something went horribly wrong with a bush growing...");
					}
        		} else {
        	}
        }
    }
}
