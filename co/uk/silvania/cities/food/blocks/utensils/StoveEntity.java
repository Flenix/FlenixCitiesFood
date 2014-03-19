package co.uk.silvania.cities.food.blocks.utensils;

import co.uk.silvania.cities.food.util.IFlenixFoods;
import co.uk.silvania.cities.food.util.IHobUtensil;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class StoveEntity extends TileEntity implements IInventory {
	
	private ItemStack[] items;
	
	private int temperature;
	private double fuelValue;
	
	public int grill1Setting;
	public int oven1Setting;
	public int oven2Setting;
	public int hob1Setting;
	public int hob2Setting;
	public int hob3Setting;
	public int hob4Setting;
	
	
	public StoveEntity() {
		items = new ItemStack[32];
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		NBTTagList nbtTagList = new NBTTagList();
		for (int i = 0; i < this.items.length; ++i) {
			if (this.items[i] != null) {
				System.out.println("Items Length:" + items.length);
				System.out.println("Writing Item in Slot (Stove)" + i);
				NBTTagCompound compound = new NBTTagCompound();
				nbt.setByte("Slot", (byte)i);
				this.items[i].writeToNBT(compound);
				nbtTagList.appendTag(compound);
			}
		}
		nbt.setTag("Items",  nbtTagList);
		nbt.setInteger("temperature", temperature);
		nbt.setDouble("fuelValue", fuelValue);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		NBTTagList nbtTagList = nbt.getTagList("Items");
		for (int i = 0; i < nbtTagList.tagCount(); i++) {
			NBTTagCompound nbt1 = (NBTTagCompound)nbtTagList.tagAt(i);
			int j = nbt1.getByte("Slot") & 255;
			System.out.println("Reading Item in Slot " + i + "/" + j);
			this.items[i] = ItemStack.loadItemStackFromNBT(nbt1);
		}
		this.temperature = nbt.getInteger("temperature");
		this.fuelValue = nbt.getDouble("fuelValue");
	}
	
	@Override
	public ItemStack getStackInSlot(int i) {
		return items[i];
	}

	@Override
	public int getSizeInventory() {
		return items.length;
	}

	@Override
	public ItemStack decrStackSize(int i, int amount) {
		ItemStack itemStack = getStackInSlot(i);

		if (itemStack != null) {
			if (itemStack.stackSize <= amount) {
				setInventorySlotContents(i, null);
			} else {
				itemStack = itemStack.splitStack(amount);
				onInventoryChanged();
			}
		}
		return itemStack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		ItemStack itemStack = getStackInSlot(i);
		setInventorySlotContents(i, null);
		return itemStack;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemStack) {
		if (isItemValidForSlot(i, itemStack)) {
			items[i] = itemStack;

			if (itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
				itemStack.stackSize = getInventoryStackLimit();
			}

			onInventoryChanged();
		}
	}

	@Override
	public String getInvName() {
		return null;
	}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
	}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}

	/*@Override
	public boolean isItemValidForSlot(int i, ItemStack item) {
		if (i == 0) {
			return GameRegistry.getFuelValue(item) > 0; //Check if it's a consumable fuel
		} else if (i >= 8 && i <= 13) {
			return getStackInSlot(1).getItem() instanceof IHobUtensil; //For the 6 slots for hob 1, check if there's a usable utensil ON hob 1
		} else if (i >= 14 && i <= 19) {
			return getStackInSlot(2).getItem() instanceof IHobUtensil; //You can't just cook directly on the flame!
		} else if (i >= 20 && i <= 25) {
			return getStackInSlot(3).getItem() instanceof IHobUtensil;
		} else if (i >= 26 && i <= 31) {
			return getStackInSlot(4).getItem() instanceof IHobUtensil;
		}
		return item.getItem() instanceof IFlenixFoods;
	}*/
	
	@Override
	public boolean isItemValidForSlot(int i, ItemStack item) {
		return true;
	}
	
	@Override
	public void updateEntity() {
		ItemStack fuel = getStackInSlot(0);
		ItemStack hob1 = getStackInSlot(1);
		ItemStack hob2 = getStackInSlot(2);
		ItemStack hob3 = getStackInSlot(3);
		ItemStack hob4 = getStackInSlot(4);
		ItemStack grill1 = getStackInSlot(5);
		ItemStack oven1 = getStackInSlot(6);
		ItemStack oven2 = getStackInSlot(7);
		int fuelVal = GameRegistry.getFuelValue(fuel);
		if (fuelValue > 0) {
			//Temperature Setting for each section affects cook speed.
			//Grill 1
			if (grill1 != null) {
				if (temperature >= grill1Setting) {
					if (grill1.getItem() instanceof IFlenixFoods) {
						grill1.stackTagCompound.setInteger("cookedStyle", 3);
						float localCV = 0.0F;
						float cookedValue = grill1.stackTagCompound.getFloat("cookedValue");
						float maxCV = grill1.stackTagCompound.getFloat("burnedLevel");
						int foodTemp = grill1.stackTagCompound.getInteger("temperature");
						if (foodTemp >= temperature) {
							
						} else {
							grill1.stackTagCompound.setInteger("temperature", foodTemp + 1);
						}
						if (cookedValue <= maxCV) {
							float cookMultiplier = temperature / 100000;
							fuelValue = fuelValue - (cookMultiplier * 100);
							grill1.stackTagCompound.setFloat("cookedValue", cookedValue + cookMultiplier);
						}
					}
				} else {
					temperature++;
				}
			}
		}
	}
}
