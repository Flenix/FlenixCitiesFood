package co.uk.silvania.cities.food.items.foods;

import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class CityDrinks extends ItemFood {

	public CityDrinks(int heal, boolean wolf) {
		super(heal, wolf);
		this.setCreativeTab(CreativeTabs.tabFood);
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
}

//TODO Drinks
//Apple Juice
//Cola Can
//Orange Juice Can
//Bottle of Water
//Bottle of Milk
//Energy Drink
//Milkshake
//Coffee
//Hot chocolate