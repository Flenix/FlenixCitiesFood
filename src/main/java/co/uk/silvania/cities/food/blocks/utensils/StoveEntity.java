package co.uk.silvania.cities.food.blocks.utensils;

import co.uk.silvania.cities.food.items.ItemHobUtensil;
import co.uk.silvania.cities.food.util.IFlenixFoods;
import co.uk.silvania.cities.food.util.IHobUtensil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class StoveEntity extends TileEntity implements IInventory {
	
	//TODO Durability
	
	private ItemStack[] items;
	
	private int temperature;
	private int fuelValue;
	//TODO private int damage;
	//TODO private int maxDamage;
	
	public int grill1Setting = 120;
	public int oven1Setting = 120;
	public int oven2Setting = 120;
	public int hob1Setting = 120;
	public int hob2Setting = 120;
	public int hob3Setting = 120;
	public int hob4Setting = 120;
	
	
	public StoveEntity() {
		items = new ItemStack[58];
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		NBTTagList tags = new NBTTagList();
		
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i] != null) {
				NBTTagCompound nbt2 = new NBTTagCompound();
				nbt2.setByte("Slot", (byte)i);
				this.items[i].writeToNBT(nbt2);
				tags.appendTag(nbt2);
			}
		}
		
		nbt.setTag("Items", tags);

		nbt.setInteger("temperature", temperature);
		nbt.setInteger("fuelValue", fuelValue);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		NBTTagList tags = nbt.getTagList("Items", 10);
		this.items = new ItemStack[this.getSizeInventory()];
		
		for (int i = 0; i < tags.tagCount(); i++) {
			NBTTagCompound nbt2 = (NBTTagCompound) tags.getCompoundTagAt(i);
			int j = nbt2.getByte("Slot") & 255;
			
			if (j >= 0 && j < this.items.length) {
				this.items[j] = ItemStack.loadItemStackFromNBT(nbt2);
			}
		}
		
		this.temperature = nbt.getInteger("temperature");
		this.fuelValue = nbt.getInteger("fuelValue");
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
		}
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
	public boolean isItemValidForSlot(int i, ItemStack item) {
		return true;
	}
	
	@Override
	public void updateEntity() {
		ItemStack fuel = getStackInSlot(0);
		ItemStack hob1 = getStackInSlot(4);
		ItemStack hob2 = getStackInSlot(5);
		ItemStack hob3 = getStackInSlot(6);
		ItemStack hob4 = getStackInSlot(7);
		ItemStack grill1 = getStackInSlot(5);
		ItemStack oven1 = getStackInSlot(6);
		ItemStack oven2 = getStackInSlot(7);

		if (!worldObj.isRemote) {
			if (fuel != null) {
				if (fuelValue <= (40000 - TileEntityFurnace.getItemBurnTime(fuel))) {
					fuelValue = fuelValue + TileEntityFurnace.getItemBurnTime(fuel);
					if (fuel.stackSize > 1) {
						this.setInventorySlotContents(0, new ItemStack(fuel.getItem(), fuel.stackSize - 1, fuel.getItemDamage()));
					} else {
						this.setInventorySlotContents(0, null);
					}
				}
			}
			System.out.println("Fuel value: " + fuelValue);
			
			if (fuelValue > 0) {
				//Temperature Setting for each section affects cook speed.
				//Hob 1
				if (hob1 != null && hob1.getItem() instanceof IHobUtensil) {
					ItemHobUtensil hobUtil = (ItemHobUtensil) hob1.getItem();
					if (hob1.stackTagCompound != null) {
						for (int s = 8; s < 13; s++) {
							ItemStack food = getStackInSlot(s);
							int utensilTemp = hob1.stackTagCompound.getInteger("temperature");
							
							if ((utensilTemp / 1000) >= hob1Setting) {
							
								if (food != null) {
									if (food.getItem() instanceof IFlenixFoods) {
										int temp = food.stackTagCompound.getInteger("temperature");
										
										
										if (temp < utensilTemp) {
											food.stackTagCompound.setInteger("temperature", temp + 1000);
										}
										if (temp > utensilTemp) {
											food.stackTagCompound.setInteger("temperature", utensilTemp);
										}
										
										if ((temp / 1000) >= hob1Setting) {
											food.stackTagCompound.setInteger("cookedType", hobUtil.cookType());
											float cookedValue = food.stackTagCompound.getFloat("cookedValue");
											
											float cookMultiplier = temperature / 100000;
											fuelValue = Math.round(fuelValue - (cookMultiplier * 100));
											food.stackTagCompound.setFloat("cookedValue", cookedValue + 0.01F + cookMultiplier);
										} 
									}
								}
							} else {
									hob1.stackTagCompound.setInteger("temperature", utensilTemp + 100);
							}
						}
					}
				}
				
				//Hob 2
				if (hob2 != null && hob2.getItem() instanceof IHobUtensil) {
					ItemHobUtensil hobUtil = (ItemHobUtensil) hob2.getItem();
					if (hob2.stackTagCompound != null) {
						for (int s = 8; s < 13; s++) {
							ItemStack food = getStackInSlot(s);
							int utensilTemp = hob2.stackTagCompound.getInteger("temperature");
							
							if ((utensilTemp / 1000) >= hob2Setting) {
							
								if (food != null) {
									if (food.getItem() instanceof IFlenixFoods) {
										int temp = food.stackTagCompound.getInteger("temperature");
										
										
										if (temp < utensilTemp) {
											food.stackTagCompound.setInteger("temperature", temp + 1000);
										}
										if (temp > utensilTemp) {
											food.stackTagCompound.setInteger("temperature", utensilTemp);
										}
										
										if ((temp / 1000) >= hob2Setting) {
											food.stackTagCompound.setInteger("cookedType", hobUtil.cookType());
											float cookedValue = food.stackTagCompound.getFloat("cookedValue");
											
											float cookMultiplier = temperature / 100000;
											fuelValue = Math.round(fuelValue - (cookMultiplier * 100));
											food.stackTagCompound.setFloat("cookedValue", cookedValue + 0.01F + cookMultiplier);
										} 
									}
								}
							} else {
									hob2.stackTagCompound.setInteger("temperature", utensilTemp + 100);
							}
						}
					}
				}
				
				//Hob 3
				if (hob3 != null && hob3.getItem() instanceof IHobUtensil) {
					ItemHobUtensil hobUtil = (ItemHobUtensil) hob3.getItem();
					if (hob3.stackTagCompound != null) {
						for (int s = 8; s < 13; s++) {
							ItemStack food = getStackInSlot(s);
							int utensilTemp = hob3.stackTagCompound.getInteger("temperature");
							
							if ((utensilTemp / 1000) >= hob3Setting) {
							
								if (food != null) {
									if (food.getItem() instanceof IFlenixFoods) {
										int temp = food.stackTagCompound.getInteger("temperature");
										
										
										if (temp < utensilTemp) {
											food.stackTagCompound.setInteger("temperature", temp + 1000);
										}
										if (temp > utensilTemp) {
											food.stackTagCompound.setInteger("temperature", utensilTemp);
										}
										
										if ((temp / 1000) >= hob3Setting) {
											food.stackTagCompound.setInteger("cookedType", hobUtil.cookType());
											float cookedValue = food.stackTagCompound.getFloat("cookedValue");
											
											float cookMultiplier = temperature / 100000;
											fuelValue = Math.round(fuelValue - (cookMultiplier * 100));
											food.stackTagCompound.setFloat("cookedValue", cookedValue + 0.01F + cookMultiplier);
										} 
									}
								}
							} else {
									hob3.stackTagCompound.setInteger("temperature", utensilTemp + 100);
							}
						}
					}
				}
				
				//Hob 4
				if (hob4 != null && hob4.getItem() instanceof IHobUtensil) {
					ItemHobUtensil hobUtil = (ItemHobUtensil) hob4.getItem();
					if (hob4.stackTagCompound != null) {
						for (int s = 8; s < 13; s++) {
							ItemStack food = getStackInSlot(s);
							int utensilTemp = hob4.stackTagCompound.getInteger("temperature");
							
							if ((utensilTemp / 1000) >= hob4Setting) {
							
								if (food != null) {
									if (food.getItem() instanceof IFlenixFoods) {
										int temp = food.stackTagCompound.getInteger("temperature");
										
										
										if (temp < utensilTemp) {
											food.stackTagCompound.setInteger("temperature", temp + 1000);
										}
										if (temp > utensilTemp) {
											food.stackTagCompound.setInteger("temperature", utensilTemp);
										}
										
										if ((temp / 1000) >= hob4Setting) {
											food.stackTagCompound.setInteger("cookedType", hobUtil.cookType());
											float cookedValue = food.stackTagCompound.getFloat("cookedValue");
											
											float cookMultiplier = temperature / 100000;
											fuelValue = Math.round(fuelValue - (cookMultiplier * 100));
											food.stackTagCompound.setFloat("cookedValue", cookedValue + 0.01F + cookMultiplier);
										} 
									}
								}
							} else {
									hob4.stackTagCompound.setInteger("temperature", utensilTemp + 100);
							}
						}
					}
				}
				
				
				//Grill 1

				
				//Oven 1
				
				
				//Oven 2
				
				
				
				fuelValue--;
			}
		}
	}
	
	
	public void sentInfoToClient(int hob1, int hob2, int hob3, int hob4, int grill1, int oven1, int oven2) {
		
	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}
}
