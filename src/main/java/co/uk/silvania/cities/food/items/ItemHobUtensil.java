package co.uk.silvania.cities.food.items;

import java.util.List;

import co.uk.silvania.cities.food.FlenixCities_Food;
import co.uk.silvania.cities.food.util.IHobUtensil;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemHobUtensil extends Item implements IHobUtensil {
	
	int cookType;

	public ItemHobUtensil(int cookType) {
		super();
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
		this.cookType = cookType;
		this.setMaxStackSize(1);
	}
	
	@Override
    public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean par5) {
		if (!world.isRemote) {
			if (item.stackTagCompound == null) {
				item.stackTagCompound = new NBTTagCompound();
				item.stackTagCompound.setInteger("temperature", 21000); //Time in ticks until expiration
			}
			
			int temp = item.stackTagCompound.getInteger("temperature");
			if (temp > 21000) {
				item.stackTagCompound.setInteger("temperature", temp - 10);
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_Food.modid + ":" + (this.getUnlocalizedName().toLowerCase().substring(5)));
	}

	@Override
	public int cookType() {
		return cookType;
	}
	
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean bool) {
    	if (item.stackTagCompound != null) {
    		int temp = Math.round(item.stackTagCompound.getInteger("temperature") / 1000);
    		
	    	EnumChatFormatting tempColour = EnumChatFormatting.WHITE;
	    	if (temp < 100) {
	    		tempColour = EnumChatFormatting.YELLOW;
	    	} else if (temp < 175) {
	    		tempColour = EnumChatFormatting.RED;
	    	} else if (temp >= 175) {
	    		tempColour = EnumChatFormatting.DARK_RED;
	    	}
	    	if (temp > 25) {
		    	list.add("");
		    	list.add(tempColour + "Temperature: " + temp + "C");
	    	}
    	}
    }

}
