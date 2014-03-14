package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.FridgeItemBlock;
import co.uk.silvania.cities.food.items.ItemVendingMachineBlock;
import co.uk.silvania.cities.food.items.foods.ItemFoodMeat;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
    	
    	//Saplings
    	GameRegistry.registerBlock(FCF_Blocks.orangeSapling, "orangeSapling");
    	GameRegistry.registerBlock(FCF_Blocks.pearSapling, "pearSapling");
    	GameRegistry.registerBlock(FCF_Blocks.bananaSapling, "bananaSapling");
    	GameRegistry.registerBlock(FCF_Blocks.lemonSapling, "lemonSapling");
    	GameRegistry.registerBlock(FCF_Blocks.limeSapling, "limeSapling");
    	
    	
        //Raw Ingredients
    	GameRegistry.registerItem(FCF_Items.lambShoulder, "lambShoulder");
    	GameRegistry.registerItem(FCF_Items.lambBreast, "lambBreast");
    	GameRegistry.registerItem(FCF_Items.lambFlank, "lambFlank");
    	GameRegistry.registerItem(FCF_Items.lambLoin, "lambLoin");
    	GameRegistry.registerItem(FCF_Items.lambLeg, "lambLeg");
    	GameRegistry.registerItem(FCF_Items.lambRack, "lambRack");
    	GameRegistry.registerItem(FCF_Items.lambShank, "lambShank");
    	GameRegistry.registerItem(FCF_Items.lambChop, "lambChop");
    	/*
    	GameRegistry.registerItem(FCF_Items.rawDuck, "rawDuck");
    	GameRegistry.registerItem(FCF_Items.rawMutton, "rawMutton");
    	GameRegistry.registerItem(FCF_Items.rawTurkey, "rawTurkey");
    	GameRegistry.registerItem(FCF_Items.rawPheasant, "rawPheasant");
    	GameRegistry.registerItem(FCF_Items.rawHorse, "rawHorse");
    	GameRegistry.registerItem(FCF_Items.rawRabbit, "rawRabbit");
    	GameRegistry.registerItem(FCF_Items.rawVenison, "rawVenison");
    	GameRegistry.registerItem(FCF_Items.rawGoat, "rawGoat");
    	GameRegistry.registerItem(FCF_Items.rawPigeon, "rawPigeon");
    	GameRegistry.registerItem(FCF_Items.rawOx, "rawOx");
    	GameRegistry.registerItem(FCF_Items.rawBuffalo, "rawBuffalo");
    	GameRegistry.registerItem(FCF_Items.rawBoar, "rawBoar");*/
    	
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
        
        //Prepared Ingredients
        GameRegistry.registerItem(FCF_Items.foodChocolateBar, "foodChocolateBar");
        GameRegistry.registerItem(FCF_Items.foodCrisps, "foodCrisps");
        GameRegistry.registerItem(FCF_Items.foodEnergyBar, "foodEnergyBar");
        GameRegistry.registerItem(FCF_Items.foodCheeseMolten, "foodCheese");
        GameRegistry.registerItem(FCF_Items.foodCheeseMild, "foodCheeseMild");
        GameRegistry.registerItem(FCF_Items.foodCheeseMedium, "foodCheeseMedium");
        GameRegistry.registerItem(FCF_Items.foodCheeseMature, "foodCheeseMature");
        GameRegistry.registerItem(FCF_Items.foodCheeseBlue, "foodCheeseBlue");
        GameRegistry.registerItem(FCF_Items.foodCheeseMouldy, "foodCheeseMouldy");
        GameRegistry.registerItem(FCF_Items.foodSausage, "foodSausage");
        GameRegistry.registerItem(FCF_Items.pastryItem, "pastryItem");
        GameRegistry.registerItem(FCF_Items.doughItem, "doughItem");
        GameRegistry.registerItem(FCF_Items.chocolateItem, "chocolateItem");
        GameRegistry.registerItem(FCF_Items.chocolateChips, "chocolateChips");
        GameRegistry.registerItem(FCF_Items.breadSlice, "breadSlice");
        GameRegistry.registerItem(FCF_Items.breadCrumbs, "breadCrumbs");
        GameRegistry.registerItem(FCF_Items.mincedBeef, "mincedBeef");
        GameRegistry.registerItem(FCF_Items.coneItem, "coneItem");
        
        //Snacks etc
        GameRegistry.registerItem(FCF_Items.foodDonut, "foodDonut");
        GameRegistry.registerItem(FCF_Items.foodSweets, "foodSweets");
        GameRegistry.registerItem(FCF_Items.foodFries, "foodFries");
        GameRegistry.registerItem(FCF_Items.foodPopcorn, "foodPopcorn");
        GameRegistry.registerItem(FCF_Items.foodIceCream, "foodIceCream");
        GameRegistry.registerItem(FCF_Items.foodChocolateIceCream, "foodChocolateIceCream");
        GameRegistry.registerItem(FCF_Items.foodMuffin, "foodMuffin");
        GameRegistry.registerItem(FCF_Items.foodChocolateMuffin, "foodChocolateMuffin");
        GameRegistry.registerItem(FCF_Items.foodBlueberryMuffin, "foodBlueberryMuffin");
        GameRegistry.registerItem(FCF_Items.chocolateCake, "chocolateCake");
        GameRegistry.registerItem(FCF_Items.chocolateCakeSlice, "chocolateCakeSlice");
        GameRegistry.registerItem(FCF_Items.cakeSlice, "cakeSlice");
        GameRegistry.registerItem(FCF_Items.strawberryCheesecake, "strawberryCheesecake");
        GameRegistry.registerItem(FCF_Items.chocolateCheesecake, "chocolateCheesecake");
        GameRegistry.registerItem(FCF_Items.foodVanillaCone, "foodVanillaCone");
        GameRegistry.registerItem(FCF_Items.foodChocolateCone, "foodChocolateCone");
        GameRegistry.registerItem(FCF_Items.strawberryIceLolly, "strawberryIceLolly");
        GameRegistry.registerItem(FCF_Items.chocolateIceLolly, "chocolateIceLolly");
        GameRegistry.registerItem(FCF_Items.milkIceLolly, "milkIceLolly");
        
        //Meal Parts
        GameRegistry.registerItem(FCF_Items.foodChickenWings, "foodChickenWings");
        GameRegistry.registerItem(FCF_Items.foodChickenNuggets, "foodChickenNuggets");
        GameRegistry.registerItem(FCF_Items.foodSausageRoll, "foodSausageRoll");
        GameRegistry.registerItem(FCF_Items.foodCheeseBurger, "foodCheeseBurger");
        GameRegistry.registerItem(FCF_Items.foodBurger, "foodBurger");
        GameRegistry.registerItem(FCF_Items.foodHotDog, "foodHotDog");
        GameRegistry.registerItem(FCF_Items.foodNoodles, "foodNoodles");
        GameRegistry.registerItem(FCF_Items.foodPizza, "foodPizza");

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
    
    public void addNames() {
        LanguageRegistry.addName(FCF_Blocks.fridgeBlock, "Fridge");
        LanguageRegistry.addName(FCF_Blocks.largeFridgeBlock, "Large Fridge");
        LanguageRegistry.addName(FCF_Blocks.stoveBlock, "Stove");
        
    	//Bushes
    	LanguageRegistry.addName(FCF_Blocks.blackberryBush, "Blackberry Bush");
    	LanguageRegistry.addName(FCF_Blocks.strawberryBush, "Strawberry Bush");
    	LanguageRegistry.addName(FCF_Blocks.raspberryBush, "Raspberry Bush");
    	LanguageRegistry.addName(FCF_Blocks.seaweedBush, "Seaweed");
    	LanguageRegistry.addName(FCF_Blocks.redGrapeVine, "Red Grapevine");
    	LanguageRegistry.addName(FCF_Blocks.greenGrapeVine, "Green Grapevine");
    	
    	//Saplings
    	LanguageRegistry.addName(FCF_Blocks.orangeSapling, "Orange Sapling");
    	LanguageRegistry.addName(FCF_Blocks.pearSapling, "Pear Sapling");
    	LanguageRegistry.addName(FCF_Blocks.bananaSapling, "Banana Sapling");
    	LanguageRegistry.addName(FCF_Blocks.lemonSapling, "Lemon Sapling");
    	LanguageRegistry.addName(FCF_Blocks.limeSapling, "Lime Sapling");
        
        //Raw Ingredients
    	/*LanguageRegistry.addName(FCF_Items.rawDuck, "Raw Duck");
    	LanguageRegistry.addName(FCF_Items.rawMutton, "Raw Mutton");
    	LanguageRegistry.addName(FCF_Items.rawTurkey, "Raw Turkey");
    	LanguageRegistry.addName(FCF_Items.rawPheasant, "Raw Pheasant");
    	LanguageRegistry.addName(FCF_Items.rawHorse, "Raw Horse");
    	LanguageRegistry.addName(FCF_Items.rawRabbit, "Raw Rabbit");
    	LanguageRegistry.addName(FCF_Items.rawVenison, "Raw Venison");
    	LanguageRegistry.addName(FCF_Items.rawGoat, "Raw Goat");
    	LanguageRegistry.addName(FCF_Items.rawPigeon, "Raw Pigeon");
    	LanguageRegistry.addName(FCF_Items.rawOx, "Raw Ox");
    	LanguageRegistry.addName(FCF_Items.rawBuffalo, "Raw Buffalo");
    	LanguageRegistry.addName(FCF_Items.rawBoar, "Raw Boar");*/
    	
    	LanguageRegistry.addName(FCF_Items.rawSquid, "Raw Squid");
    	LanguageRegistry.addName(FCF_Items.rawCod, "Raw Cod");
    	LanguageRegistry.addName(FCF_Items.rawLobster, "Raw Lobster");
    	LanguageRegistry.addName(FCF_Items.rawCrab, "Raw Crab");
    	LanguageRegistry.addName(FCF_Items.rawPrawn, "Raw Prawn");
    	LanguageRegistry.addName(FCF_Items.rawShrimp, "Raw Shrimp");
    	LanguageRegistry.addName(FCF_Items.rawAnchovy, "Raw Anchovy");
    	LanguageRegistry.addName(FCF_Items.rawTuna, "Raw Tuna");
    	LanguageRegistry.addName(FCF_Items.rawSardine, "Raw Sardine");
    	LanguageRegistry.addName(FCF_Items.rawCarp, "Raw Carp");
    	LanguageRegistry.addName(FCF_Items.rawOyster, "Raw Oyster");
    	LanguageRegistry.addName(FCF_Items.rawMussel, "Raw Mussel");
    	//LanguageRegistry.addName(FCF_Items.rawSnail, "Raw Snail");
    	LanguageRegistry.addName(FCF_Items.rawShark, "Raw Shark");
    	LanguageRegistry.addName(FCF_Items.rawTrout, "Raw Trout");
    	LanguageRegistry.addName(FCF_Items.rawBass, "Raw Bass");
    	LanguageRegistry.addName(FCF_Items.rawHaddock, "Raw Haddock");
    	LanguageRegistry.addName(FCF_Items.rawSwordfish, "Raw Swordfish");
    	LanguageRegistry.addName(FCF_Items.rawMackeral, "Raw Mackeral");
        
        //Fruit n Veg
        LanguageRegistry.addName(FCF_Items.tomatoItem, "Tomato");
        LanguageRegistry.addName(FCF_Items.lettuceItem, "Lettuce");
        LanguageRegistry.addName(FCF_Items.garlicItem, "Garlic");
        LanguageRegistry.addName(FCF_Items.broccoliItem, "Broccoli");
        LanguageRegistry.addName(FCF_Items.cabbageItem, "Cabbage");
        LanguageRegistry.addName(FCF_Items.celeryItem, "Celery");
        LanguageRegistry.addName(FCF_Items.cornItem, "Corn");
        LanguageRegistry.addName(FCF_Items.cucumberItem, "Cucumber");
        LanguageRegistry.addName(FCF_Items.redPepperItem, "Red Pepper");
        LanguageRegistry.addName(FCF_Items.yellowPepperItem, "Yellow Pepper");
        LanguageRegistry.addName(FCF_Items.greenPepperItem, "Green Pepper");
        LanguageRegistry.addName(FCF_Items.leekItem, "Leek");
        LanguageRegistry.addName(FCF_Items.onionItem, "Onion");
        LanguageRegistry.addName(FCF_Items.blackberryItem, "Blackberry");
        LanguageRegistry.addName(FCF_Items.blueberryItem, "Blueberry");
        LanguageRegistry.addName(FCF_Items.blackcurrantItem, "Blackcurrent");
        LanguageRegistry.addName(FCF_Items.grapesItem, "Green Grapes");
        LanguageRegistry.addName(FCF_Items.redGrapesItem, "Red Grapes");
        LanguageRegistry.addName(FCF_Items.lemonItem, "Lemon");
        LanguageRegistry.addName(FCF_Items.limeItem, "Lime");
        LanguageRegistry.addName(FCF_Items.orangeItem, "Orange");
        LanguageRegistry.addName(FCF_Items.strawberryItem, "Strawberry");
        LanguageRegistry.addName(FCF_Items.raspberryItem, "Raspberry");
        LanguageRegistry.addName(FCF_Items.avocadoItem, "Avocado");
        LanguageRegistry.addName(FCF_Items.pearItem, "Pear");
        LanguageRegistry.addName(FCF_Items.bananaItem, "Banana");
        LanguageRegistry.addName(FCF_Items.seaweedItem, "Seaweed");
        LanguageRegistry.addName(FCF_Items.rhubarbItem, "Rhubarb");
        
        //Prepared Ingredients
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodChocolateBar, 1, 0), "CHOC!");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodChocolateBar, 1, 1), "Chocolate Bar");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodChocolateBar, 1, 2), "Chocolate Bar");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodChocolateBar, 1, 3), "Chocolate Bar");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodCrisps, 1, 0), "FlenixChips Plain Crisps");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodCrisps, 1, 1), "FlenixChips ChuckyChuck Crisps");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodCrisps, 1, 2), "FlenixChips Cheezumz Crisps");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodCrisps, 1, 3), "FlenixChips Salt N' Vinny Crisps");
        LanguageRegistry.addName(FCF_Items.foodEnergyBar, "Energy Bar");
        LanguageRegistry.addName(FCF_Items.foodCheeseMolten, "Molten Cheese");
        LanguageRegistry.addName(FCF_Items.foodCheeseMild, "Mild Cheese");
        LanguageRegistry.addName(FCF_Items.foodCheeseMedium, "Medium Cheese");
        LanguageRegistry.addName(FCF_Items.foodCheeseMature, "Mature Cheese");
        LanguageRegistry.addName(FCF_Items.foodCheeseBlue, "Blue Cheese");
        LanguageRegistry.addName(FCF_Items.foodCheeseMouldy, "Mouldy Cheese");
        LanguageRegistry.addName(FCF_Items.foodSausage, "Sausage");
        LanguageRegistry.addName(FCF_Items.pastryItem, "Pastry");
        LanguageRegistry.addName(FCF_Items.doughItem, "Dough");
        LanguageRegistry.addName(FCF_Items.chocolateItem, "Chocolate");
        LanguageRegistry.addName(FCF_Items.chocolateChips, "Chocolate Chips");
        LanguageRegistry.addName(FCF_Items.breadSlice, "Slice of Bread");
        LanguageRegistry.addName(FCF_Items.breadCrumbs, "Bread Crumbs");
        LanguageRegistry.addName(FCF_Items.mincedBeef, "Minced Beef");
        LanguageRegistry.addName(FCF_Items.coneItem, "Ice Cream Cone");
        
        //Snacks etc
        LanguageRegistry.addName(FCF_Items.foodDonut, "Donut");
        LanguageRegistry.addName(FCF_Items.foodSweets, "Sweets");
        LanguageRegistry.addName(FCF_Items.foodFries, "Fries");
        LanguageRegistry.addName(FCF_Items.foodPopcorn, "Popcorn");
        LanguageRegistry.addName(FCF_Items.foodIceCream, "Ice Cream");
        LanguageRegistry.addName(FCF_Items.foodChocolateIceCream, "Chocolate Ice Cream");
        LanguageRegistry.addName(FCF_Items.foodMuffin, "Muffin");
        LanguageRegistry.addName(FCF_Items.foodChocolateMuffin, "Chocolate Muffin");
        LanguageRegistry.addName(FCF_Items.foodBlueberryMuffin, "Blueberry Muffin");
        LanguageRegistry.addName(FCF_Items.chocolateCake, "Chocolate Cake");
        LanguageRegistry.addName(FCF_Items.chocolateCakeSlice, "Chocolate Cake (Slice)");
        LanguageRegistry.addName(FCF_Items.cakeSlice, "Cake (Slice)");
        LanguageRegistry.addName(FCF_Items.strawberryCheesecake, "Strawberry Cheesecake");
        LanguageRegistry.addName(FCF_Items.chocolateCheesecake, "Chocolate Cheesecake");
        LanguageRegistry.addName(FCF_Items.foodVanillaCone, "Vanilla Cone");
        LanguageRegistry.addName(FCF_Items.foodChocolateCone, "Chocolate Cone");
        LanguageRegistry.addName(FCF_Items.strawberryIceLolly, "Strawberry Ice Lolly");
        LanguageRegistry.addName(FCF_Items.chocolateIceLolly, "Chocolate Ice Lolly");
        LanguageRegistry.addName(FCF_Items.milkIceLolly, "Milk Ice Lolly");
        
        //Meal Parts
        LanguageRegistry.addName(FCF_Items.foodChickenWings, "Chicken Wings");
        LanguageRegistry.addName(FCF_Items.foodChickenNuggets, "Chicken Nuggets");
        LanguageRegistry.addName(FCF_Items.foodSausageRoll, "Sausage Roll");
        LanguageRegistry.addName(FCF_Items.foodCheeseBurger, "Cheeseburger");
        LanguageRegistry.addName(FCF_Items.foodBurger, "Burger");
        LanguageRegistry.addName(FCF_Items.foodHotDog, "Hot Dog");
        LanguageRegistry.addName(FCF_Items.foodNoodles, "Noodles");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodPizza, 1, 0), "Margherita Pizza");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodPizza, 1, 1), "Mushroom Pizza");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodPizza, 1, 2), "Pepperoni Pizza");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodPizza, 1, 3), "Mushroom & Pepperoni Pizza");

        //Meals
        
        //Seeds
        LanguageRegistry.addName(FCF_Items.broccoliSeed, "Broccoli Seed");
        LanguageRegistry.addName(FCF_Items.tomatoSeed, "Tomato Seed");
        LanguageRegistry.addName(FCF_Items.lettuceSeed, "Lettuce Seed");
        LanguageRegistry.addName(FCF_Items.garlicSeed, "Clove of Garlic");
        LanguageRegistry.addName(FCF_Items.cabbageSeed, "Cabbage Seed");
        LanguageRegistry.addName(FCF_Items.celerySeed, "Celery Seed");
        LanguageRegistry.addName(FCF_Items.cornSeed, "Corn");
        LanguageRegistry.addName(FCF_Items.cucumberSeed, "Cucumber Seed");
        LanguageRegistry.addName(FCF_Items.redPepperSeed, "Red Pepper Seed");
        LanguageRegistry.addName(FCF_Items.yellowPepperSeed, "Yellow Pepper Seed");
        LanguageRegistry.addName(FCF_Items.greenPepperSeed, "Green Pepper Seed");
        LanguageRegistry.addName(FCF_Items.leekSeed, "Leek Seed");
        LanguageRegistry.addName(FCF_Items.blueBerrySeed, "Blueberry Seed");
        LanguageRegistry.addName(FCF_Items.blackCurrantSeed, "Blackcurrant Seed");
        LanguageRegistry.addName(FCF_Items.avocadoSeed, "Avocado Seed");
        LanguageRegistry.addName(FCF_Items.rhubarbSeed, "Rhubarb Seed");
        LanguageRegistry.addName(FCF_Items.onionSeed, "Onion Seed");
        LanguageRegistry.addName(FCF_Items.riceItem, "Ball of Rice");
        LanguageRegistry.addName(FCF_Items.rapeSeed, "Rape Seed");
        
        //Utensils
    	LanguageRegistry.addName(FCF_Items.knifeForkItem, "Knife & Fork");
    	LanguageRegistry.addName(FCF_Items.spoonItem, "Spoon");
    	LanguageRegistry.addName(FCF_Items.woodenSpoon, "Wooden Spoon");
    	LanguageRegistry.addName(FCF_Items.breadKnife, "Bread Knife");
    	LanguageRegistry.addName(FCF_Items.cheeseKnife, "Cheese Knife");
    	LanguageRegistry.addName(FCF_Items.largeKnife, "Large Knife");
    	LanguageRegistry.addName(FCF_Items.saucepanSmall, "Small Saucepan");
    	LanguageRegistry.addName(FCF_Items.saucepanLarge, "Large Saucepan");
    	LanguageRegistry.addName(FCF_Items.fryingPan, "Frying Pan");
    	LanguageRegistry.addName(FCF_Items.wokItem, "Wok");
    	LanguageRegistry.addName(FCF_Items.smallContainer, "Small Storage Container");
    	LanguageRegistry.addName(FCF_Items.medContainer, "Medium Storage Container");
    	LanguageRegistry.addName(FCF_Items.largeContainer, "Large Storage Container");
    	LanguageRegistry.addName(FCF_Items.smallPlate, "Small Plate");
    	LanguageRegistry.addName(FCF_Items.largePlate, "Large Plate");
    	LanguageRegistry.addName(FCF_Items.bowlItem, "Bowl");
    	LanguageRegistry.addName(FCF_Items.mugItem, "Mug");
    	LanguageRegistry.addName(FCF_Items.plasticCup, "Plastic Cup");
    	LanguageRegistry.addName(FCF_Items.glassCup, "Glass Cup");
    	LanguageRegistry.addName(FCF_Items.pieTin, "Pie Tin");
    	
        //Drinks
        LanguageRegistry.addName(FCF_Items.drinkAppleJuice, "Apple Juice");
        LanguageRegistry.addName(FCF_Items.drinkCola, "Cola");
        LanguageRegistry.addName(FCF_Items.drinkOrangeJuice, "Orange Juice");
        LanguageRegistry.addName(FCF_Items.drinkWaterBottle, "Water Bottle");
        LanguageRegistry.addName(FCF_Items.drinkMilkBottle, "Milk Bottle");
        LanguageRegistry.addName(FCF_Items.drinkEnergyDrink, "Energy Drink");
        LanguageRegistry.addName(FCF_Items.drinkMilkshake, "Milkshake");
        LanguageRegistry.addName(FCF_Items.drinkCoffee, "Coffee");
        LanguageRegistry.addName(FCF_Items.drinkHotChocolate, "Hot Chocolate");

        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 0), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 4), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 8), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 12), "Vending Machine");
    }
    
    public void addRecipes() {
    	
    }
}