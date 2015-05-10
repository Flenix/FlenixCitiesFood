package co.uk.silvania.cities.food.blocks.crops;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import co.uk.silvania.cities.food.FCF_Blocks;
import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;

public class BlockCornCrop1 extends BlockFCFCrop {

	public BlockCornCrop1() {
		super();
		this.setTickRandomly(true);
	}
	
	@Override
	protected Item getSeedItem() {
		return FCF_Items.cornSeed;
	}
	
	@Override
	protected Item getCropItem() {
		return FCF_Items.cornItem;
	}
	
	@Override
    public Item getItemDropped(int meta, Random p_149650_2_, int p_149650_3_) {
        return this.getSeedItem();
    }
	
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		this.icons = new IIcon[10];
		
		for (int i = 0; i < this.icons.length; ++i) {
			this.icons[i] = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_stage_" + i);
		}
	}
	
	@Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        super.updateTick(world, x, y, z, rand);

        if (world.getBlockLightValue(x, y + 3, z) >= 9)
        {
            int meta = world.getBlockMetadata(x, y, z);

            if (meta < 7)
            {
                float f = this.func_149864_n(world, x, y, z);

                if (rand.nextInt((int)(25.0F / f) + 1) == 0)
                {
                    ++meta;
                    world.setBlockMetadataWithNotify(x, y, z, meta, 3);
                }
            } else if (meta >= 7) {
            	world.setBlock(x, y+1, z, FCF_Blocks.cornCrop2, 1, 3);
            }
            
        }
    }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
		int meta = world.getBlockMetadata(x, y, z);
		System.out.println("Crop 1 Metadata: " + meta);
		return false;
	}
	
	//Stolen directly from the BlockCrop class due to the fact I'm overriding updateTick, and this was private.
	private float func_149864_n(World p_149864_1_, int p_149864_2_, int p_149864_3_, int p_149864_4_)
    {
        float f = 1.0F;
        Block block = p_149864_1_.getBlock(p_149864_2_, p_149864_3_, p_149864_4_ - 1);
        Block block1 = p_149864_1_.getBlock(p_149864_2_, p_149864_3_, p_149864_4_ + 1);
        Block block2 = p_149864_1_.getBlock(p_149864_2_ - 1, p_149864_3_, p_149864_4_);
        Block block3 = p_149864_1_.getBlock(p_149864_2_ + 1, p_149864_3_, p_149864_4_);
        Block block4 = p_149864_1_.getBlock(p_149864_2_ - 1, p_149864_3_, p_149864_4_ - 1);
        Block block5 = p_149864_1_.getBlock(p_149864_2_ + 1, p_149864_3_, p_149864_4_ - 1);
        Block block6 = p_149864_1_.getBlock(p_149864_2_ + 1, p_149864_3_, p_149864_4_ + 1);
        Block block7 = p_149864_1_.getBlock(p_149864_2_ - 1, p_149864_3_, p_149864_4_ + 1);
        boolean flag = block2 == this || block3 == this;
        boolean flag1 = block == this || block1 == this;
        boolean flag2 = block4 == this || block5 == this || block6 == this || block7 == this;

        for (int l = p_149864_2_ - 1; l <= p_149864_2_ + 1; ++l)
        {
            for (int i1 = p_149864_4_ - 1; i1 <= p_149864_4_ + 1; ++i1)
            {
                float f1 = 0.0F;

                if (p_149864_1_.getBlock(l, p_149864_3_ - 1, i1).canSustainPlant(p_149864_1_, l, p_149864_3_ - 1, i1, ForgeDirection.UP, this))
                {
                    f1 = 1.0F;

                    if (p_149864_1_.getBlock(l, p_149864_3_ - 1, i1).isFertile(p_149864_1_, l, p_149864_3_ - 1, i1))
                    {
                        f1 = 3.0F;
                    }
                }

                if (l != p_149864_2_ || i1 != p_149864_4_)
                {
                    f1 /= 4.0F;
                }

                f += f1;
            }
        }

        if (flag2 || flag && flag1)
        {
            f /= 2.0F;
        }

        return f;
    }
	
	@Override 
	public IIcon getIcon(IBlockAccess block, int x, int y, int z, int side) {
		System.out.println("Corn 1 texture being registered");
		int meta = block.getBlockMetadata(x, y, z);
		
		if (block.getBlock(x, y+2, z) instanceof BlockCornCrop3) {
			if (block.getBlockMetadata(x, y+2, z) >= 7) {
				System.out.println("Corn should be complete if this appears.");
				return this.icons[13];
			}
		} else if (block.getBlock(x, y+1, z) instanceof BlockCornCrop2) {
			System.out.println("Corn should be 2-high if this appears.");
			return this.icons[9];
		} else if (meta < 0 || meta > 7) {
			meta = 7;
		}
		return this.icons[meta];
	}
}