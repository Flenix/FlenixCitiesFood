package co.uk.silvania.cities.food.items.foods;

import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class CityFoods extends ItemFood {

	public CityFoods(int id, int heal, float sat, boolean wolf) {
		super(id, heal, sat, wolf);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setMaxStackSize(16);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)));
	}
	
	public void plannedFoods() {
		//TODO the following
		
		//TODO Set up NBT
		//NBT values are for all foods, and consist of the following:
		//Feed (read by minecraft and applied to hunger bar. Int)
		//Saturation (read by MC and applied as normal. Float)
		//Spoil Date (Time in ticks until it's considered off. When off, the texture changes and the name turns red. Shown in item tooltip. Int)
		//Packaged (Whether the item has been packaged. If so, it applies two texture layers to add "packaging". String for different types.)
		//Storage type is set by which type of food it extends (FoodChillable or FoodFreezable)
		
		//BB = Best Before (Fresh/Packed) (in in-game days or 24000 ticks)
		//Cooking increases values, but effectively kills the spoil time. 0 means it can't be cooked.
		//Packaging it will simply take the current age off the pack time. Eg if the pack life is 5, and it was made 2 days ago, it's pack life will be 3.
		//Best Before will be displayed on the item tooltip as a countdown.
		
		//ST = Storage. Fridge, Freezer or none. Storage prevents food from ever spoiling and freezes it's best before value.
		//Putting it anywhere except the correct one will do nothing. If the value is "none", storage is irrelevant and can't preserve the food.
		//Other blocks may extend fridge and freezer. For example a vending machine is a fridge, a fish sale panel is a freezer.
		
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