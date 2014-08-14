package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import co.uk.silvania.cities.food.blocks.utensils.StoveEntity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=FlenixCities_Food.modid, dependencies="required-after:flenixcities;required-after:FlenixTweaks", name="FlenixCities Food", version="0.5")
public class FlenixCities_Food { 
	
	public static final String modid = "fc_food";
	
    @Instance(FlenixCities_Food.modid)
    public static FlenixCities_Food instance;
    public static GuiHandler foodGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.food.client.ClientProxy", serverSide="co.uk.silvania.cities.food.CommonProxy")
    public static CommonProxy proxy;
        
	public static CreativeTabs tabCityFood = new CreativeTabs("tabCityFood") {
		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return new ItemStack(FCF_Items.foodBurger, 1, 0).getItem();
		}
	};
	
	public static String configPath;
    
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	configPath = event.getModConfigurationDirectory() + "/FlenixCities/";
    	FoodConfig.init(configPath);
    	
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	//TODO NetworkRegistry.instance().registerGuiHandler(this, foodGuiHandler);
    	FCF_Blocks.init();
    	FCF_Items.init();
    	
    	VanillaFoods.run();
    	
    	MinecraftForge.EVENT_BUS.register(new MobDrops());
    }
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {        
        proxy.registerBlocks();
        
        GameRegistry.registerTileEntity(TileEntityFridge.class, "tileEntityFridge");
        GameRegistry.registerTileEntity(TileEntityFridgeLarge.class, "tileEntityFridgeLarge");
        GameRegistry.registerTileEntity(TileEntityVendingMachine.class, "tileEntityVendingMachine");
        GameRegistry.registerTileEntity(StoveEntity.class, "tileEntityStove");
        
        ItemStack beefStack = new ItemStack(Items.cooked_beef);
        ItemStack porkStack = new ItemStack(Items.cooked_porkchop);
        ItemStack chickenStack = new ItemStack(Items.cooked_chicken);
        ItemStack breadStack = new ItemStack(Items.bread);
        ItemStack cheeseStack = new ItemStack(FCF_Items.foodCheeseMolten.setContainerItem(Items.bucket));
        ItemStack miCheeseStack = new ItemStack(FCF_Items.foodCheeseMild);
        ItemStack meCheeseStack = new ItemStack(FCF_Items.foodCheeseMedium);
        ItemStack maCheeseStack = new ItemStack(FCF_Items.foodCheeseMature);
        ItemStack burgerStack = new ItemStack(FCF_Items.foodBurger);
        ItemStack bakedPotato = new ItemStack(Items.baked_potato);
        ItemStack plainPizza = new ItemStack(FCF_Items.foodPizza, 1, 0);
        ItemStack mushroomPizza = new ItemStack(FCF_Items.foodPizza, 1, 1);
        ItemStack pepperoniPizza = new ItemStack(FCF_Items.foodPizza, 1, 2);
        ItemStack mushroomStack = new ItemStack(Blocks.brown_mushroom);
        ItemStack plainCrisps = new ItemStack(FCF_Items.foodCrisps, 1, 0);
        
        
        GameRegistry.addRecipe(burgerStack, "b", "m", "b", 'b', breadStack, 'm', beefStack);
        GameRegistry.addRecipe(new ItemStack(FCF_Items.foodPizza, 1, 0), "ccc", "bbb", 'c', miCheeseStack, 'b', breadStack);
        GameRegistry.addRecipe(new ItemStack(FCF_Items.foodPizza, 1, 1), "mmm", "ccc", "bbb", 'c', miCheeseStack, 'b', breadStack, 'm', mushroomStack);
        GameRegistry.addRecipe(new ItemStack(FCF_Items.foodPizza, 1, 2), "ppp", "ccc", "bbb", 'c', miCheeseStack, 'b', breadStack, 'p', porkStack);

        GameRegistry.addShapelessRecipe(miCheeseStack, cheeseStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodPizza, 1, 3), mushroomStack, mushroomStack, mushroomStack, pepperoniPizza);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodPizza, 1, 3), porkStack, porkStack, porkStack, mushroomPizza);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodPizza, 1, 3), mushroomStack, mushroomStack, mushroomStack, porkStack, porkStack, porkStack, plainPizza);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodCrisps, 1, 1), plainCrisps, chickenStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FCF_Items.foodCrisps, 1, 2), plainCrisps, cheeseStack);
        
        GameRegistry.addSmelting(Items.milk_bucket, cheeseStack, 0.1F);
        GameRegistry.addSmelting(Items.baked_potato, new ItemStack(FCF_Items.foodCrisps, 1, 0), 0.1F);
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
};