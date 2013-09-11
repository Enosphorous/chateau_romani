package enosphorous.chateau_romani.handlers;

import enosphorous.chateau_romani.common.Items;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class FireHandler
{
	EntityPlayer player;
	public void onFillBucketEvent(FillBucketEvent event)
	{
	if(event.world.getBlockId(event.target.blockX, event.target.blockY, event.target.blockZ) == Block.dirt.blockID)
	{
	    if (player.getHeldItem().stackSize-- == 1)
	    {
	        player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.bottled_fire));
	    }
	}
	}
}
