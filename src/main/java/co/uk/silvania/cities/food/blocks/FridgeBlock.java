package co.uk.silvania.cities.food.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import co.uk.silvania.cities.core.FlenixCities_Core;
import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class FridgeBlock extends BlockContainer {
	

	public FridgeBlock() {
		super(Material.iron);
		this.setHardness(1.0F);
		this.setCreativeTab(FlenixCities_Core.tabCity);
		this.setLightOpacity(0);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TileEntityFridge();
	}
	
	@Override
	public int getRenderType() {
		return -1;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	
    @Override
    @SideOnly(Side.CLIENT)
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
    	if (world.isRemote) {
    		System.out.println("Fridge GUI currently disabled. Patience please :P");
    		//player.openGui(FlenixCities_Food.instance, 0, world, x, y, z);
    	}
        return true;
    }
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

		if (l == 0) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 0);
		}

		if (l == 1) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 0);
		}

		if (l == 2) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 0);
		}

		if (l == 3) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 0);
		}
	}	
}