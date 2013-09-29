package co.uk.silvania.cities.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import co.uk.silvania.cities.food.blocks.ContainerFridge;
import co.uk.silvania.cities.food.blocks.ContainerFridgeLarge;
import co.uk.silvania.cities.food.blocks.ContainerVendingMachine;
import co.uk.silvania.cities.food.blocks.GuiFridge;
import co.uk.silvania.cities.food.blocks.GuiFridgeLarge;
import co.uk.silvania.cities.food.blocks.GuiVendingMachine;
import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
 

		public GuiHandler() {
		}
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        	switch(id) {
        	case 0: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFridge) {
                        return new ContainerFridge(player.inventory, (TileEntityFridge) tileEntity);
                }	
        	}
        	case 1: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFridgeLarge) {
                        return new ContainerFridgeLarge(player.inventory, (TileEntityFridgeLarge) tileEntity);
                }	
        	}
        	case 2: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityVendingMachine) {
                        return new ContainerVendingMachine(player.inventory, (TileEntityVendingMachine) tileEntity);
                }	
        	}
        }
			return null;	
    }

        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        	switch(id) {
        	case 0: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFridge) {
                        return new GuiFridge(player.inventory, (TileEntityFridge) tileEntity, world, x, y, z);
                }	
        	}        	
        	case 1: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFridgeLarge) {
                        return new GuiFridgeLarge(player.inventory, (TileEntityFridgeLarge) tileEntity, world, x, y, z);
                }	
        	}
        	case 2: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityVendingMachine) {
                        return new GuiVendingMachine(player.inventory, (TileEntityVendingMachine) tileEntity, world, x, y, z);
                }	
        	}
        }
			return null;
    }
}