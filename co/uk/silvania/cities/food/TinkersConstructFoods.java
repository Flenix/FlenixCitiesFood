package co.uk.silvania.cities.food;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Loader;

public class TinkersConstructFoods {
	
	public void overrideTinkersFood() {
		if (Loader.isModLoaded("TConstruct")) {
			System.out.println("*** TINKERS LOADED ***");
			//Item.itemsList[TRepo.jerky] = null;
		}
	}

}
