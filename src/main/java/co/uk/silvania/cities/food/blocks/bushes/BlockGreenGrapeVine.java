package co.uk.silvania.cities.food.blocks.bushes;

import java.util.Random;

import co.uk.silvania.cities.food.FCF_Items;
import co.uk.silvania.cities.food.FlenixCities_Food;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockGreenGrapeVine extends BlockGrapeVine {

	public BlockGreenGrapeVine() {
		super();
		this.setTickRandomly(true);
		this.setCreativeTab(FlenixCities_Food.tabCityFood);
	}

	@Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote && world.rand.nextInt(4) == 0) {
        	int meta = world.getBlockMetadata(x, y, z);
        	System.out.println("Tick! (Green Vine) Meta:" + meta);
        }
    }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        int meta = world.getBlockMetadata(x, y, z);
        if (meta == 15) {
        	System.out.println("Enjoy your grapes!");
        	player.inventory.addItemStackToInventory(new ItemStack(FCF_Items.grapesItem, 1));
        	world.setBlockMetadataWithNotify(x, y, z, 8, 3);
        }
		return false;
    }
}
