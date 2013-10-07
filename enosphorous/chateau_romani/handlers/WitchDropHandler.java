package enosphorous.chateau_romani.handlers;

import enosphorous.chateau_romani.common.CItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class WitchDropHandler {
	public static double rand;
	
	@ForgeSubscribe
	public void onEntityDrop1(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.3D) { 
					event.entityLiving.dropItem(CItems.fermented_grain.itemID, 2);
				}
			}
		}
	}
	
	@ForgeSubscribe
	public void onEntityDrop2(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.3D) { 
					event.entityLiving.dropItem(CItems.milk_bottle.itemID, 1);
				}
			}
		}
	}
	
	@ForgeSubscribe
	public void onEntityDrop3(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.1D) { 
					event.entityLiving.dropItem(CItems.bottled_fire.itemID, 1);
				}
			}
		}
	}
	
	@ForgeSubscribe
	public void onEntityDrop4(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.03D) { 
					event.entityLiving.dropItem(CItems.bottled_ghast.itemID, 1);
				}
			}
		}
	}
	
	@ForgeSubscribe
	public void onEntityDrop5(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.05D) { 
					event.entityLiving.dropItem(CItems.potion_red.itemID, 1);
				}
			}
		}
	}
	
	@ForgeSubscribe
	public void onEntityDrop6(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.05D) { 
					event.entityLiving.dropItem(CItems.potion_green.itemID, 1);
				}
			}
		}	
	}
	
	@ForgeSubscribe
	public void onEntityDrop7(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.02D) { 
					event.entityLiving.dropItem(CItems.potion_blue.itemID, 1);
				}
			}
		}
	}
}