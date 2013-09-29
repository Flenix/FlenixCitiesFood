package co.uk.silvania.cities.food;

import net.minecraft.item.Item;
import co.uk.silvania.cities.core.items.CraftingIngredientItems;
import co.uk.silvania.cities.food.items.CityDrinks;
import co.uk.silvania.cities.food.items.CityFoods;
import co.uk.silvania.cities.food.items.CityMetaFoods;
import co.uk.silvania.cities.food.items.CraftingItems;
import co.uk.silvania.cities.food.items.SeedItems;

public class FCF_Items {
	private static FoodConfig config;
	
	public static Item foodCheeseBurger;
	public static Item foodBurger;
	public static Item foodHotDog;
	public static Item foodPizza;
	public static Item foodNoodles;
	public static Item foodChocolateBar;
	public static Item foodCrisps;
	public static Item foodEnergyBar;
	public static Item foodCheese;
	public static Item foodTomato;
	public static Item foodDonut;
	public static Item foodSweets;
	public static Item foodFries;
	public static Item foodPopcorn;
	public static Item foodIceCream;
	public static Item foodChickenWings;
	public static Item foodChickenNuggets;
	public static Item foodSausage;
	public static Item foodSausageRoll;
	
	public static Item lettuceItem;
	public static Item garlicItem;
	public static Item broccoliItem;
	public static Item cabbageItem;
	public static Item celeryItem;
	//public static Item cornItem;
	public static Item cucumberItem;
	public static Item redPepperItem;
	public static Item yellowPepperItem;
	public static Item greenPepperItem;
	public static Item leekItem;
	public static Item onionItem;
	public static Item blackberryItem;
	public static Item blueberryItem;
	public static Item blackcurrentItem;
	public static Item grapesItem;
	public static Item lemonItem;
	public static Item limeItem;
	public static Item orangeItem;
	public static Item strawberryItem;
	public static Item raspberryItem;
	public static Item riceItem;
	
	//public static Item pastryItem;
	//public static Item pieTin;
	//CheeseBlock
	
	public static Item broccoliSeed;
	public static Item tomatoSeed;
	public static Item lettuceSeed;
	public static Item garlicSeed;
	public static Item cabbageSeed;
	public static Item celerySeed;
	public static Item cornSeed;
	public static Item cucumberSeed;
	public static Item redPepperSeed;
	public static Item yellowPepperSeed;
	public static Item greenPepperSeed;
	public static Item leekSeed;
	public static Item grapesSeed;
	public static Item lemonSeed;
	public static Item limeSeed;
	public static Item orangeSeed;
	public static Item onionSeed;
	
	//TODO Growable
	public static Item drinkAppleJuice;
	public static Item drinkCola;
	public static Item drinkOrangeJuice;
	public static Item drinkWaterBottle;
	public static Item drinkMilkBottle;
	public static Item drinkEnergyDrink;
	public static Item drinkMilkshake;
	public static Item drinkCoffee;
	public static Item drinkHotChocolate;
	
	public static void init() {
		initFood();
		initDrinks();
		initSeeds();
	}
	
