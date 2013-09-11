package enosphorous.chateau_romani.handlers;

import enosphorous.chateau_romani.common.Items;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

public class GhastHandler
{
@ForgeSubscribe
public void onEntityInteract(EntityInteractEvent event)
{
if (event.entity instanceof EntityPlayer)
{
EntityPlayer player = (EntityPlayer) event.entity;
if (event.target != null && event.target instanceof EntityGhast && player.getHeldItem() != null && player.getHeldItem().itemID == Item.glassBottle.itemID)
{
    if (player.getHeldItem().stackSize-- == 1)
    {
        player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.bottled_ghast));
        event.target.attackEntityFrom(DamageSource.generic, 8000F);
        event.target.setInvisible(true);

    }
}
}
}
}
