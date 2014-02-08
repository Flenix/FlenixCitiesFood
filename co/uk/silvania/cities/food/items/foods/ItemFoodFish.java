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
import net.minecraft.world.World;
import co.uk.silvania.cities.api.GeneralUtils;
import co.uk.silvania.cities.core.CityConfig;
import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodFish extends ItemFood {
	
	public int feedValue;
	public float satValue;
	private int expiryTime;
	private String meatName;
	private float underCookedLevel;
	private float cookedLevel;
	private float burnedLevel;
	private boolean poisonous;
	private int boneSize;
	private int boneQty;
	

	public ItemFoodFish(int id, int feed, float sat, boolean wolf, int time, String name, float uc, float c, float b, int bone, int boneq) {
		super(id, feed, sat, wolf);
		this.feedValue = feed;
		this.satValue = sat;
		this.expiryTime = time;
		this.meatName = name;
		this.underCookedLevel = uc;
		this.cookedLevel = c;
		this.burnedLevel = b;
		this.boneSize = bone;
		this.boneQty = boneq;
	}
	
	@Override
    public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean par5) {
		EntityPlayer player = (EntityPlayer) entity;
		if (!world.isRemote) {
			if (item.stackTagCompound == null) {
				item.stackTagCompound = new NBTTagCompound();
				item.stackTagCompound.setInteger("expiryTime", expiryTime);
				item.stackTagCompound.setInteger("livingTime", 0);
				item.stackTagCompound.setInteger("feedValue", feedValue);
				item.stackTagCompound.setInteger("temperature", 21000);
				item.stackTagCompound.setFloat("satValue", satValue);
				item.stackTagCompound.setFloat("cookedValue", 0);
				item.stackTagCompound.setBoolean("burned", false);
				item.stackTagCompound.setBoolean("mouldy", false);
				item.stackTagCompound.setFloat("underCookedLevel", underCookedLevel);
				item.stackTagCompound.setFloat("cookedLevel", cookedLevel);
				item.stackTagCompound.setFloat("burnedLevel", burnedLevel);
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
				item.stackTagCompound.setInteger("feedValue", 0);
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
					item.stackTagCompound.setInteger("feedValue", 0);
					item.stackTagCompound.setFloat("satValue", 0);
					item.stackTagCompound.setInteger("livingTime", item.stackTagCompound.getInteger("expiryTime"));
				}
			}
			
			if (!mouldy && !burned) {
				float c = item.stackTagCompound.getFloat("cookedValue");
				float ucooked = item.stackTagCompound.getFloat("underCookedLevel");
				float cooked = item.stackTagCompound.getFloat("cookedLevel");
				float fBurned = item.stackTagCompound.getFloat("burnedLevel");
				
				if (c < ucooked) { //raw
					item.stackTagCompound.setInteger("feedValue", feedValue);
					item.stackTagCompound.setFloat("satValue", satValue);
				} else if (c < cooked) { //undercooked
					item.stackTagCompound.setInteger("feedValue", feedValue + 1);
					item.stackTagCompound.setFloat("satValue", satValue);
				} else if (c < fBurned) { //cooked
					float fdFloat = (float) feedValue;
					int finalFeed = (int) Math.round((fdFloat + 1) * 2.5);
					float finalSat = satValue * 15;
					item.stackTagCompound.setInteger("feedValue", finalFeed);
					item.stackTagCompound.setFloat("satValue", finalSat);
				} else //burned
					item.stackTagCompound.setInteger("feedValue", 0);
					item.stackTagCompound.setFloat("satValue", 0);
			}
		}
	}
	
    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
    	if (item.stackTagCompound.getFloat("cookedValue") > item.stackTagCompound.getFloat("underCookedLevel")) {
    		player.addPotionEffect((new PotionEffect(Potion.poison.getId(), 0, 1)));
    		player.addPotionEffect((new PotionEffect(Potion.confusion.getId(), 0, 1)));
    	}
    	if (this.poisonous) {
    		player.addPotionEffect((new PotionEffect(Potion.poison.getId(), 0, 1)));
    		player.addPotionEffect((new PotionEffect(Potion.confusion.getId(), 0, 1)));
    	}
        --item.stackSize;
        player.getFoodStats().addStats(this);
        world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(item, world, player);
        if (boneSize < 0) {
        	if (boneSize == 1) {
        		
        	}
        	if (boneSize == 2) {
        		
        	}
        	if (boneSize == 3) {
        		player.inventory.addItemStackToInventory(new ItemStack(Item.bone.itemID, boneQty, 1));
        	}
        	if (boneSize == 4) {
        		
        	}
        	if (boneSize == 5) {
        		player.inventory.addItemStackToInventory(new ItemStack(Item.bone.itemID, boneQty, 1));
        		//player.inventory.addItemStackToInventory(new ItemStack(Item.bone.itemID, boneQty, 1)); //Medium Bone
        	}
        }
        return item;
    }
	
	//****************************************************************
	//****************************************************************
	//
	//Everything below here is graphical!!! Names, textures and so on.
	//
	//****************************************************************
	//****************************************************************
	
	@Override
	public String getUnlocalizedName(ItemStack item) {
		if (item.stackTagCompound != null) {
			float c = item.stackTagCompound.getFloat("cookedValue");
			float ucooked = item.stackTagCompound.getFloat("underCookedLevel");
			float cooked = item.stackTagCompound.getFloat("cookedLevel");
			float burned = item.stackTagCompound.getFloat("burnedLevel");
			int cookedType = item.stackTagCompound.getInteger("cookedType");
			if (c < 0) {
				return "item.frozen" + meatName;
			} else if (c < ucooked) {
				return "item.raw" + meatName;
			} else if (c < cooked) {
				return "item.underCooked" + meatName;
			} else if (c < burned) {
				if (cookedType == 1) {
					return "item.roasted" + meatName;
				}
				if (cookedType == 2) {
					return "item.fried" + meatName;
				}
				if (cookedType == 3) {
					return "item.grilled" + meatName;
				}
				if (cookedType == 4) {
					return "item.steamed" + meatName;
				}
				return "item.cooked" + meatName;
			} else
				return "item.burned" + meatName;
		} else
			return "item." + meatName;
	}
		
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean bool) {
    	if (item.stackTagCompound != null) {
    		int expTime = item.stackTagCompound.getInteger("expiryTime");
    		int livingTime = item.stackTagCompound.getInteger("livingTime");
    		int feed = item.stackTagCompound.getInteger("feedValue");
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
    			list.add(colour + "Expires In: " + timeDays + " Days, " + timeHours + " Hours.");
    		} else
    			list.add(EnumChatFormatting.DARK_RED + "Expired");
	    	list.add("");
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
	    	list.add("Satiety: " + stColour + sat);
	    	if (burn == true) {
	    		list.add("");
	    		list.add(EnumChatFormatting.DARK_GRAY + "Burned");
	    	}
    	}
    }
	
	@Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		if (!world.isRemote) {
	        if (player.isSneaking()) {
	            System.out.println("Add to cooked value");
	            item.stackTagCompound.setFloat("cookedValue", (item.stackTagCompound.getFloat("cookedValue") + 1));
	        }
		}
        return item;
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
	
	@Override
	public boolean requiresMultipleRenderPasses() {
		return true;
	}
	
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
