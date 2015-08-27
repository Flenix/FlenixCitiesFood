package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import co.uk.silvania.cities.food.blocks.utensils.StoveEntity;
import co.uk.silvania.cities.food.network.StovePacket;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid=FlenixCities_Food.modid, dependencies="required-after:flenixcities"/*;required-after:FlenixTweaks"*/, name="FlenixCities Food", version="0.7.0")
public class FlenixCities_Food { 
	
	public static final String modid = "fc_food";
	
    @Instance(FlenixCities_Food.modid)
    public static FlenixCities_Food instance;
    public static GuiHandler foodGuiHandler = new GuiHandler();
    public static SimpleNetworkWrapper network;

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
    	network = NetworkRegistry.INSTANCE.newSimpleChannel("FlenixCitiesFood");
    	network.registerMessage(StovePacket.Handler.class, StovePacket.class, 0, Side.SERVER);
    	
    	configPath = event.getModConfigurationDirectory() + "/FlenixCities/";
    	FoodConfig.init(configPath);
    	
    	NetworkRegistry.INSTANCE.registerGuiHandler(this, foodGuiHandler);
    	FCF_Blocks.init();
    	FCF_Items.init();
    	
    	VanillaFoods.run();
    	
    	MinecraftForge.EVENT_BUS.register(new MobDrops());
    	
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.avocadoSeed), 5);
    	//MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.blackCurrantSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.blueBerrySeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.broccoliSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.cabbageSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.celerySeed), 5);
    	//MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.cornSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.cucumberSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.garlicSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.greenPepperSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.leekSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.lettuceSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.onionSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.rapeSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.redPepperSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.rhubarbSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.tomatoSeed), 5);
    	MinecraftForge.addGrassSeed(new ItemStack(FCF_Items.yellowPepperSeed), 5);
    }
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {        
        proxy.registerBlocks();
        
        GameRegistry.registerTileEntity(TileEntityFridge.class, "tileEntityFridge");
        GameRegistry.registerTileEntity(TileEntityFridgeLarge.class, "tileEntityFridgeLarge");
        GameRegistry.registerTileEntity(TileEntityVendingMachine.class, "tileEntityVendingMachine");
        GameRegistry.registerTileEntity(StoveEntity.class, "tileEntityStove");
        
        proxy.registerRenderThings();
        proxy.registerRenderers();
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
};