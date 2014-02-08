package co.uk.silvania.cities.food.blocks.utensils;

import net.minecraft.tileentity.TileEntity;

public class OvenEntity extends TileEntity {
	
	@Override
	public void updateEntity() {
		//Get item in slot (Oven has 4 simultanious cooking slots)
		//- Get that item's NBT
		//- Add to the "cookedValue" float
		//- set cookedType int to 1 for baked/roasted
		//SIMPLES!
	}
}
