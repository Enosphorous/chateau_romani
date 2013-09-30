package enosphorous.chateau_romani.items;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityCreeper;
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
import enosphorous.chateau_romani.handlers.ICategorization;

public class ItemLonLonMilk extends Item implements ICategorization
{

/**
 * Values
 */
	public static String variant;
	
	
    public ItemLonLonMilk(int par1, String par2) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setMaxStackSize(1);
		this.variant = par2;
		this.setUnlocalizedName("lonlon_milk" + "_" + variant);
		this.setTextureName(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		
		if (this.isBottled()){
			
			this.setContainerItem(Item.glassBottle);
			
		}
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote)
        {
            par3EntityPlayer.curePotionEffects(par1ItemStack);
            par3EntityPlayer.extinguish();
        }

        return par1ItemStack.stackSize <= 0 ? new ItemStack(Items.lonlon_milk_half) : par1ItemStack;
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

    
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.uncommon;
    }

	@Override
	public EnumDrinkType getDrinkType(World world, int x, int y, int z) {
	
		return EnumDrinkType.Milk;
	}

	@Override
	public String getOrigin() {
		
		return "0.0.2";
	}

	@Override
	public boolean isBottled() {
	
		return true;
	}

}
