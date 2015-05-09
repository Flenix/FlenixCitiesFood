package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.items.ItemVendingMachineBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
    public void registerRenderThings() {
    }
    
    public void registerRenderers() {
    }
    
    public void registerBlocks() {
        GameRegistry.registerBlock(FCF_Blocks.fridgeBlock, "fridgeBlock"); //FridgeItemBlock.class, "fc_food" + (FCF_Blocks.fridgeBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FCF_Blocks.largeFridgeBlock, "largeFridgeBlock");
        GameRegistry.registerBlock(FCF_Blocks.vendingMachine, ItemVendingMachineBlock.class, "FlenixCities" + (FCF_Blocks.vendingMachine.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FCF_Blocks.stoveBlock, "stoveBlock");

        GameRegistry.registerBlock(FCF_Blocks.broccoliCrop, "broccoliCrop");
        GameRegistry.registerBlock(FCF_Blocks.tomatoCrop, "tomatoCrop");
    	GameRegistry.registerBlock(FCF_Blocks.lettuceCrop, "lettuceCrop");
    	GameRegistry.registerBlock(FCF_Blocks.garlicCrop, "garlicCrop");
    	GameRegistry.registerBlock(FCF_Blocks.cabbageCrop, "cabbageCrop");
    	GameRegistry.registerBlock(FCF_Blocks.celeryCrop, "celeryCrop");
    	GameRegistry.registerBlock(FCF_Blocks.cornCrop, "cornCrop");
    	GameRegistry.registerBlock(FCF_Blocks.cucumberCrop, "cucumberCrop");
    	GameRegistry.registerBlock(FCF_Blocks.redPepperCrop, "redPepperCrop");
    	GameRegistry.registerBlock(FCF_Blocks.yellowPepperCrop, "yellowPepperCrop");
    	GameRegistry.registerBlock(FCF_Blocks.greenPepperCrop, "greenPepperCrop");
    	GameRegistry.registerBlock(FCF_Blocks.leekCrop, "leekCrop");
    	GameRegistry.registerBlock(FCF_Blocks.blueBerryCrop, "blueBerryCrop");
    	GameRegistry.registerBlock(FCF_Blocks.blackCurrantCrop, "blackCurrantCrop");
    	GameRegistry.registerBlock(FCF_Blocks.avocadoCrop, "avocadoCrop");
    	GameRegistry.registerBlock(FCF_Blocks.rhubarbCrop, "rhubarbCrop");
    	GameRegistry.registerBlock(FCF_Blocks.onionCrop, "onionCrop");
    	GameRegistry.registerBlock(FCF_Blocks.riceCrop, "riceCrop");
    	GameRegistry.registerBlock(FCF_Blocks.rapeCrop, "rapeCrop");
    	
    	//Bushes
    	GameRegistry.registerBlock(FCF_Blocks.blackberryBush, "blackberryBush");
    	GameRegistry.registerBlock(FCF_Blocks.strawberryBush, "strawberryBush");
    	GameRegistry.registerBlock(FCF_Blocks.raspberryBush, "raspberryBush");
    	GameRegistry.registerBlock(FCF_Blocks.seaweedBush, "seaweedBush");
    	GameRegistry.registerBlock(FCF_Blocks.redGrapeVine, "redGrapeVine");
    	GameRegistry.registerBlock(FCF_Blocks.greenGrapeVine, "greenGrapeVine");
    	
    	//Saplings TODO
    	/*GameRegistry.registerBlock(FCF_Blocks.orangeSapling, "orangeSapling");
    	GameRegistry.registerBlock(FCF_Blocks.pearSapling, "pearSapling");
    	GameRegistry.registerBlock(FCF_Blocks.bananaSapling, "bananaSapling");
    	GameRegistry.registerBlock(FCF_Blocks.lemonSapling, "lemonSapling");
    	GameRegistry.registerBlock(FCF_Blocks.limeSapling, "limeSapling");*/
    	
    	
        //Raw Ingredients
    	GameRegistry.registerItem(FCF_Items.lambShoulder, "lambShoulder");
    	GameRegistry.registerItem(FCF_Items.lambBreast, "lambBreast");
    	GameRegistry.registerItem(FCF_Items.lambFlank, "lambFlank");
    	GameRegistry.registerItem(FCF_Items.lambLoin, "lambLoin");
    	GameRegistry.registerItem(FCF_Items.lambLeg, "lambLeg");
    	GameRegistry.registerItem(FCF_Items.lambRack, "lambRack");
    	GameRegistry.registerItem(FCF_Items.lambShank, "lambShank");
    	GameRegistry.registerItem(FCF_Items.lambChop, "lambChop");
    	
    	GameRegistry.registerItem(FCF_Items.muttonShoulder, "muttonShoulder");
    	GameRegistry.registerItem(FCF_Items.muttonBreast, "muttonBreast");
    	GameRegistry.registerItem(FCF_Items.muttonFlank, "muttonFlank");
    	GameRegistry.registerItem(FCF_Items.muttonLeg, "muttonLeg");
    	GameRegistry.registerItem(FCF_Items.muttonLoin, "muttonLoin");
    	GameRegistry.registerItem(FCF_Items.muttonRack, "muttonRack");
    	
    	GameRegistry.registerItem(FCF_Items.duckBreast, "duckBreast");
    	GameRegistry.registerItem(FCF_Items.duckLeg, "duckLeg");
    	GameRegistry.registerItem(FCF_Items.duckWhole, "duckWhole");
    	GameRegistry.registerItem(FCF_Items.duckWing, "duckWing");
    	
    	GameRegistry.registerItem(FCF_Items.turkeyBreast, "turkeyBreast");
    	GameRegistry.registerItem(FCF_Items.turkeyLeg, "turkeyLeg");
    	GameRegistry.registerItem(FCF_Items.turkeyWhole, "turkeyWhole");
    	GameRegistry.registerItem(FCF_Items.turkeyWing, "turkeyWing");
    	
    	GameRegistry.registerItem(FCF_Items.pheasantBreast, "pheasantBreast");
    	GameRegistry.registerItem(FCF_Items.pheasantLeg, "pheasantLeg");
    	GameRegistry.registerItem(FCF_Items.pheasantWhole, "pheasantWhole");
    	GameRegistry.registerItem(FCF_Items.pheasantWing, "pheasantWing");
    	
    	GameRegistry.registerItem(FCF_Items.horseRib, "horseRib");
    	GameRegistry.registerItem(FCF_Items.horseRump, "horseRump");
    	GameRegistry.registerItem(FCF_Items.horseShank, "horseShank");
    	GameRegistry.registerItem(FCF_Items.horseShoulder, "horseShoulder");
    	GameRegistry.registerItem(FCF_Items.horseSirloin, "horseSirloin");
    	
    	GameRegistry.registerItem(FCF_Items.rabbitMeat, "rabbitMeat");
    	
    	GameRegistry.registerItem(FCF_Items.venisonLoin, "venisonLoin");
    	GameRegistry.registerItem(FCF_Items.venisonRibs, "venisonRibs");
    	GameRegistry.registerItem(FCF_Items.venisonShank, "venisonShank");
    	GameRegistry.registerItem(FCF_Items.venisonShoulder, "venisonShoulder");
    	
    	GameRegistry.registerItem(FCF_Items.goatLeg, "goatLeg");
    	GameRegistry.registerItem(FCF_Items.goatLoin, "goatLoin");
    	GameRegistry.registerItem(FCF_Items.goatRack, "goatRack");
    	
    	GameRegistry.registerItem(FCF_Items.pigeonBreast, "pigeonBreast");
    	GameRegistry.registerItem(FCF_Items.pigeonLeg, "pigeonLeg");
    	GameRegistry.registerItem(FCF_Items.pigeonWhole, "pigeonWhole");
    	GameRegistry.registerItem(FCF_Items.pigeonWing, "pigeonWing");
    	
    	GameRegistry.registerItem(FCF_Items.oxTongue, "oxTongue");
    	GameRegistry.registerItem(FCF_Items.oxTBone, "oxTBone");
    	GameRegistry.registerItem(FCF_Items.oxTail, "oxTail");
    	GameRegistry.registerItem(FCF_Items.oxSirloin, "oxSirloin");
    	GameRegistry.registerItem(FCF_Items.oxRump, "oxRump");
    	GameRegistry.registerItem(FCF_Items.oxRib, "oxRib");
    	GameRegistry.registerItem(FCF_Items.oxLeg, "oxLeg");
    	GameRegistry.registerItem(FCF_Items.oxFlank, "oxFlank");
    	GameRegistry.registerItem(FCF_Items.oxFillet, "oxFillet");
    	GameRegistry.registerItem(FCF_Items.oxBrisket, "oxBrisket");
    	GameRegistry.registerItem(FCF_Items.oxBlade, "oxBlade");
    	
    	GameRegistry.registerItem(FCF_Items.buffaloSirloin, "buffaloSirloin");
    	GameRegistry.registerItem(FCF_Items.buffaloRib, "buffaloRib");
    	GameRegistry.registerItem(FCF_Items.buffaloFlank, "buffaloFlank");
    	GameRegistry.registerItem(FCF_Items.buffaloBreast, "buffaloBreast");
    	
    	GameRegistry.registerItem(FCF_Items.boarShoulder, "boarShoulder");
    	GameRegistry.registerItem(FCF_Items.boarLoin, "boarLoin");
    	GameRegistry.registerItem(FCF_Items.boarLeg, "boarLeg");
    	GameRegistry.registerItem(FCF_Items.boarBelly, "boarBelly");
    	
    	GameRegistry.registerItem(FCF_Items.beefSirloin, "beefSirloin");
    	GameRegistry.registerItem(FCF_Items.beefRib, "beefRib");
    	GameRegistry.registerItem(FCF_Items.beefLeg, "beefLeg");
    	GameRegistry.registerItem(FCF_Items.beefFlank, "beefFlank");
    	GameRegistry.registerItem(FCF_Items.beefBrisket, "beefBrisket");
    	
    	GameRegistry.registerItem(FCF_Items.porkRib, "porkRib");
    	GameRegistry.registerItem(FCF_Items.porkLoin, "porkLoin");
    	GameRegistry.registerItem(FCF_Items.porkLeg, "porkLeg");
    	GameRegistry.registerItem(FCF_Items.porkchop, "porkchop");
    	GameRegistry.registerItem(FCF_Items.porkBelly, "porkBelly");
    	
    	GameRegistry.registerItem(FCF_Items.chickenWing, "chickenWing");
    	GameRegistry.registerItem(FCF_Items.chickenLeg, "chickenLeg");
    	GameRegistry.registerItem(FCF_Items.chickenBreast, "chickenBreast");
    	
    	GameRegistry.registerItem(FCF_Items.rawSquid, "rawSquid");
    	GameRegistry.registerItem(FCF_Items.rawCod, "rawCod");
    	GameRegistry.registerItem(FCF_Items.rawLobster, "rawLobster");
    	GameRegistry.registerItem(FCF_Items.rawCrab, "rawCrab");
    	GameRegistry.registerItem(FCF_Items.rawPrawn, "rawPrawn");
    	GameRegistry.registerItem(FCF_Items.rawShrimp, "rawShrimp");
    	GameRegistry.registerItem(FCF_Items.rawAnchovy, "rawAnchovy");
    	GameRegistry.registerItem(FCF_Items.rawTuna, "rawTuna");
    	GameRegistry.registerItem(FCF_Items.rawSardine, "rawSardine");
    	GameRegistry.registerItem(FCF_Items.rawCarp, "rawCarp");
    	GameRegistry.registerItem(FCF_Items.rawOyster, "rawOyster");
    	GameRegistry.registerItem(FCF_Items.rawMussel, "rawMussel");
    	//GameRegistry.registerItem(FCF_Items.rawSnail, "rawSnail");
    	GameRegistry.registerItem(FCF_Items.rawShark, "rawShark");
    	GameRegistry.registerItem(FCF_Items.rawTrout, "rawTrout");
    	GameRegistry.registerItem(FCF_Items.rawBass, "rawBass");
    	GameRegistry.registerItem(FCF_Items.rawHaddock, "rawHaddock");
    	GameRegistry.registerItem(FCF_Items.rawSwordfish, "rawSwordfish");
    	GameRegistry.registerItem(FCF_Items.rawMackeral, "rawMackeral");
    	
    	//Fruit n Veg
        GameRegistry.registerItem(FCF_Items.tomatoItem, "tomatoItem");
        GameRegistry.registerItem(FCF_Items.lettuceItem, "lettuceItem");
        GameRegistry.registerItem(FCF_Items.garlicItem, "garlicItem");
        GameRegistry.registerItem(FCF_Items.broccoliItem, "broccoliItem");
        GameRegistry.registerItem(FCF_Items.cabbageItem, "cabbageItem");
        GameRegistry.registerItem(FCF_Items.celeryItem, "celeryItem");
        GameRegistry.registerItem(FCF_Items.cornItem, "cornItem");
        GameRegistry.registerItem(FCF_Items.cucumberItem, "cucumberItem");
        GameRegistry.registerItem(FCF_Items.redPepperItem, "redPepperItem");
        GameRegistry.registerItem(FCF_Items.yellowPepperItem, "yellowPepperItem");
        GameRegistry.registerItem(FCF_Items.greenPepperItem, "greenPepperItem");
        GameRegistry.registerItem(FCF_Items.leekItem, "leekItem");
        GameRegistry.registerItem(FCF_Items.onionItem, "onionItem");
        GameRegistry.registerItem(FCF_Items.blackberryItem, "blackberryItem");
        GameRegistry.registerItem(FCF_Items.blueberryItem, "blueberryItem");
        GameRegistry.registerItem(FCF_Items.blackcurrantItem, "blackcurrantItem");
        GameRegistry.registerItem(FCF_Items.grapesItem, "grapesItem");
        GameRegistry.registerItem(FCF_Items.lemonItem, "lemonItem");
        GameRegistry.registerItem(FCF_Items.limeItem, "limeItem");
        GameRegistry.registerItem(FCF_Items.orangeItem, "orangeItem");
        GameRegistry.registerItem(FCF_Items.strawberryItem, "strawberryItem");
        GameRegistry.registerItem(FCF_Items.raspberryItem, "raspberryItem");
        GameRegistry.registerItem(FCF_Items.avocadoItem, "avocadoItem");
        GameRegistry.registerItem(FCF_Items.pearItem, "pearItem");
        GameRegistry.registerItem(FCF_Items.bananaItem, "bananaItem");
        GameRegistry.registerItem(FCF_Items.seaweedItem, "seaweedItem");
        GameRegistry.registerItem(FCF_Items.redGrapesItem, "redGrapesItem");
        GameRegistry.registerItem(FCF_Items.rhubarbItem, "rhubarbItem");

        //Seeds
        GameRegistry.registerItem(FCF_Items.broccoliSeed, "broccoliSeed");
        GameRegistry.registerItem(FCF_Items.tomatoSeed, "tomatoSeed");
        GameRegistry.registerItem(FCF_Items.lettuceSeed, "lettuceSeed");
        GameRegistry.registerItem(FCF_Items.garlicSeed, "garlicSeed");
        GameRegistry.registerItem(FCF_Items.cabbageSeed, "cabbageSeed");
        GameRegistry.registerItem(FCF_Items.celerySeed, "celerySeed");
        GameRegistry.registerItem(FCF_Items.cornSeed, "cornSeed");
        GameRegistry.registerItem(FCF_Items.cucumberSeed, "cucumberSeed");
        GameRegistry.registerItem(FCF_Items.redPepperSeed, "redPepperSeed");
        GameRegistry.registerItem(FCF_Items.yellowPepperSeed, "yellowPepperSeed");
        GameRegistry.registerItem(FCF_Items.greenPepperSeed, "greenPepperSeed");
        GameRegistry.registerItem(FCF_Items.leekSeed, "leekSeed");
        GameRegistry.registerItem(FCF_Items.blueBerrySeed, "blueBerrySeed");
        GameRegistry.registerItem(FCF_Items.blackCurrantSeed, "blackCurrantSeed");
        GameRegistry.registerItem(FCF_Items.avocadoSeed, "avocadoSeed");
        GameRegistry.registerItem(FCF_Items.rhubarbSeed, "rhubarbSeed");
        GameRegistry.registerItem(FCF_Items.onionSeed, "onionSeed");
        GameRegistry.registerItem(FCF_Items.riceItem, "riceItem");
        GameRegistry.registerItem(FCF_Items.rapeSeed, "rapeSeed");
        
        //Utensils
    	GameRegistry.registerItem(FCF_Items.knifeForkItem, "knifeForkItem");
    	GameRegistry.registerItem(FCF_Items.spoonItem, "spoonItem");
    	GameRegistry.registerItem(FCF_Items.woodenSpoon, "woodenSpoon");
    	GameRegistry.registerItem(FCF_Items.breadKnife, "breadKnife");
    	GameRegistry.registerItem(FCF_Items.cheeseKnife, "cheeseKnife");
    	GameRegistry.registerItem(FCF_Items.largeKnife, "largeKnife");
    	GameRegistry.registerItem(FCF_Items.saucepanSmall, "saucepanSmall");
    	GameRegistry.registerItem(FCF_Items.saucepanLarge, "saucepanLarge");
    	GameRegistry.registerItem(FCF_Items.fryingPan, "fryingPan");
    	GameRegistry.registerItem(FCF_Items.wokItem, "wokItem");
    	GameRegistry.registerItem(FCF_Items.smallContainer, "smallContainer");
    	GameRegistry.registerItem(FCF_Items.medContainer, "medContainer");
    	GameRegistry.registerItem(FCF_Items.largeContainer, "largeContainer");
    	GameRegistry.registerItem(FCF_Items.smallPlate, "smallPlate");
    	GameRegistry.registerItem(FCF_Items.largePlate, "largePlate");
    	GameRegistry.registerItem(FCF_Items.bowlItem, "bowlItem");
    	GameRegistry.registerItem(FCF_Items.mugItem, "mugItem");
    	GameRegistry.registerItem(FCF_Items.plasticCup, "plasticCup");
    	GameRegistry.registerItem(FCF_Items.glassCup, "glassCup");
    	GameRegistry.registerItem(FCF_Items.pieTin, "pieTin");
    	
    	//Drinks
        GameRegistry.registerItem(FCF_Items.drinkAppleJuice, "drinkAppleJuice");
        GameRegistry.registerItem(FCF_Items.drinkCola, "drinkCola");
        GameRegistry.registerItem(FCF_Items.drinkOrangeJuice, "drinkOrangeJuice");
        GameRegistry.registerItem(FCF_Items.drinkWaterBottle, "drinkWaterBottle");
        GameRegistry.registerItem(FCF_Items.drinkMilkBottle, "drinkMilkBottle");
        GameRegistry.registerItem(FCF_Items.drinkEnergyDrink, "drinkEnergyDrink");
        GameRegistry.registerItem(FCF_Items.drinkMilkshake, "drinkMilkshake");
        GameRegistry.registerItem(FCF_Items.drinkCoffee, "drinkCoffee");
        GameRegistry.registerItem(FCF_Items.drinkHotChocolate, "drinkHotChocolate");
    }
    
    public void addRecipes() {
    	
    }
}