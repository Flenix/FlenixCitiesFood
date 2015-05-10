package co.uk.silvania.cities.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.potion.Potion;
import co.uk.silvania.cities.food.items.CraftingItems;
import co.uk.silvania.cities.food.items.ItemHobUtensil;
import co.uk.silvania.cities.food.items.ItemUtensil;
import co.uk.silvania.cities.food.items.SeedItems;
import co.uk.silvania.cities.food.items.foods.CityDrinks;
import co.uk.silvania.cities.food.items.foods.CityFoods;
import co.uk.silvania.cities.food.items.foods.ItemDisabledFood;
import co.uk.silvania.cities.food.items.foods.ItemFoodFish;
import co.uk.silvania.cities.food.items.foods.ItemFoodMeat;

public class FCF_Items {
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
	
    public static Item apple;
    public static Item bread;
    public static Item porkchop;
    public static Item cooked_porkchop;
    public static Item cookie;
    public static Item melon;
    public static Item beef;
    public static Item cooked_beef;
    public static Item chicken;
    public static Item cooked_chicken;
    public static Item rotten_flesh;
    public static Item baked_potato;
    public static Item poisonous_potato;
    public static Item pumpkin_pie;
    public static Item mushroom_stew;
    public static Item carrot;
    public static Item potato;
    
    public static Item fish;
    public static Item cooked_fished;
	
	public static void init() {
		initRawIngredients();
		initFruitnVeg();
		initDrinks();
		initSeeds();
		initUtensils();
	}
	
	public static void initVanilla() {
		apple = new ItemFood(1, 0.05F, false).setUnlocalizedName("apple").setTextureName("apple");
        fish = new ItemFood(1, 0.05F, false).setUnlocalizedName("fish").setTextureName("fish_raw");
        cooked_fished = new ItemFood(3, 0.1F, false).setUnlocalizedName("cooked_fished").setTextureName("fish_cooked");
        cookie = new ItemFood(1, 0.05F, false).setUnlocalizedName("cookie").setTextureName("cookie");
        melon = new ItemFood(1, 0.05F, false).setUnlocalizedName("melon").setTextureName("melon");
        rotten_flesh = new ItemFood(1, 0.05F, true).setPotionEffect(Potion.poison.id, 30, 0, 0.4F).setUnlocalizedName("rotten_flesh").setTextureName("rotten_flesh");
        baked_potato = new ItemFood(2, 0.15F, false).setUnlocalizedName("baked_potato").setTextureName("potato_baked");
        poisonous_potato = new ItemFood(1, 0.05F, false).setPotionEffect(Potion.poison.id, 5, 0, 0.3F).setUnlocalizedName("poisonous_potato").setTextureName("potato_poisonous");
        pumpkin_pie = new ItemFood(3, 0.15F, false).setUnlocalizedName("pumpkin_pie").setTextureName("pumpkin_pie").setCreativeTab(CreativeTabs.tabFood);
        mushroom_stew = new ItemFood(3, 0.1F, false).setUnlocalizedName("mushroom_stew").setTextureName("mushroom_stew");
        carrot = new ItemSeedFood(1, 0.05F, Blocks.carrots, Blocks.farmland).setUnlocalizedName("carrot").setTextureName("carrot");
        potato = new ItemSeedFood(1, 0.05F, Blocks.potatoes, Blocks.farmland).setUnlocalizedName("potato").setTextureName("potato");
        
        porkchop = new ItemFoodMeat(0.0, 0.05F, true, 96000, "PorkChop", 3, 7, 12, true, 00000, true, 123).setUnlocalizedName("porkchopRaw").setTextureName("porkchop_raw");
        cooked_porkchop = new ItemDisabledFood(3, 0.15F, true).setUnlocalizedName("porkchopCooked").setTextureName("porkchop_cooked");
        beef = new ItemFoodMeat(0.0, 0.05F, true, 120000, "RumpSteak", 4, 8, 13, false, 00000, true, 123).setUnlocalizedName("beefRaw").setTextureName("beef_raw");
        cooked_beef = new ItemDisabledFood(3, 0.15F, true).setUnlocalizedName("beefCooked").setTextureName("beef_cooked");
        chicken = new ItemFoodMeat(0.0, 0.05F, true, 36000, "ChickenWhole", 2, 5, 8, true, 02021, false, 123).setPotionEffect(Potion.poison.id, 30, 0, 0.15F).setUnlocalizedName("chickenRaw").setTextureName("chicken_raw");
        cooked_chicken = new ItemDisabledFood(3, 0.15F, true).setUnlocalizedName("chickenCooked").setTextureName("chicken_cooked");
	}
	
