package co.uk.silvania.cities.food.client;

import co.uk.silvania.cities.food.CommonProxy;
import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import co.uk.silvania.cities.food.blocks.render.RenderStove;
import co.uk.silvania.cities.food.blocks.render.TileEntityFridgeRenderer;
import co.uk.silvania.cities.food.blocks.render.TileEntityLargeFridgeRenderer;
import co.uk.silvania.cities.food.blocks.render.TileEntityVendingMachineRenderer;
import co.uk.silvania.cities.food.blocks.utensils.StoveEntity;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
    @Override
    public void registerRenderThings() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFridge.class, new TileEntityFridgeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFridgeLarge.class, new TileEntityLargeFridgeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVendingMachine.class, new TileEntityVendingMachineRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(StoveEntity.class, new RenderStove());
    	
    	//Line of importance:
    	//MinecraftForgeClient.registerItemRenderer(FCF_Blocks.fridgeBlock.blockID, new FridgeItemRender());
    }        
}