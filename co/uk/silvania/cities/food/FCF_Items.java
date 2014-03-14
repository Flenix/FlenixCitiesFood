package co.uk.silvania.cities.food;

import net.minecraft.item.Item;
import co.uk.silvania.cities.core.items.CraftingIngredientItems;
import co.uk.silvania.cities.food.items.CraftingItems;
import co.uk.silvania.cities.food.items.ItemNBTSystem;
import co.uk.silvania.cities.food.items.ItemUtensil;
import co.uk.silvania.cities.food.items.SeedItems;
import co.uk.silvania.cities.food.items.foods.CityDrinks;
import co.uk.silvania.cities.food.items.foods.CityFoods;
import co.uk.silvania.cities.food.items.foods.CityMetaFoods;
import co.uk.silvania.cities.food.items.foods.ItemFoodFish;
import co.uk.silvania.cities.food.items.foods.ItemFoodMeat;

public class FCF_Items {
	private static FoodConfig config;
	
	//Raw Ingredients
	public static Item lambShoulder;
	public static Item lambBreast;
	public static Item lambFlank;
	public static Item lambLoin;
	public static Item lambLeg;
	public static Item lambRack;
	public static Item lambShank;
	public static Item lambChop;
	
	public static Item muttonShoulder;
	public static Item muttonBreast;
	public static Item muttonFlank;
	public static Item muttonLoin;
	public static Item muttonLeg;
	public static Item muttonRack;
	
	public static Item duckBreast;
	public static Item duckLeg;
	public static Item duckWing;
	public static Item duckWhole;
	
	public static Item turkeyWhole;
	public static Item turkeyBreast;
	public static Item turkeyWing;
	public static Item turkeyLeg;
	
	public static Item pheasantWhole;
	public static Item pheasantBreast;
	public static Item pheasantLeg;
	public static Item pheasantWing;
	
	public static Item horseShoulder;
	public static Item horseRib;
	public static Item horseShank;
	public static Item horseSirloin;
	public static Item horseRump;

	public static Item rabbitMeat;
	
	public static Item venisonShoulder;
	public static Item venisonLoin;
	public static Item venisonRibs;
	public static Item venisonShank;

	public static Item goatRack;
	public static Item goatLoin;
	public static Item goatLeg;
	
	public static Item pigeonWhole;
	public static Item pigeonBreast;
	public static Item pigeonWing;
	public static Item pigeonLeg;
	
	public static Item oxTongue;
	public static Item oxRib;
	public static Item oxBlade;
	public static Item oxBrisket;
	public static Item oxFlank;
	public static Item oxSirloin;
	public static Item oxTBone;
	public static Item oxFillet;
	public static Item oxRump;
	public static Item oxLeg;
	public static Item oxTail;
	
	public static Item buffaloBreast;
	public static Item buffaloRib;
	public static Item buffaloSirloin;
	public static Item buffaloFlank;
	
	public static Item boarShoulder;
	public static Item boarLoin;
	public static Item boarBelly;
	public static Item boarLeg;
	
	public static Item snailMeat;
	
	public static Item beefRib;
	public static Item beefBrisket;
	public static Item beefSirloin;
	public static Item beefLeg;
	public static Item beefFlank;
	
	public static Item porkShoulder;
	public static Item porkRib;
	public static Item porkBelly;
	public static Item porkLeg;
	public static Item porkLoin;
	