	public static void initRawIngredients() {
		//Arguments for meat are as follows:
		//ID, Feed amount, Saturation amount, Wolf feeding, Time (ticks), Name, under-cooked value, cooked value, burned value, Raw poison, Bone, Steak, Pref. Cook Style
		//Feed amount is a DOUBLE || Bone is a 5-digit int, giving Huge-Large-Med-Small-Tiny, up to 9 of each. Pref Cook Style is 4-digit int.
		lambShoulder = new ItemFoodMeat(1.1, 0.05F, true, 48000, "LambShoulder", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("lambShoulder");
		lambBreast = new ItemFoodMeat(0.8, 0.05F, true, 48000, "LambBreast", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("lambBreast");
		lambFlank = new ItemFoodMeat(0.9, 0.05F, true, 48000, "LambFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("lambFlank");
		lambLoin = new ItemFoodMeat(1.1, 0.05F, true, 48000, "LambLoin", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("lambLoin");
		lambLeg = new ItemFoodMeat(1.3, 0.05F, true, 72000, "LambLeg", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("lambLeg");//Textured
		lambRack = new ItemFoodMeat(1, 0.05F, true, 72000, "LambRack", 2, 6, 10, false, 00001, false, 123).setUnlocalizedName("lambRack");
		lambShank = new ItemFoodMeat(1, 0.05F, true, 48000, "LambShank", 2, 6, 10, false, 00010, true, 123).setUnlocalizedName("lambShank");
		lambChop = new ItemFoodMeat(0.7, 0.05F, true, 96000, "LambChop", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("lambChop");
		
		muttonShoulder = new ItemFoodMeat(1.3, 0.05F, true, 48000, "MuttonShoulder", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("muttonShoulder");
		muttonBreast = new ItemFoodMeat(1.0, 0.05F, true, 48000, "MuttonBreast", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("muttonBreast"); //Textured
		muttonFlank = new ItemFoodMeat(1.1, 0.05F, true, 48000, "MuttonFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("muttonFlank");
		muttonLoin = new ItemFoodMeat(1.3, 0.05F, true, 48000, "MuttonLoin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("muttonLoin");
		muttonLeg = new ItemFoodMeat(1.3, 0.05F, true, 48000, "MuttonLeg", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("muttonLeg");
		muttonRack = new ItemFoodMeat(1.2, 0.05F, true, 48000, "MuttonRack", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("muttonRack");
		
		duckBreast = new ItemFoodMeat(0.5, 0.05F, true, 36000, "DuckBreast", 2, 6, 10, false, 00000, false, 123).setUnlocalizedName("duckBreast");
		duckLeg = new ItemFoodMeat(0.4, 0.05F, true, 36000, "DuckLeg", 2, 6, 10, false, 00010, false, 123).setUnlocalizedName("duckLeg");
		duckWhole = new ItemFoodMeat(1.2, 0.05F, true, 36000, "DuckWhole", 2, 6, 10, false, 02021, false, 123).setUnlocalizedName("duckWhole");
		duckWing = new ItemFoodMeat(0.3, 0.05F, true, 36000, "DuckWing", 2, 6, 10, false, 00001, false, 123).setUnlocalizedName("duckWing");
		
		turkeyWhole = new ItemFoodMeat(2.5, 0.05F, true, 39000, "TurkeyWhole", 2, 6, 10, true, 03132, false, 123).setUnlocalizedName("turkeyWhole");
		turkeyBreast = new ItemFoodMeat(0.8, 0.05F, true, 39000, "TurkeyBreast", 2, 6, 10, true, 00000, false, 123).setUnlocalizedName("turkeyBreast");
		turkeyLeg = new ItemFoodMeat(0.5, 0.05F, true, 39000, "TurkeyLeg", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("turkeyLeg");
		turkeyWing = new ItemFoodMeat(0.4, 0.05F, true, 39000, "TurkeyWing", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("turkeyWing");
		
		pheasantWhole = new ItemFoodMeat(1, 0.05F, true, 36000, "PheasantWhole", 2, 6, 10, true, 02021, false, 123).setUnlocalizedName("pheasantWhole");
		pheasantBreast = new ItemFoodMeat(1, 0.05F, true, 36000, "PheasantBreast", 2, 6, 10, true, 00000, false, 123).setUnlocalizedName("pheasantBreast");
		pheasantLeg = new ItemFoodMeat(1, 0.05F, true, 36000, "PheasantLeg", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("pheasantLeg");
		pheasantWing = new ItemFoodMeat(1, 0.05F, true, 36000, "PheasantWing", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("pheasantWing");
		
		horseShoulder = new ItemFoodMeat(1, 0.05F, true, 48000, "HorseShoulder", 2, 6, 10, false, 01000, true, 123).setUnlocalizedName("horseShoulder");
		horseRib = new ItemFoodMeat(1, 0.05F, true, 48000, "HorseRib", 2, 6, 10, false, 00060, true, 123).setUnlocalizedName("horseRib");
		horseShank = new ItemFoodMeat(1, 0.05F, true, 48000, "HorseShank", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("horseShank");
		horseSirloin = new ItemFoodMeat(1, 0.05F, true, 48000, "HorseSirloin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("horseSirloin");
		horseRump = new ItemFoodMeat(1, 0.05F, true, 48000, "HorseRump", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("horseRump");
		
		rabbitMeat = new ItemFoodMeat(1, 0.05F, true, 34000, "RabbitMeat", 2, 6, 10, true, 00200, false, 123).setUnlocalizedName("rabbitMeat");
		
		venisonShoulder = new ItemFoodMeat(1, 0.05F, true, 48000, "VenisonShoulder", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("venisonShoulder");
		venisonLoin = new ItemFoodMeat(1, 0.05F, true, 48000, "VenisonLoin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("venisonLoin");
		venisonRibs = new ItemFoodMeat(1, 0.05F, true, 48000, "VenisonRibs", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("venisonRibs");
		venisonShank = new ItemFoodMeat(1, 0.05F, true, 48000, "VenisonShank", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("venisonShank");
		
		goatRack = new ItemFoodMeat(1, 0.05F, true, 48000, "GoatRack", 2, 6, 10, false, 00040, false, 123).setUnlocalizedName("goatRack");
		goatLoin = new ItemFoodMeat(1, 0.05F, true, 48000, "GoatLoin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("goatLoin");
		goatLeg = new ItemFoodMeat(1, 0.05F, true, 48000, "GoatLeg", 2, 6, 10, false, 00100, true, 123).setUnlocalizedName("goatLeg");
		
		pigeonWhole = new ItemFoodMeat(1, 0.05F, true, 32000, "PigeonWhole", 2, 6, 10, true, 02021, false, 123).setUnlocalizedName("pigeonWhole");
		pigeonBreast = new ItemFoodMeat(1, 0.05F, true, 32000, "PigeonBreast", 2, 6, 10, true, 00000, false, 123).setUnlocalizedName("pigeonBreast");
		pigeonLeg = new ItemFoodMeat(1, 0.05F, true, 32000, "PigeonLeg", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("pigeonLeg");
		pigeonWing = new ItemFoodMeat(1, 0.05F, true, 32000, "PigeonWing", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("pigeonWing");
		
		oxTongue = new ItemFoodMeat(1, 0.05F, true, 24000, "OxTongue", 2, 6, 10, false, 00000, false, 123).setUnlocalizedName("oxTongue");
		oxRib = new ItemFoodMeat(1, 0.05F, true, 72000, "OxRib", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("oxRib");
		oxBlade = new ItemFoodMeat(1, 0.05F, true, 72000, "OxBlade", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxBlade");
		oxBrisket = new ItemFoodMeat(1, 0.05F, true, 72000, "OxBrisket", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxBrisket");
		oxFlank = new ItemFoodMeat(1, 0.05F, true, 72000, "OxFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxFlank");
		oxSirloin = new ItemFoodMeat(1, 0.05F, true, 72000, "OxSirloin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxSirloin");
		oxTBone = new ItemFoodMeat(1, 0.05F, true, 72000, "OxTBone", 2, 6, 10, false, 01000, true, 123).setUnlocalizedName("oxTBone");
		oxFillet = new ItemFoodMeat(1, 0.05F, true, 72000, "OxFillet", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxFillet");
		oxRump = new ItemFoodMeat(1, 0.05F, true, 72000, "OxRump", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("oxRump");
		oxLeg = new ItemFoodMeat(1, 0.05F, true, 72000, "OxLeg", 2, 6, 10, false, 01000, true, 123).setUnlocalizedName("oxLeg");
		oxTail = new ItemFoodMeat(1, 0.05F, true, 80000, "OxTail", 2, 6, 10, false, 00000, false, 123).setUnlocalizedName("oxTail");
		
		buffaloBreast = new ItemFoodMeat(1, 0.05F, true, 56000, "BuffaloBreast", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("buffaloBreast");
		buffaloRib = new ItemFoodMeat(1, 0.05F, true, 56000, "BuffaloRib", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("buffaloRib");
		buffaloSirloin = new ItemFoodMeat(1, 0.05F, true, 56000, "BuffaloSirloin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("buffaloSirloin");
		buffaloFlank = new ItemFoodMeat(1, 0.05F, true, 56000, "BuffaloFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("buffaloFlank");
		
		boarShoulder = new ItemFoodMeat(1, 0.05F, true, 60000, "BoarShoulder", 2, 6, 10, true, 00010, true, 123).setUnlocalizedName("boarShoulder");
		boarLoin = new ItemFoodMeat(1, 0.05F, true, 60000, "BoarLoin", 2, 6, 10, true, 00000, true, 123).setUnlocalizedName("boarLoin");
		boarBelly = new ItemFoodMeat(1, 0.05F, true, 60000, "BoarBelly", 2, 6, 10, true, 00000, true, 123).setUnlocalizedName("boarBelly");
		boarLeg = new ItemFoodMeat(1, 0.05F, true, 60000, "BoarLeg", 2, 6, 10, true, 00100, true, 123).setUnlocalizedName("boarLeg");
		
		snailMeat = new ItemFoodMeat(1, 0.05F, false, 192000, "Snail", 2, 6, 10, false, 00000, false, 123).setUnlocalizedName("snailMeat");
		
		beefRib = new ItemFoodMeat(1, 0.05F, true, 52000, "BeefRib", 2, 6, 10, false, 00060, false, 123).setUnlocalizedName("beefRib");
		beefBrisket = new ItemFoodMeat(1, 0.05F, true, 52000, "BeefBrisket", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("beefBrisket");
		beefSirloin = new ItemFoodMeat(1, 0.05F, true, 52000, "BeefSirloin", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("beefSirloin");
		beefLeg = new ItemFoodMeat(1, 0.05F, true, 52000, "BeefLeg", 2, 6, 10, false, 01000, true, 123).setUnlocalizedName("beefLeg");
		beefFlank = new ItemFoodMeat(1, 0.05F, true, 52000, "BeefFlank", 2, 6, 10, false, 00000, true, 123).setUnlocalizedName("beefFlank");
		
		porkShoulder = new ItemFoodMeat(1, 0.05F, true, 60000, "PorkShoulder", 2, 6, 10, true, 00010, true, 123).setUnlocalizedName("porkShoulder");
		porkRib = new ItemFoodMeat(1, 0.05F, true, 60000, "PorkRib", 2, 6, 10, true, 00006, false, 123).setUnlocalizedName("porkRib");
		porkBelly = new ItemFoodMeat(1, 0.05F, true, 60000, "PorkBelly", 2, 6, 10, true, 00000, true, 123).setUnlocalizedName("porkBelly");
		porkLeg = new ItemFoodMeat(1, 0.05F, true, 60000, "PorkLeg", 2, 6, 10, true, 00100, true, 123).setUnlocalizedName("porkLeg");
		porkLoin = new ItemFoodMeat(1, 0.05F, true, 60000, "PorkLoin", 2, 6, 10, true, 00000, true, 123).setUnlocalizedName("porkLoin");
		
		chickenWing = new ItemFoodMeat(1, 0.05F, true, 36000, "ChickenWing", 2, 6, 10, true, 00001, false, 123).setUnlocalizedName("chickenWing");
		chickenBreast = new ItemFoodMeat(1, 0.05F, true, 36000, "ChickenBreast", 2, 6, 10, true, 00000, false, 123).setUnlocalizedName("chickenBreast");
		chickenLeg = new ItemFoodMeat(1, 0.05F, true, 36000, "ChickenLeg", 2, 6, 10, true, 00010, false, 123).setUnlocalizedName("chickenLeg");
		
		rawSquid = new ItemFoodFish(1, 0.05F, true, 36000, "Squid", 2, 6, 10, false, 00000, false, 23).setUnlocalizedName("rawSquid");
		rawCod = new ItemFoodFish(1, 0.05F, true, 36000, "Cod", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawCod");
		rawLobster = new ItemFoodFish(1, 0.05F, true, 36000, "Lobster", 2, 6, 10, false, 00000, false, 4).setUnlocalizedName("rawLobster");
		rawCrab = new ItemFoodFish(1, 0.05F, true, 36000, "Crab", 2, 6, 10, false, 00010, false, 4).setUnlocalizedName("rawCrab");
		rawPrawn = new ItemFoodFish(1, 0.05F, true, 36000, "Prawn", 2, 6, 10, false, 00010, false, 4).setUnlocalizedName("rawPrawn");
		rawShrimp = new ItemFoodFish(1, 0.05F, true, 36000, "Shrimp", 2, 6, 10, false, 00010, false, 4).setUnlocalizedName("rawShrimp");
		rawAnchovy = new ItemFoodFish(1, 0.05F, true, 36000, "Anchovy", 2, 6, 10, false, 00000, false, 23).setUnlocalizedName("rawAnchovy");
		rawTuna = new ItemFoodFish(1, 0.05F, true, 36000, "Tuna", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawTuna");
		rawSardine = new ItemFoodFish(1, 0.05F, true, 36000, "Sardine", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawSardine");
		rawCarp = new ItemFoodFish(1, 0.05F, true, 36000, "Carp", 2, 6, 10, false, 00100, false, 23).setUnlocalizedName("rawCarp");
		rawOyster = new ItemFoodFish(1, 0.05F, true, 36000, "Oyster", 2, 6, 10, false, 00000, false, 4).setUnlocalizedName("rawOyster");
		rawMussel = new ItemFoodFish(1, 0.05F, true, 36000, "Mussel", 2, 6, 10, false, 00000, false, 4).setUnlocalizedName("rawMussel");
		rawShark = new ItemFoodFish(1, 0.05F, true, 36000, "Shark", 2, 6, 10, false, 00210, false, 23).setUnlocalizedName("rawShark");
		rawTrout = new ItemFoodFish(1, 0.05F, true, 36000, "Trout", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawTrout");
		rawBass = new ItemFoodFish(1, 0.05F, true, 36000, "Bass", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawBass");
		rawHaddock = new ItemFoodFish(1, 0.05F, true, 36000, "Haddock", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawHaddock");
		rawSwordfish = new ItemFoodFish(1, 0.05F, true, 36000, "Swordfish", 2, 6, 10, false, 01100, false, 23).setUnlocalizedName("rawSwordfish");
		rawMackeral = new ItemFoodFish(1, 0.05F, true, 36000, "Mackeral", 2, 6, 10, false, 00010, false, 23).setUnlocalizedName("rawMackeral");
	}
	
	public static void initFruitnVeg() {
    	tomatoItem = new CityFoods(1, 0.05F, true).setUnlocalizedName("foodTomato");
    	lettuceItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("lettuceItem");
    	garlicItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("garlicItem");
    	broccoliItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("broccoliItem");
    	cabbageItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("cabbageItem");
    	celeryItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("celeryItem");
    	cornItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("cornItem");
    	cucumberItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("cucumberItem");
    	onionItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("onionItem");
    	rhubarbItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("rhubarbItem");
    	
    	redPepperItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("redPepperItem");
    	yellowPepperItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("yellowPepperItem");
    	greenPepperItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("greenPepperItem");
    	leekItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("leekItem");
    	blackberryItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("blackberryItem");
    	blueberryItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("blueberryItem");
    	blackcurrantItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("blackcurrentItem");
    	grapesItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("grapesItem");
    	redGrapesItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("redGrapesItem");
    	lemonItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("lemonItem");
    	limeItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("limeItem");
    	orangeItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("orangeItem");
    	strawberryItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("strawberryItem");
    	raspberryItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("raspberryItem");
    	avocadoItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("avocadoItem");
    	pearItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("pearItem");
    	bananaItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("bananaItem");
    	seaweedItem = new CityFoods(1, 0.05F, false).setUnlocalizedName("seaweedItem");
	}
	
	public static void initDrinks() {
    	drinkAppleJuice = new CityDrinks(4, false).setUnlocalizedName("drinkAppleJuice");
    	drinkCola = new CityDrinks(2, false).setUnlocalizedName("drinkCola");
    	drinkOrangeJuice = new CityDrinks(5, false).setUnlocalizedName("drinkOrangeJuice");
    	drinkWaterBottle = new CityDrinks(3, false).setUnlocalizedName("drinkWaterBottle");
    	drinkMilkBottle = new CityDrinks(4, false).setUnlocalizedName("drinkMilkBottle");
    	drinkEnergyDrink = new CityDrinks(6, false).setUnlocalizedName("drinkEnergyDrink");
    	drinkMilkshake = new CityDrinks(5, false).setUnlocalizedName("drinkMilkshake");
    	drinkCoffee = new CityDrinks(4, false).setUnlocalizedName("drinkCoffee");
    	drinkHotChocolate = new CityDrinks(2, false).setUnlocalizedName("drinkHotChocolate");
	}
	
	public static void initSeeds() {
		broccoliSeed = new SeedItems(FCF_Blocks.broccoliCrop).setUnlocalizedName("broccoliSeed");
		tomatoSeed = new SeedItems(FCF_Blocks.tomatoCrop).setUnlocalizedName("tomatoSeed");
		lettuceSeed = new SeedItems(FCF_Blocks.lettuceCrop).setUnlocalizedName("lettuceSeed");
		garlicSeed = new SeedItems(FCF_Blocks.garlicCrop).setUnlocalizedName("garlicSeed");
		cabbageSeed = new SeedItems(FCF_Blocks.cabbageCrop).setUnlocalizedName("cabbageSeed");
		celerySeed = new SeedItems(FCF_Blocks.celeryCrop).setUnlocalizedName("celerySeed");
		cornSeed = new SeedItems(FCF_Blocks.cornCrop1).setUnlocalizedName("cornSeed");
		cucumberSeed = new SeedItems(FCF_Blocks.cucumberCrop).setUnlocalizedName("cucumberSeed");
		redPepperSeed = new SeedItems(FCF_Blocks.redPepperCrop).setUnlocalizedName("redPepperSeed");
		yellowPepperSeed = new SeedItems(FCF_Blocks.yellowPepperCrop).setUnlocalizedName("yellowPepperSeed");
		greenPepperSeed = new SeedItems(FCF_Blocks.greenPepperCrop).setUnlocalizedName("greenPepperSeed");
		leekSeed = new SeedItems(FCF_Blocks.leekCrop).setUnlocalizedName("leekSeed");
		onionSeed = new SeedItems(FCF_Blocks.onionCrop).setUnlocalizedName("onionSeed");
		riceItem = new SeedItems(FCF_Blocks.riceCrop).setUnlocalizedName("riceItem");
		rapeSeed = new SeedItems(FCF_Blocks.rapeCrop).setUnlocalizedName("rapeSeed");
		blueBerrySeed = new SeedItems(FCF_Blocks.blueBerryCrop).setUnlocalizedName("blueBerrySeed");
		blackCurrantSeed = new SeedItems(FCF_Blocks.blackCurrantCrop).setUnlocalizedName("blackCurrantSeed");
		avocadoSeed = new SeedItems(FCF_Blocks.avocadoCrop).setUnlocalizedName("avocadoSeed");
		rhubarbSeed = new SeedItems(FCF_Blocks.rhubarbCrop).setUnlocalizedName("rhubarbSeed");
	}
	
	public static void initUtensils() {
    	pieTin = new ItemUtensil().setUnlocalizedName("pieTin");
		knifeForkItem = new ItemUtensil().setUnlocalizedName("knifeForkItem");
		spoonItem = new ItemUtensil().setUnlocalizedName("spoonItem");
		woodenSpoon = new ItemUtensil().setUnlocalizedName("woodenSpoon");
		breadKnife = new ItemUtensil().setUnlocalizedName("breadKnife");
		cheeseKnife = new ItemUtensil().setUnlocalizedName("cheeseKnife");
		largeKnife = new ItemUtensil().setUnlocalizedName("largeKnife");
		saucepanSmall = new ItemHobUtensil(4).setUnlocalizedName("saucepanSmall");
		saucepanLarge = new ItemHobUtensil(4).setUnlocalizedName("saucepanLarge");
		fryingPan = new ItemHobUtensil(2).setUnlocalizedName("fryingPan");
		wokItem = new ItemHobUtensil(2).setUnlocalizedName("wokItem");
		smallContainer = new ItemUtensil().setUnlocalizedName("smallContainer");
		medContainer = new ItemUtensil().setUnlocalizedName("medContainer");
		largeContainer = new ItemUtensil().setUnlocalizedName("largeContainer");
		smallPlate = new ItemUtensil().setUnlocalizedName("smallPlate");
		largePlate = new ItemUtensil().setUnlocalizedName("largePlate");
		bowlItem = new ItemUtensil().setUnlocalizedName("bowlItem");
		mugItem = new ItemUtensil().setUnlocalizedName("mugItem");
		plasticCup = new ItemUtensil().setUnlocalizedName("plasticCup");
		glassCup = new ItemUtensil().setUnlocalizedName("glassCup");
	}

}
