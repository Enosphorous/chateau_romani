package enosphorous.chateau_romani.items;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;
import enosphorous.chateau_romani.handlers.EnumDrinkType;
import enosphorous.chateau_romani.handlers.ICategorization;

public class ItemBluePotion extends Item implements ICategorization
{

	
    public ItemBluePotion(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setMaxStackSize(2);
		this.setUnlocalizedName("blue_potion");
		this.setTextureName(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		
		if (this.isBottled()){
			
			this.setContainerItem(Item.glassBottle);
			
		}

	}
    
    @SideOnly(Side.CLIENT)

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.uncommon;
    }

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote && par3EntityPlayer.capabilities.isCreativeMode == false)
        {
        	par3EntityPlayer.getFoodStats().setFoodLevel(20);
        	par3EntityPlayer.getFoodStats().setFoodSaturationLevel(5F);
        	par3EntityPlayer.heal(5F);
        }

        return par1ItemStack.stackSize <= 0 ? new ItemStack(Item.glassBottle) : par1ItemStack;
    }
	
	 /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
    /**
     * Gets the drink's type, called from EnumDrinkType.
     */
	@Override
	public EnumDrinkType getDrinkType(World world, int x, int y, int z) {
		
		return EnumDrinkType.Potion;
	}

	/**
	 * Gets the first version of Chateau Romani this item was implemented in.
	 */
	@Override
	public String getOrigin() {
		return "0.0.3";
	}
	
	/**
	 * Is the item in a bottle? This sets the container item to Item.glassBottle.
	 */
	@Override
	public boolean isBottled() {
		
		return true;
	}

}
