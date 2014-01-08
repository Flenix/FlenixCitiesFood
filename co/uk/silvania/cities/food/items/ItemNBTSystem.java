package co.uk.silvania.cities.food.items;

import net.minecraft.item.ItemFood;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemNBTSystem extends ItemFood {
	
	private static int feedValue;
	private static float satValue;
	private int expiryTime;
	private int expiryDate;

	public ItemNBTSystem(int id, float sat, boolean wolf) {
		super(id, feedValue, sat, wolf);
	}
	
	public void readFromNBT(NBTTagCompound nbt) {
		expiryTime = nbt.getInteger("expiryTime");
		expiryDate = nbt.getInteger("expiryDate");
		feedValue = nbt.getInteger("feedValue");
		satValue = nbt.getFloat("satValue");
	}
	
	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("expiryTime", expiryTime);
		nbt.setInteger("expiryDate", expiryDate);
		nbt.setInteger("feedValue", feedValue);
		nbt.setFloat("satValue", satValue);
	}
	
	public void checkExpiryDate(World world) {
		//Need an event listener which checks for new day. Each new day, -1 from expiryDate.
		//Start of the last new day (1 to 0), need to listen to worldtime and trigger event at the matching time.
	}
}
