package enosphorous.chateau_romani.handlers;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import enosphorous.chateau_romani.common.Items;

public class FireHandler
{
    @ForgeSubscribe
    public void onPlayerInteract(PlayerInteractEvent event)
    {
EntityPlayer player = event.entityPlayer;
InventoryPlayer inv = player.inventory;
if(player.worldObj.getBlockId(event.x, event.y + 1, event.z) == Block.fire.blockID && inv.getCurrentItem() !=null && inv.getCurrentItem().itemID == Item.glassBottle.itemID)
{
	player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.bottled_fire));
	player.worldObj.setBlockToAir(event.x, event.y + 1, event.z);
}
    }
}
