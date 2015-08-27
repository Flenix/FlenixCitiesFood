package co.uk.silvania.cities.food.client;

import co.uk.silvania.cities.food.CommonProxy;
import co.uk.silvania.cities.food.FCF_Blocks;
import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import co.uk.silvania.cities.food.blocks.render.RenderStove;
import co.uk.silvania.cities.food.blocks.render.TileEntityFridgeRenderer;
import co.uk.silvania.cities.food.blocks.render.TileEntityLargeFridgeRenderer;
import co.uk.silvania.cities.food.blocks.render.TileEntityVendingMachineRenderer;
import co.uk.silvania.cities.food.blocks.utensils.StoveEntity;
import co.uk.silvania.cities.food.client.model.StoveHandRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
    @Override
    public void registerRenderThings() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFridge.class, new TileEntityFridgeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFridgeLarge.class, new TileEntityLargeFridgeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVendingMachine.class, new TileEntityVendingMachineRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(StoveEntity.class, new RenderStove());

    	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(FCF_Blocks.stoveBlock), new StoveHandRenderer());
    }        
}