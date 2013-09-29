package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.*;
import net.minecraft.block.Block;

public class FCF_Blocks {
	private static FoodConfig config;
	
	public static Block fridgeBlock;
	public static Block largeFridgeBlock;
	public static Block vendingMachine;
	
	/*public static Block broccoliCrop;
	public static Block lettuceCrop;
	public static Block garlicCrop;
	public static Block cabbageCrop;
	public static Block celeryCrop;
	public static Block leekCrop;
	public static Block lemonCrop;
	public static Block limeCrop;
	public static Block orangeCrop;*/
	public static Block onionCrop;
	public static Block riceCrop;
	
	public static void init() {
		initBlocks();
		initCrops();
	}
	
	public static void initBlocks() {
		fridgeBlock = new FridgeBlock(config.fridgeID).setUnlocalizedName("fridgeBlock");
		largeFridgeBlock = new LargeFridgeBlock(config.largeFridgeID).setUnlocalizedName("largeFridgeBlock");
		vendingMachine = new VendingMachineBlock(config.vendingMachineID).setUnlocalizedName("vendingMachine");
	}
	
	public static void initCrops() {
		/*broccoliCrop = new BlockBroccoliCrop(config.broccoliCropID).setUnlocalizedName("broccoliCrop");
		lettuceCrop = new BlockLettuceCrop(config.lettuceCropID).setUnlocalizedName("lettuceCrop");
		garlicCrop = new BlockGarlicCrop(config.garlicCropID).setUnlocalizedName("garlicCrop");
		cabbageCrop = new BlockCabbageCrop(config.cabbageCropID).setUnlocalizedName("cabbageCrop");
		celeryCrop = new BlockCeleryCrop(config.celeryCropID).setUnlocalizedName("celeryCrop");
		leekCrop = new BlockLeekCrop(config.leekCropID).setUnlocalizedName("leekCrop");*/
		onionCrop = new BlockOnionCrop(config.onionCropID).setUnlocalizedName("onionCrop");
		/*lemonCrop = new BlockLemonCrop(config.lemonCropID).setUnlocalizedName("lemonCrop");
		limeCrop = new BlockLimeCrop(config.limeCropID).setUnlocalizedName("limeCrop");
		orangeCrop = new BlockOrangeCrop(config.orangeCropID).setUnlocalizedName("orangeCrop");*/
		riceCrop = new BlockRiceCrop(config.riceCropID).setUnlocalizedName("riceCrop");
	}
}
