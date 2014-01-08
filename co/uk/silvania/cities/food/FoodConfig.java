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
	
	public static int rawLambID;
	public static int rawDuckID;
	public static int rawMuttonID;
	public static int rawTurkeyID;
	public static int rawPheasantID;
	public static int rawHorseID;
	public static int rawRabbitID;
	public static int rawVenisonID;
	public static int rawGoatID;
	public static int rawPigeonID;
	public static int rawOxID;
	public static int rawBuffaloID;
	public static int rawBoarID;
	public static int rawSnailID;
	
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
	
	public static int cookedLambID;
	public static int cookedDuckID;
	public static int cookedMuttonID;
	public static int cookedTurkeyID;
	public static int cookedPheasantID;
	public static int cookedHorseID;
	public static int cookedRabbitID;
	public static int cookedVenisonID;
	public static int cookedGoatID;
	public static int cookedPigeonID;
	public static int cookedOxID;
	public static int cookedBuffaloID;
	public static int cookedBoarID;
	public static int cookedSnailID;
	
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
			rawLambID = config.getItem("Raw Lamb", 16744).getInt();
			rawDuckID = config.getItem("Raw Duck", 16745).getInt();
			rawMuttonID = config.getItem("Raw Mutton", 16746).getInt();
			rawTurkeyID = config.getItem("Raw Turkey", 16747).getInt();
			rawPheasantID = config.getItem("Raw Pheasant", 16748).getInt();
			rawHorseID = config.getItem("Raw Horse", 16749).getInt();
			rawRabbitID = config.getItem("Raw Rabbit", 16750).getInt();
			rawVenisonID = config.getItem("Raw Venison", 16751).getInt();
			rawGoatID = config.getItem("Raw Goat", 16752).getInt();
			rawPigeonID = config.getItem("Raw Pigeon", 16753).getInt();
			rawOxID = config.getItem("Raw Ox", 16754).getInt();
			rawBuffaloID = config.getItem("Raw Buffalo", 16755).getInt();
			rawBoarID = config.getItem("Raw Boar", 16756).getInt();
			rawSnailID = config.getItem("Raw Snail", 16757).getInt();
			
			rawSquidID = config.getItem("Raw Squid", 16770).getInt();
			rawCodID = config.getItem("Raw Cod", 16771).getInt();
			rawLobsterID = config.getItem("Raw Lobster", 16772).getInt();
			rawCrabID = config.getItem("Raw Crab", 16773).getInt();
			rawPrawnID = config.getItem("Raw Prawn", 16774).getInt();
			rawShrimpID = config.getItem("Raw Shrimp", 16775).getInt();
			rawAnchovyID = config.getItem("Raw Anchovy", 16776).getInt();
			rawTunaID = config.getItem("Raw Tuna", 16777).getInt();
			rawSardineID = config.getItem("Raw Sardine", 16778).getInt();
			rawCarpID = config.getItem("Raw Carp", 16779).getInt();
			rawOysterID = config.getItem("Raw Oyster", 16780).getInt();
			rawMusselID = config.getItem("Raw Mussel", 16781).getInt();
			rawSharkID = config.getItem("Raw Shark", 16782).getInt();
			rawTroutID = config.getItem("Raw Trout", 16783).getInt();
			rawBassID = config.getItem("Raw Bass", 16784).getInt();
			rawHaddockID = config.getItem("Raw Haddock", 16785).getInt();
			rawSwordfishID = config.getItem("Raw Swordfish", 16786).getInt();
			rawMackeralID = config.getItem("Raw Mackeral", 16787).getInt();
			
			//Fruit n Veg
			lettuceItemID = config.getItem("Lettuce", 16800).getInt();
			garlicItemID = config.getItem("Garlic", 16801).getInt();
			broccoliItemID = config.getItem("Broccoli", 16802).getInt();
			cabbageItemID = config.getItem("Cabbage", 16803).getInt();
			celeryItemID = config.getItem("Celery", 16804).getInt();
			cucumberItemID = config.getItem("Cucumber", 16805).getInt();
			redPepperItemID = config.getItem("Red Pepper", 16806).getInt();
			yellowPepperItemID = config.getItem("Yellow Pepper", 16807).getInt();
			greenPepperItemID = config.getItem("Green Pepper", 16808).getInt();
			leekItemID = config.getItem("Leek", 16809).getInt();
			onionItemID = config.getItem("Onion", 16810).getInt();
			blackberryItemID = config.getItem("Blackberry", 16811).getInt();
			blueberryItemID = config.getItem("Blueberry", 16812).getInt();
			blackcurrentItemID = config.getItem("Blackcurrant", 16813).getInt();
			grapesItemID = config.getItem("Grape", 16814).getInt();
			redGrapesItemID = config.getItem("Red Grape", 16815).getInt();
			lemonItemID = config.getItem("Lemon", 16816).getInt();
			limeItemID = config.getItem("Lime", 16817).getInt();
			orangeItemID = config.getItem("Orange", 16818).getInt();
			strawberryItemID = config.getItem("Strawberry", 16819).getInt();
			raspberryItemID = config.getItem("Raspberry", 16820).getInt();
			riceItemID = config.getItem("Rice", 16821).getInt();
			avocadoItemID = config.getItem("Avocado", 16822).getInt();
			pearItemID = config.getItem("Pear", 16823).getInt();
			bananaItemID = config.getItem("Banana", 16824).getInt();
			seaweedItemID = config.getItem("Seaweed", 16825).getInt();
			rhubarbItemID = config.getItem("Rhubarb", 16826).getInt();
			cornItemID = config.getItem("Corn", 16827).getInt();
			
			//Meal Parts
			foodCheeseBurgerID = config.getItem("Cheeseburger", 16850).getInt();
			foodBurgerID = config.getItem("Burger", 16851).getInt();
			foodHotDogID = config.getItem("Hot Dog", 16852).getInt();
			foodPizzaID = config.getItem("Pizza", 16853).getInt();
			foodNoodlesID = config.getItem("Noodles", 16854).getInt();
			foodChocolateBarID = config.getItem("Chocolate Bar", 16855).getInt();
			foodCrispsID = config.getItem("Crisps", 16856).getInt();
			foodEnergyBarID = config.getItem("Energy Bar", 16857).getInt();
			foodCheeseMoltenID = config.getItem("Cheese", 16858).getInt();
			foodCheeseMildID = config.getItem("Mild Cheese", 16859).getInt();
			foodCheeseMediumID = config.getItem("Medium Cheese", 16860).getInt();
			foodCheeseMatureID = config.getItem("Mature Cheese", 16861).getInt();
			foodCheeseBlueID = config.getItem("Blue Cheese", 16862).getInt();
			foodCheeseMouldyID = config.getItem("Mouldy Cheese", 16863).getInt();
			foodTomatoID = config.getItem("Tomato", 16864).getInt();
			//ID = config.getItem("", 16865).getInt();
			//ID = config.getItem("", 16866).getInt();
			//ID = config.getItem("", 16867).getInt();
			//ID = config.getItem("", 16868).getInt();
			//ID = config.getItem("", 16869).getInt();
			foodChickenWingsID = config.getItem("Chicken Wings", 16870).getInt();
			foodChickenNuggetsID = config.getItem("Chicken Nuggets", 16871).getInt();
			foodSausageID = config.getItem("Sausage", 16872).getInt();
			foodSausageRollID = config.getItem("Sausage Roll", 16873).getInt();
			doughItemID = config.getItem("Dough", 16874).getInt();
			pastryItemID = config.getItem("Pastry", 16875).getInt();
			chocolateItemID = config.getItem("Chocolate", 16876).getInt();
			chocolateChipsID = config.getItem("Chocolate Chips", 16877).getInt();
			breadSliceID = config.getItem("Bread Slice", 16878).getInt();
			breadCrumbsID = config.getItem("Bread Crumbs", 16879).getInt();
			mincedBeefID = config.getItem("Minced Beef", 16880).getInt();
			coneItemID = config.getItem("Ice Cream Cone", 16881).getInt();
			
			cookedLambID = config.getItem("Cooked Lamb", 16882).getInt();
			cookedDuckID = config.getItem("Cooked Duck", 16883).getInt();
			cookedMuttonID = config.getItem("Cooked Mutton", 16884).getInt();
			cookedTurkeyID = config.getItem("Cooked Turkey", 16885).getInt();
			cookedPheasantID = config.getItem("Cooked Pheasant", 16886).getInt();
			cookedHorseID = config.getItem("Cooked Horse", 16887).getInt();
			cookedRabbitID = config.getItem("Cooked Rabbit", 16888).getInt();
			cookedVenisonID = config.getItem("Cooked Venison", 16889).getInt();
			cookedGoatID = config.getItem("Cooked Goat", 16890).getInt();
			cookedPigeonID = config.getItem("Cooked Pigeon", 16891).getInt();
			cookedOxID = config.getItem("Cooked Ox", 16892).getInt();
			cookedBuffaloID = config.getItem("Cooked Buffalo", 16893).getInt();
			cookedBoarID = config.getItem("Cooked Boar", 16894).getInt();
			cookedSnailID = config.getItem("Cooked Snail", 16895).getInt();
			
			cookedSquidID = config.getItem("Cooked Squid", 16908).getInt();
			cookedCodID = config.getItem("Cooked Cod", 16909).getInt();
			cookedLobsterID = config.getItem("Cooked Lobster", 16910).getInt();
			cookedCrabID = config.getItem("Cooked Crab", 16911).getInt();
			cookedPcookednID = config.getItem("Cooked Pcookedn", 16912).getInt();
			cookedShrimpID = config.getItem("Cooked Shrimp", 16913).getInt();
			cookedAnchovyID = config.getItem("Cooked Anchovy", 16914).getInt();
			cookedTunaID = config.getItem("Cooked Tuna", 16915).getInt();
			cookedSardineID = config.getItem("Cooked Sardine", 16916).getInt();
			cookedCarpID = config.getItem("Cooked Carp", 16917).getInt();
			cookedOysterID = config.getItem("Cooked Oyster", 16918).getInt();
			cookedMusselID = config.getItem("Cooked Mussel", 16919).getInt();
			cookedSharkID = config.getItem("Cooked Shark", 16920).getInt();
			cookedTroutID = config.getItem("Cooked Trout", 16921).getInt();
			cookedBassID = config.getItem("Cooked Bass", 16922).getInt();
			cookedHaddockID = config.getItem("Cooked Haddock", 16923).getInt();
			cookedSwordfishID = config.getItem("Cooked Swordfish", 16924).getInt();
			cookedMackeralID = config.getItem("Cooked Mackeral", 16925).getInt();
			
			
			//Snacks
			foodDonutID = config.getItem("Donut", 17000).getInt();
			foodSweetsID = config.getItem("Sweets", 17001).getInt();
			foodFriesID = config.getItem("Fries", 17002).getInt();
			foodPopcornID = config.getItem("Popcorn", 17003).getInt();
			foodIceCreamID = config.getItem("Ice Cream", 17004).getInt();
			foodChocolateIceCreamID = config.getItem("Chocolate Ice Cream", 17005).getInt();
			foodMuffinID = config.getItem("Muffin", 17006).getInt();
			foodChocolateMuffinID = config.getItem("Chocolate Muffin", 17007).getInt();
			foodBlueberryMuffinID = config.getItem("Blueberry Muffin", 17008).getInt();
			chocolateCakeID = config.getItem("Chocolate Cake", 17009).getInt();
			chocolateCakeSliceID = config.getItem("Chocolate Cake Slice", 17010).getInt();
			cakeSliceID = config.getItem("Cake Slice", 17011).getInt();
			strawberryCheesecakeID = config.getItem("Strawberry Cheesecake", 17012).getInt();
			chocolateCheesecakeID = config.getItem("Chocolate Cheesecake", 17013).getInt();
			foodVanillaConeID = config.getItem("Vanilla Cone", 17014).getInt();
			foodChocolateConeID = config.getItem("Chocolate Cone", 17015).getInt();
			strawberryIceLollyID = config.getItem("Strawberry Ice Lolly", 17016).getInt();
			chocolateIceLollyID = config.getItem("Chocolate Ice Lolly", 17017).getInt();
			milkIceLollyID = config.getItem("Milk Ice Lolly", 17018).getInt();
			
			
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
