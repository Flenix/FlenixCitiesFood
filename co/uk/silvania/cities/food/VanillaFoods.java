//Credit to Iguana_Man & his Hunger Overhaul mod for this class.
//Class modifies vanilla food values, so my food has more worth behind it. Can be disabled of course.

package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.items.CityFoods;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.potion.Potion;
import cpw.mods.fml.common.Loader;

public class VanillaFoods {

	public static void run() {
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

		if(FoodConfig.overrideFood == false)
		{
            Item.appleRed = (new ItemFood(4, ((ItemFood)Item.appleRed).getHealAmount(), ((ItemFood)Item.appleRed).getSaturationModifier(), false)).setUnlocalizedName("apple");
            Item.bread = (new ItemFood(41, ((ItemFood)Item.bread).getHealAmount(), ((ItemFood)Item.bread).getSaturationModifier(), false)).setUnlocalizedName("bread");
            Item.porkRaw = (new ItemFood(63, ((ItemFood)Item.porkRaw).getHealAmount(), ((ItemFood)Item.porkRaw).getSaturationModifier(), true)).setUnlocalizedName("porkchopRaw");
            Item.porkCooked = (new ItemFood(64, ((ItemFood)Item.porkCooked).getHealAmount(), ((ItemFood)Item.porkCooked).getSaturationModifier(), true)).setUnlocalizedName("porkchopCooked");
            Item.fishRaw = (new ItemFood(93, ((ItemFood)Item.fishRaw).getHealAmount(), ((ItemFood)Item.fishRaw).getSaturationModifier(), false)).setUnlocalizedName("fishRaw");
            Item.fishCooked = (new ItemFood(94, ((ItemFood)Item.fishCooked).getHealAmount(), ((ItemFood)Item.fishCooked).getSaturationModifier(), false)).setUnlocalizedName("fishCooked");
            Item.cookie = (new ItemFood(101, ((ItemFood)Item.cookie).getHealAmount(), ((ItemFood)Item.cookie).getSaturationModifier(), false)).setUnlocalizedName("cookie");
            Item.melon = (new ItemFood(104, ((ItemFood)Item.melon).getHealAmount(), ((ItemFood)Item.melon).getSaturationModifier(), false)).setUnlocalizedName("melon");
            Item.beefRaw = (new ItemFood(107, ((ItemFood)Item.beefRaw).getHealAmount(), ((ItemFood)Item.beefRaw).getSaturationModifier(), true)).setUnlocalizedName("beefRaw");
            Item.beefCooked = (new ItemFood(108, ((ItemFood)Item.beefCooked).getHealAmount(), ((ItemFood)Item.beefCooked).getSaturationModifier(), true)).setUnlocalizedName("beefCooked");
            Item.chickenRaw = (new ItemFood(109, ((ItemFood)Item.chickenRaw).getHealAmount(), ((ItemFood)Item.chickenRaw).getSaturationModifier(), true)).setPotionEffect(Potion.poison.id, 30, 0, 0.3F).setUnlocalizedName("chickenRaw");
            Item.chickenCooked = (new ItemFood(110, ((ItemFood)Item.chickenCooked).getHealAmount(), ((ItemFood)Item.chickenCooked).getSaturationModifier(), true)).setUnlocalizedName("chickenCooked");
            Item.rottenFlesh = (new ItemFood(111, ((ItemFood)Item.rottenFlesh).getHealAmount(), ((ItemFood)Item.rottenFlesh).getSaturationModifier(), true)).setPotionEffect(Potion.poison.id, 30, 0, 0.8F).setUnlocalizedName("rottenFlesh");
            Item.bakedPotato = (new ItemFood(137, ((ItemFood)Item.bakedPotato).getHealAmount(), ((ItemFood)Item.bakedPotato).getSaturationModifier(), false)).setUnlocalizedName("potatoBaked");
            Item.poisonousPotato = (new ItemFood(138, ((ItemFood)Item.poisonousPotato).getHealAmount(), ((ItemFood)Item.poisonousPotato).getSaturationModifier(), false)).setPotionEffect(Potion.poison.id, 5, 0, 0.6F).setUnlocalizedName("potatoPoisonous");
            Item.pumpkinPie = (new ItemFood(144, ((ItemFood)Item.pumpkinPie).getHealAmount(), ((ItemFood)Item.pumpkinPie).getSaturationModifier(), false)).setUnlocalizedName("pumpkinPie").setCreativeTab(CreativeTabs.tabFood);
            Item.bowlSoup = (new ItemFood(26, ((ItemFood)Item.bowlSoup).getHealAmount(), ((ItemFood)Item.bowlSoup).getSaturationModifier(), false)).setUnlocalizedName("mushroomStew");
            Item.carrot = (new ItemSeedFood(135, ((ItemSeedFood)Item.carrot).getHealAmount(), ((ItemSeedFood)Item.carrot).getSaturationModifier(), Block.carrot.blockID, Block.tilledField.blockID)).setUnlocalizedName("carrots");
            Item.potato = (new ItemSeedFood(136, ((ItemSeedFood)Item.potato).getHealAmount(), ((ItemSeedFood)Item.potato).getSaturationModifier(), Block.potato.blockID, Block.tilledField.blockID)).setUnlocalizedName("potato");
		}
		else
		{
            Item.appleRed = (new ItemFood(4, 1, 0.05F, false)).setUnlocalizedName("apple").func_111206_d("apple");
            Item.bread = (new ItemFood(41, 1, 0.4F, false)).setUnlocalizedName("bread").func_111206_d("bread");
            Item.porkRaw = (new ItemFood(63, 0, 0.05F, true)).setUnlocalizedName("porkchopRaw").func_111206_d("porkchop_raw");
            Item.porkCooked = (new ItemFood(64, 3, 0.15F, true)).setUnlocalizedName("porkchopCooked").func_111206_d("porkchop_cooked");
            Item.fishRaw = (new ItemFood(93, 1, 0.05F, false)).setUnlocalizedName("fishRaw").func_111206_d("fish_raw");
            Item.fishCooked = (new ItemFood(94, 3, 0.1F, false)).setUnlocalizedName("fishCooked").func_111206_d("fish_cooked");
            Item.cookie = (new ItemFood(101, 1, 0.05F, false)).setUnlocalizedName("cookie").func_111206_d("cookie");
            Item.melon = (new ItemFood(104, 1, 0.05F, false)).setUnlocalizedName("melon").func_111206_d("melon");
            Item.beefRaw = (new ItemFood(107, 0, 0.05F, true)).setUnlocalizedName("beefRaw").func_111206_d("beef_raw");
            Item.beefCooked = (new ItemFood(108, 3, 0.15F, true)).setUnlocalizedName("beefCooked").func_111206_d("beef_cooked");
            Item.chickenRaw = (new ItemFood(109, 0, 0.05F, true)).setPotionEffect(Potion.poison.id, 30, 0, 0.15F).setUnlocalizedName("chickenRaw").func_111206_d("chicken_raw");
            Item.chickenCooked = (new ItemFood(110, 3, 0.15F, true)).setUnlocalizedName("chickenCooked").func_111206_d("chicken_cooked");
            Item.rottenFlesh = (new ItemFood(111, 1, 0.05F, true)).setPotionEffect(Potion.poison.id, 30, 0, 0.4F).setUnlocalizedName("rottenFlesh").func_111206_d("rotten_flesh");
            Item.bakedPotato = (new ItemFood(137, 2, 0.15F, false)).setUnlocalizedName("potatoBaked").func_111206_d("potato_baked");
            Item.poisonousPotato = (new ItemFood(138, 1, 0.05F, false)).setPotionEffect(Potion.poison.id, 5, 0, 0.3F).setUnlocalizedName("potatoPoisonous").func_111206_d("potato_poisonous");
            Item.pumpkinPie = (new ItemFood(144, 3, 0.15F, false)).setUnlocalizedName("pumpkinPie").func_111206_d("pumpkin_pie").setCreativeTab(CreativeTabs.tabFood);
            Item.bowlSoup = (new ItemFood(26, 3, 0.1F, false)).setUnlocalizedName("mushroomStew").func_111206_d("mushroom_stew");
            Item.carrot = (new ItemSeedFood(135, 1, 0.05F, Block.carrot.blockID, Block.tilledField.blockID)).setUnlocalizedName("carrots").func_111206_d("carrot");
            Item.potato = (new ItemSeedFood(136, 1, 0.05F, Block.potato.blockID, Block.tilledField.blockID)).setUnlocalizedName("potato").func_111206_d("potato");
		}
	}

}
