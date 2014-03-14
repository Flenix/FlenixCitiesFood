package co.uk.silvania.cities.food;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class MobDrops {
	public static double rand;
	
	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			//Either 0 or 1, effectively an integer boolean.
			int bool = (int) (Math.round(rand));
			//Value between 0 and 5. Negate off it directly in the code to restrict (eg -2 will be 0-3)
			int random = (int) ((Math.round(rand * 10)) / 2);
			if (random < 0) {
				random = 0;
			}
			
			if (event.entityLiving instanceof EntityCow) {
				event.drops.clear();
				event.entityLiving.dropItem(Item.leather.itemID, (Math.max(0, random - 3)) + 1);
				event.entityLiving.dropItem(FCF_Items.beefBrisket.itemID, bool);
				event.entityLiving.dropItem(FCF_Items.beefFlank.itemID, bool);
				event.entityLiving.dropItem(FCF_Items.beefLeg.itemID, Math.max(0, random - 2));
				event.entityLiving.dropItem(FCF_Items.beefRib.itemID, bool);
				event.entityLiving.dropItem(FCF_Items.beefSirloin.itemID, bool);
			}
			
			if (event.entityLiving instanceof EntityPig) {
				event.drops.clear();
				event.entityLiving.dropItem(FCF_Items.porkShoulder.itemID, bool);
				event.entityLiving.dropItem(FCF_Items.porkRib.itemID, bool);
				event.entityLiving.dropItem(FCF_Items.porkLoin.itemID, bool);
				event.entityLiving.dropItem(FCF_Items.porkLeg.itemID,  Math.max(0, random - 2));
				event.entityLiving.dropItem(FCF_Items.porkBelly.itemID, bool);
				event.entityLiving.dropItem(Item.porkRaw.itemID, bool);
			}
			
			if (event.entityLiving instanceof EntitySheep) {
				if (event.entityLiving.isChild()) {
					event.entityLiving.dropItem(FCF_Items.lambBreast.itemID, Math.max(0, random - 3));
					event.entityLiving.dropItem(FCF_Items.lambChop.itemID, bool);
					event.entityLiving.dropItem(FCF_Items.lambFlank.itemID, bool);
					event.entityLiving.dropItem(FCF_Items.lambLeg.itemID, Math.max(0, random - 3));
					event.entityLiving.dropItem(FCF_Items.lambLoin.itemID, bool);
					event.entityLiving.dropItem(FCF_Items.lambRack.itemID, bool);
					event.entityLiving.dropItem(FCF_Items.lambShank.itemID, bool);
					event.entityLiving.dropItem(FCF_Items.lambShoulder.itemID, bool);
				} else {
					event.entityLiving.dropItem(FCF_Items.muttonBreast.itemID, Math.max(0, random - 2));
					event.entityLiving.dropItem(FCF_Items.muttonFlank.itemID, bool);
					event.entityLiving.dropItem(FCF_Items.muttonLeg.itemID, Math.max(0, random - 2));
					event.entityLiving.dropItem(FCF_Items.muttonLoin.itemID, bool);
					event.entityLiving.dropItem(FCF_Items.muttonRack.itemID, bool);
					event.entityLiving.dropItem(FCF_Items.muttonShoulder.itemID, bool);
				}
			}
		}
	}
}
