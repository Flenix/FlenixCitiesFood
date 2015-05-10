package co.uk.silvania.cities.food.blocks.crops;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import co.uk.silvania.cities.food.FCF_Blocks;
import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;

public class BlockCornCrop2 extends BlockFCFCrop {

	public BlockCornCrop2() {
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
	protected boolean canPlaceBlockOn(Block block) {
        return block == FCF_Blocks.cornCrop1;
    }
	
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		this.icons = new IIcon[13];
		
		for (int i = 0; i < this.icons.length; ++i) {
			this.icons[i] = icon.registerIcon(FlenixCities_Food.modid + ":cornCrop1_stage_" + i);
		}
	}
	
	@Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        super.updateTick(world, x, y, z, rand);

        if (world.getBlockLightValue(x, y + 1, z) >= 9)
        {
            int meta = world.getBlockMetadata(x, y, z);

            if (meta < 7)
            {
                ++meta;
                world.setBlockMetadataWithNotify(x, y, z, meta, 3);
            } else if (meta >= 7) {
            	world.setBlock(x, y+1, z, FCF_Blocks.cornCrop3, 1, 3);
            }
        }
    }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
		int meta = world.getBlockMetadata(x, y, z);
		System.out.println("Crop 1 Metadata: " + meta);
		return false;
	}
	
	@Override 
	public IIcon getIcon(IBlockAccess block, int x, int y, int z, int side) {
		int meta = block.getBlockMetadata(x, y, z);
		
		if (block.getBlock(x, y+1, z) instanceof BlockCornCrop3) {
			if (block.getBlockMetadata(x, y+1, z) >= 7) {
				return this.icons[11];
			}
		} else if (block.getBlock(x, y+1, z) instanceof BlockCornCrop3) {
			return this.icons[12];
		} else if (meta < 0 || meta > 7) {
			meta = 7;
		}
		return this.icons[meta];
	}
}