package co.uk.silvania.cities.food;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MobDrops {
	public static double rand;
	
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		rand = Math.random();
		//Value between 0 and 5. Negate off it directly in the code to restrict (eg -2 will be 0-3)
		int random = (int) ((Math.round(rand * 10)) / 2);
		if (random < 0) {
			random = 0;
		}
		
		//Everything must only drop 1 or 0 due to stack size limits.
		
		if (event.entityLiving instanceof EntityChicken) {
			event.drops.clear();
			event.entityLiving.dropItem(Items.feather, (Math.max(0, random - 3)) + 1);
			event.entityLiving.dropItem(FCF_Items.chickenBreast, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.chickenBreast, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.chickenWing, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.chickenWing, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.chickenLeg, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.chickenLeg, (int) (Math.round(Math.random())));
		}
		
		if (event.entityLiving instanceof EntityCow) {
			event.drops.clear();
			event.entityLiving.dropItem(Items.leather, (Math.max(0, random - 3)) + 1);
			event.entityLiving.dropItem(FCF_Items.beefBrisket, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.beefFlank, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.beefLeg, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.beefLeg, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.beefLeg, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.beefRib, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.beefSirloin, (int) (Math.round(Math.random())));
		}
		
		if (event.entityLiving instanceof EntityPig) {
			event.drops.clear();
			event.entityLiving.dropItem(FCF_Items.porkShoulder, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.porkRib, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.porkLoin, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.porkLeg,  (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.porkLeg,  (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.porkLeg,  (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.porkBelly, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(Items.porkchop, (int) (Math.round(Math.random())));
		}
		
		if (event.entityLiving instanceof EntitySheep) {
			//if (event.entityLiving.isChild()) {
				event.entityLiving.dropItem(FCF_Items.lambBreast, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambBreast, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambChop, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambFlank, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambLeg, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambLeg, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambLeg, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambLoin, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambRack, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambShank, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.lambShoulder, (int) (Math.round(Math.random())));
			/*} else {
				event.entityLiving.dropItem(FCF_Items.muttonBreast, Math.max(0, Math.random()om - 2)));
				event.entityLiving.dropItem(FCF_Items.muttonFlank, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.muttonLeg, Math.max(0, Math.random()om - 2)));
				event.entityLiving.dropItem(FCF_Items.muttonLoin, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.muttonRack, (int) (Math.round(Math.random())));
				event.entityLiving.dropItem(FCF_Items.muttonShoulder, (int) (Math.round(Math.random())));*/
			}
	
		if (event.entityLiving instanceof EntityHorse) {
			event.entityLiving.dropItem(FCF_Items.horseRib, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.horseRump, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.horseShank, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.horseShoulder, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.horseShoulder, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.horseSirloin, (int) (Math.round(Math.random())));
			event.entityLiving.dropItem(FCF_Items.horseSirloin, (int) (Math.round(Math.random())));
		}
	}
}