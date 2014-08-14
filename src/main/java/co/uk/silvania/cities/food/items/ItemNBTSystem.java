package co.uk.silvania.cities.food.items;

import co.uk.silvania.cities.food.FlenixCities_Food;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemNBTSystem extends ItemFood {
	
	private static int feedValue;
	private static float satValue;
	private int expiryTime;
	private int expiryDate;
	private boolean isBurned;
	private boolean isUnderCooked;
	private String texture = FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().substring(5));
	

	public ItemNBTSystem(int feed, float sat, boolean wolf) {
		super(feedValue, satValue, wolf);
	}
	
	public void readFromNBT(NBTTagCompound nbt) {
		expiryTime = nbt.getInteger("expiryTime");
		expiryDate = nbt.getInteger("expiryDate");
		feedValue = nbt.getInteger("feedValue");
		satValue = nbt.getFloat("satValue");
		isBurned = nbt.getBoolean("isBurned");
		isUnderCooked = nbt.getBoolean("isUnderCooked");
		
		if (isBurned == true) {
			feedValue = 0;
			satValue = 0;
		}
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		if (!world.isRemote) {
	        if (player.isSneaking()) {
	            System.out.println("Burning it!");
	            isBurned = true;
	        } else {
	        	System.out.println("Expiry Time: " + expiryTime);
	        	System.out.println("Expiry Date: " + expiryDate);
	        	System.out.println("Feed Value: " + feedValue);
	        	System.out.println("Saturation Value: " + satValue);
	        	System.out.println("Burned? " + isBurned);
	        	System.out.println("Undercooked? " + isUnderCooked);
			}
		}
        return item;
    }
	
	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("expiryTime", expiryTime);
		nbt.setInteger("expiryDate", expiryDate);
		nbt.setInteger("feedValue", feedValue);
		nbt.setFloat("satValue", satValue);
		nbt.setBoolean("isBurned", isBurned);
		//Only relevant really to meat
		nbt.setBoolean("isUnderCooked", isUnderCooked);
	}
	
	public void checkExpiryDate(World world) {
		//Need an event listener which checks for new day. Each new day, -1 from expiryDate.
		//Start of the last new day (1 to 0), need to listen to worldtime and trigger event at the matching time.
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(texture);
	}
}
