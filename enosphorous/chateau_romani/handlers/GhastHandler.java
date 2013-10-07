package enosphorous.chateau_romani.handlers;

import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import enosphorous.chateau_romani.common.CItems;

public class GhastHandler
{
	
	public static float damagestrength = 1000F;
	
@ForgeSubscribe
public void onEntityInteract(EntityInteractEvent event)
{
if (event.entity instanceof EntityPlayer)
{
EntityPlayer player = (EntityPlayer) event.entity;
if (event.target != null && event.target instanceof EntityGhast && player.getHeldItem() != null && player.getHeldItem().itemID == Item.glassBottle.itemID)
{
	    if (player.capabilities.isCreativeMode == false){
            player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(CItems.bottled_ghast));	    
            event.target.playSound("mob.ghast.death", 1F, 1F);
            event.target.attackEntityFrom(DamageSource.generic, damagestrength);
	        player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(CItems.bottled_ghast));
		    }
}
}
}

@ForgeSubscribe
public void onEntityInteract(LivingDropsEvent event){
	
	if (event.entity !=null && event.entity instanceof EntityGhast && event.source.getEntity() instanceof EntityPlayer && event.recentlyHit == true){
		
		event.setCanceled(true);
		
	}
	
}

}
