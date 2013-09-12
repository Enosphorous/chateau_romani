package enosphorous.chateau_romani.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enosphorous.chateau_romani.common.Reference;

public class ItemBottledFire extends Item
{
	
    
    /** The ID of the block the reed will spawn when used from inventory bar. */
    private int spawnID;
	
    public ItemBottledFire(int par1, Block par2Block) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("bottled_fire");
		this.func_111206_d(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		this.setContainerItem(Item.glassBottle);
		this.spawnID = par2Block.blockID;
	}
    
}
