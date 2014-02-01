package co.uk.silvania.cities.food;

import net.minecraft.item.Item;
import co.uk.silvania.cities.core.items.CraftingIngredientItems;
import co.uk.silvania.cities.food.items.CraftingItems;
import co.uk.silvania.cities.food.items.ItemFoodMeat;
import co.uk.silvania.cities.food.items.ItemNBTSystem;
import co.uk.silvania.cities.food.items.ItemUtensil;
import co.uk.silvania.cities.food.items.SeedItems;
import co.uk.silvania.cities.food.items.foods.CityDrinks;
import co.uk.silvania.cities.food.items.foods.CityFoods;
import co.uk.silvania.cities.food.items.foods.CityMetaFoods;

public class FCF_Items {
	private static FoodConfig config;
	
	//Raw Ingredients
	public static Item lambMeat;
	public static Item rawDuck;
	public static Item rawMutton;
	public static Item rawTurkey;
	public static Item rawPheasant;
	public static Item rawHorse;
	public static Item rawRabbit;
	public static Item rawVenison;
	public static Item rawGoat;
	public static Item rawPigeon;
	public static Item rawOx;
	public static Item rawBuffalo;
	public static Item rawBoar;
	public static Item rawSnail;
	
	public static Item rawSquid;
	public static Item rawCod;
	public static Item rawLobster;
	public static Item rawCrab;
	public static Item rawPrawn;
	public static Item rawShrimp;
	public static Item rawAnchovy;
	public static Item rawTuna;
	public static Item rawSardine;
	public static Item rawCarp;
	public static Item rawOyster;
	public static Item rawMussel;
	public static Item rawShark;
	public static Item rawTrout;
	public static Item rawBass;
	public static Item rawHaddock;
	public static Item rawSwordfish;
	public static Item rawMackeral;
	
	
	//Fruit n Veg
	public static Item tomatoItem;
	public static Item lettuceItem;
	public static Item garlicItem;
	public static Item broccoliItem;
	public static Item cabbageItem;
	public static Item celeryItem;
	public static Item cornItem;
	public static Item cucumberItem;
	public static Item redPepperItem;
	public static Item yellowPepperItem;
	public static Item greenPepperItem;
	public static Item leekItem;
	public static Item onionItem;
	public static Item blackberryItem;
	public static Item blueberryItem;
	public static Item blackcurrantItem;
	public static Item grapesItem;
	public static Item redGrapesItem;
	public static Item lemonItem;
	public static Item limeItem;
	public static Item orangeItem;
	public static Item strawberryItem;
	public static Item raspberryItem;
	public static Item avocadoItem;
	public static Item pearItem;
	public static Item bananaItem;
	public static Item seaweedItem;
	public static Item rhubarbItem;
	
	//Prepared Ingredients
	public static Item foodChocolateBar;
	public static Item foodCrisps;
	public static Item foodEnergyBar;
	public static Item foodCheeseMolten;
	public static Item foodCheeseMild;
	public static Item foodCheeseMedium;
	public static Item foodCheeseMature;
	public static Item foodCheeseBlue;
	public static Item foodCheeseMouldy;
	public static Item foodSausage;
	public static Item pastryItem;
	public static Item doughItem;
	public static Item chocolateItem;
	public static Item chocolateChips;
	public static Item breadSlice;
	public static Item breadCrumbs;
	public static Item mincedBeef;
	public static Item coneItem;
	
	//Snacks etc
	public static Item foodDonut;
	public static Item foodSweets;
	public static Item foodFries;
	public static Item foodPopcorn;
	public static Item foodIceCream;
	public static Item foodChocolateIceCream;
	public static Item foodMuffin;
	public static Item foodChocolateMuffin;
	public static Item foodBlueberryMuffin;
	public static Item chocolateCake;
	public static Item chocolateCakeSlice;
	public static Item cakeSlice;
	public static Item strawberryCheesecake;
	public static Item chocolateCheesecake;
	public static Item foodVanillaCone;
	public static Item foodChocolateCone;
	public static Item strawberryIceLolly;
	public static Item chocolateIceLolly;
	public static Item milkIceLolly;
	
