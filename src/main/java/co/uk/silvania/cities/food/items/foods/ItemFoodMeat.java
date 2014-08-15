package co.uk.silvania.cities.food.items.foods;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import co.uk.silvania.cities.api.GeneralUtils;
import co.uk.silvania.cities.core.CityConfig;
import co.uk.silvania.cities.food.FlenixCities_Food;
import co.uk.silvania.cities.food.util.IFlenixFoods;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodMeat extends ItemFood implements IFlenixFoods {
	
	/*
	 * For reference, here is a list of all the "Cooked Types" and "Cut Types" available.
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
	 * Cut Type:
	 * Thick Sliced
	 * Thin Sliced
	 * Diced
	 * Minced
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
	

	public ItemFoodMeat(double feed, float sat, boolean wolf, int time, String name, float uc, float c, float b, boolean poison, int bone, boolean steak, int prefCookType) {
		super((int) feed, sat, wolf);
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
					item.stackTagCompound.setInteger("expiryTime", expiryTime); //Time in ticks until expiration
					item.stackTagCompound.setInteger("livingTime", 0); //How long it has existed for
					item.stackTagCompound.setDouble("feedValue", feedValue); //How much food to replenish. Rounded to an int upon consumption.
					item.stackTagCompound.setInteger("temperature", 21000); //It's current temperature, in celcius x1000
					item.stackTagCompound.setFloat("satValue", satValue); //The saturation value
					item.stackTagCompound.setFloat("cookedValue", 0.01F); //How much it has been cooked
					item.stackTagCompound.setBoolean("burned", false); //Whether it is burnt
					item.stackTagCompound.setBoolean("mouldy", false); //Whether it is mouldy
					item.stackTagCompound.setBoolean("steak", steak); //Whether it is red meat (Affects naming and edibility)
					item.stackTagCompound.setFloat("underCookedLevel", underCookedLevel); //The level it transitions from raw to undercooked
					item.stackTagCompound.setFloat("cookedLevel", cookedLevel); //The level it transitions from undercooked to coooked
					item.stackTagCompound.setFloat("perfectCookedLevel", (cookedLevel + (cookedLevel / 4))); //The level at which the food is "perfectly" cooked, adding X to feed and sat.
					item.stackTagCompound.setFloat("burnedLevel", burnedLevel); //The level it transitions from cooked to burned
					item.stackTagCompound.setInteger("cookedType", 0); //How it was cooked
					item.stackTagCompound.setInteger("prefCookType", prefCookType); //Preferred cooking style (Affects final values)
					item.stackTagCompound.setInteger("boneContents", boneConts); //What bones should be given on consumption
					item.stackTagCompound.setBoolean("hasBeenCooked", false); //Set to true if food's temp is over 100c when it ticks. It will never tick during the cooking stage, only when placed in an inventory.
					item.stackTagCompound.setBoolean("perfect", false); //Perfectly cooked food is hard to get, but gives a bonus.
				}
				boolean mouldy = item.stackTagCompound.getBoolean("mouldy");
				boolean burned = item.stackTagCompound.getBoolean("burned");
				int expTime = item.stackTagCompound.getInteger("expiryTime");
				int lvTime = item.stackTagCompound.getInteger("livingTime");
				int temp = item.stackTagCompound.getInteger("temperature");
				int roundTemp = Math.round(item.stackTagCompound.getInteger("temperature") / 1000);
				
				if (!mouldy) {
					if (temp >= 4000) {
						item.stackTagCompound.setInteger("livingTime", (lvTime + 1));
					}
				}
				if (lvTime >= expTime && !burned) {
					item.stackTagCompound.setBoolean("mouldy", true);
					item.stackTagCompound.setDouble("feedValue", 0);
					item.stackTagCompound.setFloat("satValue", 0);
				}
				
				if (!burned) {
					int playerTemp = ((GeneralUtils.getPlayerTemperature(player) < 5) ? 5 : GeneralUtils.getPlayerTemperature(player));
					int newTemp = (Math.round(temp / 10)) * 10;
					boolean alter = true;
					int low = (playerTemp * 10) - 2;
					int high = (playerTemp * 10) + 2;
					if ((roundTemp * 10) <= high && (roundTemp * 10) >= low) {
						alter = false;
					}
					if (alter) {
						if (roundTemp >= playerTemp) {
							newTemp = temp - 10;
						} else if (roundTemp <= playerTemp) {
							newTemp = temp + 10;
						}
						item.stackTagCompound.setInteger("temperature", newTemp);
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
				
				//Deciding if the food can be cooked again:
				if (!item.stackTagCompound.getBoolean("hasBeenCooked")) {
					if (temp >= 100000) {
						item.stackTagCompound.setBoolean("hasBeenCooked", true);
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
		float temp = (item.stackTagCompound.getInteger("temperature") / 1000);
		float bonus = 0;
		
		float pcl = item.stackTagCompound.getFloat("perfectCookedLevel");
		if (cookedValue >= (pcl - 0.1F) && cookedValue <= (pcl + 0.1F)) {
			item.stackTagCompound.setBoolean("perfect", true);
			bonus = bonus + 2;
		}
		
		if (temp >= 50) {
			bonus = bonus + (temp / 20);
		}
		
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
		
        if (item.stackTagCompound.getBoolean("hasBeenCooked")) {
			if (!mouldy && !burned) {
				if (cookedValue < ucl) { //Raw
					return feed + bonus;
				} else if (cookedValue < cl) { //Undercooked
					double localFeed = 0.25;
					if (steak) {
						localFeed = 3;
					}
					return feed + localFeed + bonus;
				} else if (cookedValue < bl) { //Cooked
					if (cookedType == 1 && roasted) {
						return feed * 5.2 + bonus;
					} else if (cookedType == 1 && !roasted) {
						return feed * 4.2 + bonus;
					} 
					
					else if (cookedType == 2 && fried) {
						return feed * 5.5 + bonus;
					} else if (cookedType == 2 && !fried) {
						return feed * 4.5 + bonus;
					}
					
					else if (cookedType == 3 && grilled) {
						return feed * 5.89 + bonus;
					} else if (cookedType == 3 && !grilled) {
						return feed * 4.89 + bonus;
					}
					
					else if (cookedType == 4 && steamed) {
						return feed * 6.7 + bonus;
					} else if (cookedType == 4 && !steamed) {
						return feed * 5.15 + bonus;
					}
				}
			} else if (burned || mouldy) {
				return 0;
			}
			System.out.println("[FlenixCitiesFood] ERROR: Something went wrong with food value calculations! Setting to raw levels to avoid bad exploits!");
			if (CityConfig.debugMode) {
				System.out.println("[FCF] ERROR: Food Calc break at item: " + item + ", cook value: " + cookedValue + ", Feed Value: " + feed);
			}
        }
		return feed;
	}
	
	@Override //If the food is considered unsafe to eat raw, add a poison effect.
	//Also give any bones back that were inside the food.
    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
		if (item.stackTagCompound.getInteger("temperature") > 150000) {
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "You burned your mouth on the hot food!"));
			player.attackEntityFrom(DamageSource.onFire, 1.0F);
		}
    	if (item.stackTagCompound.getFloat("cookedValue") > item.stackTagCompound.getFloat("underCookedLevel")) {
    		player.addPotionEffect((new PotionEffect(Potion.poison.getId(), 10, 1)));
    		player.addPotionEffect((new PotionEffect(Potion.confusion.getId(), 10, 1)));
    	}
    	if (this.poisonous) {
    		player.addPotionEffect((new PotionEffect(Potion.poison.getId(), 10, 1)));
    		player.addPotionEffect((new PotionEffect(Potion.confusion.getId(), 10, 1)));
    	}
    	if (item.stackTagCompound.getBoolean("mouldy")) {
    		player.addPotionEffect((new PotionEffect(Potion.poison.getId(), 10, 3)));
    		player.addPotionEffect((new PotionEffect(Potion.confusion.getId(), 10, 3)));
    	}
        --item.stackSize;
        player.getFoodStats().addStats((int) Math.round(calculateFeedValue(item)), item.stackTagCompound.getFloat("satValue"));
        world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(item, world, player);

        /*int bones = item.stackTagCompound.getInteger("boneContents");
        String boneStr = "" + bones;

        char tinyStr = boneStr.charAt(4);
        char smallStr = boneStr.charAt(3);
        char medStr = boneStr.charAt(2);
        char largeStr = boneStr.charAt(1);
        char hugeStr = boneStr.charAt(0);

        int boneTiny = Character.getNumericValue(tinyStr);
        int boneSmall = Character.getNumericValue(smallStr);
        int boneMed = Character.getNumericValue(medStr);
        int boneLarge = Character.getNumericValue(largeStr);
        int boneHuge = Character.getNumericValue(hugeStr);*/
        
        player.inventory.addItemStackToInventory(new ItemStack(Items.bone, 1, 0));
        return item;
    }
	
	@Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if (player.canEat(false)) {
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
	public String getItemStackDisplayName(ItemStack item) {
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
			item.stackTagCompound.getBoolean("steak");
			int cookedType = item.stackTagCompound.getInteger("cookedType");
			item.stackTagCompound.getInteger("slicedType");
			
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
			} else
				finalName = burned;
		}
		return finalName + meat;
	}
		
	//Add nutritional info, best before date, and mouldy/burned stats if applicable
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean bool) {
    	if (item.stackTagCompound != null) {
			float c = item.stackTagCompound.getFloat("cookedValue");
			float cookV = item.stackTagCompound.getFloat("cookedLevel");
			float burnV = item.stackTagCompound.getFloat("burnedLevel");
			boolean steak = item.stackTagCompound.getBoolean("steak");
			float cookedTo = (burnV - cookV) / 3;
			
			String rare = StatCollector.translateToLocal("item.rare.name");
			String medium = StatCollector.translateToLocal("item.medium.name");
			String welldone = StatCollector.translateToLocal("item.welldone.name");
    		
			if (steak) {
				if (c <= (cookV + cookedTo)) {
					list.add(rare);
				} else if (c <= (cookV + (cookedTo * 2))) {
					list.add(medium);
				} else if (c <= (cookV + (cookedTo * 3)) && c < burnV) {
					list.add(welldone);
				}
			}
    		
    		int expTime = item.stackTagCompound.getInteger("expiryTime");
    		int livingTime = item.stackTagCompound.getInteger("livingTime");
    		double feed = calculateFeedValue(item);
    		boolean perfect = item.stackTagCompound.getBoolean("perfect");
    		float sat = item.stackTagCompound.getFloat("satValue");
    		boolean burn = item.stackTagCompound.getBoolean("burned");
    		int temp = Math.round(item.stackTagCompound.getInteger("temperature") / 1000);
    		
    		if (perfect) {
    			list.add(EnumChatFormatting.GREEN + "" + EnumChatFormatting.ITALIC + "Perfect");
    		}
    		
    		int remainingTime = expTime - livingTime;
    		int timeHours = Math.round(remainingTime / 1000);
    		int timeDays = 0;
    		while (timeHours >= 24) {
    			timeDays = timeDays + 1;
    			timeHours = timeHours - 24;
    		}
    		//For debug only: list.add("expTime: " + expTime + ", livingtime: " + livingTime + ", remainingTime: " + remainingTime);
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
	    	list.add("Fill: " + fdColour + formatDouble(feed));
	    	
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
	    	
	    	EnumChatFormatting tempColour = EnumChatFormatting.WHITE;
	    	if (temp < 10) {
	    		tempColour = EnumChatFormatting.AQUA;
	    	} else if (temp < 25) {
	    		tempColour = EnumChatFormatting.WHITE;
	    	} else if (temp < 100) {
	    		tempColour = EnumChatFormatting.YELLOW;
	    	} else if (temp < 175) {
	    		tempColour = EnumChatFormatting.RED;
	    	} else if (temp >= 175) {
	    		tempColour = EnumChatFormatting.DARK_RED;
	    	}
	    	list.add("");
	    	list.add(tempColour + "Temperature: " + temp + "C");
    	}
    }
	
	@SideOnly(Side.CLIENT)
	public IIcon iconRaw;
	@SideOnly(Side.CLIENT)
	public IIcon iconUnderCooked;
	@SideOnly(Side.CLIENT)
	public IIcon iconCooked;
	@SideOnly(Side.CLIENT)
	public IIcon iconBurned;
	@SideOnly(Side.CLIENT)
	public IIcon iconMouldy;
	
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		iconRaw = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "0");
		iconUnderCooked = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "1");
		iconCooked = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "2");
		iconBurned = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "3");
		iconMouldy = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)) + "4");
	}
	
	@Override //Required for icon switching
	public boolean requiresMultipleRenderPasses() {
		return true;
	}
	
	//Set the icon based on cooked state
	@Override
	public IIcon getIcon(ItemStack item, int pass) {
		if (item.stackTagCompound != null) {
			float c = item.stackTagCompound.getFloat("cookedValue");
			float ucooked = item.stackTagCompound.getFloat("underCookedLevel");
			float cooked = item.stackTagCompound.getFloat("cookedLevel");
			float burned = item.stackTagCompound.getFloat("burnedLevel");
			if (item.stackTagCompound.getBoolean("mouldy")) {
				return iconMouldy;
			}
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
	
	public static String formatDouble(double d) {
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		nf.setRoundingMode(RoundingMode.HALF_UP);
		String str = nf.format(d);
		str = str.replace(",", "");

		return str;
	}
}
