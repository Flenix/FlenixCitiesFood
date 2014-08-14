package co.uk.silvania.cities.food.blocks;

import java.util.List;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VendingMachineBlock extends BlockContainer {

	public VendingMachineBlock() {
		super(Material.iron);
		this.setHardness(1.0F);
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
		this.setLightOpacity(0);
		this.setLightLevel(1.0F);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TileEntityVendingMachine();
	}
	
	@Override
	public int getRenderType() {
		return -1;
	}
	
	
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
    	player.openGui(FlenixCities_Food.instance, 2, world, x, y, z);
        return true;
    }
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityliving, ItemStack itemStack)
	{
	    int blockSet = world.getBlockMetadata(x, y, z) / 4;
	    int direction = MathHelper.floor_double((entityliving.rotationYaw * 4F) / 360F + 0.5D) & 3;
	    int newMeta = (blockSet * 4) + direction;
	    world.setBlockMetadataWithNotify(x, y, z, newMeta, 0);
	}
    
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		return blockIcon;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        list.add(new ItemStack(item, 1, 0));
        //list.add(new ItemStack(par1, 1, 4));
        //list.add(new ItemStack(par1, 1, 8));
        //list.add(new ItemStack(par1, 1, 12));
	}
}