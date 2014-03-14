package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.*;
import co.uk.silvania.cities.food.blocks.bushes.*;
import co.uk.silvania.cities.food.blocks.crops.*;
import co.uk.silvania.cities.food.blocks.trees.*;
import co.uk.silvania.cities.food.blocks.utensils.StoveBlock;
import net.minecraft.block.Block;

public class FCF_Blocks {
	private static FoodConfig config;
	
	public static Block fridgeBlock;
	public static Block largeFridgeBlock;
	public static Block vendingMachine;
	public static Block stoveBlock;
	
	public static Block broccoliCrop;
	public static Block tomatoCrop;
	public static Block lettuceCrop;
	public static Block garlicCrop;
	public static Block cabbageCrop;
	public static Block celeryCrop;
	public static Block cornCrop;
	public static Block cucumberCrop;
	public static Block redPepperCrop;
	public static Block yellowPepperCrop;
	public static Block greenPepperCrop;
	public static Block leekCrop;
	public static Block onionCrop;
	public static Block riceCrop;
	public static Block rapeCrop;
	public static Block blueBerryCrop;
	public static Block blackCurrantCrop;
	public static Block avocadoCrop;
	public static Block rhubarbCrop;
	
	public static Block blackberryBush;
	public static Block strawberryBush;
	public static Block raspberryBush;
	public static Block seaweedBush;
	public static Block greenGrapeVine;
	public static Block redGrapeVine;
	
	public static Block orangeSapling;
	public static Block pearSapling;
	public static Block bananaSapling;
	public static Block lemonSapling;
	public static Block limeSapling;

	
	public static void init() {
		initBlocks();
		initCrops();
		initBushes();
		initSaplings();
	}
	
	public static void initBlocks() {
		fridgeBlock = new FridgeBlock(config.fridgeID).setUnlocalizedName("fridgeBlock");
		largeFridgeBlock = new LargeFridgeBlock(config.largeFridgeID).setUnlocalizedName("largeFridgeBlock");
		vendingMachine = new VendingMachineBlock(config.vendingMachineID).setUnlocalizedName("vendingMachine");
		stoveBlock = new StoveBlock(config.stoveBlockID).setUnlocalizedName("stoveBlock");
	}
	
	public static void initCrops() {
		broccoliCrop = new BlockBroccoliCrop(config.broccoliCropID).setUnlocalizedName("broccoliCrop");
		tomatoCrop = new BlockTomatoCrop(config.tomatoCropID).setUnlocalizedName("tomatoCrop");
		lettuceCrop = new BlockLettuceCrop(config.lettuceCropID).setUnlocalizedName("lettuceCrop");
		garlicCrop = new BlockGarlicCrop(config.garlicCropID).setUnlocalizedName("garlicCrop");
		cabbageCrop = new BlockCabbageCrop(config.cabbageCropID).setUnlocalizedName("cabbageCrop");
		celeryCrop = new BlockCeleryCrop(config.celeryCropID).setUnlocalizedName("celeryCrop");
		cornCrop = new BlockCornCrop(config.cornCropID).setUnlocalizedName("cornCrop");
		cucumberCrop = new BlockCucumberCrop(config.cucumberCropID).setUnlocalizedName("cucumberCrop");
		redPepperCrop = new BlockRedPepperCrop(config.redPepperCropID).setUnlocalizedName("redPepperCrop");
		yellowPepperCrop = new BlockYellowPepperCrop(config.yellowPepperCropID).setUnlocalizedName("yellowPepperCrop");
		greenPepperCrop = new BlockGreenPepperCrop(config.greenPepperCropID).setUnlocalizedName("greenPepperCrop");
		leekCrop = new BlockLeekCrop(config.leekCropID).setUnlocalizedName("leekCrop");
		onionCrop = new BlockOnionCrop(config.onionCropID).setUnlocalizedName("onionCrop");
		riceCrop = new BlockRiceCrop(config.riceCropID).setUnlocalizedName("riceCrop");
		rapeCrop = new BlockRapeCrop(config.rapeCropID).setUnlocalizedName("rapeCrop");
		blueBerryCrop = new BlockBlueBerryCrop(config.blueBerryCropID).setUnlocalizedName("blueBerryCrop");
		blackCurrantCrop = new BlockBlackCurrantCrop(config.blackCurrantCropID).setUnlocalizedName("blackCurrantCrop");
		avocadoCrop = new BlockAvocadoCrop(config.avocadoCropID).setUnlocalizedName("avocadoCrop");
		rhubarbCrop = new BlockRhubarbCrop(config.rhubarbCropID).setUnlocalizedName("rhubarbCrop");
	}
	
	public static void initBushes() {
		blackberryBush = new BlockBlackberryBush(config.blackberryBushID).setUnlocalizedName("blackberryBush");
		strawberryBush = new BlockStrawberryBush(config.strawberryBushID).setUnlocalizedName("strawberryBush");
		raspberryBush = new BlockRaspberryBush(config.raspberryBushID).setUnlocalizedName("raspberryBush");
		seaweedBush = new BlockSeaweedBush(config.seaweedBushID).setUnlocalizedName("seaweedBush");
		greenGrapeVine = new BlockGreenGrapeVineBare(config.greenGrapeVineID).setUnlocalizedName("greenGrapeVine");
		redGrapeVine = new BlockRedGrapeVineBare(config.redGrapeVineID).setUnlocalizedName("redGrapeVine");
	}
	
	public static void initSaplings() {
		orangeSapling = new BlockOrangeSapling(config.orangeSaplingID).setUnlocalizedName("orangeSapling");
		pearSapling = new BlockPearSapling(config.pearSaplingID).setUnlocalizedName("pearSapling");
		bananaSapling = new BlockBananaSapling(config.bananaSaplingID).setUnlocalizedName("bananaSapling");
		lemonSapling = new BlockLemonSapling(config.lemonSaplingID).setUnlocalizedName("lemonSapling");
		limeSapling = new BlockLimeSapling(config.limeSaplingID).setUnlocalizedName("limeSapling");

	}
}
