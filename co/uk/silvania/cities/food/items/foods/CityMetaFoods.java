package co.uk.silvania.cities.food.items.foods;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CityMetaFoods extends ItemFood {

	
	public CityMetaFoods(int id, int heal, float sat, boolean wolf) {
		super(id, heal, sat, wolf);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setMaxStackSize(16);
		this.setHasSubtypes(true);
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		icons = new Icon[4];
		for(int i = 0; i < icons.length; i++) {
			icons[i] = icon.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}
	
	public static final String[] names = new String[] {"0", "1", "2", "3"};
	
	public String getUnlocalizedName(ItemStack item) {
		int i = MathHelper.clamp_int(item.getItemDamage(), 0, 15);
		return super.getUnlocalizedName() + names[i];
	}
	
	public Icon getIconFromDamage(int dmg) {
		return icons[dmg];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubItems(int meta, CreativeTabs tabs, List list) {
		for (int x = 0; x < 4; x++) {
			list.add(new ItemStack(this, 1, x));
		}
	}
}