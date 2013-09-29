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
	
	public static int foodCheeseBurgerID;
	public static int foodBurgerID;
	public static int foodHotDogID;
	public static int foodPizzaID;
	public static int foodNoodlesID;
	public static int foodChocolateBarID;
	public static int foodCrispsID;
	public static int foodEnergyBarID;
	public static int foodCheeseID;
	public static int foodTomatoID;
	public static int foodDonutID;
	public static int foodSweetsID;
	public static int foodFriesID;
	public static int foodPopcornID;
	public static int foodIceCreamID;
	public static int foodChickenWingsID;
	public static int foodChickenNuggetsID;
	public static int foodSausageID;
	public static int foodSausageRollID;
	
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
	public static int lemonItemID;
	public static int limeItemID;
	public static int orangeItemID;
	public static int strawberryItemID;
	public static int raspberryItemID;
	public static int riceItemID;
	
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
	public static int grapesSeedID;
	public static int lemonSeedID;
	public static int limeSeedID;
	public static int orangeSeedID;
	
	public static int broccoliCropID;
	public static int lettuceCropID;
	public static int garlicCropID;
	public static int cabbageCropID;
	public static int celeryCropID;
	public static int leekCropID;
	public static int onionCropID;
	public static int lemonCropID;
	public static int limeCropID;
	public static int orangeCropID;
	public static int riceCropID;
	
	public static int drinkAppleJuiceID;
	public static int drinkColaID;
	public static int drinkOrangeJuiceID;
	public static int drinkWaterBottleID;
	public static int drinkMilkBottleID;
	public static int drinkEnergyDrinkID;
	public static int drinkMilkshakeID;
	public static int drinkCoffeeID;
	public static int drinkHotChocolateID;
	
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
			lemonCropID = config.getBlock("Lemon Crop", 1557).getInt();
			limeCropID = config.getBlock("Lime Crop", 1558).getInt();
			orangeCropID = config.getBlock("Orange Crop", 1559).getInt();
			riceCropID = config.getBlock("Rice Crop", 1560).getInt();
			
			foodCheeseBurgerID = config.getItem("Cheeseburger", 17919).getInt();
			foodBurgerID = config.getItem("Burger", 17920).getInt();
			foodHotDogID = config.getItem("Hot Dog", 17921).getInt();
			foodPizzaID = config.getItem("Pizza", 17922).getInt();
			foodNoodlesID = config.getItem("Noodles", 17923).getInt();
			foodChocolateBarID = config.getItem("Chocolate Bar", 17924).getInt();
			foodCrispsID = config.getItem("Crisps", 17925).getInt();
			foodEnergyBarID = config.getItem("Energy Bar", 17926).getInt();
			foodCheeseID = config.getItem("Cheese", 17927).getInt();
			foodTomatoID = config.getItem("Tomato", 17928).getInt();
			foodDonutID = config.getItem("Donut", 17929).getInt();
			foodSweetsID = config.getItem("Sweets", 17930).getInt();
			foodFriesID = config.getItem("Fries", 17931).getInt();
			foodPopcornID = config.getItem("Popcorn", 17932).getInt();
			foodIceCreamID = config.getItem("Ice Cream", 17933).getInt();
			foodChickenWingsID = config.getItem("Chicken Wings", 17934).getInt();
			foodChickenNuggetsID = config.getItem("Chicken Nuggets", 17935).getInt();
			foodSausageID = config.getItem("Sausage", 17945).getInt();
			foodSausageRollID = config.getItem("Sausage Roll", 17944).getInt();
			
			lettuceItemID = config.getItem("Lettuce", 17946).getInt();
			garlicItemID = config.getItem("Garlic", 17947).getInt();
			broccoliItemID = config.getItem("Broccoli", 17948).getInt();
			cabbageItemID = config.getItem("Cabbage", 17949).getInt();
			celeryItemID = config.getItem("Celery", 17950).getInt();
			cucumberItemID = config.getItem("Cucumber", 17951).getInt();
			redPepperItemID = config.getItem("Red Pepper", 17952).getInt();
			yellowPepperItemID = config.getItem("Yellow Pepper", 17953).getInt();
			greenPepperItemID = config.getItem("Green Pepper", 17954).getInt();
			leekItemID = config.getItem("Leek", 17955).getInt();
			onionItemID = config.getItem("Onion", 17956).getInt();
			blackberryItemID = config.getItem("Blackberry", 17957).getInt();
			blueberryItemID = config.getItem("Blueberry", 17958).getInt();
			blackcurrentItemID = config.getItem("Blackcurrent", 17959).getInt();
			grapesItemID = config.getItem("Grape", 17960).getInt();
			lemonItemID = config.getItem("Lemon", 17961).getInt();
			limeItemID = config.getItem("Lime", 17962).getInt();
			orangeItemID = config.getItem("Orange", 17963).getInt();
			strawberryItemID = config.getItem("Strawberry", 17964).getInt();
			raspberryItemID = config.getItem("Raspberry", 17965).getInt();
			riceItemID = config.getItem("Rice", 17966).getInt();
			
			pastryItemID = config.getItem("Pastry", 17966).getInt();
			pieTinID = config.getItem("Pie Tin", 17967).getInt();
			cornItemID = config.getItem("Corn", 17968).getInt();
			
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
			grapesSeedID = config.getItem("Grape Seed", 17982).getInt();
			lemonSeedID = config.getItem("Lemon Seed", 17983).getInt();
			limeSeedID = config.getItem("Lime Seed", 17984).getInt();
			orangeSeedID = config.getItem("Orange Seed", 17985).getInt();
			
			drinkAppleJuiceID = config.getItem("Apple Juice", 17936).getInt();
			drinkColaID = config.getItem("Cola", 17937).getInt();
			drinkOrangeJuiceID = config.getItem("Orange Juice", 17938).getInt();
			drinkWaterBottleID = config.getItem("Water Bottle", 17939).getInt();
			drinkMilkBottleID = config.getItem("Milk Bottle", 17940).getInt();
			drinkEnergyDrinkID = config.getItem("Energy Drink", 17941).getInt();
			drinkMilkshakeID = config.getItem("Milkshake", 17942).getInt();
			drinkCoffeeID = config.getItem("Coffee", 17943).getInt();
			drinkHotChocolateID = config.getItem("Hot Chocolate", 17944).getInt();
			
			
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
