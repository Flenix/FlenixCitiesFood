package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import co.uk.silvania.cities.food.blocks.utensils.StoveEntity;
import net.minecraft.creativetab.CreativeTabs;
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

@Mod(modid=FlenixCities_Food.modid, dependencies="required-after:flenixcities"/*;required-after:FlenixTweaks"*/, name="FlenixCities Food", version="0.5")
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
			return new ItemStack(FCF_Items.lambLeg, 1, 0).getItem();
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
    	
    	//MinecraftForge.EVENT_BUS.register(new MobDrops());
    }
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {        
        proxy.registerBlocks();
        
        GameRegistry.registerTileEntity(TileEntityFridge.class, "tileEntityFridge");
        GameRegistry.registerTileEntity(TileEntityFridgeLarge.class, "tileEntityFridgeLarge");
        GameRegistry.registerTileEntity(TileEntityVendingMachine.class, "tileEntityVendingMachine");
        GameRegistry.registerTileEntity(StoveEntity.class, "tileEntityStove");
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
};