	//Meal Parts
	public static Item foodChickenWings;
	public static Item foodChickenNuggets;
	public static Item foodSausageRoll;
	public static Item foodCheeseBurger;
	public static Item foodBurger;
	public static Item foodHotDog;
	public static Item foodNoodles;
	public static Item foodPizza;
	
	public static Item cookedLamb;
	public static Item cookedDuck;
	public static Item cookedMutton;
	public static Item cookedTurkey;
	public static Item cookedPheasant;
	public static Item cookedHorse;
	public static Item cookedRabbit;
	public static Item cookedVenison;
	public static Item cookedGoat;
	public static Item cookedPigeon;
	public static Item cookedOx;
	public static Item cookedBuffalo;
	public static Item cookedBoar;
	public static Item cookedSnail;
	
	public static Item cookedSquid;
	public static Item cookedCod;
	public static Item cookedLobster;
	public static Item cookedCrab;
	public static Item cookedPcookedn;
	public static Item cookedShrimp;
	public static Item cookedAnchovy;
	public static Item cookedTuna;
	public static Item cookedSardine;
	public static Item cookedCarp;
	public static Item cookedOyster;
	public static Item cookedMussel;
	public static Item cookedShark;
	public static Item cookedTrout;
	public static Item cookedBass;
	public static Item cookedHaddock;
	public static Item cookedSwordfish;
	public static Item cookedMackeral;
	
	//Meals
	
	
	//Condements
	public static Item tomatoKetchup;
	public static Item brownSauce;
	public static Item saltItem;
	public static Item vinegarItem;
	public static Item mustardItem;

	//Seeds
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
	public static Item onionSeed;
	public static Item riceItem;
	public static Item rapeSeed;
	public static Item blueBerrySeed;
	public static Item blackCurrantSeed;
	public static Item avocadoSeed;
	public static Item rhubarbSeed;
	
	//Utensils
	public static Item pieTin;
	public static Item knifeForkItem;
	public static Item spoonItem;
	public static Item woodenSpoon;
	public static Item breadKnife;
	public static Item cheeseKnife;
	public static Item largeKnife;
	public static Item saucepanSmall;
	public static Item saucepanLarge;
	public static Item fryingPan;
	public static Item wokItem;
	public static Item smallContainer;
	public static Item medContainer;
	public static Item largeContainer;
	public static Item smallPlate;
	public static Item largePlate;
	public static Item bowlItem;
	public static Item mugItem;
	public static Item plasticCup;
	public static Item glassCup;
	
