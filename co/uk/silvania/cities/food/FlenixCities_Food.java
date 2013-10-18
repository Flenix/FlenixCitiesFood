package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=FlenixCities_Food.modid, name="FlenixCities Food", version="0.3.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_Food { 
	
	public static final String modid = "fc_food";
	
    @Instance(FlenixCities_Food.modid)
    public static FlenixCities_Food instance;
    public static GuiHandler foodGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.food.client.ClientProxy", serverSide="co.uk.silvania.cities.food.CommonProxy")
    public static CommonProxy proxy;
        
	public static CreativeTabs tabCityFood = new CreativeTabs("tabCityFood") {
		public ItemStack getIconItemStack() {
			return new ItemStack(FCF_Items.foodBurger, 1, 0);
		}
	};
	
	public static String configPath;
    
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	configPath = event.getModConfigurationDirectory() + "/FlenixCities/";
    	FoodConfig.init(configPath);
    	
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	NetworkRegistry.instance().registerGuiHandler(this, foodGuiHandler);
    	FCF_Blocks.init();
    	FCF_Items.init();
    	
    	VanillaFoods.run();
    }
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {        
        proxy.registerBlocks();
        proxy.addNames();
        
        GameRegistry.registerTileEntity(TileEntityFridge.class, "tileEntityFridge");
        GameRegistry.registerTileEntity(TileEntityFridgeLarge.class, "tileEntityFridgeLarge");
        GameRegistry.registerTileEntity(TileEntityVendingMachine.class, "tileEntityVendingMachine");
        
        ItemStack beefStack = new ItemStack(Item.beefCooked);
        ItemStack porkStack = new ItemStack(Item.porkCooked);
        ItemStack chickenStack = new ItemStack(Item.chickenCooked);
        ItemStack breadStack = new ItemStack(Item.bread);
        ItemStack cheeseStack = new ItemStack(FCF_Items.foodCheese);
        ItemStack burgerStack = new ItemStack(FCF_Items.foodBurger);
        ItemStack bakedPotato = new ItemStack(Item.bakedPotato);
        ItemStack plainPizza = new ItemStack(FCF_Items.foodPizza, 1, 0);
        ItemStack mushroomPizza = new ItemStack(FCF_Items.foodPizza, 1, 1);
        ItemStack pepperoniPizza = new ItemStack(FCF_Items.foodPizza, 1, 2);
        ItemStack mushroomStack = new ItemStack(Block.mushroomCapBrown);
        ItemStack plainCrisps = new ItemStack(FCF_Items.foodCrisps, 1, 0);
        
        GameRegistry.addRecipe(burgerStack, "b", "m", "b", 'b', breadStack, 'm', beefStack);
        GameRegistry.addRecipe(new ItemStack(FCF_Items.foodPizza, 1, 0), "ccc", "bbb", 'c', cheeseStack, 'b', breadStack);
        GameRegistry.addRecipe(new ItemStack(FCF_Items.foodPizza, 1, 1), "mmm", "ccc", "bbb", 'c', cheeseStack, 'b', breadStack, 'm', mushroomStack);
        GameRegistry.addRecipe(new ItemStack(FCF_Items.foodPizza, 1, 2), "ppp", "ccc", "bbb", 'c', cheeseStack, 'b', breadStack, 'p', porkStack);

        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodPizza, 1, 3), mushroomStack, mushroomStack, mushroomStack, pepperoniPizza);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodPizza, 1, 3), porkStack, porkStack, porkStack, mushroomPizza);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodPizza, 1, 3), mushroomStack, mushroomStack, mushroomStack, porkStack, porkStack, porkStack, plainPizza);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodCrisps, 1, 1), plainCrisps, chickenStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodCrisps, 1, 2), plainCrisps, cheeseStack);
        
        GameRegistry.addSmelting(Item.bucketMilk.itemID, cheeseStack, 0.1F);
        GameRegistry.addSmelting(Item.bakedPotato.itemID, new ItemStack(FCF_Items.foodCrisps, 1, 0), 0.1F);
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabCityFood", "en_US", "Cities: Food");
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
};