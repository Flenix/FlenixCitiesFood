package co.uk.silvania.cities.food.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodMeat extends ItemFood {
	
	public int feedValue;
	public float satValue;
	private int expiryTime;
	private String meatName;
	public static String status = "Raw";
	private float underCookedLevel;
	private float cookedLevel;
	private float burnedLevel;
	

	public ItemFoodMeat(int id, int feed, float sat, boolean wolf, int time, String name, float uc, float c, float b) {
		super(id, feed, sat, wolf);
		this.feedValue = feed;
		this.satValue = sat;
		this.expiryTime = time;
		this.meatName = name;
		this.underCookedLevel = uc;
		this.cookedLevel = c;
		this.burnedLevel = b;
	}
	
	@Override
    public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean par5) {
		if (!world.isRemote) {
			if (item.stackTagCompound == null) {
				item.stackTagCompound = new NBTTagCompound();
				item.stackTagCompound.setInteger("expiryTime", expiryTime);
				item.stackTagCompound.setInteger("livingTime", 0);
				item.stackTagCompound.setInteger("feedValue", feedValue);
				item.stackTagCompound.setInteger("temperature", 21);
				item.stackTagCompound.setFloat("satValue", satValue);
				item.stackTagCompound.setFloat("cookedValue", 0);
				item.stackTagCompound.setBoolean("burned", false);
				item.stackTagCompound.setBoolean("mouldy", false);
				item.stackTagCompound.setFloat("underCookedLevel", underCookedLevel);
				item.stackTagCompound.setFloat("cookedLevel", cookedLevel);
				item.stackTagCompound.setFloat("burnedLevel", burnedLevel);
			}
			if (item.stackTagCompound.getBoolean("mouldy") == false) {
				item.stackTagCompound.setInteger("livingTime", (item.stackTagCompound.getInteger("livingTime") + 1));
			}
			if ((item.stackTagCompound.getInteger("livingTime")) >= expiryTime) {
				item.stackTagCompound.setBoolean("mouldy", true);
			}
			boolean burnStatus = item.stackTagCompound.getBoolean("burned");
			if ((item.stackTagCompound.getFloat("cookedValue")) >= (item.stackTagCompound.getFloat("cookedLevel")) && ((item.stackTagCompound.getBoolean("burned")) == false)) {
				int temperatureCounter = 0;
			}
			if ((item.stackTagCompound.getFloat("cookedValue")) >= (item.stackTagCompound.getFloat("burnedLevel"))) {
				if (!world.isRemote) {
					item.stackTagCompound.setBoolean("burned", true);
					item.stackTagCompound.setInteger("feedValue", 0);
					item.stackTagCompound.setFloat("satValue", 0);
				}
			}
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item) {
		if (item.stackTagCompound != null) {
			float c = item.stackTagCompound.getFloat("cookedValue");
			float ucooked = item.stackTagCompound.getFloat("underCookedLevel");
			float cooked = item.stackTagCompound.getFloat("cookedLevel");
			float burned = item.stackTagCompound.getFloat("burnedLevel");
			if (c < ucooked) {
				return "item.raw";
			} else if (c < cooked) {
				return "item.underCooked" + meatName;
			} else if (c < burned) {
				return "item.cooked" + meatName;
			} else
				return ("item.burned") + (meatName);
		} else
			return "item.raw" + meatName;
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
    		list.add("expTime: " + expTime + ", livingtime: " + livingTime + ", remainingTime: " + remainingTime);
    		if (remainingTime > 0) {
    			list.add("Expires In: " + timeDays + " Days, " + timeHours + " Hours.");
    		} else
    			list.add("Expired");
	    	list.add("");
	    	list.add("Nutritional Information:");
	    	list.add("Fill: " + feed);
	    	list.add("Satiety: " + sat);
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
	        } else {
	        	System.out.println("Expiry Time: " + item.stackTagCompound.getInteger("expiryTime"));
	        	System.out.println("Expiry Date: " + item.stackTagCompound.getInteger("expiryDate"));
	        	System.out.println("Feed Value: " + item.stackTagCompound.getInteger("feedValue"));
	        	System.out.println("Saturation Value: " + item.stackTagCompound.getFloat("satValue"));
	        	System.out.println("Cooked Value: " + item.stackTagCompound.getFloat("cookedValue"));
	        	System.out.println("Burned? " + item.stackTagCompound.getBoolean("burned"));
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
