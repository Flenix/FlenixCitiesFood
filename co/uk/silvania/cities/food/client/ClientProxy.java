package co.uk.silvania.cities.food.client;

import co.uk.silvania.cities.food.CommonProxy;
import co.uk.silvania.cities.food.FCF_Blocks;
import co.uk.silvania.cities.food.blocks.*;
import co.uk.silvania.cities.food.blocks.render.*;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
    @Override
    public void registerRenderThings() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFridge.class, new TileEntityFridgeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFridgeLarge.class, new TileEntityLargeFridgeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVendingMachine.class, new TileEntityVendingMachineRenderer());
    	
    	//Line of importance:
    	//MinecraftForgeClient.registerItemRenderer(FCF_Blocks.fridgeBlock.blockID, new FridgeItemRender());
    }        
}