	public static Item chickenWing;
	public static Item chickenBreast;
	public static Item chickenLeg;
	
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
		//ID, Feed amount, Saturation amount, Wolf feeding, Time (ticks), Name, under-cooked value, cooked value, burned value, Raw poison, Bone, Steak, Pref. Cook Style
		//Feed amount is a DOUBLE || Bone is a 5-digit int, giving Huge-Large-Med-Small-Tiny, up to 9 of each. Pref Cook Style is 4-digit int.
		lambShoulder = new ItemFoodMeat(config.lambShoulderID, 1.1, 0.05F, true, 48000, "LambShoulder", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("lambShoulder");
		lambBreast = new ItemFoodMeat(config.lambBreastID, 0.8, 0.05F, true, 48000, "LambBreast", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("lambBreast");
		lambFlank = new ItemFoodMeat(config.lambFlankID, 0.9, 0.05F, true, 48000, "LambFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("lambFlank");
		lambLoin = new ItemFoodMeat(config.lambLoinID, 1.1, 0.05F, true, 48000, "LambLoin", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("lambLoin");
		lambLeg = new ItemFoodMeat(config.lambLegID, 1.3, 0.05F, true, 72000, "LambLeg", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("lambLeg");//Textured
		lambRack = new ItemFoodMeat(config.lambRackID, 1, 0.05F, true, 72000, "LambRack", 2, 6, 10, false, 00001, false, 123).setUnlocalizedName("lambRack");
		lambShank = new ItemFoodMeat(config.lambShankID, 1, 0.05F, true, 48000, "LambShank", 2, 6, 10, false, 00010, true, 123).setUnlocalizedName("lambShank");
		lambChop = new ItemFoodMeat(config.lambChopID, 0.7, 0.05F, true, 96000, "LambChop", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("lambChop");
		
		muttonShoulder = new ItemFoodMeat(config.muttonShoulderID, 1.3, 0.05F, true, 48000, "MuttonShoulder", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("muttonShoulder");
		muttonBreast = new ItemFoodMeat(config.muttonBreastID, 1.0, 0.05F, true, 48000, "MuttonBreast", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("muttonBreast"); //Textured
		muttonFlank = new ItemFoodMeat(config.muttonFlankID, 1.1, 0.05F, true, 48000, "MuttonFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("muttonFlank");
		muttonLoin = new ItemFoodMeat(config.muttonLoinID, 1.3, 0.05F, true, 48000, "MuttonLoin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("muttonLoin");
		muttonLeg = new ItemFoodMeat(config.muttonLegID, 1.3, 0.05F, true, 48000, "MuttonLeg", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("muttonLeg");
		muttonRack = new ItemFoodMeat(config.muttonRackID, 1.2, 0.05F, true, 48000, "MuttonRack", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("muttonRack");
		
		duckBreast = new ItemFoodMeat(config.duckBreastID, 0.5, 0.05F, true, 36000, "DuckBreast", 2, 6, 10, false, 00000, false, 123).setUnlocalizedName("duckBreast");
		duckLeg = new ItemFoodMeat(config.duckLegID, 0.4, 0.05F, true, 36000, "DuckLeg", 2, 6, 10, false, 00010, false, 123).setUnlocalizedName("duckLeg");
		duckWhole = new ItemFoodMeat(config.duckWholeID, 1.2, 0.05F, true, 36000, "DuckWhole", 2, 6, 10, false, 02021, false, 123).setUnlocalizedName("duckWhole");
		duckWing = new ItemFoodMeat(config.duckWingID, 0.3, 0.05F, true, 36000, "DuckWing", 2, 6, 10, false, 00001, false, 123).setUnlocalizedName("duckWing");
		
		turkeyWhole = new ItemFoodMeat(config.turkeyWholeID, 2.5, 0.05F, true, 39000, "TurkeyWhole", 2, 6, 10, true, 03132, false, 123).setUnlocalizedName("turkeyWhole");
		turkeyBreast = new ItemFoodMeat(config.turkeyBreastID, 0.8, 0.05F, true, 39000, "TurkeyBreast", 2, 6, 10, true, 00000, false, 123).setUnlocalizedName("turkeyBreast");
		turkeyLeg = new ItemFoodMeat(config.turkeyLegID, 0.5, 0.05F, true, 39000, "TurkeyLeg", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("turkeyLeg");
		turkeyWing = new ItemFoodMeat(config.turkeyWingID, 0.4, 0.05F, true, 39000, "TurkeyWing", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("turkeyWing");
		
		pheasantWhole = new ItemFoodMeat(config.pheasantWholeID, 1, 0.05F, true, 36000, "PheasantWhole", 2, 6, 10, true, 02021, false, 123).setUnlocalizedName("pheasantWhole");
		pheasantBreast = new ItemFoodMeat(config.pheasantBreastID, 1, 0.05F, true, 36000, "PheasantBreast", 2, 6, 10, true, 00000, false, 123).setUnlocalizedName("pheasantBreast");
		pheasantLeg = new ItemFoodMeat(config.pheasantLegID, 1, 0.05F, true, 36000, "PheasantLeg", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("pheasantLeg");
		pheasantWing = new ItemFoodMeat(config.pheasantWingID, 1, 0.05F, true, 36000, "PheasantWing", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("pheasantWing");
		
		horseShoulder = new ItemFoodMeat(config.horseShoulderID, 1, 0.05F, true, 48000, "HorseShoulder", 2, 6, 10, false, 01000, true, 123).setUnlocalizedName("horseShoulder");
		horseRib = new ItemFoodMeat(config.horseRibID, 1, 0.05F, true, 48000, "HorseRib", 2, 6, 10, false, 00060, true, 123).setUnlocalizedName("horseRib");
		horseShank = new ItemFoodMeat(config.horseShankID, 1, 0.05F, true, 48000, "HorseShank", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("horseShank");
		horseSirloin = new ItemFoodMeat(config.horseSirloinID, 1, 0.05F, true, 48000, "HorseSirloin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("horseSirloin");
		horseRump = new ItemFoodMeat(config.horseRumpID, 1, 0.05F, true, 48000, "HorseRump", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("horseRump");
		
		rabbitMeat = new ItemFoodMeat(config.rabbitMeatID, 1, 0.05F, true, 34000, "RabbitMeat", 2, 6, 10, true, 00200, false, 123).setUnlocalizedName("rabbitMeat");
		
		venisonShoulder = new ItemFoodMeat(config.venisonShoulderID, 1, 0.05F, true, 48000, "VenisonShoulder", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("venisonShoulder");
		venisonLoin = new ItemFoodMeat(config.venisonLoinID, 1, 0.05F, true, 48000, "VenisonLoin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("venisonLoin");
		venisonRibs = new ItemFoodMeat(config.venisonRibsID, 1, 0.05F, true, 48000, "VenisonRibs", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("venisonRibs");
		venisonShank = new ItemFoodMeat(config.venisonShankID, 1, 0.05F, true, 48000, "VenisonShank", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("venisonShank");
		
		goatRack = new ItemFoodMeat(config.goatRackID, 1, 0.05F, true, 48000, "GoatRack", 2, 6, 10, false, 00040, false, 123).setUnlocalizedName("goatRack");
		goatLoin = new ItemFoodMeat(config.goatLoinID, 1, 0.05F, true, 48000, "GoatLoin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("goatLoin");
		goatLeg = new ItemFoodMeat(config.goatLegID, 1, 0.05F, true, 48000, "GoatLeg", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("goatLeg");
		
		pigeonWhole = new ItemFoodMeat(config.pigeonWholeID, 1, 0.05F, true, 32000, "PigeonWhole", 2, 6, 10, true, 02021, false, 123).setUnlocalizedName("pigeonWhole");
		pigeonBreast = new ItemFoodMeat(config.pigeonBreastID, 1, 0.05F, true, 32000, "PigeonBreast", 2, 6, 10, true, 00000, false, 123).setUnlocalizedName("pigeonBreast");
		pigeonLeg = new ItemFoodMeat(config.pigeonLegID, 1, 0.05F, true, 32000, "PigeonLeg", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("pigeonLeg");
		pigeonWing = new ItemFoodMeat(config.pigeonWingID, 1, 0.05F, true, 32000, "PigeonWing", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("pigeonWing");
		
		oxTongue = new ItemFoodMeat(config.oxTongueID, 1, 0.05F, true, 24000, "OxTongue", 2, 6, 10, false, 00000, false, 123).setUnlocalizedName("oxTongue");
		oxRib = new ItemFoodMeat(config.oxRibID, 1, 0.05F, true, 72000, "OxRib", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("oxRib");
		oxBlade = new ItemFoodMeat(config.oxBladeID, 1, 0.05F, true, 72000, "OxBlade", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxBlade");
		oxBrisket = new ItemFoodMeat(config.oxBrisketID, 1, 0.05F, true, 72000, "OxBrisket", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxBrisket");
		oxFlank = new ItemFoodMeat(config.oxFlankID, 1, 0.05F, true, 72000, "OxFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxFlank");
		oxSirloin = new ItemFoodMeat(config.oxSirloinID, 1, 0.05F, true, 72000, "OxSirloin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxSirloin");
		oxTBone = new ItemFoodMeat(config.oxTBoneID, 1, 0.05F, true, 72000, "OxTBone", 2, 6, 10, false, 01000, true, 123).setUnlocalizedName("oxTBone");
		oxFillet = new ItemFoodMeat(config.oxFilletID, 1, 0.05F, true, 72000, "OxFillet", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxFillet");
		oxRump = new ItemFoodMeat(config.oxRumpID, 1, 0.05F, true, 72000, "OxRump", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxRump");
		oxLeg = new ItemFoodMeat(config.oxLegID, 1, 0.05F, true, 72000, "OxLeg", 2, 6, 10, false, 01000, true, 123).setUnlocalizedName("oxLeg");
		oxTail = new ItemFoodMeat(config.oxTailID, 1, 0.05F, true, 80000, "OxTail", 2, 6, 10, false, 00000, false, 123).setUnlocalizedName("oxTail");
		
		buffaloBreast = new ItemFoodMeat(config.buffaloBreastID, 1, 0.05F, true, 56000, "BuffaloBreast", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("buffaloBreast");
		buffaloRib = new ItemFoodMeat(config.buffaloRibID, 1, 0.05F, true, 56000, "BuffaloRib", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("buffaloRib");
		buffaloSirloin = new ItemFoodMeat(config.buffaloSirloinID, 1, 0.05F, true, 56000, "BuffaloSirloin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("buffaloSirloin");
		buffaloFlank = new ItemFoodMeat(config.buffaloFlankID, 1, 0.05F, true, 56000, "BuffaloFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("buffaloFlank");
		
		boarShoulder = new ItemFoodMeat(config.boarShoulderID, 1, 0.05F, true, 60000, "BoarShoulder", 2, 6, 10, true, 00010, true, 123).setUnlocalizedName("boarShoulder");
		boarLoin = new ItemFoodMeat(config.boarLoinID, 1, 0.05F, true, 60000, "BoarLoin", 2, 6, 10, true, 00000, true, 123).setUnlocalizedName("boarLoin");
		boarBelly = new ItemFoodMeat(config.boarBellyID, 1, 0.05F, true, 60000, "BoarBelly", 2, 6, 10, true, 00000, true, 123).setUnlocalizedName("boarBelly");
		boarLeg = new ItemFoodMeat(config.boarLegID, 1, 0.05F, true, 60000, "BoarLeg", 2, 6, 10, true, 00100, true, 123).setUnlocalizedName("boarLeg");
		
		snailMeat = new ItemFoodMeat(config.snailMeatID, 1, 0.05F, false, 192000, "Snail", 2, 6, 10, false, 00000, false, 123).setUnlocalizedName("snailMeat");
		
		beefRib = new ItemFoodMeat(config.beefRibID, 1, 0.05F, true, 52000, "BeefRib", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("beefRib");
		beefBrisket = new ItemFoodMeat(config.beefBrisketID, 1, 0.05F, true, 52000, "BeefBrisket", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("beefBrisket");
		beefSirloin = new ItemFoodMeat(config.beefSirloinID, 1, 0.05F, true, 52000, "BeefSirloin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("beefSirloin");
		beefLeg = new ItemFoodMeat(config.beefLegID, 1, 0.05F, true, 52000, "BeefLeg", 2, 6, 10, false, 01000, true, 123).setUnlocalizedName("beefLeg");
		beefFlank = new ItemFoodMeat(config.beefFlankID, 1, 0.05F, true, 52000, "BeefFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("beefFlank");
		
		porkShoulder = new ItemFoodMeat(config.porkShoulderID, 1, 0.05F, true, 60000, "PorkShoulder", 2, 6, 10, true, 00010, true, 123).setUnlocalizedName("porkShoulder");
		porkRib = new ItemFoodMeat(config.porkRibID, 1, 0.05F, true, 60000, "PorkRib", 2, 6, 10, true, 00006, false, 123).setUnlocalizedName("porkRib");
		porkBelly = new ItemFoodMeat(config.porkBellyID, 1, 0.05F, true, 60000, "PorkBelly", 2, 6, 10, true, 00000, true, 123).setUnlocalizedName("porkBelly");
		porkLeg = new ItemFoodMeat(config.porkLegID, 1, 0.05F, true, 60000, "PorkLeg", 2, 6, 10, true, 00100, true, 123).setUnlocalizedName("porkLeg");
		porkLoin = new ItemFoodMeat(config.porkLoinID, 1, 0.05F, true, 60000, "PorkLoin", 2, 6, 10, true, 00000, true, 123).setUnlocalizedName("porkLoin");
		
		chickenWing = new ItemFoodMeat(config.chickenWingID, 1, 0.05F, true, 36000, "ChickenWing", 2, 6, 10, true, 00001, false, 123).setUnlocalizedName("chickenWing");
		chickenBreast = new ItemFoodMeat(config.chickenBreastID, 1, 0.05F, true, 36000, "ChickenBreast", 2, 6, 10, true, 00000, false, 123).setUnlocalizedName("chickenBreast");
		chickenLeg = new ItemFoodMeat(config.chickenLegID, 1, 0.05F, true, 36000, "ChickenLeg", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("chickenLeg");
		
		rawSquid = new ItemFoodFish(config.rawSquidID, 1, 0.05F, true, 36000, "Squid", 2, 6, 10, false, 00000, false, 23).setUnlocalizedName("rawSquid");
		rawCod = new ItemFoodFish(config.rawCodID, 1, 0.05F, true, 36000, "Cod", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawCod");
		rawLobster = new ItemFoodFish(config.rawLobsterID, 1, 0.05F, true, 36000, "Lobster", 2, 6, 10, false, 00000, false, 4).setUnlocalizedName("rawLobster");
		rawCrab = new ItemFoodFish(config.rawCrabID, 1, 0.05F, true, 36000, "Crab", 2, 6, 10, false, 00010, false, 4).setUnlocalizedName("rawCrab");
		rawPrawn = new ItemFoodFish(config.rawPrawnID, 1, 0.05F, true, 36000, "Prawn", 2, 6, 10, false, 00010, false, 4).setUnlocalizedName("rawPrawn");
		rawShrimp = new ItemFoodFish(config.rawShrimpID, 1, 0.05F, true, 36000, "Shrimp", 2, 6, 10, false, 00010, false, 4).setUnlocalizedName("rawShrimp");
		rawAnchovy = new ItemFoodFish(config.rawAnchovyID, 1, 0.05F, true, 36000, "Anchovy", 2, 6, 10, false, 00000, false, 23).setUnlocalizedName("rawAnchovy");
		rawTuna = new ItemFoodFish(config.rawTunaID, 1, 0.05F, true, 36000, "Tuna", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawTuna");
		rawSardine = new ItemFoodFish(config.rawSardineID, 1, 0.05F, true, 36000, "Sardine", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawSardine");
		rawCarp = new ItemFoodFish(config.rawCarpID, 1, 0.05F, true, 36000, "Carp", 2, 6, 10, false, 00100, false, 23).setUnlocalizedName("rawCarp");
		rawOyster = new ItemFoodFish(config.rawOysterID, 1, 0.05F, true, 36000, "Oyster", 2, 6, 10, false, 00000, false, 4).setUnlocalizedName("rawOyster");
		rawMussel = new ItemFoodFish(config.rawMusselID, 1, 0.05F, true, 36000, "Mussel", 2, 6, 10, false, 00000, false, 4).setUnlocalizedName("rawMussel");
		rawShark = new ItemFoodFish(config.rawSharkID, 1, 0.05F, true, 36000, "Shark", 2, 6, 10, false, 00210, false, 23).setUnlocalizedName("rawShark");
		rawTrout = new ItemFoodFish(config.rawTroutID, 1, 0.05F, true, 36000, "Trout", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawTrout");
		rawBass = new ItemFoodFish(config.rawBassID, 1, 0.05F, true, 36000, "Bass", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawBass");
		rawHaddock = new ItemFoodFish(config.rawHaddockID, 1, 0.05F, true, 36000, "Haddock", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawHaddock");
		rawSwordfish = new ItemFoodFish(config.rawSwordfishID, 1, 0.05F, true, 36000, "Swordfish", 2, 6, 10, false, 01100, false, 23).setUnlocalizedName("rawSwordfish");
		rawMackeral = new ItemFoodFish(config.rawMackeralID, 1, 0.05F, true, 36000, "Mackeral", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawMackeral");
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