	public static void initFood() {
		foodCheeseBurger = new CityFoods(config.foodCheeseBurgerID, 8, 0.5F, true).setUnlocalizedName("foodCheeseBurger");
    	foodBurger = new CityFoods(config.foodBurgerID, 6, 0.4F, true).setUnlocalizedName("foodBurger");
    	foodHotDog = new CityFoods(config.foodHotDogID, 5, 0.3F, true).setUnlocalizedName("foodHotDog");
    	foodPizza = new CityMetaFoods(config.foodPizzaID, 12, 0.4F, true).setUnlocalizedName("foodPizza");
    	foodNoodles = new CityFoods(config.foodNoodlesID, 4, 0.15F, true).setUnlocalizedName("foodNoodles");
    	//foodChocolateBar = new CityMetaFoods(config.foodChocolateBarID, 8, 0.01F, true).setUnlocalizedName("foodChocolateBar");
    	foodCrisps = new CityMetaFoods(config.foodCrispsID, 5, 0.01F, true).setUnlocalizedName("foodCrisps");
    	//foodEnergyBar = new CityFoods(config.foodEnergyBarID, 10, 0F, true).setUnlocalizedName("foodEnergyBar");
    	foodCheese = new CityFoods(config.foodCheeseID, 2, 0.05F, true).setUnlocalizedName("foodCheese");
    	//foodTomato = new CityFoods(config.foodTomatoID, 1, 0.05F, true).setUnlocalizedName("foodTomato");
    	//foodDonut = new CityFoods(config.foodDonutID, 6, 0.01F, true).setUnlocalizedName("foodDonut");
    	//foodSweets = new CityFoods(config.foodSweetsID, 2, 0.01F, true).setUnlocalizedName("foodSweets");
    	//foodFries = new CityFoods(config.foodFriesID, 4, 0.15F, true).setUnlocalizedName("foodFries");
    	foodPopcorn = new CityFoods(config.foodPopcornID, 3, 0.05F, true).setUnlocalizedName("foodPopcorn");
    	//foodIceCream = new CityFoods(config.foodIceCreamID, 4, 0.07F, true).setUnlocalizedName("foodIceCream");
    	//foodChickenWings = new CityFoods(config.foodChickenWingsID, 5, 0.2F, true).setUnlocalizedName("foodChickenWings");
    	//foodChickenNuggets = new CityFoods(config.foodChickenNuggetsID, 5, 0.2F, true).setUnlocalizedName("foodChickenNuggets");
    	//foodSausage = new CityFoods(config.foodSausageID, 2, 0.2F, true).setUnlocalizedName("foodSausage");
    	//foodSausageRoll = new CityFoods(config.foodSausageRollID, 4, 0.3F, true).setUnlocalizedName("foodSausageRoll");
    	
    	//lettuceItem = new CityFoods(config.lettuceItemID, 1, 0.05F, false).setUnlocalizedName("lettuceItem");
    	//garlicItem = new CityFoods(config.garlicItemID, 1, 0.05F, false).setUnlocalizedName("garlicItem");
    	broccoliItem = new CityFoods(config.broccoliItemID, 1, 0.05F, false).setUnlocalizedName("broccoliItem");
    	/*cabbageItem = new CityFoods(config.cabbageItemID, 1, 0.05F, false).setUnlocalizedName("cabbageItem");
    	celeryItem = new CityFoods(config.celeryItemID, 1, 0.05F, false).setUnlocalizedName("celeryItem");
    	cucumberItem = new CityFoods(config.cucumberItemID, 1, 0.05F, false).setUnlocalizedName("cucumberItem");
    	redPepperItem = new CityFoods(config.redPepperItemID, 1, 0.05F, false).setUnlocalizedName("redPepperItem");
    	yellowPepperItem = new CityFoods(config.yellowPepperItemID, 1, 0.05F, false).setUnlocalizedName("yellowPepperItem");
    	greenPepperItem = new CityFoods(config.greenPepperItemID, 1, 0.05F, false).setUnlocalizedName("greenPepperItem");
    	leekItem = new CityFoods(config.leekItemID, 1, 0.05F, false).setUnlocalizedName("leekItem");*/
    	onionItem = new CityFoods(config.onionItemID, 1, 0.05F, false).setUnlocalizedName("onionItem");
    	/*blackberryItem = new CityFoods(config.blackberryItemID, 1, 0.05F, false).setUnlocalizedName("blackberryItem");
    	blueberryItem = new CityFoods(config.blueberryItemID, 1, 0.05F, false).setUnlocalizedName("blueberryItem");
    	blackcurrentItem = new CityFoods(config.blackcurrentItemID, 1, 0.05F, false).setUnlocalizedName("blackcurrentItem");
    	grapesItem = new CityFoods(config.grapesItemID, 1, 0.05F, false).setUnlocalizedName("grapesItem");
    	lemonItem = new CityFoods(config.lemonItemID, 1, 0.05F, false).setUnlocalizedName("lemonItem");
    	limeItem = new CityFoods(config.limeItemID, 1, 0.05F, false).setUnlocalizedName("limeItem");
    	orangeItem = new CityFoods(config.orangeItemID, 1, 0.05F, false).setUnlocalizedName("orangeItem");
    	strawberryItem = new CityFoods(config.strawberryItemID, 1, 0.05F, false).setUnlocalizedName("strawberryItem");
    	raspberryItem = new CityFoods(config.raspberryItemID, 1, 0.05F, false).setUnlocalizedName("raspberryItem");
    	
    	pastryItem = new CraftingItems(config.pastryItemID).setUnlocalizedName("pastryItem");
    	pieTin = new CraftingItems(config.pieTinID).setUnlocalizedName("pieTin");
    	cornItem = new CraftingItems(config.cornItemID).setUnlocalizedName("cornItem");*/
	}
	
