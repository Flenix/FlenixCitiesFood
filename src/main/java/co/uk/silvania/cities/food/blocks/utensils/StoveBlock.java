package co.uk.silvania.cities.food.blocks.utensils;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.UP;

import java.util.Random;

import co.uk.silvania.cities.core.FlenixCities_Core;
import co.uk.silvania.cities.food.FlenixCities_Food;
import co.uk.silvania.cities.food.util.IFlenixFoods;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StoveBlock extends BlockContainer {

	public StoveBlock() {
		super(Material.iron);
		this.setHardness(1.0F);
		this.setCreativeTab(FlenixCities_Core.tabCity);
		this.setLightOpacity(0);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.825F, 1F);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new StoveEntity();
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
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
    	if (!world.isRemote) {
    		if (i == 1) {
    			player.openGui(FlenixCities_Food.instance, 4, world, x, y, z);
        	} else {
        		player.addChatComponentMessage(new ChatComponentText("The oven and grill are not yet implemented. Please use the hob for all cooking (Top side)"));
        		//player.openGui(FlenixCities_Food.instance, 3, world, x, y, z);
        	}
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
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
    	TileEntity te = world.getTileEntity(x, y, z);
    	if (te != null) {
    		if (te instanceof StoveEntity) {
    			StoveEntity stove = (StoveEntity) te;
    			
    			for (int i = 0; i < stove.invSize; i++) {
    				ItemStack item = stove.getStackInSlot(i);
    				if (item != null) {
    					if (item.getItem() instanceof IFlenixFoods) {
    						if ((item.stackTagCompound.getFloat("cookedValue")) >= (item.stackTagCompound.getFloat("burnedLevel"))) {
    					        if (rand.nextInt(24) == 0) {
    					            world.playSound((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "fire.fire", 1.0F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.3F, false);
    					        }

    					        int l;
    					        float f;
    					        float f1;
    					        float f2;

    					        for (l = 0; l < 2; ++l) {
    					        	f = (float)x + rand.nextFloat();
    					        	f1 = ((float)y + 0.8F) + rand.nextFloat() * 0.1F;
    					        	f2 = (float)z + rand.nextFloat();
    					        	world.spawnParticle("largesmoke", (double)f, (double)f1, (double)f2, 0.0D, 0.0D, 0.0D);
    					        }
    						}
    					}
    				}
    			}
    		}
    	}
    }
    
	@Override
    public void breakBlock(World world, int x, int y, int z, Block block, int par6) {
		dropItems(world, x, y, z);
		super.breakBlock(world, x, y, z, block, par6);
    }

    private void dropItems(World world, int x, int y, int z){
    	Random rand = new Random();

    	TileEntity tileEntity = world.getTileEntity(x, y, z);
    	if (!(tileEntity instanceof IInventory)) {
    		return;
    	}
    	IInventory inventory = (IInventory) tileEntity;

    	for (int i = 0; i < inventory.getSizeInventory(); i++) {
    		ItemStack item = inventory.getStackInSlot(i);

    		if (item != null && item.stackSize > 0) {
    			float rx = rand.nextFloat() * 0.8F + 0.1F;
    			float ry = rand.nextFloat() * 0.8F + 0.1F;
    			float rz = rand.nextFloat() * 0.8F + 0.1F;
    			
    			EntityItem entityItem = new EntityItem(world, x + rx, y + ry, z + rz, new ItemStack(item.getItem(), item.stackSize, item.getItemDamage()));
    			
    			if (item.hasTagCompound()) {
    				entityItem.getEntityItem().setTagCompound((NBTTagCompound) item.getTagCompound().copy());
    			}

    			float factor = 0.05F;
    			entityItem.motionX = rand.nextGaussian() * factor;
    			entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
    			entityItem.motionZ = rand.nextGaussian() * factor;
    			world.spawnEntityInWorld(entityItem);
    			item.stackSize = 0;
    		}
    	}
    }
}
