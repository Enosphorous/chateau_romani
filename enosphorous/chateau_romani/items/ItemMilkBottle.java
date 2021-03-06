package enosphorous.chateau_romani.items;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import enosphorous.chateau_romani.api.EnumDrinkType;
import enosphorous.chateau_romani.api.ICategorization;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;

public class ItemMilkBottle extends Item implements ICategorization
{


	
    public ItemMilkBottle(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("milk_bottle");
		this.setTextureName(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		this.setMaxStackSize(1);
		
		if (this.isBottled()){
			
			this.setContainerItem(Item.glassBottle);
			
		}
	}


    @Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote)
        {
            par3EntityPlayer.curePotionEffects(par1ItemStack);
            par3EntityPlayer.clearActivePotions();
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
		
		return EnumDrinkType.Milk;
	}

	@Override
	public String getOrigin() {
		
		return "0.0.1";
	}


	@Override
	public boolean isBottled() {
		
		return true;
	}


	@Override
	public String getLoreLine1() {
		
		return "A refreshing glass of milk. . .";
	}


	@Override
	public String getLoreLine2() {
		
		return null;
	}


	@Override
	public String getLoreLine3() {
		
		return null;
	}
	

    @SideOnly(Side.CLIENT)
    @Override

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	
    	par3List.add(this.getLoreLine1());
    }


}
