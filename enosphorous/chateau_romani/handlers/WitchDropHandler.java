package enosphorous.chateau_romani.handlers;

import enosphorous.chateau_romani.common.Items;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class WitchDropHandler {
	public static double rand;
	
	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.3D) { 
					event.entityLiving.dropItem(Items.fermented_grain.itemID, 2);
				}
			}
		}
	}
	
	@ForgeSubscribe
	public void onDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) { 
			rand = Math.random();
			if (event.entityLiving instanceof EntityWitch) {
				if (rand < 0.3D) { 
					event.entityLiving.dropItem(Items.milk_bottle.itemID, 1);
				}
			}
		}
	}
}