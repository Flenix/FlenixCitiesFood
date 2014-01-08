package co.uk.silvania.cities.food.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import co.uk.silvania.cities.food.FlenixCities_Food;

public class SeedItems extends ItemSeeds implements IPlantable {
	
	private int cropBlock;
	
	public SeedItems(int id, int par2) {
		super(id, par2, Block.tilledField.blockID);
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
		cropBlock = par2;
	}
	
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)));
	}
	
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3world, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        if (par7 != 1) {
            return false;
        } else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack)) {
            int i1 = par3world.getBlockId(par4, par5, par6);
            Block soil = Block.blocksList[i1];

            if (soil != null && soil.canSustainPlant(par3world, par4, par5, par6, ForgeDirection.UP, this) && par3world.isAirBlock(par4, par5 + 1, par6)) {
                par3world.setBlock(par4, par5 + 1, par6, this.cropBlock);
                --par1ItemStack.stackSize;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
	
	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) {
		return EnumPlantType.Crop;
	}
	
	@Override
	public int getPlantID(World world, int x, int y, int z) {
		return cropBlock;
	}
	
	@Override
	public int getPlantMetadata(World world, int x, int y, int z) {
		return 0;
	}
}