	public static void initDrinks() {
    	/*drinkAppleJuice = new CityDrinks(config.drinkAppleJuiceID, 4, false).setUnlocalizedName("drinkAppleJuice");
    	drinkCola = new CityDrinks(config.drinkColaID, 2, false).setUnlocalizedName("drinkCola");
    	drinkOrangeJuice = new CityDrinks(config.drinkOrangeJuiceID, 5, false).setUnlocalizedName("drinkOrangeJuice");
    	drinkWaterBottle = new CityDrinks(config.drinkWaterBottleID, 3, false).setUnlocalizedName("drinkWaterBottle");
    	drinkMilkBottle = new CityDrinks(config.drinkMilkBottleID, 4, false).setUnlocalizedName("drinkMilkBottle");
    	drinkEnergyDrink = new CityDrinks(config.drinkEnergyDrinkID, 6, false).setUnlocalizedName("drinkEnergyDrink");
    	drinkMilkshake = new CityDrinks(config.drinkMilkshakeID, 5, false).setUnlocalizedName("drinkMilkshake");
    	drinkCoffee = new CityDrinks(config.drinkCoffeeID, 4, false).setUnlocalizedName("drinkCoffee");
    	drinkHotChocolate = new CityDrinks(config.drinkHotChocolateID, 2, false).setUnlocalizedName("drinkHotChocolate");*/
	}
	
	public static void initSeeds() {
		/*broccoliSeed = new SeedItems(config.broccoliSeedID, FCF_Blocks.broccoliCrop.blockID).setUnlocalizedName("broccoliSeed");
		lettuceSeed = new SeedItems(config.lettuceSeedID, FCF_Blocks.lettuceCrop.blockID).setUnlocalizedName("lettuceSeed");
		garlicSeed = new SeedItems(config.garlicSeedID, FCF_Blocks.garlicCrop.blockID).setUnlocalizedName("garlicSeed");
		cabbageSeed = new SeedItems(config.cabbageSeedID, FCF_Blocks.cabbageCrop.blockID).setUnlocalizedName("cabbageSeed");
		celerySeed = new SeedItems(config.celerySeedID, FCF_Blocks.celeryCrop.blockID).setUnlocalizedName("celerySeed");
		leekSeed = new SeedItems(config.leekSeedID, FCF_Blocks.leekCrop.blockID).setUnlocalizedName("leekSeed");*/
		onionSeed = new SeedItems(config.onionSeedID, FCF_Blocks.onionCrop.blockID).setUnlocalizedName("onionSeed");
		/*lemonSeed = new SeedItems(config.lemonSeedID, FCF_Blocks.lemonCrop.blockID).setUnlocalizedName("lemonSeed");
		limeSeed = new SeedItems(config.limeSeedID, FCF_Blocks.limeCrop.blockID).setUnlocalizedName("limeSeed");
		orangeSeed = new SeedItems(config.orangeSeedID, FCF_Blocks.orangeCrop.blockID).setUnlocalizedName("orangeSeed");*/
		riceItem = new SeedItems(config.riceItemID, FCF_Blocks.riceCrop.blockID).setUnlocalizedName("riceItem");
		
	}

}
