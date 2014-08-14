package co.uk.silvania.cities.food;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MobDrops {
	public static double rand;
	
	@SubscribeEvent
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
				event.entityLiving.dropItem(Items.leather, (Math.max(0, random - 3)) + 1);
				event.entityLiving.dropItem(FCF_Items.beefBrisket, bool);
				event.entityLiving.dropItem(FCF_Items.beefFlank, bool);
				event.entityLiving.dropItem(FCF_Items.beefLeg, Math.max(0, random - 2));
				event.entityLiving.dropItem(FCF_Items.beefRib, bool);
				event.entityLiving.dropItem(FCF_Items.beefSirloin, bool);
			}
			
			if (event.entityLiving instanceof EntityPig) {
				event.drops.clear();
				event.entityLiving.dropItem(FCF_Items.porkShoulder, bool);
				event.entityLiving.dropItem(FCF_Items.porkRib, bool);
				event.entityLiving.dropItem(FCF_Items.porkLoin, bool);
				event.entityLiving.dropItem(FCF_Items.porkLeg,  Math.max(0, random - 2));
				event.entityLiving.dropItem(FCF_Items.porkBelly, bool);
				event.entityLiving.dropItem(Items.porkchop, bool);
			}
			
			if (event.entityLiving instanceof EntitySheep) {
				if (event.entityLiving.isChild()) {
					event.entityLiving.dropItem(FCF_Items.lambBreast, Math.max(0, random - 3));
					event.entityLiving.dropItem(FCF_Items.lambChop, bool);
					event.entityLiving.dropItem(FCF_Items.lambFlank, bool);
					event.entityLiving.dropItem(FCF_Items.lambLeg, Math.max(0, random - 3));
					event.entityLiving.dropItem(FCF_Items.lambLoin, bool);
					event.entityLiving.dropItem(FCF_Items.lambRack, bool);
					event.entityLiving.dropItem(FCF_Items.lambShank, bool);
					event.entityLiving.dropItem(FCF_Items.lambShoulder, bool);
				} else {
					event.entityLiving.dropItem(FCF_Items.muttonBreast, Math.max(0, random - 2));
					event.entityLiving.dropItem(FCF_Items.muttonFlank, bool);
					event.entityLiving.dropItem(FCF_Items.muttonLeg, Math.max(0, random - 2));
					event.entityLiving.dropItem(FCF_Items.muttonLoin, bool);
					event.entityLiving.dropItem(FCF_Items.muttonRack, bool);
					event.entityLiving.dropItem(FCF_Items.muttonShoulder, bool);
				}
			}
		}
	}
}
