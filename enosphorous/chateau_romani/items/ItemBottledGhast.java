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
import enosphorous.chateau_romani.common.Items;
import enosphorous.chateau_romani.common.Reference;
import enosphorous.chateau_romani.handlers.EnumDrinkType;
import enosphorous.chateau_romani.handlers.IDrinkType;

public class ItemBottledGhast extends Item implements IDrinkType
{
	
	
    public ItemBottledGhast(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("bottled_ghast");
		this.func_111206_d(Reference.MOD_ID + ":" + this.getUnlocalizedName());

	}
    
    @SideOnly(Side.CLIENT)

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote && par3EntityPlayer.capabilities.isCreativeMode == false)
        {
        	par3EntityPlayer.inventory.setInventorySlotContents(par3EntityPlayer.inventory.getFirstEmptyStack(), new ItemStack(Item.ghastTear));
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

	@Override
	public EnumDrinkType getDrinkType(World world, int x, int y, int z) {
		
		if (this.itemID == Items.bottled_fire.itemID     ) return EnumDrinkType.Harmful;
		if (this.itemID == Items.bottled_ghast.itemID    ) return EnumDrinkType.Inedible;
		if (this.itemID == Items.chateau_romani.itemID   ) return EnumDrinkType.Special;
		if (this.itemID == Items.fermented_grain.itemID  ) return EnumDrinkType.Inedible;
		if (this.itemID == Items.lonlon_milk_full.itemID ) return EnumDrinkType.Milk;
		if (this.itemID == Items.lonlon_milk_half.itemID ) return EnumDrinkType.Milk;
		if (this.itemID == Items.milk_bottle.itemID      ) return EnumDrinkType.Milk;		
		return EnumDrinkType.Special;
	}

	@Override
	public String getOrigin() {
		
		return "0.0.2";
	}

}
