package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.*;
import co.uk.silvania.cities.food.blocks.bushes.*;
import co.uk.silvania.cities.food.blocks.crops.*;
import co.uk.silvania.cities.food.blocks.trees.*;
import co.uk.silvania.cities.food.blocks.utensils.StoveBlock;
import net.minecraft.block.Block;

public class FCF_Blocks {
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
	
	/*public static Block orangeSapling;
	public static Block pearSapling;
	public static Block bananaSapling;
	public static Block lemonSapling;
	public static Block limeSapling;*/

	
	public static void init() {
		initBlocks();
		initCrops();
		initBushes();
		initSaplings();
	}
	
	public static void initBlocks() {
		fridgeBlock = new FridgeBlock().setBlockName("fridgeBlock");
		largeFridgeBlock = new LargeFridgeBlock().setBlockName("largeFridgeBlock");
		vendingMachine = new VendingMachineBlock().setBlockName("vendingMachine");
		stoveBlock = new StoveBlock().setBlockName("stoveBlock");
	}
	
	public static void initCrops() {
		broccoliCrop = new BlockBroccoliCrop().setBlockName("broccoliCrop");
		tomatoCrop = new BlockTomatoCrop().setBlockName("tomatoCrop");
		lettuceCrop = new BlockLettuceCrop().setBlockName("lettuceCrop");
		garlicCrop = new BlockGarlicCrop().setBlockName("garlicCrop");
		cabbageCrop = new BlockCabbageCrop().setBlockName("cabbageCrop");
		celeryCrop = new BlockCeleryCrop().setBlockName("celeryCrop");
		cornCrop = new BlockCornCrop().setBlockName("cornCrop");
		cucumberCrop = new BlockCucumberCrop().setBlockName("cucumberCrop");
		redPepperCrop = new BlockRedPepperCrop().setBlockName("redPepperCrop");
		yellowPepperCrop = new BlockYellowPepperCrop().setBlockName("yellowPepperCrop");
		greenPepperCrop = new BlockGreenPepperCrop().setBlockName("greenPepperCrop");
		leekCrop = new BlockLeekCrop().setBlockName("leekCrop");
		onionCrop = new BlockOnionCrop().setBlockName("onionCrop");
		riceCrop = new BlockRiceCrop().setBlockName("riceCrop");
		rapeCrop = new BlockRapeCrop().setBlockName("rapeCrop");
		blueBerryCrop = new BlockBlueBerryCrop().setBlockName("blueBerryCrop");
		blackCurrantCrop = new BlockBlackCurrantCrop().setBlockName("blackCurrantCrop");
		avocadoCrop = new BlockAvocadoCrop().setBlockName("avocadoCrop");
		rhubarbCrop = new BlockRhubarbCrop().setBlockName("rhubarbCrop");
	}
	
	public static void initBushes() {
		blackberryBush = new BlockBlackberryBush().setBlockName("blackberryBush");
		strawberryBush = new BlockStrawberryBush().setBlockName("strawberryBush");
		raspberryBush = new BlockRaspberryBush().setBlockName("raspberryBush");
		seaweedBush = new BlockSeaweedBush().setBlockName("seaweedBush");
		greenGrapeVine = new BlockGreenGrapeVineBare().setBlockName("greenGrapeVine");
		redGrapeVine = new BlockRedGrapeVineBare().setBlockName("redGrapeVine");
	}
	
	public static void initSaplings() {
		/*orangeSapling = new BlockFCFSapling().setBlockName("orangeSapling");
		pearSapling = new BlockFCFSapling().setBlockName("pearSapling");
		bananaSapling = new BlockFCFSapling().setBlockName("bananaSapling");
		lemonSapling = new BlockFCFSapling().setBlockName("lemonSapling");
		limeSapling = new BlockFCFSapling().setBlockName("limeSapling");*/

	}
}
