package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.FridgeItemBlock;
import co.uk.silvania.cities.food.items.ItemVendingMachineBlock;
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

        /*GameRegistry.registerBlock(FCF_Blocks.broccoliCrop, "broccoliCrop");
    	GameRegistry.registerBlock(FCF_Blocks.lettuceCrop, "lettuceCrop");
    	GameRegistry.registerBlock(FCF_Blocks.garlicCrop, "garlicCrop");
    	GameRegistry.registerBlock(FCF_Blocks.cabbageCrop, "cabbageCrop");
    	GameRegistry.registerBlock(FCF_Blocks.celeryCrop, "celeryCrop");
    	GameRegistry.registerBlock(FCF_Blocks.leekCrop, "leekCrop");
    	GameRegistry.registerBlock(FCF_Blocks.lemonCrop, "lemonCrop");
    	GameRegistry.registerBlock(FCF_Blocks.limeCrop, "limeCrop");
    	GameRegistry.registerBlock(FCF_Blocks.orangeCrop, "orangeCrop");*/
    	GameRegistry.registerBlock(FCF_Blocks.onionCrop, "onionCrop");
    	GameRegistry.registerBlock(FCF_Blocks.riceCrop, "riceCrop");
        
        GameRegistry.registerItem(FCF_Items.foodCheeseBurger, "foodCheeseBurger");
        GameRegistry.registerItem(FCF_Items.foodBurger, "foodBurger");
        GameRegistry.registerItem(FCF_Items.foodHotDog, "foodHotDog");
        GameRegistry.registerItem(FCF_Items.foodPizza, "foodPizza");
        GameRegistry.registerItem(FCF_Items.foodNoodles, "foodNoodles");
        //GameRegistry.registerItem(FCF_Items.foodChocolateBar, "foodChocolateBar");
        GameRegistry.registerItem(FCF_Items.foodCrisps, "foodCrisps");
        //GameRegistry.registerItem(FCF_Items.foodEnergyBar, "foodEnergyBar");
        GameRegistry.registerItem(FCF_Items.foodCheese, "foodCheese");
        /*GameRegistry.registerItem(FCF_Items.foodTomato, "foodTomato");
        GameRegistry.registerItem(FCF_Items.foodDonut, "foodDonut");
        GameRegistry.registerItem(FCF_Items.foodSweets, "foodSweets");
        GameRegistry.registerItem(FCF_Items.foodFries, "foodFries");*/
        GameRegistry.registerItem(FCF_Items.foodPopcorn, "foodPopcorn");
        /*GameRegistry.registerItem(FCF_Items.foodIceCream, "foodIceCream");
        GameRegistry.registerItem(FCF_Items.foodChickenNuggets, "foodChickenNuggets");
        GameRegistry.registerItem(FCF_Items.foodChickenWings, "foodChickenWings");
        GameRegistry.registerItem(FCF_Items.foodSausage, "foodSausage");
        GameRegistry.registerItem(FCF_Items.foodSausageRoll, "foodSausageRoll");
        
        GameRegistry.registerItem(FCF_Items.lettuceItem, "lettuceItem");
        GameRegistry.registerItem(FCF_Items.garlicItem, "garlicItem");*/
        GameRegistry.registerItem(FCF_Items.broccoliItem, "broccoliItem");
        /*GameRegistry.registerItem(FCF_Items.cabbageItem, "cabbageItem");
        GameRegistry.registerItem(FCF_Items.celeryItem, "celeryItem");
        GameRegistry.registerItem(FCF_Items.cornItem, "cornItem");
        GameRegistry.registerItem(FCF_Items.cucumberItem, "cucumberItem");
        GameRegistry.registerItem(FCF_Items.redPepperItem, "redPepperItem");
        GameRegistry.registerItem(FCF_Items.yellowPepperItem, "yellowPepperItem");
        GameRegistry.registerItem(FCF_Items.greenPepperItem, "greenPepperItem");
        GameRegistry.registerItem(FCF_Items.leekItem, "leekItem");*/
        GameRegistry.registerItem(FCF_Items.onionItem, "onionItem");
        /*GameRegistry.registerItem(FCF_Items.blackberryItem, "blackberryItem");
        GameRegistry.registerItem(FCF_Items.blueberryItem, "blueberryItem");
        GameRegistry.registerItem(FCF_Items.blackcurrentItem, "blackcurrentItem");
        GameRegistry.registerItem(FCF_Items.grapesItem, "grapesItem");
        GameRegistry.registerItem(FCF_Items.lemonItem, "lemonItem");
        GameRegistry.registerItem(FCF_Items.limeItem, "limeItem");
        GameRegistry.registerItem(FCF_Items.orangeItem, "orangeItem");
        GameRegistry.registerItem(FCF_Items.strawberryItem, "strawberryItem");
        GameRegistry.registerItem(FCF_Items.raspberryItem, "raspberryItem");
        				
        GameRegistry.registerItem(FCF_Items.drinkAppleJuice, "drinkAppleJuice");
        GameRegistry.registerItem(FCF_Items.drinkCola, "drinkCola");
        GameRegistry.registerItem(FCF_Items.drinkOrangeJuice, "drinkOrangeJuice");
        GameRegistry.registerItem(FCF_Items.drinkWaterBottle, "drinkWaterBottle");
        GameRegistry.registerItem(FCF_Items.drinkMilkBottle, "drinkMilkBottle");
        GameRegistry.registerItem(FCF_Items.drinkEnergyDrink, "drinkEnergyDrink");
        GameRegistry.registerItem(FCF_Items.drinkMilkshake, "drinkMilkshake");
        GameRegistry.registerItem(FCF_Items.drinkCoffee, "drinkCoffee");
        GameRegistry.registerItem(FCF_Items.drinkHotChocolate, "drinkHotChocolate");
        
        GameRegistry.registerItem(FCF_Items.broccoliSeed, "broccoliSeed");
        GameRegistry.registerItem(FCF_Items.lettuceSeed, "lettuceSeed");
        GameRegistry.registerItem(FCF_Items.garlicSeed, "garlicSeed");
        GameRegistry.registerItem(FCF_Items.cabbageSeed, "cabbageSeed");
        GameRegistry.registerItem(FCF_Items.celerySeed, "celerySeed");
        GameRegistry.registerItem(FCF_Items.leekSeed, "leekSeed");*/
        GameRegistry.registerItem(FCF_Items.onionSeed, "onionSeed");
        /*GameRegistry.registerItem(FCF_Items.lemonSeed, "lemonSeed");
        GameRegistry.registerItem(FCF_Items.limeSeed, "limeSeed");
        GameRegistry.registerItem(FCF_Items.orangeSeed, "orangeSeed");*/
        GameRegistry.registerItem(FCF_Items.riceItem, "riceItem");
    }
    
    public void addNames() {
        LanguageRegistry.addName(FCF_Blocks.fridgeBlock, "Fridge");
        LanguageRegistry.addName(FCF_Blocks.largeFridgeBlock, "Large Fridge");
       
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodPizza, 1, 0), "Margherita Pizza");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodPizza, 1, 1), "Mushroom Pizza");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodPizza, 1, 2), "Pepperoni Pizza");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodPizza, 1, 3), "Mushroom & Pepperoni Pizza");
        /*LanguageRegistry.addName(new ItemStack(FCF_Items.foodChocolateBar, 1, 0), "CHOC!");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodChocolateBar, 1, 1), "Chocolate Bar");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodChocolateBar, 1, 2), "Chocolate Bar");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodChocolateBar, 1, 3), "Chocolate Bar");*/
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodCrisps, 1, 0), "FlenixChips Plain Crisps");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodCrisps, 1, 1), "FlenixChips ChuckyChuck Crisps");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodCrisps, 1, 2), "FlenixChips Cheezumz Crisps");
        LanguageRegistry.addName(new ItemStack(FCF_Items.foodCrisps, 1, 3), "FlenixChips Salt N' Vinny Crisps");
        
        LanguageRegistry.addName(FCF_Items.foodCheeseBurger, "Cheeseburger");
        LanguageRegistry.addName(FCF_Items.foodBurger, "Burger");
        LanguageRegistry.addName(FCF_Items.foodHotDog, "Hot Dog");
        LanguageRegistry.addName(FCF_Items.foodNoodles, "Noodles");
        LanguageRegistry.addName(FCF_Items.foodCheese, "Cheese");
        LanguageRegistry.addName(FCF_Items.foodPopcorn, "Popcorn");
        /*LanguageRegistry.addName(FCF_Items.foodEnergyBar, "Energy Bar");
        LanguageRegistry.addName(FCF_Items.foodTomato, "Tomato");
        LanguageRegistry.addName(FCF_Items.foodDonut, "Donut");
        LanguageRegistry.addName(FCF_Items.foodSweets, "Sweets");
        LanguageRegistry.addName(FCF_Items.foodFries, "Fries");
        LanguageRegistry.addName(FCF_Items.foodIceCream, "Ice Cream");
        LanguageRegistry.addName(FCF_Items.foodChickenNuggets, "Chicken Nuggets");
        LanguageRegistry.addName(FCF_Items.foodChickenWings, "Chicken Wings");
        LanguageRegistry.addName(FCF_Items.foodSausage, "Sausage");
        LanguageRegistry.addName(FCF_Items.foodSausageRoll, "Sausage Roll");*/
        
        //LanguageRegistry.addName(FCF_Items.lettuceItem, "Lettuce");
        //LanguageRegistry.addName(FCF_Items.garlicItem, "Garlic");
        LanguageRegistry.addName(FCF_Items.broccoliItem, "Broccoli");
        //LanguageRegistry.addName(FCF_Items.cabbageItem, "Cabbage");
        //LanguageRegistry.addName(FCF_Items.celeryItem, "Celery");
        //LanguageRegistry.addName(FCF_Items.cornItem, "Corn");
        //LanguageRegistry.addName(FCF_Items.cucumberItem, "CucumberItem");
        //LanguageRegistry.addName(FCF_Items.redPepperItem, "Red Pepper");
        //LanguageRegistry.addName(FCF_Items.yellowPepperItem, "Yellow Pepper");
        //LanguageRegistry.addName(FCF_Items.greenPepperItem, "Green Pepper");
        //LanguageRegistry.addName(FCF_Items.leekItem, "Leek");
        LanguageRegistry.addName(FCF_Items.onionItem, "Onion");
        /*LanguageRegistry.addName(FCF_Items.blackberryItem, "Blackberry");
        LanguageRegistry.addName(FCF_Items.blueberryItem, "Blueberry");
        LanguageRegistry.addName(FCF_Items.blackcurrentItem, "Blackcurrent");
        LanguageRegistry.addName(FCF_Items.grapesItem, "Grapes");
        LanguageRegistry.addName(FCF_Items.lemonItem, "Lemon");
        LanguageRegistry.addName(FCF_Items.limeItem, "Lime");
        LanguageRegistry.addName(FCF_Items.orangeItem, "Orange");
        LanguageRegistry.addName(FCF_Items.strawberryItem, "Strawberry");
        LanguageRegistry.addName(FCF_Items.raspberryItem, "Raspberry");
        
        LanguageRegistry.addName(FCF_Items.drinkAppleJuice, "Apple Juice");
        LanguageRegistry.addName(FCF_Items.drinkCola, "Cola");
        LanguageRegistry.addName(FCF_Items.drinkOrangeJuice, "Orange Juice");
        LanguageRegistry.addName(FCF_Items.drinkWaterBottle, "Water Bottle");
        LanguageRegistry.addName(FCF_Items.drinkMilkBottle, "Milk Bottle");
        LanguageRegistry.addName(FCF_Items.drinkEnergyDrink, "Energy Drink");
        LanguageRegistry.addName(FCF_Items.drinkMilkshake, "Milkshake");
        LanguageRegistry.addName(FCF_Items.drinkCoffee, "Coffee");
        LanguageRegistry.addName(FCF_Items.drinkHotChocolate, "Hot Chocolate");*/
        
        //LanguageRegistry.addName(FCF_Items.broccoliSeed, "Broccoli Seed");
        //LanguageRegistry.addName(FCF_Items.lettuceSeed, "Lettuce Seed");
        //LanguageRegistry.addName(FCF_Items.garlicSeed, "Garlic Seed");
        //LanguageRegistry.addName(FCF_Items.cabbageSeed, "Cabbage Seed");
        //LanguageRegistry.addName(FCF_Items.celerySeed, "Celery Seed");
        //LanguageRegistry.addName(FCF_Items.leekSeed, "Leek Seed");
        LanguageRegistry.addName(FCF_Items.onionSeed, "Onion Seed");
        //LanguageRegistry.addName(FCF_Items.lemonSeed, "Lemon Seed");
        //LanguageRegistry.addName(FCF_Items.limeSeed, "Lime Seed");
        //LanguageRegistry.addName(FCF_Items.orangeSeed, "Orange Seed");
        LanguageRegistry.addName(FCF_Items.riceItem, "Ball of Rice");
        
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 0), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 4), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 8), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 12), "Vending Machine");
    }
    
    public void addRecipes() {
    	
    }
}