package co.uk.silvania.cities.food;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class FoodConfig {
	
	public static File fcFoodConfigFile;
	
	public static void init(String configpath) {
		fcFoodConfigFile = new File(configpath + "FlenixCities_Food.cfg");
		
		FoodConfig.initConfig(fcFoodConfigFile);
	}
	
    public static Configuration config;

	public static boolean overrideFood;
	
	
	public static void initConfig (File configFile) {
		config = new Configuration(configFile);
		
		try {
			config.load();			
			overrideFood = config.get(Configuration.CATEGORY_GENERAL, "overrideFood", true).getBoolean(true);
		}
		catch (Exception e) {
			//FMLLog.log(Level.SEVERE, e, "### Warning! FlenixCities Food could not load it's config file! ###");
		}
		
		finally {
			if (config.hasChanged()) {
				config.save();
			}
		}
	}
}
