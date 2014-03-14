//Credit to Iguana_Man for showing me how he overrides food.
//Unfortunately due to his help, I am not sure if this is compatible with his mod Hunger Overhaul.
//I have added a configuration option to potentially decide whether I will force-override him or not (default to not) - I cannot force him to override me.
//Class modifies food values, so my food has more worth behind it. Can be disabled of course.

package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.items.foods.CityFoods;
import co.uk.silvania.cities.food.items.foods.ItemDisabledFood;
import co.uk.silvania.cities.food.items.foods.ItemFoodMeat;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.potion.Potion;
import cpw.mods.fml.common.Loader;

public class VanillaFoods {

	
	public static void run() {
        if (Loader.isModLoaded("malnourished")) {
        	System.out.println("Malnourished Detected; handing over vanilla food control");
        } else {
			if(FoodConfig.overrideFood) {
		        Item.itemsList[Item.appleRed.itemID] = null;
		        Item.itemsList[Item.bread.itemID] = null;
		        Item.itemsList[Item.porkRaw.itemID] = null;
		        Item.itemsList[Item.porkCooked.itemID] = null;
		        Item.itemsList[Item.fishRaw.itemID] = null;
		        Item.itemsList[Item.fishCooked.itemID] = null;
		        Item.itemsList[Item.cookie.itemID] = null;
		        Item.itemsList[Item.melon.itemID] = null;
		        Item.itemsList[Item.beefRaw.itemID] = null;
		        Item.itemsList[Item.beefCooked.itemID] = null;
		        Item.itemsList[Item.chickenRaw.itemID] = null;
		        Item.itemsList[Item.chickenCooked.itemID] = null;
		        Item.itemsList[Item.rottenFlesh.itemID] = null;
		        Item.itemsList[Item.bakedPotato.itemID] = null;
		        Item.itemsList[Item.poisonousPotato.itemID] = null;
		        Item.itemsList[Item.pumpkinPie.itemID] = null;
		        Item.itemsList[Item.bowlSoup.itemID] = null;
		        Item.itemsList[Item.carrot.itemID] = null;
		        Item.itemsList[Item.potato.itemID] = null;

	            Item.appleRed = (new ItemFood(4, 1, 0.05F, false)).setUnlocalizedName("apple").setTextureName("apple");
	            Item.bread = (new ItemFood(41, 1, 0.4F, false)).setUnlocalizedName("bread").setTextureName("bread");
	            Item.fishRaw = (new ItemFood(93, 1, 0.05F, false)).setUnlocalizedName("fishRaw").setTextureName("fish_raw");
	            Item.fishCooked = (new ItemFood(94, 3, 0.1F, false)).setUnlocalizedName("fishCooked").setTextureName("fish_cooked");
	            Item.cookie = (new ItemFood(101, 1, 0.05F, false)).setUnlocalizedName("cookie").setTextureName("cookie");
	            Item.melon = (new ItemFood(104, 1, 0.05F, false)).setUnlocalizedName("melon").setTextureName("melon");
	            Item.rottenFlesh = (new ItemFood(111, 1, 0.05F, true)).setPotionEffect(Potion.poison.id, 30, 0, 0.4F).setUnlocalizedName("rottenFlesh").setTextureName("rotten_flesh");
	            Item.bakedPotato = (new ItemFood(137, 2, 0.15F, false)).setUnlocalizedName("potatoBaked").setTextureName("potato_baked");
	            Item.poisonousPotato = (new ItemFood(138, 1, 0.05F, false)).setPotionEffect(Potion.poison.id, 5, 0, 0.3F).setUnlocalizedName("potatoPoisonous").setTextureName("potato_poisonous");
	            Item.pumpkinPie = (new ItemFood(144, 3, 0.15F, false)).setUnlocalizedName("pumpkinPie").setTextureName("pumpkin_pie").setCreativeTab(CreativeTabs.tabFood);
	            Item.bowlSoup = (new ItemFood(26, 3, 0.1F, false)).setUnlocalizedName("mushroomStew").setTextureName("mushroom_stew");
	            Item.carrot = (new ItemSeedFood(135, 1, 0.05F, Block.carrot.blockID, Block.tilledField.blockID)).setUnlocalizedName("carrots").setTextureName("carrot");
	            Item.potato = (new ItemSeedFood(136, 1, 0.05F, Block.potato.blockID, Block.tilledField.blockID)).setUnlocalizedName("potato").setTextureName("potato");
	            
	            Item.porkRaw = (new ItemFoodMeat(63, 0.0, 0.05F, true, 96000, "PorkChop", 3, 7, 12, true, 00000, true, 123)).setUnlocalizedName("porkchopRaw").setTextureName("porkchop_raw");
	            Item.porkCooked = (new ItemDisabledFood(64, 3, 0.15F, true)).setUnlocalizedName("porkchopCooked").setTextureName("porkchop_cooked");
	            Item.beefRaw = (new ItemFoodMeat(107, 0.0, 0.05F, true, 120000, "RumpSteak", 4, 8, 13, false, 00000, true, 123)).setUnlocalizedName("beefRaw").setTextureName("beef_raw");
	            Item.beefCooked = (new ItemDisabledFood(108, 3, 0.15F, true)).setUnlocalizedName("beefCooked").setTextureName("beef_cooked");
	            Item.chickenRaw = (new ItemFoodMeat(109, 0.0, 0.05F, true, 36000, "ChickenWhole", 2, 5, 8, true, 02021, false, 123)).setPotionEffect(Potion.poison.id, 30, 0, 0.15F).setUnlocalizedName("chickenRaw").setTextureName("chicken_raw");
	            Item.chickenCooked = (new ItemDisabledFood(110, 3, 0.15F, true)).setUnlocalizedName("chickenCooked").setTextureName("chicken_cooked");
	        }
		}
	}
}
