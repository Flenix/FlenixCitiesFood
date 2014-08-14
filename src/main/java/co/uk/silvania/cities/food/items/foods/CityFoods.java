package co.uk.silvania.cities.food.items.foods;

import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class CityFoods extends ItemFood {

	public CityFoods(int heal, float sat, boolean wolf) {
		super(heal, sat, wolf);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setMaxStackSize(16);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)));
	}
	
	public void plannedFoods() {
		//TODO the following
		
		

		
		//TODO Mechanics
		//Thirst - Adds a new thing to worry about
		//Max saturation (getting "full") - Makes you choose food wisely. Just bread will fill sat before it fills hunger for example.
		//Spoiling - Food can go off when not stored in a fridge or freezer. Which depends on the type of food.
		//Burning - Food cooking changes entirely. It will keep cooking until you turn off the oven, and if it goes over the timer, it burns and becomes useless.
		//Undercooked - certain meats will poison you if undercooked.
		//Hot/Cold food - If a meal is cooked, it gives higher food values while it's hot.
		
		//TODO Tools & Blocks
		//Stove
		//Hob
		//Oven (Stove/Hob together)
		//Timer Oven (Can auto-disable itself to prevent food burning. Expensive)
		//Microwave
		//Frying Pan
		//Small Saucepan
		//Large Saucepan
		//Wok
		//Large knife
		//Small knife
		//Bread knife
		//Cheese knife
		//Spatula
		//Mincer
		//Egg Timer
		//Electric Timer (beeps)
		//Fridge
		//Freezer
		//Glass Fridge (DONE)
		//Glass Freezer (DONE)
		//Microwave (Gives lower fill but higher sat for things which can be cooked in here.)
	}
}