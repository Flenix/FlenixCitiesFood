package co.uk.silvania.cities.food.items.foods;

import java.util.List;
import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import co.uk.silvania.cities.api.GeneralUtils;
import co.uk.silvania.cities.core.CityConfig;
import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;
import co.uk.silvania.cities.food.util.IFlenixFoods;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodFish extends ItemFood implements IFlenixFoods {
	
	/*
	 * For reference, here is a list of all the "Cooked Types" available.
	 * 
	 * Cooked Type: 
	 * Frozen
	 * Raw
	 * Undercooked
	 * Cooked:
	 * 1 Roasted
	 * 2 Fried
	 * 3 Grilled
	 * 4 Steamed
	 * Burned
	 * 
	 * Fish is odd; Raw and Cooked will both restore more than undercooked, as raw = sushi
	 */
	
	public double feedValue;
	public float satValue;
	private int expiryTime;
	private String meatName;
	private float underCookedLevel;
	private float cookedLevel;
	private float burnedLevel;
	private boolean poisonous;
	private boolean steak;
	private int boneConts;
	private int prefCookType;
	

	public ItemFoodFish(int id, double feed, float sat, boolean wolf, int time, String name, float uc, float c, float b, boolean poison, int bone, boolean steak, int prefCookType) {
		super(id, (int) feed, sat, wolf);
		this.feedValue = feed;
		this.satValue = sat;
		this.expiryTime = time;
		this.meatName = name;
		this.underCookedLevel = uc;
		this.cookedLevel = c;
		this.burnedLevel = b;
		this.poisonous = poison;
		this.boneConts = bone;
		this.steak = steak;
		this.prefCookType = prefCookType;
		this.setMaxStackSize(1);
	}
	
	@Override
	//Control the food; do things like tick it to slowly rot.
    public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean par5) {
		EntityPlayer player = (EntityPlayer) entity;
		if (player.isEating()) {
			if (CityConfig.debugMode) {
				System.out.println("Player eating! Pause all tasks");
			}
		} else {
			if (!world.isRemote) {
				if (item.stackTagCompound == null) {
					item.stackTagCompound = new NBTTagCompound();
					item.stackTagCompound.setInteger("expiryTime", expiryTime);
					item.stackTagCompound.setInteger("livingTime", 0);
					item.stackTagCompound.setDouble("feedValue", feedValue);
					item.stackTagCompound.setInteger("temperature", 21000);
					item.stackTagCompound.setFloat("satValue", satValue);
					item.stackTagCompound.setFloat("cookedValue", 0);
					item.stackTagCompound.setBoolean("burned", false);
					item.stackTagCompound.setBoolean("mouldy", false);
					item.stackTagCompound.setBoolean("steak", steak);
					item.stackTagCompound.setFloat("underCookedLevel", underCookedLevel);
					item.stackTagCompound.setFloat("cookedLevel", cookedLevel);
					item.stackTagCompound.setFloat("burnedLevel", burnedLevel);
					item.stackTagCompound.setInteger("cookedType", 0);
					item.stackTagCompound.setInteger("prefCookType", prefCookType);
					item.stackTagCompound.setInteger("boneContents", boneConts);
				}
				boolean mouldy = item.stackTagCompound.getBoolean("mouldy");
				boolean burned = item.stackTagCompound.getBoolean("burned");
				int expTime = item.stackTagCompound.getInteger("expiryTime");
				int lvTime = item.stackTagCompound.getInteger("livingTime");
				int temp = item.stackTagCompound.getInteger("temperature");
				int roundTemp = Math.round(item.stackTagCompound.getInteger("temperature") / 1000);
				
				if (!mouldy) {
					item.stackTagCompound.setInteger("livingTime", (lvTime + 1));
				}
				if (lvTime >= expTime && !burned) {
					item.stackTagCompound.setBoolean("mouldy", true);
					item.stackTagCompound.setDouble("feedValue", 0);
					item.stackTagCompound.setFloat("satValue", 0);
				}
				
				if ((item.stackTagCompound.getFloat("cookedValue")) >= (item.stackTagCompound.getFloat("cookedLevel")) && !burned) {
					if (roundTemp >= GeneralUtils.getPlayerTemperature(player)) {
						item.stackTagCompound.setInteger("temperature", temp - 1);
					} else if (roundTemp <= GeneralUtils.getPlayerTemperature(player)) {
						item.stackTagCompound.setInteger("temperature", temp + 1);
					}
				}
				if ((item.stackTagCompound.getFloat("cookedValue")) >= (item.stackTagCompound.getFloat("burnedLevel"))) {
					if (!world.isRemote) {
						item.stackTagCompound.setBoolean("burned", true);
						item.stackTagCompound.setDouble("feedValue", 0);
						item.stackTagCompound.setFloat("satValue", 0);
						item.stackTagCompound.setInteger("livingTime", item.stackTagCompound.getInteger("expiryTime"));
					}
				}
				calculateFeedValue(item);
				//Math for calculating how much to restore.
				if (!mouldy && !burned) {
					float c = item.stackTagCompound.getFloat("cookedValue");
					float ucooked = item.stackTagCompound.getFloat("underCookedLevel");
					float cooked = item.stackTagCompound.getFloat("cookedLevel");
					float fBurned = item.stackTagCompound.getFloat("burnedLevel");
					
					if (c < ucooked) { //raw
						item.stackTagCompound.setDouble("feedValue", feedValue);
						item.stackTagCompound.setFloat("satValue", satValue);
					} else if (c < cooked) { //undercooked
						item.stackTagCompound.setDouble("feedValue", feedValue - 1);
						item.stackTagCompound.setFloat("satValue", satValue);
					} else if (c < fBurned) { //cooked
						float fdFloat = (float) feedValue;
						double finalFeed = (int) Math.round((fdFloat + 1) * 2.5);
						float finalSat = satValue * 15;
						item.stackTagCompound.setDouble("feedValue", finalFeed);
						item.stackTagCompound.setFloat("satValue", finalSat);
					} else { //burned
						item.stackTagCompound.setDouble("feedValue", 0);
						item.stackTagCompound.setFloat("satValue", 0);
					}
				}
			}
		}
	}
	
	public double calculateFeedValue(ItemStack item) {
		double feed = item.stackTagCompound.getDouble("feedValue");
		boolean mouldy = item.stackTagCompound.getBoolean("mouldy");
		boolean burned = item.stackTagCompound.getBoolean("burned");
		float cookedValue = item.stackTagCompound.getFloat("cookedValue");
		boolean steak = item.stackTagCompound.getBoolean("steak");
		float ucl = item.stackTagCompound.getFloat("underCookedLevel");
		float cl = item.stackTagCompound.getFloat("cookedLevel");
		float bl = item.stackTagCompound.getFloat("burnedLevel");
		int cookedType = item.stackTagCompound.getInteger("cookedType");
		int cookedPref = item.stackTagCompound.getInteger("prefCookType");
		
		boolean roasted = false;
		boolean fried = false;
		boolean grilled = false;
		boolean steamed = false;
		
        String prefStr = "" + cookedPref;        

        if (prefStr.contains("1")) {
        	roasted = true;
        }
        if (prefStr.contains("2")) {
        	fried = true;
        }
        if (prefStr.contains("3")) {
        	grilled = true;
        }
        if (prefStr.contains("4")) {
        	steamed = true;
        }
		
		if (!mouldy && !burned) {
			if (!steak) {
				if (cookedValue < ucl) { //Raw (Sushi!)
					return feed;
				} else if (cookedValue < cl) { //Undercooked
					return feed - 0.5;
				} else if (cookedValue < bl) { //Cooked
					if (cookedType == 1 && roasted) {
						return feed * 5.2;
					} else if (cookedType == 2 && fried) {
						return feed * 5.5;
					} else if (cookedType == 3 && grilled) {
						return feed * 5.89;
					} else if (cookedType == 4 && steamed) {
						return feed * 6.7;
					}
				}
			} else {
				return feed;
			}
		} else if (burned || mouldy) {
			return 0;
		}
		System.out.println("[FlenixCitiesFood] ERROR: Something went wrong with food value calculations! Setting to 0 to avoid bad bugs!");
		if (CityConfig.debugMode) {
			System.out.println("[FCF] ERROR: Food Calc break at item: " + item + ", cook value: " + cookedValue + ", Feed Value: " + feed);
		}
		return 0;
	}
	
	@Override //If the food is considered unsafe to eat raw, add a poison effect.
	//Also give any bones back that were inside the food.
    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
    	if (this.poisonous) {
    		player.addPotionEffect((new PotionEffect(Potion.poison.getId(), 10, 1)));
    		player.addPotionEffect((new PotionEffect(Potion.confusion.getId(), 10, 1)));
    	}
    	if (item.stackTagCompound.getBoolean("mouldy")) {
    		player.addPotionEffect((new PotionEffect(Potion.poison.getId(), 10, 3)));
    		player.addPotionEffect((new PotionEffect(Potion.confusion.getId(), 10, 3)));
    	}
        --item.stackSize;
        player.getFoodStats().addStats((int) Math.round(item.stackTagCompound.getDouble("feedValue")), item.stackTagCompound.getFloat("satValue"));
        world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(item, world, player);

        int bones = item.stackTagCompound.getInteger("boneContents");
        String boneStr = "" + bones;
        System.out.println("Bones: " + bones + " " + boneStr);

        /*char tinyStr = boneStr.charAt(4);
        char smallStr = boneStr.charAt(3);
        char medStr = boneStr.charAt(2);
        char largeStr = boneStr.charAt(1);
        char hugeStr = boneStr.charAt(0);

        int boneTiny = Character.getNumericValue(tinyStr);
        int boneSmall = Character.getNumericValue(smallStr);
        int boneMed = Character.getNumericValue(medStr);
        int boneLarge = Character.getNumericValue(largeStr);
        int boneHuge = Character.getNumericValue(hugeStr);*/
        
        player.inventory.addItemStackToInventory(new ItemStack(Item.bone.itemID, 1, 0));
        return item;
    }
	
	@Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if (player.canEat(this.alwaysEdible)) {
            player.setItemInUse(item, this.getMaxItemUseDuration(item));
        }
        getItemUseAction(item);
        return item;
    }
	
	//****************************************************************
	//****************************************************************
	//
	//Everything below here is graphical!!! Names, textures and so on.
	//
	//****************************************************************
	//****************************************************************
	//Huge shoutout to PaleoCrafter, Kingrunes and ntzrmtthihu777 on Forge IRC for helping with this one!
	@Override
	public String getItemDisplayName(ItemStack item) {
		String meat = StatCollector.translateToLocal("item." + meatName + ".name");
		String frozen = StatCollector.translateToLocal("item.frozen.name");
		String raw = StatCollector.translateToLocal("item.raw.name");
		String underCooked = StatCollector.translateToLocal("item.undercooked.name");
		String cooked = StatCollector.translateToLocal("item.cooked.name");
		String roasted = StatCollector.translateToLocal("item.roasted.name");
		String fried = StatCollector.translateToLocal("item.fried.name");
		String grilled = StatCollector.translateToLocal("item.grilled.name");
		String steamed = StatCollector.translateToLocal("item.steamed.name");
		String burned = StatCollector.translateToLocal("item.burned.name");
		
		String finalName = "";
		
		if (item.stackTagCompound != null) {
			float c = item.stackTagCompound.getFloat("cookedValue");
			float ucooked = item.stackTagCompound.getFloat("underCookedLevel");
			float cookV = item.stackTagCompound.getFloat("cookedLevel");
			float burnV = item.stackTagCompound.getFloat("burnedLevel");
			boolean steak = item.stackTagCompound.getBoolean("steak");
			int cookedType = item.stackTagCompound.getInteger("cookedType");
			int slicedType = item.stackTagCompound.getInteger("slicedType");
			float cookedTo = (burnV - cookV) / 3;
			
			if (c < 0) {
				finalName = frozen;
			} else if (c < ucooked) {
				finalName = raw;
			} else if (c < cookV) {
				finalName = underCooked;
				
			} else if (c < burnV) {
				if (cookedType == 1) {
					finalName = roasted;
				} else if (cookedType == 2) {
					finalName = fried;
				} else if (cookedType == 3) {
					finalName = grilled;
				} else if (cookedType == 4) {
					finalName = steamed;
				} else
					finalName = cooked;
				}
			} else {
				finalName = burned;
			}
		return finalName + meat;
	}
		
	//Add nutritional info, best before date, and mouldy/burned stats if applicable
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean bool) {
    	if (item.stackTagCompound != null) {
    		int expTime = item.stackTagCompound.getInteger("expiryTime");
    		int livingTime = item.stackTagCompound.getInteger("livingTime");
    		double feed = item.stackTagCompound.getDouble("feedValue");
    		float sat = item.stackTagCompound.getFloat("satValue");
    		boolean burn = item.stackTagCompound.getBoolean("burned");
    		boolean mouldy = item.stackTagCompound.getBoolean("mouldy");
    		
    		int remainingTime = expTime - livingTime;
    		int timeHours = Math.round(remainingTime / 1000);
    		int timeDays = 0;
    		while (timeHours >= 24) {
    			timeDays = timeDays + 1;
    			timeHours = timeHours - 24;
    		}
    		//list.add("expTime: " + expTime + ", livingtime: " + livingTime + ", remainingTime: " + remainingTime);
    		if (remainingTime > 0) {
    			EnumChatFormatting colour = EnumChatFormatting.WHITE;
    			if (remainingTime >= (expiryTime / 4) * 3) {
    				colour = EnumChatFormatting.DARK_GREEN;
    			} else if (remainingTime >= expiryTime / 2) {
    				colour = EnumChatFormatting.GOLD;
    			} else if (remainingTime >= expiryTime / 4) {
    				colour = EnumChatFormatting.RED;
    			}
    			String day = " Days, ";
    			String hour = " Hours.";
    			if (timeDays == 1) {
    				day = " Day, ";
    			}
    			if (timeHours == 1) {
    				hour = " Hour.";
    			}
    			if (timeHours < 1) {
    				hour = " Minutes.";
        			list.add(colour + "Expires In: " + timeDays + day + (timeHours / 60) + hour);
        	    	list.add("");
    			} else
    			list.add(colour + "Expires In: " + timeDays + day + timeHours + hour);
    	    	list.add("");
    		} else
    			if (!burn) {
        			list.add(EnumChatFormatting.DARK_RED + "Expired");
        	    	list.add("");
    			}

	    	list.add("Nutritional Information:");
	    	
	    	EnumChatFormatting fdColour = EnumChatFormatting.WHITE;
	    	if (feed == 1) {
	    		fdColour = EnumChatFormatting.DARK_RED;
	    	} else if (feed == 2) {
	    		fdColour = EnumChatFormatting.RED;
	    	} else if (feed == 3) {
	    		fdColour = EnumChatFormatting.GOLD;
	    	} else if (feed == 4) {
	    		fdColour = EnumChatFormatting.DARK_GREEN;
	    	} else if (feed > 4) {
	    		fdColour = EnumChatFormatting.GREEN;
	    	}
	    	list.add("Fill: " + fdColour + feed);
	    	
	    	EnumChatFormatting stColour = EnumChatFormatting.WHITE;
	    	if (sat <= 0.1) {
	    		stColour = EnumChatFormatting.DARK_RED;
	    	} else if (sat <= 0.2) {
	    		stColour = EnumChatFormatting.RED;
	    	} else if (sat <= 0.3) {
	    		stColour = EnumChatFormatting.GOLD;
	    	} else if (sat <= 0.5) {
	    		stColour = EnumChatFormatting.DARK_GREEN;
	    	} else if (sat > 0.5) {
	    		stColour = EnumChatFormatting.GREEN;
	    	}
	    	list.add("Satiety: " + stColour + item.stackTagCompound.getFloat("satValue"));
	    	if (burn == true) {
	    		list.add("");
	    		list.add(EnumChatFormatting.DARK_GRAY + "Burned");
	    	}
    	}
    }
	
	@SideOnly(Side.CLIENT)
	public Icon iconRaw;
	public Icon iconUnderCooked;
	public Icon iconCooked;
	public Icon iconBurned;
	
	public void registerIcons(IconRegister iconRegister) {
		iconRaw = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "0");
		iconUnderCooked = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "1");
		iconCooked = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "2");
		iconBurned = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "3");
	}
	
	@Override //Required for icon switching
	public boolean requiresMultipleRenderPasses() {
		return true;
	}
	
	//Set the icon based on cooked state
	public Icon getIcon(ItemStack item, int pass) {
		if (item.stackTagCompound != null) {
			float c = item.stackTagCompound.getFloat("cookedValue");
			float ucooked = item.stackTagCompound.getFloat("underCookedLevel");
			float cooked = item.stackTagCompound.getFloat("cookedLevel");
			float burned = item.stackTagCompound.getFloat("burnedLevel");
			if (c < ucooked) {
				return iconRaw;
			} else if (c < cooked) {
				return iconUnderCooked;
			} else if (c < burned) {
				return iconCooked;
			} else
			return iconBurned;
		} else
			return iconRaw;
	}
}
