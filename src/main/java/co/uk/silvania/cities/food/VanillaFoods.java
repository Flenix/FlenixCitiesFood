//Credit to Iguana_Man for showing me how he overrides food.
//Unfortunately due to his help, I am not sure if this is compatible with his mod Hunger Overhaul.
//I have added a configuration option to potentially decide whether I will force-override him or not (default to not) - I cannot force him to override me.
//Class modifies food values, so my food has more worth behind it. Can be disabled of course.

package co.uk.silvania.cities.food;

import cpw.mods.fml.common.Loader;

public class VanillaFoods {

	
	public static void run() {
        if (Loader.isModLoaded("malnourished")) {
        	System.out.println("Malnourished Detected; handing over vanilla food control");
        } else {
			if(FoodConfig.overrideFood) {
		        /*Items.apple = null;
		        Items.bread = null;
		        Items.porkchop = null;
		        Items.cooked_porkchop = null;
		        Items.cookie = null;
		        Items.melon = null;
		        Items.beef = null;
		        Items.cooked_beef = null;
		        Items.chicken = null;
		        Items.cooked_chicken = null;
		        Items.rotten_flesh = null;
		        Items.baked_potato = null;
		        Items.poisonous_potato = null;
		        Items.pumpkin_pie = null;
		        Items.mushroom_stew = null;
		        Items.carrot = null;
		        Items.potato = null;
		        
		        Items.fish= null;
		        Items.cooked_fished = null;
		        
	            Items.apple = FCF_Items.apple;
	            Items.bread = FCF_Items.bread;
	            Items.fish = FCF_Items.fish;
	            Items.cooked_fished = FCF_Items.cooked_fished;
	            Items.cookie = FCF_Items.cookie;
	            Items.melon = FCF_Items.melon;
	            Items.rotten_flesh = FCF_Items.rotten_flesh;
	            Items.baked_potato = FCF_Items.baked_potato;
	            Items.poisonous_potato = FCF_Items.poisonous_potato;
	            Items.pumpkin_pie = FCF_Items.pumpkin_pie;
	            Items.mushroom_stew = FCF_Items.mushroom_stew;
	            Items.carrot = FCF_Items.carrot;
	            Items.potato = FCF_Items.potato;
	            
	            Items.porkchop = FCF_Items.porkchop;
	            Items.cooked_porkchop = FCF_Items.cooked_porkchop;
	            Items.beef = FCF_Items.beef;
	            Items.cooked_beef = FCF_Items.cooked_beef;
	            Items.chicken = FCF_Items.chicken;
	            Items.cooked_chicken = FCF_Items.cooked_chicken;*/
	        }
		}
	}
}
