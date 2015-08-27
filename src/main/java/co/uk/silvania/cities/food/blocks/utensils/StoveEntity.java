package co.uk.silvania.cities.food.blocks.utensils;

import java.util.Random;

import co.uk.silvania.cities.food.items.ItemHobUtensil;
import co.uk.silvania.cities.food.util.IFlenixFoods;
import co.uk.silvania.cities.food.util.IHobUtensil;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.EnumSkyBlock;

public class StoveEntity extends TileEntity implements IInventory {
	
	//TODO Durability
	
	private ItemStack[] items;
	

	public int fuelValue;
	//TODO private int damage;
	//TODO private int maxDamage;
	
	public int grill1Setting = 120;
	public int oven1Setting = 120;
	public int oven2Setting = 120;
	public int hob1Setting = 120;
	public int hob2Setting = 120;
	public int hob3Setting = 120;
	public int hob4Setting = 120;
	
	public int invSize = 29;
	
	
	public StoveEntity() {
		items = new ItemStack[invSize];
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

		nbt.setInteger("fuelValue", fuelValue);
		
		nbt.setInteger("hob1Setting", hob1Setting);
		nbt.setInteger("hob2Setting", hob2Setting);
		nbt.setInteger("hob3Setting", hob3Setting);
		nbt.setInteger("hob4Setting", hob4Setting);
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
		
		this.fuelValue = nbt.getInteger("fuelValue");
		
		this.hob1Setting = nbt.getInteger("hob1Setting");
		this.hob2Setting = nbt.getInteger("hob2Setting");
		this.hob3Setting = nbt.getInteger("hob3Setting");
		this.hob4Setting = nbt.getInteger("hob4Setting");
	}
	
	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("fuelValue", fuelValue);
		
		nbt.setInteger("hob1Setting", hob1Setting);
		nbt.setInteger("hob2Setting", hob2Setting);
		nbt.setInteger("hob3Setting", hob3Setting);
		nbt.setInteger("hob4Setting", hob4Setting);
		
		this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
		markDirty();
		
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, nbt);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		NBTTagCompound nbt = pkt.func_148857_g();
		
		this.fuelValue = nbt.getInteger("fuelValue");
		
		this.hob1Setting = nbt.getInteger("hob1Setting");
		this.hob2Setting = nbt.getInteger("hob2Setting");
		this.hob3Setting = nbt.getInteger("hob3Setting");
		this.hob4Setting = nbt.getInteger("hob4Setting");
		
		this.worldObj.updateLightByType(EnumSkyBlock.Block, this.xCoord, this.yCoord, this.zCoord);
	}
	
	@Override
	public int getSizeInventory() {
		return invSize;
	}
	
	@Override
	public ItemStack getStackInSlot(int slot) {
		return items[slot];
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		items[slot] = stack;

		if (stack != null && stack.stackSize > getInventoryStackLimit()) {
			stack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public ItemStack decrStackSize(int slot, int amount) {
		ItemStack stack = getStackInSlot(slot);

		if (stack != null) {
			if (stack.stackSize <= amount) {
				setInventorySlotContents(slot, null);
			} else {
				stack = stack.splitStack(amount);
				if (stack.stackSize == 0) {
					setInventorySlotContents(slot, null);
				}
			}
		}
		return stack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		ItemStack stack = getStackInSlot(slot);
		if (stack != null) {
			setInventorySlotContents(slot, null);
		}
		return stack;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return worldObj.getTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}
	
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
		//ItemStack grill1 = getStackInSlot(29);
		//ItemStack oven1 = getStackInSlot(30);
		//ItemStack oven2 = getStackInSlot(31);
		
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
			
		if (fuelValue > 0) {
			//Temperature Setting for each section affects cook speed.
			//Hob 1
			if (hob1 != null) {
				if (hob1.getItem() instanceof IHobUtensil) {
					ItemHobUtensil hobUtil = (ItemHobUtensil) hob1.getItem();
					if (hob1.stackTagCompound != null) {
						for (int s = 5; s < 10; s++) {
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
											
											float cookMultiplier = hob1Setting / 100000;
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
			}
			
			//Hob 2
			if (hob2 != null) {
				if (hob2.getItem() instanceof IHobUtensil) {
					ItemHobUtensil hobUtil = (ItemHobUtensil) hob2.getItem();
					if (hob2.stackTagCompound != null) {
						for (int s = 11; s < 16; s++) {
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
											
											float cookMultiplier = hob2Setting / 100000;
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
			}
			
			//Hob 3
			if (hob3 != null) {
				if (hob3.getItem() instanceof IHobUtensil) {
					ItemHobUtensil hobUtil = (ItemHobUtensil) hob3.getItem();
					if (hob3.stackTagCompound != null) {
						for (int s = 17; s < 22; s++) {
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
											
											float cookMultiplier = hob3Setting / 100000;
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
			}
			
			//Hob 4
			if (hob4 != null) {
				if (hob4.getItem() instanceof IHobUtensil) {
					ItemHobUtensil hobUtil = (ItemHobUtensil) hob4.getItem();
					if (hob4.stackTagCompound != null) {
						for (int s = 23; s < 28; s++) {
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
											
											float cookMultiplier = hob4Setting / 100000;
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
			}
			
			
			//Grill 1

			
			//Oven 1
			
			
			//Oven 2
			
			
			
			fuelValue--;
		} else {
			if (hob1 != null) {
				if (hob1.stackTagCompound != null) {
					int hob1Temp = hob1.stackTagCompound.getInteger("temperature");
					if ((hob1Temp / 1000) >= 21) {
						hob1.stackTagCompound.setInteger("temperature", hob1Temp - 10);
					}
				}
			}
			if (hob2 != null) {
				if (hob2.stackTagCompound != null) {
					int hob2Temp = hob2.stackTagCompound.getInteger("temperature");
					if ((hob2Temp / 1000) >= 21) {
						hob2.stackTagCompound.setInteger("temperature", hob2Temp - 10);
					}
				}
			}
			if (hob3 != null) {
				if (hob3.stackTagCompound != null) {
					int hob3Temp = hob3.stackTagCompound.getInteger("temperature");
					if ((hob3Temp / 1000) >= 21) {
						hob3.stackTagCompound.setInteger("temperature", hob3Temp - 10);
					}
				}
			}
			if (hob4 != null) {
				if (hob4.stackTagCompound != null) {
					int hob4Temp = hob4.stackTagCompound.getInteger("temperature");
					if ((hob4Temp / 1000) >= 21) {
						hob4.stackTagCompound.setInteger("temperature", hob4Temp - 10);
					}
				}
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public int getFuelValue() {
		return fuelValue;
	}
	
	@Override
	public String getInventoryName() {
		return "Stove";
	}

	@Override public boolean hasCustomInventoryName() { return true; }
	@Override public void openInventory() {}
	@Override public void closeInventory() {}
}
