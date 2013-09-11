package enosphorous.chateau_romani.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
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
	
	
    public ItemBottledFire(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("bottled_fire");
		this.func_111206_d(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		this.setContainerItem(Item.glassBottle);
	}
    
    @SideOnly(Side.CLIENT)

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }
}