	//Drinks
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
		initRawIngredients();
		initFruitnVeg();
		initPreparedIngredients();
		initSnacks();
		initMealParts();
		initMeals();
		initDrinks();
		initSeeds();
		initUtensils();
	}
	
	public static void initRawIngredients() {
		//Arguments for meat are as follows:
		//ID, Feed amount, Saturation amount, Wolf feeding, Time (ticks), Name, undercooked value, cooked value, burned value
		lambMeat = new ItemFoodMeat(config.rawLambID, 1, 0.05F, true, 48000, "Lamb Meat", 2, 6, 10).setUnlocalizedName("lambMeat");
		rawDuck = new CityFoods(config.rawDuckID, 1, 0.05F, true).setUnlocalizedName("rawDuck");
		rawMutton = new CityFoods(config.rawMuttonID, 1, 0.05F, true).setUnlocalizedName("rawMutton");
		rawTurkey = new CityFoods(config.rawTurkeyID, 1, 0.05F, true).setUnlocalizedName("rawTurkey");
		rawPheasant = new CityFoods(config.rawPheasantID, 1, 0.05F, true).setUnlocalizedName("rawPheasant");
		rawHorse = new CityFoods(config.rawHorseID, 1, 0.05F, true).setUnlocalizedName("rawHorse");
		rawRabbit = new CityFoods(config.rawRabbitID, 1, 0.05F, true).setUnlocalizedName("rawRabbit");
		rawVenison = new CityFoods(config.rawVenisonID, 1, 0.05F, true).setUnlocalizedName("rawVenison");
		rawGoat = new CityFoods(config.rawGoatID, 1, 0.05F, true).setUnlocalizedName("rawGoat");
		rawPigeon = new CityFoods(config.rawPigeonID, 1, 0.05F, true).setUnlocalizedName("rawPigeon");
		rawOx = new CityFoods(config.rawOxID, 1, 0.05F, true).setUnlocalizedName("rawOx");
		rawBuffalo = new CityFoods(config.rawBuffaloID, 1, 0.05F, true).setUnlocalizedName("rawBuffalo");
		rawBoar = new CityFoods(config.rawBoarID, 1, 0.05F, true).setUnlocalizedName("rawBoar");
		rawSnail = new CityFoods(config.rawSnailID, 1, 0.05F, true).setUnlocalizedName("rawSnail");
		
		rawSquid = new CityFoods(config.rawSquidID, 1, 0.05F, true).setUnlocalizedName("rawSquid");
		rawCod = new CityFoods(config.rawCodID, 1, 0.05F, true).setUnlocalizedName("rawCod");
		rawLobster = new CityFoods(config.rawLobsterID, 1, 0.05F, true).setUnlocalizedName("rawLobster");
		rawCrab = new CityFoods(config.rawCrabID, 1, 0.05F, true).setUnlocalizedName("rawCrab");
		rawPrawn = new CityFoods(config.rawPrawnID, 1, 0.05F, true).setUnlocalizedName("rawPrawn");
		rawShrimp = new CityFoods(config.rawShrimpID, 1, 0.05F, true).setUnlocalizedName("rawShrimp");
		rawAnchovy = new CityFoods(config.rawAnchovyID, 1, 0.05F, true).setUnlocalizedName("rawAnchovy");
		rawTuna = new CityFoods(config.rawTunaID, 1, 0.05F, true).setUnlocalizedName("rawTuna");
		rawSardine = new CityFoods(config.rawSardineID, 1, 0.05F, true).setUnlocalizedName("rawSardine");
		rawCarp = new CityFoods(config.rawCarpID, 1, 0.05F, true).setUnlocalizedName("rawCarp");
		rawOyster = new CityFoods(config.rawOysterID, 1, 0.05F, true).setUnlocalizedName("rawOyster");
		rawMussel = new CityFoods(config.rawMusselID, 1, 0.05F, true).setUnlocalizedName("rawMussel");
		rawShark = new CityFoods(config.rawSharkID, 1, 0.05F, true).setUnlocalizedName("rawShark");
		rawTrout = new CityFoods(config.rawTroutID, 1, 0.05F, true).setUnlocalizedName("rawTrout");
		rawBass = new CityFoods(config.rawBassID, 1, 0.05F, true).setUnlocalizedName("rawBass");
		rawHaddock = new CityFoods(config.rawHaddockID, 1, 0.05F, true).setUnlocalizedName("rawHaddock");
		rawSwordfish = new CityFoods(config.rawSwordfishID, 1, 0.05F, true).setUnlocalizedName("rawSwordfish");
		rawMackeral = new CityFoods(config.rawMackeralID, 1, 0.05F, true).setUnlocalizedName("rawMackeral");
	}
	
	public static void initFruitnVeg() {
    	tomatoItem = new CityFoods(config.foodTomatoID, 1, 0.05F, true).setUnlocalizedName("foodTomato");
    	lettuceItem = new CityFoods(config.lettuceItemID, 1, 0.05F, false).setUnlocalizedName("lettuceItem");
    	garlicItem = new CityFoods(config.garlicItemID, 1, 0.05F, false).setUnlocalizedName("garlicItem");
    	broccoliItem = new CityFoods(config.broccoliItemID, 1, 0.05F, false).setUnlocalizedName("broccoliItem");
    	cabbageItem = new CityFoods(config.cabbageItemID, 1, 0.05F, false).setUnlocalizedName("cabbageItem");
    	celeryItem = new CityFoods(config.celeryItemID, 1, 0.05F, false).setUnlocalizedName("celeryItem");
    	cornItem = new CraftingItems(config.cornItemID).setUnlocalizedName("cornItem");
    	cucumberItem = new CityFoods(config.cucumberItemID, 1, 0.05F, false).setUnlocalizedName("cucumberItem");
    	redPepperItem = new CityFoods(config.redPepperItemID, 1, 0.05F, false).setUnlocalizedName("redPepperItem");
    	yellowPepperItem = new CityFoods(config.yellowPepperItemID, 1, 0.05F, false).setUnlocalizedName("yellowPepperItem");
    	greenPepperItem = new CityFoods(config.greenPepperItemID, 1, 0.05F, false).setUnlocalizedName("greenPepperItem");
    	leekItem = new CityFoods(config.leekItemID, 1, 0.05F, false).setUnlocalizedName("leekItem");
    	onionItem = new CityFoods(config.onionItemID, 1, 0.05F, false).setUnlocalizedName("onionItem");
    	blackberryItem = new CityFoods(config.blackberryItemID, 1, 0.05F, false).setUnlocalizedName("blackberryItem");
    	blueberryItem = new CityFoods(config.blueberryItemID, 1, 0.05F, false).setUnlocalizedName("blueberryItem");
    	blackcurrantItem = new CityFoods(config.blackcurrentItemID, 1, 0.05F, false).setUnlocalizedName("blackcurrentItem");
    	grapesItem = new CityFoods(config.grapesItemID, 1, 0.05F, false).setUnlocalizedName("grapesItem");
    	redGrapesItem = new CityFoods(config.redGrapesItemID, 1, 0.05F, false).setUnlocalizedName("redGrapesItem");
    	lemonItem = new CityFoods(config.lemonItemID, 1, 0.05F, false).setUnlocalizedName("lemonItem");
    	limeItem = new CityFoods(config.limeItemID, 1, 0.05F, false).setUnlocalizedName("limeItem");
    	orangeItem = new CityFoods(config.orangeItemID, 1, 0.05F, false).setUnlocalizedName("orangeItem");
    	strawberryItem = new CityFoods(config.strawberryItemID, 1, 0.05F, false).setUnlocalizedName("strawberryItem");
    	raspberryItem = new CityFoods(config.raspberryItemID, 1, 0.05F, false).setUnlocalizedName("raspberryItem");
    	avocadoItem = new CityFoods(config.avocadoItemID, 1, 0.05F, false).setUnlocalizedName("avocadoItem");
    	pearItem = new CityFoods(config.pearItemID, 1, 0.05F, false).setUnlocalizedName("pearItem");
    	bananaItem = new CityFoods(config.bananaItemID, 1, 0.05F, false).setUnlocalizedName("bananaItem");
    	seaweedItem = new CityFoods(config.seaweedItemID, 1, 0.05F, false).setUnlocalizedName("seaweedItem");
    	rhubarbItem = new CityFoods(config.rhubarbItemID, 1, 0.05F, false).setUnlocalizedName("rhubarbItem");
	}
	
	public static void initPreparedIngredients() {
    	foodChocolateBar = new CityMetaFoods(config.foodChocolateBarID, 8, 0.01F, true).setUnlocalizedName("foodChocolateBar");
    	foodCrisps = new CityMetaFoods(config.foodCrispsID, 5, 0.01F, true).setUnlocalizedName("foodCrisps");
    	foodEnergyBar = new CityFoods(config.foodEnergyBarID, 10, 0F, true).setUnlocalizedName("foodEnergyBar");
    	foodCheeseMolten = new CityFoods(config.foodCheeseMoltenID, 2, 0.05F, true).setUnlocalizedName("foodCheese");
    	foodCheeseMild = new CityFoods(config.foodCheeseMildID, 2, 0.05F, true).setUnlocalizedName("foodCheeseMild");
    	foodCheeseMedium = new CityFoods(config.foodCheeseMediumID, 2, 0.05F, true).setUnlocalizedName("foodCheeseMedium");
    	foodCheeseMature = new CityFoods(config.foodCheeseMatureID, 2, 0.05F, true).setUnlocalizedName("foodCheeseMature");
    	foodCheeseBlue = new CityFoods(config.foodCheeseBlueID, 2, 0.05F, true).setUnlocalizedName("foodCheeseBlue");
    	foodCheeseMouldy = new CityFoods(config.foodCheeseMouldyID, 2, 0.05F, true).setUnlocalizedName("foodCheeseMouldy");
    	foodSausage = new CityFoods(config.foodSausageID, 2, 0.2F, true).setUnlocalizedName("foodSausage");
    	pastryItem = new CraftingItems(config.pastryItemID).setUnlocalizedName("pastryItem"); //TODO
    	doughItem = new CraftingItems(config.doughItemID).setUnlocalizedName("doughItem"); //TODO
    	chocolateItem = new CityFoods(config.chocolateItemID, 2, 0.2F, true).setUnlocalizedName("chocolateItem");
    	chocolateChips = new CityFoods(config.chocolateChipsID, 2, 0.2F, true).setUnlocalizedName("chocolateChips");
    	breadSlice = new CityFoods(config.breadSliceID, 2, 0.2F, true).setUnlocalizedName("breadSlice");
    	breadCrumbs = new CityFoods(config.breadCrumbsID, 2, 0.2F, true).setUnlocalizedName("breadCrumbs"); //TODO
    	mincedBeef = new CityFoods(config.mincedBeefID, 2, 0.2F, true).setUnlocalizedName("mincedBeef");
    	coneItem = new CityFoods(config.coneItemID, 2, 0.2F, true).setUnlocalizedName("coneItem");
	}
	
	public static void initSnacks() {
    	foodDonut = new CityFoods(config.foodDonutID, 6, 0.01F, true).setUnlocalizedName("foodDonut");
    	foodSweets = new CityFoods(config.foodSweetsID, 2, 0.01F, true).setUnlocalizedName("foodSweets");
    	foodFries = new CityFoods(config.foodFriesID, 4, 0.15F, true).setUnlocalizedName("foodFries");
    	foodPopcorn = new CityFoods(config.foodPopcornID, 3, 0.05F, true).setUnlocalizedName("foodPopcorn");
    	foodIceCream = new CityFoods(config.foodIceCreamID, 4, 0.07F, true).setUnlocalizedName("foodIceCream");
    	foodChocolateIceCream = new CityFoods(config.foodChocolateIceCreamID, 4, 0.07F, true).setUnlocalizedName("foodChocolateIceCream");
    	foodMuffin = new CityFoods(config.foodMuffinID, 4, 0.07F, true).setUnlocalizedName("foodMuffin");
    	foodChocolateMuffin = new CityFoods(config.foodChocolateMuffinID, 4, 0.07F, true).setUnlocalizedName("foodChocolateMuffin");
    	foodBlueberryMuffin = new CityFoods(config.foodBlueberryMuffinID, 4, 0.07F, true).setUnlocalizedName("foodBlueberryMuffin");
    	chocolateCake = new CityFoods(config.chocolateCakeID, 4, 0.07F, true).setUnlocalizedName("chocolateCake"); //TODO check
    	chocolateCakeSlice = new CityFoods(config.chocolateCakeSliceID, 4, 0.07F, true).setUnlocalizedName("chocolateCakeSlice");
    	cakeSlice = new CityFoods(config.cakeSliceID, 4, 0.07F, true).setUnlocalizedName("cakeSlice");
    	strawberryCheesecake = new CityFoods(config.strawberryCheesecakeID, 4, 0.07F, true).setUnlocalizedName("strawberryCheesecake");
    	chocolateCheesecake = new CityFoods(config.chocolateCheesecakeID, 4, 0.07F, true).setUnlocalizedName("chocolateCheesecake");
    	foodVanillaCone = new CityFoods(config.foodVanillaConeID, 4, 0.07F, true).setUnlocalizedName("foodVanillaCone");
    	foodChocolateCone = new CityFoods(config.foodChocolateConeID, 4, 0.07F, true).setUnlocalizedName("foodChocolateCone");
    	strawberryIceLolly = new CityFoods(config.strawberryIceLollyID, 4, 0.07F, true).setUnlocalizedName("strawberryIceLolly");
    	chocolateIceLolly = new CityFoods(config.chocolateIceLollyID, 4, 0.07F, true).setUnlocalizedName("chocolateIceLolly");
    	milkIceLolly = new CityFoods(config.milkIceLollyID, 4, 0.07F, true).setUnlocalizedName("milkIceLolly");
    	
	}
	
	public static void initMealParts() {
    	foodChickenWings = new CityFoods(config.foodChickenWingsID, 5, 0.2F, true).setUnlocalizedName("foodChickenWings");
    	foodChickenNuggets = new CityFoods(config.foodChickenNuggetsID, 5, 0.2F, true).setUnlocalizedName("foodChickenNuggets");
    	foodSausageRoll = new CityFoods(config.foodSausageRollID, 4, 0.3F, true).setUnlocalizedName("foodSausageRoll");
		foodCheeseBurger = new CityFoods(config.foodCheeseBurgerID, 8, 0.5F, true).setUnlocalizedName("foodCheeseBurger");
    	foodBurger = new CityFoods(config.foodBurgerID, 6, 0.4F, true).setUnlocalizedName("foodBurger");
    	foodHotDog = new CityFoods(config.foodHotDogID, 5, 0.3F, true).setUnlocalizedName("foodHotDog");
    	foodPizza = new CityMetaFoods(config.foodPizzaID, 12, 0.4F, true).setUnlocalizedName("foodPizza");
    	foodNoodles = new CityFoods(config.foodNoodlesID, 4, 0.15F, true).setUnlocalizedName("foodNoodles"); //Check
    	
		cookedLamb = new CityFoods(config.cookedLambID, 1, 0.05F, true).setUnlocalizedName("cookedLamb");
		cookedDuck = new CityFoods(config.cookedDuckID, 1, 0.05F, true).setUnlocalizedName("cookedDuck");
		cookedMutton = new CityFoods(config.cookedMuttonID, 1, 0.05F, true).setUnlocalizedName("cookedMutton");
		cookedTurkey = new CityFoods(config.cookedTurkeyID, 1, 0.05F, true).setUnlocalizedName("cookedTurkey");
		cookedPheasant = new CityFoods(config.cookedPheasantID, 1, 0.05F, true).setUnlocalizedName("cookedPheasant");
		cookedHorse = new CityFoods(config.cookedHorseID, 1, 0.05F, true).setUnlocalizedName("cookedHorse");
		cookedRabbit = new CityFoods(config.cookedRabbitID, 1, 0.05F, true).setUnlocalizedName("cookedRabbit");
		cookedVenison = new CityFoods(config.cookedVenisonID, 1, 0.05F, true).setUnlocalizedName("cookedVenison");
		cookedGoat = new CityFoods(config.cookedGoatID, 1, 0.05F, true).setUnlocalizedName("cookedGoat");
		cookedPigeon = new CityFoods(config.cookedPigeonID, 1, 0.05F, true).setUnlocalizedName("cookedPigeon");
		cookedOx = new CityFoods(config.cookedOxID, 1, 0.05F, true).setUnlocalizedName("cookedOx");
		cookedBuffalo = new CityFoods(config.cookedBuffaloID, 1, 0.05F, true).setUnlocalizedName("cookedBuffalo");
		cookedBoar = new CityFoods(config.cookedBoarID, 1, 0.05F, true).setUnlocalizedName("cookedBoar");
		cookedSnail = new CityFoods(config.cookedSnailID, 1, 0.05F, true).setUnlocalizedName("cookedSnail");
		
		cookedSquid = new CityFoods(config.cookedSquidID, 1, 0.05F, true).setUnlocalizedName("cookedSquid");
		cookedCod = new CityFoods(config.cookedCodID, 1, 0.05F, true).setUnlocalizedName("cookedCod");
		cookedLobster = new CityFoods(config.cookedLobsterID, 1, 0.05F, true).setUnlocalizedName("cookedLobster");
		cookedCrab = new CityFoods(config.cookedCrabID, 1, 0.05F, true).setUnlocalizedName("cookedCrab");
		cookedPcookedn = new CityFoods(config.cookedPcookednID, 1, 0.05F, true).setUnlocalizedName("cookedPcookedn");
		cookedShrimp = new CityFoods(config.cookedShrimpID, 1, 0.05F, true).setUnlocalizedName("cookedShrimp");
		cookedAnchovy = new CityFoods(config.cookedAnchovyID, 1, 0.05F, true).setUnlocalizedName("cookedAnchovy");
		cookedTuna = new CityFoods(config.cookedTunaID, 1, 0.05F, true).setUnlocalizedName("cookedTuna");
		cookedSardine = new CityFoods(config.cookedSardineID, 1, 0.05F, true).setUnlocalizedName("cookedSardine");
		cookedCarp = new CityFoods(config.cookedCarpID, 1, 0.05F, true).setUnlocalizedName("cookedCarp");
		cookedOyster = new CityFoods(config.cookedOysterID, 1, 0.05F, true).setUnlocalizedName("cookedOyster");
		cookedMussel = new CityFoods(config.cookedMusselID, 1, 0.05F, true).setUnlocalizedName("cookedMussel");
		cookedShark = new CityFoods(config.cookedSharkID, 1, 0.05F, true).setUnlocalizedName("cookedShark");
		cookedTrout = new CityFoods(config.cookedTroutID, 1, 0.05F, true).setUnlocalizedName("cookedTrout");
		cookedBass = new CityFoods(config.cookedBassID, 1, 0.05F, true).setUnlocalizedName("cookedBass");
		cookedHaddock = new CityFoods(config.cookedHaddockID, 1, 0.05F, true).setUnlocalizedName("cookedHaddock");
		cookedSwordfish = new CityFoods(config.cookedSwordfishID, 1, 0.05F, true).setUnlocalizedName("cookedSwordfish");
		cookedMackeral = new CityFoods(config.cookedMackeralID, 1, 0.05F, true).setUnlocalizedName("cookedMackeral");
	}
	
	public static void initMeals() {
		
	}
	
	public static void initDrinks() {
    	drinkAppleJuice = new CityDrinks(config.drinkAppleJuiceID, 4, false).setUnlocalizedName("drinkAppleJuice");
    	drinkCola = new CityDrinks(config.drinkColaID, 2, false).setUnlocalizedName("drinkCola");
    	drinkOrangeJuice = new CityDrinks(config.drinkOrangeJuiceID, 5, false).setUnlocalizedName("drinkOrangeJuice");
    	drinkWaterBottle = new CityDrinks(config.drinkWaterBottleID, 3, false).setUnlocalizedName("drinkWaterBottle");
    	drinkMilkBottle = new CityDrinks(config.drinkMilkBottleID, 4, false).setUnlocalizedName("drinkMilkBottle");
    	drinkEnergyDrink = new CityDrinks(config.drinkEnergyDrinkID, 6, false).setUnlocalizedName("drinkEnergyDrink");
    	drinkMilkshake = new CityDrinks(config.drinkMilkshakeID, 5, false).setUnlocalizedName("drinkMilkshake");
    	drinkCoffee = new CityDrinks(config.drinkCoffeeID, 4, false).setUnlocalizedName("drinkCoffee");
    	drinkHotChocolate = new CityDrinks(config.drinkHotChocolateID, 2, false).setUnlocalizedName("drinkHotChocolate");
	}
	
	public static void initSeeds() {
		broccoliSeed = new SeedItems(config.broccoliSeedID, FCF_Blocks.broccoliCrop.blockID).setUnlocalizedName("broccoliSeed");
		tomatoSeed = new SeedItems(config.tomatoSeedID, FCF_Blocks.tomatoCrop.blockID).setUnlocalizedName("tomatoSeed");
		lettuceSeed = new SeedItems(config.lettuceSeedID, FCF_Blocks.lettuceCrop.blockID).setUnlocalizedName("lettuceSeed");
		garlicSeed = new SeedItems(config.garlicSeedID, FCF_Blocks.garlicCrop.blockID).setUnlocalizedName("garlicSeed");
		cabbageSeed = new SeedItems(config.cabbageSeedID, FCF_Blocks.cabbageCrop.blockID).setUnlocalizedName("cabbageSeed");
		celerySeed = new SeedItems(config.celerySeedID, FCF_Blocks.celeryCrop.blockID).setUnlocalizedName("celerySeed");
		cornSeed = new SeedItems(config.cornSeedID, FCF_Blocks.cornCrop.blockID).setUnlocalizedName("cornSeed");
		cucumberSeed = new SeedItems(config.cucumberSeedID, FCF_Blocks.cucumberCrop.blockID).setUnlocalizedName("cucumberSeed");
		redPepperSeed = new SeedItems(config.redPepperSeedID, FCF_Blocks.redPepperCrop.blockID).setUnlocalizedName("redPepperSeed");
		yellowPepperSeed = new SeedItems(config.yellowPepperSeedID, FCF_Blocks.yellowPepperCrop.blockID).setUnlocalizedName("yellowPepperSeed");
		greenPepperSeed = new SeedItems(config.greenPepperSeedID, FCF_Blocks.greenPepperCrop.blockID).setUnlocalizedName("greenPepperSeed");
		leekSeed = new SeedItems(config.leekSeedID, FCF_Blocks.leekCrop.blockID).setUnlocalizedName("leekSeed");
		onionSeed = new SeedItems(config.onionSeedID, FCF_Blocks.onionCrop.blockID).setUnlocalizedName("onionSeed");
		riceItem = new SeedItems(config.riceItemID, FCF_Blocks.riceCrop.blockID).setUnlocalizedName("riceItem");
		rapeSeed = new SeedItems(config.rapeSeedID, FCF_Blocks.rapeCrop.blockID).setUnlocalizedName("rapeSeed");
		blueBerrySeed = new SeedItems(config.blueBerrySeedID, FCF_Blocks.blueBerryCrop.blockID).setUnlocalizedName("blueBerrySeed");
		blackCurrantSeed = new SeedItems(config.blackCurrantSeedID, FCF_Blocks.blackCurrantCrop.blockID).setUnlocalizedName("blackCurrantSeed");
		avocadoSeed = new SeedItems(config.avocadoSeedID, FCF_Blocks.avocadoCrop.blockID).setUnlocalizedName("avocadoSeed");
		rhubarbSeed = new SeedItems(config.rhubarbSeedID, FCF_Blocks.rhubarbCrop.blockID).setUnlocalizedName("rhubarbSeed");
	}
	
	public static void initUtensils() {
    	pieTin = new ItemUtensil(config.pieTinID).setUnlocalizedName("pieTin");
		knifeForkItem = new ItemUtensil(config.knifeForkItemID).setUnlocalizedName("knifeForkItem");
		spoonItem = new ItemUtensil(config.spoonItemID).setUnlocalizedName("spoonItem");
		woodenSpoon = new ItemUtensil(config.woodenSpoonID).setUnlocalizedName("woodenSpoon");
		breadKnife = new ItemUtensil(config.breadKnifeID).setUnlocalizedName("breadKnife");
		cheeseKnife = new ItemUtensil(config.cheeseKnifeID).setUnlocalizedName("cheeseKnife");
		largeKnife = new ItemUtensil(config.largeKnifeID).setUnlocalizedName("largeKnife");
		saucepanSmall = new ItemUtensil(config.saucepanSmallID).setUnlocalizedName("saucepanSmall");
		saucepanLarge = new ItemUtensil(config.saucepanLargeID).setUnlocalizedName("saucepanLarge");
		fryingPan = new ItemUtensil(config.fryingPanID).setUnlocalizedName("fryingPan");
		wokItem = new ItemUtensil(config.wokItemID).setUnlocalizedName("wokItem");
		smallContainer = new ItemUtensil(config.smallContainerID).setUnlocalizedName("smallContainer");
		medContainer = new ItemUtensil(config.medContainerID).setUnlocalizedName("medContainer");
		largeContainer = new ItemUtensil(config.largeContainerID).setUnlocalizedName("largeContainer");
		smallPlate = new ItemUtensil(config.smallPlateID).setUnlocalizedName("smallPlate");
		largePlate = new ItemUtensil(config.largePlateID).setUnlocalizedName("largePlate");
		bowlItem = new ItemUtensil(config.bowlItemID).setUnlocalizedName("bowlItem");
		mugItem = new ItemUtensil(config.mugItemID).setUnlocalizedName("mugItem");
		plasticCup = new ItemUtensil(config.plasticCupID).setUnlocalizedName("plasticCup");
		glassCup = new ItemUtensil(config.glassCupID).setUnlocalizedName("glassCup");
	}

}
