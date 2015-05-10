package co.uk.silvania.cities.food.blocks.crops;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import co.uk.silvania.cities.food.FCF_Blocks;
import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCornCrop3 extends BlockFCFCrop {

	public BlockCornCrop3() {
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
        return block == FCF_Blocks.cornCrop2;
    }
	
	@Override
    public Item getItemDropped(int meta, Random p_149650_2_, int p_149650_3_) {
        return meta == 7 ? this.getCropItem() : this.getSeedItem();
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
            }            
        }
    }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
		int meta = world.getBlockMetadata(x, y, z);
		System.out.println("Crop 2 Metadata: " + meta);
		return false;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		this.icons = new IIcon[13];
		
		for (int i = 0; i < this.icons.length; ++i) {
			this.icons[i] = icon.registerIcon(FlenixCities_Food.modid + ":cornCrop1_stage_" + i);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}
	
	@Override 
	public IIcon getIcon(IBlockAccess block, int x, int y, int z, int side) {
		int meta = block.getBlockMetadata(x, y, z);
		if (meta == 7) {
			return this.icons[13];
		}
		if (meta < 0 || meta > 7) {
			meta = 7;
		}
		return this.icons[meta];
	}
	
	@Override
	public boolean func_149851_a(World world, int x, int y, int z, boolean p_149851_5_) {
		return world.getBlockMetadata(x, y, z) != 7;
	}
	
	@Override public boolean func_149852_a(World world, Random rand, int p_149852_3_, int p_149852_4_, int p_149852_5_) { return true; }
	
	@Override 
	public void func_149853_b(World world, Random rand, int x, int y, int z) {
		this.metaSafetyCheck(world, x, y, z);
	}
	
    public void metaSafetyCheck (World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 2, 5);

        if (meta > 7) { 
        	meta = 7; 
        }
        world.setBlockMetadataWithNotify(x, y, z, meta, 3);
    }
}