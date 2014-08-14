package co.uk.silvania.cities.food.items;

import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class CraftingItems extends Item {

	public CraftingItems() {
		super();
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
		this.setMaxStackSize(16);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
