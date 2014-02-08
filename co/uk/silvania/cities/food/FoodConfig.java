package co.uk.silvania.cities.food;

import java.io.File;
import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class FoodConfig {
	
	public static File fcFoodConfigFile;
	
	public static void init(String configpath) {
		fcFoodConfigFile = new File(configpath + "FlenixCities_Food.cfg");
		
		FoodConfig.initConfig(fcFoodConfigFile);
	}
	
    public static Configuration config;
    
	public static int fridgeID;
	public static int largeFridgeID;
	public static int vendingMachineID;
	
	public static int lambShoulderID;
	public static int lambBreastID;
	public static int lambFlankID;
	public static int lambLoinID;
	public static int lambLegID;
	public static int lambRackID;
	public static int lambShankID;
	public static int lambChopID;
	
	public static int muttonShoulderID;
	public static int muttonBreastID;
	public static int muttonFlankID;
	public static int muttonLoinID;
	public static int muttonLegID;
	public static int muttonRackID;
	
	public static int duckBreastID;
	public static int duckLegID;
	public static int duckWholeID;
	public static int duckWingID;
	
	public static int turkeyWholeID;
	public static int turkeyBreastID;
	public static int turkeyLegID;
	public static int turkeyWingID;
	
	public static int pheasantWholeID;
	public static int pheasantBreastID;
	public static int pheasantLegID;
	public static int pheasantWingID;
	
	public static int horseShoulderID;
	public static int horseRibID;
	public static int horseShankID;
	public static int horseSirloinID;
	public static int horseRumpID;
	
	public static int rabbitMeatID;
	
	public static int venisonShoulderID;
	public static int venisonLoinID;
	public static int venisonRibsID;
	public static int venisonShankID;
	
	public static int goatRackID;
	public static int goatLoinID;
	public static int goatLegID;
	
	public static int pigeonWholeID;
	public static int pigeonBreastID;
	public static int pigeonLegID;
	public static int pigeonWingID;
	
	public static int oxTongueID;
	public static int oxRibID;
	public static int oxBladeID;
	public static int oxBrisketID;
	public static int oxFlankID;
	public static int oxSirloinID;
	public static int oxTBoneID;
	public static int oxFilletID;
	public static int oxRumpID;
	public static int oxLegID;
	public static int oxTailID;
	
	public static int buffaloBreastID;
	public static int buffaloRibID;
	public static int buffaloSirloinID;
	public static int buffaloFlankID;
	
	public static int boarShoulderID;
	public static int boarLoinID;
	public static int boarBellyID;
	public static int boarLegID;
	
	public static int beefRibID;
	public static int beefBrisketID;
	public static int beefSirloinID;
	public static int beefLegID;
	public static int beefFlankID;
	
	public static int porkShoulderID;
	public static int porkRibID;
	public static int porkBellyID;
	public static int porkLegID;
	public static int porkLoinID;
	
	public static int chickenWingID;
	public static int chickenBreastID;
	public static int chickenLegID;
	
	public static int snailMeatID;
	
	public static int rawSquidID;
	public static int rawCodID;
	public static int rawLobsterID;
	public static int rawCrabID;
	public static int rawPrawnID;
	public static int rawShrimpID;
	public static int rawAnchovyID;
	public static int rawTunaID;
	public static int rawSardineID;
	public static int rawCarpID;
	public static int rawOysterID;
	public static int rawMusselID;
	public static int rawSharkID;
	public static int rawTroutID;
	public static int rawBassID;
	public static int rawHaddockID;
	public static int rawSwordfishID;
	public static int rawMackeralID;
	
	public static int foodCheeseBurgerID;
	public static int foodBurgerID;
	public static int foodHotDogID;
	public static int foodPizzaID;
	public static int foodNoodlesID;
	public static int foodChocolateBarID;
	public static int foodCrispsID;
	public static int foodEnergyBarID;
	public static int foodCheeseMoltenID;
	public static int foodCheeseMildID;
	public static int foodCheeseMediumID;
	public static int foodCheeseMatureID;
	public static int foodCheeseBlueID;
	public static int foodCheeseMouldyID;
	public static int foodTomatoID;

	public static int foodChickenWingsID;
	public static int foodChickenNuggetsID;
	public static int foodSausageID;
	public static int foodSausageRollID;
	public static int doughItemID;
	public static int chocolateItemID;
	public static int chocolateChipsID;
	public static int breadSliceID;
	public static int breadCrumbsID;
	public static int mincedBeefID;
	public static int coneItemID;
	
	public static int cookedSquidID;
	public static int cookedCodID;
	public static int cookedLobsterID;
	public static int cookedCrabID;
	public static int cookedPcookednID;
	public static int cookedShrimpID;
	public static int cookedAnchovyID;
	public static int cookedTunaID;
	public static int cookedSardineID;
	public static int cookedCarpID;
	public static int cookedOysterID;
	public static int cookedMusselID;
	public static int cookedSharkID;
	public static int cookedTroutID;
	public static int cookedBassID;
	public static int cookedHaddockID;
	public static int cookedSwordfishID;
	public static int cookedMackeralID;
	
	public static int foodDonutID;
	public static int foodSweetsID;
	public static int foodFriesID;
	public static int foodPopcornID;
	public static int foodIceCreamID;
	public static int foodChocolateIceCreamID;
	public static int foodMuffinID;
	public static int foodChocolateMuffinID;
	public static int foodBlueberryMuffinID;
	public static int chocolateCakeID;
	public static int chocolateCakeSliceID;
	public static int cakeSliceID;
	public static int strawberryCheesecakeID;
	public static int chocolateCheesecakeID;
	public static int foodVanillaConeID;
	public static int foodChocolateConeID;
	public static int strawberryIceLollyID;
	public static int chocolateIceLollyID;
	public static int milkIceLollyID;
	
	public static int lettuceItemID;
	public static int garlicItemID;
	public static int broccoliItemID;
	public static int cabbageItemID;
	public static int celeryItemID;
	public static int cornItemID;
	public static int cucumberItemID;
	public static int redPepperItemID;
	public static int yellowPepperItemID;
	public static int greenPepperItemID;
	public static int leekItemID;
	public static int onionItemID;
	public static int blackberryItemID;
	public static int blueberryItemID;
	public static int blackcurrentItemID;
	public static int figItemID;
	public static int grapesItemID;
	public static int redGrapesItemID;
	public static int lemonItemID;
	public static int limeItemID;
	public static int orangeItemID;
	public static int strawberryItemID;
	public static int raspberryItemID;
	public static int riceItemID;
	public static int avocadoItemID;
	public static int pearItemID;
	public static int bananaItemID;
	public static int seaweedItemID;
	public static int rhubarbItemID;
	
	public static int pastryItemID;
	public static int pieTinID;
	
	public static int broccoliSeedID;
	public static int tomatoSeedID;
	public static int lettuceSeedID;
	public static int garlicSeedID;
	public static int cabbageSeedID;
	public static int celerySeedID;
	public static int cornSeedID;
	public static int cucumberSeedID;
	public static int redPepperSeedID;
	public static int yellowPepperSeedID;
	public static int greenPepperSeedID;
	public static int leekSeedID;
	public static int onionSeedID;
	public static int rapeSeedID;
	public static int blueBerrySeedID;
	public static int blackCurrantSeedID;
	public static int avocadoSeedID;
	public static int rhubarbSeedID;
	
	public static int broccoliCropID;
	public static int tomatoCropID;
	public static int lettuceCropID;
	public static int garlicCropID;
	public static int cabbageCropID;
	public static int celeryCropID;
	public static int cornCropID;
	public static int cucumberCropID;
	public static int redPepperCropID;
	public static int yellowPepperCropID;
	public static int greenPepperCropID;
	public static int leekCropID;
	public static int onionCropID;
	public static int riceCropID;
	public static int rapeCropID;
	public static int blueBerryCropID;
	public static int blackCurrantCropID;
	public static int avocadoCropID;
	public static int rhubarbCropID;
	
	public static int blackberryBushID;
	public static int strawberryBushID;
	public static int raspberryBushID;
	public static int seaweedBushID;
	public static int greenGrapeVineID;
	public static int redGrapeVineID;
	
	public static int orangeSaplingID;
	public static int pearSaplingID;
	public static int bananaSaplingID;
	public static int lemonSaplingID;
	public static int limeSaplingID;
	
	public static int drinkAppleJuiceID;
	public static int drinkColaID;
	public static int drinkOrangeJuiceID;
	public static int drinkWaterBottleID;
	public static int drinkMilkBottleID;
	public static int drinkEnergyDrinkID;
	public static int drinkMilkshakeID;
	public static int drinkCoffeeID;
	public static int drinkHotChocolateID;
	
	public static int knifeForkItemID;
	public static int spoonItemID;
	public static int woodenSpoonID;
	public static int breadKnifeID;
	public static int cheeseKnifeID;
	public static int largeKnifeID;
	public static int saucepanSmallID;
	public static int saucepanLargeID;
	public static int fryingPanID;
	public static int wokItemID;
	public static int smallContainerID;
	public static int medContainerID;
	public static int largeContainerID;
	public static int smallPlateID;
	public static int largePlateID;
	public static int bowlItemID;
	public static int mugItemID;
	public static int plasticCupID;
	public static int glassCupID;
	
	public static boolean overrideFood;
	
	
	public static void initConfig (File configFile) {
		config = new Configuration(configFile);
		
		try {
			config.load();
			fridgeID = config.getBlock("Fridge", 1437).getInt();
			largeFridgeID = config.getBlock("Large Fridge", 1438).getInt();
			vendingMachineID = config.getBlock("Vending Machine", 1426).getInt();
			
			broccoliCropID = config.getBlock("Broccoli Crop", 1550).getInt();
			lettuceCropID = config.getBlock("Lettuce Crop", 1551).getInt();
			garlicCropID = config.getBlock("Garlic Crop", 1552).getInt();
			cabbageCropID = config.getBlock("Cabbage Crop", 1553).getInt();
			celeryCropID = config.getBlock("Celery Crop", 1554).getInt();
			leekCropID = config.getBlock("Leek Crop", 1555).getInt();
			onionCropID = config.getBlock("Onion Crop", 1556).getInt();
			blueBerryCropID = config.getBlock("Blueberry Crop", 1557).getInt();
			blackCurrantCropID = config.getBlock("Blackcurrant Crop", 1558).getInt();
			avocadoCropID = config.getBlock("Avocado Crop", 1559).getInt();
			riceCropID = config.getBlock("Rice Crop", 1560).getInt();
			tomatoCropID = config.getBlock("Tomato Crop", 1561).getInt();
			cornCropID = config.getBlock("Corn Crop", 1562).getInt();
			cucumberCropID = config.getBlock("Cucumber Crop", 1563).getInt();
			redPepperCropID = config.getBlock("Red Pepper Crop", 1564).getInt();
			yellowPepperCropID = config.getBlock("Yellow Pepper Crop", 1565).getInt();
			greenPepperCropID = config.getBlock("Green Pepper Crop", 1566).getInt();
			rhubarbCropID = config.getBlock("Rhubarb Crop", 1567).getInt();
			rapeCropID = config.getBlock("Rape Crop", 1568).getInt();
			
			blackberryBushID = config.getBlock("Blackberry Bush", 1575).getInt();
			strawberryBushID = config.getBlock("Strawberry Bush", 1576).getInt();
			raspberryBushID = config.getBlock("Raspberry Bush", 1577).getInt();
			seaweedBushID = config.getBlock("Seaweed Bush", 1578).getInt();
			greenGrapeVineID = config.getBlock("Green Grape Vine", 1579).getInt();
			redGrapeVineID = config.getBlock("Red Grape Vine", 1580).getInt();
			
			orangeSaplingID = config.getBlock("Orange Sapling", 1581).getInt();
			pearSaplingID = config.getBlock("Pear Sapling", 1582).getInt();
			bananaSaplingID = config.getBlock("Banana Sapling", 1583).getInt();
			lemonSaplingID = config.getBlock("Lemon Sapling", 1584).getInt();
			limeSaplingID = config.getBlock("Lime Sapling", 1585).getInt();
			
			//Raw Ingredients
			lambShoulderID = config.getItem("Lamb Shoulder", 16744).getInt();
			lambBreastID = config.getItem("Lamb Breast", 16745).getInt();
			lambFlankID = config.getItem("Lamb Flank", 16746).getInt();
			lambLoinID = config.getItem("Lamb Loin", 16747).getInt();
			lambLegID = config.getItem("Lamb Leg", 16748).getInt();
			lambRackID = config.getItem("Lamb Rack", 16749).getInt();
			lambShankID = config.getItem("Lamb Shank", 16750).getInt();
			lambChopID = config.getItem("Lamb Chop", 16751).getInt();
			
			muttonShoulderID = config.getItem("Mutton Shoulder", 16752).getInt();
			muttonBreastID = config.getItem("Mutton Breast", 16753).getInt();
			muttonFlankID = config.getItem("Mutton Flank", 16754).getInt();
			muttonLoinID = config.getItem("Mutton Loin", 16755).getInt();
			muttonLegID = config.getItem("Mutton Leg", 16756).getInt();
			muttonRackID = config.getItem("Mutton Rack", 16757).getInt();
			
			duckBreastID = config.getItem("Duck Breast", 16758).getInt();
			duckLegID = config.getItem("Duck Leg", 16759).getInt();
			duckWholeID = config.getItem("Duck Whole", 16760).getInt();
			duckWingID = config.getItem("Duck Wing", 16761).getInt();
			
			turkeyWholeID = config.getItem("Turkey Whole", 16762).getInt();
			turkeyBreastID = config.getItem("Turkey Breast", 16763).getInt();
			turkeyLegID = config.getItem("Turkey Leg", 16764).getInt();
			turkeyWingID = config.getItem("Turkey Wing", 16765).getInt();
			
			pheasantWholeID = config.getItem("Pheasant Whole", 16766).getInt();
			pheasantBreastID = config.getItem("Pheasant Breast", 16767).getInt();
			pheasantLegID = config.getItem("Pheasant Leg", 16768).getInt();
			pheasantWingID = config.getItem("Pheasant Wing", 16769).getInt();
			
			horseShoulderID = config.getItem("Horse Shoulder", 16770).getInt();
			horseRibID = config.getItem("Horse Rib", 16771).getInt();
			horseShankID = config.getItem("Horse Shank", 16772).getInt();
			horseSirloinID = config.getItem("Horse Sirloin", 16773).getInt();
			horseRumpID = config.getItem("Horse Rump", 16774).getInt();
			
			rabbitMeatID = config.getItem("Rabbit Meat", 16775).getInt();
			
			venisonShoulderID = config.getItem("Venison Shoulder", 16776).getInt();
			venisonLoinID = config.getItem("Venison Loin", 16777).getInt();
			venisonRibsID = config.getItem("Venison Ribs", 16778).getInt();
			venisonShankID = config.getItem("Venison Shank", 16779).getInt();
			
			goatRackID = config.getItem("Goat Rack", 16780).getInt();
			goatLoinID = config.getItem("Goat Loin", 16781).getInt();
			goatLegID = config.getItem("Goat Leg", 16782).getInt();
			
			pigeonWholeID = config.getItem("Pigeon Whole", 16783).getInt();
			pigeonBreastID = config.getItem("Pigeon Breast", 16784).getInt();
			pigeonLegID = config.getItem("Pigeon Leg", 16785).getInt();
			pigeonWingID = config.getItem("Pigeon Wing", 16786).getInt();
			
			oxTongueID = config.getItem("Ox Tongue", 16787).getInt();
			oxRibID = config.getItem("Ox Rib", 16788).getInt();
			oxBladeID = config.getItem("Ox Blade", 16789).getInt();
			oxBrisketID = config.getItem("Ox Brisket", 16790).getInt();
			oxFlankID = config.getItem("Ox Flank", 16791).getInt();
			oxSirloinID = config.getItem("Ox Sirloin", 16792).getInt();
			oxTBoneID = config.getItem("Ox T-Bone", 16793).getInt();
			oxFilletID = config.getItem("Ox Fillet", 16794).getInt();
			oxRumpID = config.getItem("Ox Rump", 16795).getInt();
			oxLegID = config.getItem("Ox Leg", 16796).getInt();
			oxTailID = config.getItem("Ox Tail", 16797).getInt();
			
			buffaloBreastID = config.getItem("Buffalo Breast", 16798).getInt();
			buffaloRibID = config.getItem("Buffalo Rib", 16799).getInt();
			buffaloSirloinID = config.getItem("Buffalo Sirloin", 16800).getInt();
			buffaloFlankID = config.getItem("Buffalo Flank", 16801).getInt();
			
			boarShoulderID = config.getItem("Boar Shoulder", 16802).getInt();
			boarLoinID = config.getItem("Boar Loin", 16803).getInt();
			boarBellyID = config.getItem("Boar Belly", 16804).getInt();
			boarLegID = config.getItem("Boar Leg", 16805).getInt();
			
			beefRibID = config.getItem("Beef Rib", 16806).getInt();
			beefBrisketID = config.getItem("Beef Brisket", 16807).getInt();
			beefSirloinID = config.getItem("Beef Sirloin", 16808).getInt();
			beefLegID = config.getItem("Beef Leg", 16809).getInt();
			beefFlankID = config.getItem("Beef Flank", 16810).getInt();
			
			porkShoulderID = config.getItem("Pork Shoulder", 16811).getInt();
			porkRibID = config.getItem("Pork Rib", 16812).getInt();
			porkBellyID = config.getItem("Pork Belly", 16813).getInt();
			porkLegID = config.getItem("Pork Leg", 16814).getInt();
			porkLoinID = config.getItem("Pork Loin", 16815).getInt();
			
			chickenWingID = config.getItem("Chicken Wing", 16816).getInt();
			chickenBreastID = config.getItem("Chicken Breast", 16817).getInt();
			chickenLegID = config.getItem("Chicken Leg", 16818).getInt();
			
			snailMeatID = config.getItem("Chicken Leg", 16819).getInt();
			
			rawSquidID = config.getItem("Raw Squid", 16900).getInt();
			rawCodID = config.getItem("Raw Cod", 16901).getInt();
			rawLobsterID = config.getItem("Raw Lobster", 16902).getInt();
			rawCrabID = config.getItem("Raw Crab", 16903).getInt();
			rawPrawnID = config.getItem("Raw Prawn", 16904).getInt();
			rawShrimpID = config.getItem("Raw Shrimp", 16905).getInt();
			rawAnchovyID = config.getItem("Raw Anchovy", 16906).getInt();
			rawTunaID = config.getItem("Raw Tuna", 16907).getInt();
			rawSardineID = config.getItem("Raw Sardine", 16908).getInt();
			rawCarpID = config.getItem("Raw Carp", 16909).getInt();
			rawOysterID = config.getItem("Raw Oyster", 16910).getInt();
			rawMusselID = config.getItem("Raw Mussel", 16911).getInt();
			rawSharkID = config.getItem("Raw Shark", 16912).getInt();
			rawTroutID = config.getItem("Raw Trout", 16913).getInt();
			rawBassID = config.getItem("Raw Bass", 16914).getInt();
			rawHaddockID = config.getItem("Raw Haddock", 16915).getInt();
			rawSwordfishID = config.getItem("Raw Swordfish", 16916).getInt();
			rawMackeralID = config.getItem("Raw Mackeral", 16917).getInt();
			
			//Fruit n Veg
			lettuceItemID = config.getItem("Lettuce", 17000).getInt();
			garlicItemID = config.getItem("Garlic", 17001).getInt();
			broccoliItemID = config.getItem("Broccoli", 17002).getInt();
			cabbageItemID = config.getItem("Cabbage", 17003).getInt();
			celeryItemID = config.getItem("Celery", 17004).getInt();
			cucumberItemID = config.getItem("Cucumber", 17005).getInt();
			redPepperItemID = config.getItem("Red Pepper", 17006).getInt();
			yellowPepperItemID = config.getItem("Yellow Pepper", 17007).getInt();
			greenPepperItemID = config.getItem("Green Pepper", 17008).getInt();
			leekItemID = config.getItem("Leek", 17009).getInt();
			onionItemID = config.getItem("Onion", 17010).getInt();
			blackberryItemID = config.getItem("Blackberry", 17011).getInt();
			blueberryItemID = config.getItem("Blueberry", 17012).getInt();
			blackcurrentItemID = config.getItem("Blackcurrant", 17013).getInt();
			grapesItemID = config.getItem("Grape", 17014).getInt();
			redGrapesItemID = config.getItem("Red Grape", 17015).getInt();
			lemonItemID = config.getItem("Lemon", 17016).getInt();
			limeItemID = config.getItem("Lime", 17017).getInt();
			orangeItemID = config.getItem("Orange", 17018).getInt();
			strawberryItemID = config.getItem("Strawberry", 17019).getInt();
			raspberryItemID = config.getItem("Raspberry", 17020).getInt();
			riceItemID = config.getItem("Rice", 17021).getInt();
			avocadoItemID = config.getItem("Avocado", 17022).getInt();
			pearItemID = config.getItem("Pear", 17023).getInt();
			bananaItemID = config.getItem("Banana", 17024).getInt();
			seaweedItemID = config.getItem("Seaweed", 17025).getInt();
			rhubarbItemID = config.getItem("Rhubarb", 17026).getInt();
			cornItemID = config.getItem("Corn", 17027).getInt();
			
			//Meal Parts
			foodCheeseBurgerID = config.getItem("Cheeseburger", 17050).getInt();
			foodBurgerID = config.getItem("Burger", 17051).getInt();
			foodHotDogID = config.getItem("Hot Dog", 17052).getInt();
			foodPizzaID = config.getItem("Pizza", 17053).getInt();
			foodNoodlesID = config.getItem("Noodles", 17054).getInt();
			foodChocolateBarID = config.getItem("Chocolate Bar", 17055).getInt();
			foodCrispsID = config.getItem("Crisps", 17056).getInt();
			foodEnergyBarID = config.getItem("Energy Bar", 17057).getInt();
			foodCheeseMoltenID = config.getItem("Cheese", 17058).getInt();
			foodCheeseMildID = config.getItem("Mild Cheese", 17059).getInt();
			foodCheeseMediumID = config.getItem("Medium Cheese", 17060).getInt();
			foodCheeseMatureID = config.getItem("Mature Cheese", 17061).getInt();
			foodCheeseBlueID = config.getItem("Blue Cheese", 17062).getInt();
			foodCheeseMouldyID = config.getItem("Mouldy Cheese", 17063).getInt();
			foodTomatoID = config.getItem("Tomato", 17064).getInt();
			//ID = config.getItem("", 17065).getInt();
			//ID = config.getItem("", 17066).getInt();
			//ID = config.getItem("", 17067).getInt();
			//ID = config.getItem("", 17068).getInt();
			//ID = config.getItem("", 17069).getInt();
			foodChickenWingsID = config.getItem("Chicken Wings", 17070).getInt();
			foodChickenNuggetsID = config.getItem("Chicken Nuggets", 17071).getInt();
			foodSausageID = config.getItem("Sausage", 17072).getInt();
			foodSausageRollID = config.getItem("Sausage Roll", 17073).getInt();
			doughItemID = config.getItem("Dough", 17074).getInt();
			pastryItemID = config.getItem("Pastry", 17075).getInt();
			chocolateItemID = config.getItem("Chocolate", 17076).getInt();
			chocolateChipsID = config.getItem("Chocolate Chips", 17077).getInt();
			breadSliceID = config.getItem("Bread Slice", 17078).getInt();
			breadCrumbsID = config.getItem("Bread Crumbs", 17079).getInt();
			mincedBeefID = config.getItem("Minced Beef", 17080).getInt();
			coneItemID = config.getItem("Ice Cream Cone", 17081).getInt();
			
			cookedSquidID = config.getItem("Cooked Squid", 17108).getInt();
			cookedCodID = config.getItem("Cooked Cod", 17109).getInt();
			cookedLobsterID = config.getItem("Cooked Lobster", 17110).getInt();
			cookedCrabID = config.getItem("Cooked Crab", 17111).getInt();
			cookedPcookednID = config.getItem("Cooked Pcookedn", 17112).getInt();
			cookedShrimpID = config.getItem("Cooked Shrimp", 17113).getInt();
			cookedAnchovyID = config.getItem("Cooked Anchovy", 17114).getInt();
			cookedTunaID = config.getItem("Cooked Tuna", 17115).getInt();
			cookedSardineID = config.getItem("Cooked Sardine", 17116).getInt();
			cookedCarpID = config.getItem("Cooked Carp", 17117).getInt();
			cookedOysterID = config.getItem("Cooked Oyster", 17118).getInt();
			cookedMusselID = config.getItem("Cooked Mussel", 17119).getInt();
			cookedSharkID = config.getItem("Cooked Shark", 17120).getInt();
			cookedTroutID = config.getItem("Cooked Trout", 17121).getInt();
			cookedBassID = config.getItem("Cooked Bass", 17122).getInt();
			cookedHaddockID = config.getItem("Cooked Haddock", 17123).getInt();
			cookedSwordfishID = config.getItem("Cooked Swordfish", 17124).getInt();
			cookedMackeralID = config.getItem("Cooked Mackeral", 17125).getInt();
			
			
			//Snacks
			foodDonutID = config.getItem("Donut", 17200).getInt();
			foodSweetsID = config.getItem("Sweets", 17201).getInt();
			foodFriesID = config.getItem("Fries", 17202).getInt();
			foodPopcornID = config.getItem("Popcorn", 17203).getInt();
			foodIceCreamID = config.getItem("Ice Cream", 17204).getInt();
			foodChocolateIceCreamID = config.getItem("Chocolate Ice Cream", 17205).getInt();
			foodMuffinID = config.getItem("Muffin", 17206).getInt();
			foodChocolateMuffinID = config.getItem("Chocolate Muffin", 17207).getInt();
			foodBlueberryMuffinID = config.getItem("Blueberry Muffin", 17208).getInt();
			chocolateCakeID = config.getItem("Chocolate Cake", 17209).getInt();
			chocolateCakeSliceID = config.getItem("Chocolate Cake Slice", 17210).getInt();
			cakeSliceID = config.getItem("Cake Slice", 17211).getInt();
			strawberryCheesecakeID = config.getItem("Strawberry Cheesecake", 17212).getInt();
			chocolateCheesecakeID = config.getItem("Chocolate Cheesecake", 17213).getInt();
			foodVanillaConeID = config.getItem("Vanilla Cone", 17214).getInt();
			foodChocolateConeID = config.getItem("Chocolate Cone", 17215).getInt();
			strawberryIceLollyID = config.getItem("Strawberry Ice Lolly", 17216).getInt();
			chocolateIceLollyID = config.getItem("Chocolate Ice Lolly", 17217).getInt();
			milkIceLollyID = config.getItem("Milk Ice Lolly", 17218).getInt();
			
			
			broccoliSeedID = config.getItem("Broccoli Seed", 17969).getInt();
			tomatoSeedID = config.getItem("Tomato Seed", 17970).getInt();
			lettuceSeedID = config.getItem("Lettuce Seed", 17971).getInt();
			garlicSeedID = config.getItem("Garlic Seed", 17972).getInt();
			cabbageSeedID = config.getItem("Cabbage Seed", 17973).getInt();
			celerySeedID = config.getItem("Celery Seed", 17974).getInt();
			cornSeedID = config.getItem("Corn Seed", 17975).getInt();
			cucumberSeedID = config.getItem("Cucumber Seed", 17976).getInt();
			redPepperSeedID = config.getItem("Red Pepper Seed", 17977).getInt();
			yellowPepperSeedID = config.getItem("Yellow Pepper Seed", 17978).getInt();
			greenPepperSeedID = config.getItem("Green Pepper Seed", 17979).getInt();
			leekSeedID = config.getItem("Leek Seed", 17980).getInt();
			onionSeedID = config.getItem("Onion Seed", 17981).getInt();
			blueBerrySeedID = config.getItem("Blueberry Seed", 17982).getInt();
			blackCurrantSeedID = config.getItem("Blackcurrant Seed", 17983).getInt();
			avocadoSeedID = config.getItem("Avocado Seed", 17984).getInt();
			rhubarbSeedID = config.getItem("Rhubarb Seed", 17985).getInt();
			rapeSeedID = config.getItem("Rape Seed", 17986).getInt();
			
			drinkAppleJuiceID = config.getItem("Apple Juice", 17936).getInt();
			drinkColaID = config.getItem("Cola", 17937).getInt();
			drinkOrangeJuiceID = config.getItem("Orange Juice", 17938).getInt();
			drinkWaterBottleID = config.getItem("Water Bottle", 17939).getInt();
			drinkMilkBottleID = config.getItem("Milk Bottle", 17940).getInt();
			drinkEnergyDrinkID = config.getItem("Energy Drink", 17941).getInt();
			drinkMilkshakeID = config.getItem("Milkshake", 17942).getInt();
			drinkCoffeeID = config.getItem("Coffee", 17943).getInt();
			drinkHotChocolateID = config.getItem("Hot Chocolate", 17944).getInt();
			
			knifeForkItemID = config.getItem("Knife/Fork", 18300).getInt();
			spoonItemID = config.getItem("Spoon", 18301).getInt();
			woodenSpoonID = config.getItem("Wooden Spoon", 18302).getInt();
			breadKnifeID = config.getItem("Bread Knife", 18303).getInt();
			cheeseKnifeID = config.getItem("Cheese Knife", 18304).getInt();
			largeKnifeID = config.getItem("Large Knife", 18305).getInt();
			saucepanSmallID = config.getItem("Small Saucepan", 18306).getInt();
			saucepanLargeID = config.getItem("Large Saucepan", 18307).getInt();
			fryingPanID = config.getItem("Frying Pan", 18308).getInt();
			wokItemID = config.getItem("Wok", 18309).getInt();
			smallContainerID = config.getItem("Small Container", 18310).getInt();
			medContainerID = config.getItem("Medium Container", 18311).getInt();
			largeContainerID = config.getItem("Large Container", 18312).getInt();
			smallPlateID = config.getItem("Small Plate", 18313).getInt();
			largePlateID = config.getItem("Large Plate", 18314).getInt();
			bowlItemID = config.getItem("Bowl", 18315).getInt();
			mugItemID = config.getItem("Mug", 18316).getInt();
			plasticCupID = config.getItem("Plastic Cup", 18317).getInt();
			glassCupID = config.getItem("Glass Cup", 18318).getInt();
			pieTinID = config.getItem("Pie Tin", 17967).getInt();
			
			
			overrideFood = config.get(Configuration.CATEGORY_GENERAL, "overrideFood", true).getBoolean(true);
		}
		catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "### Warning! FlenixCities Food could not load it's config file! ###");
		}
		
		finally {
			if (config.hasChanged()) {
				config.save();
			}
		}
	}
}
