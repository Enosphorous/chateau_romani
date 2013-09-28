package enosphorous.chateau_romani.items;

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
import enosphorous.chateau_romani.handlers.IDrinkType;

public class ItemGhastlyBrew extends Item implements IDrinkType
{


	
    public ItemGhastlyBrew(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("ghastly_brew");
		this.func_111206_d(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		this.setMaxStackSize(1);
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote && par3EntityPlayer.dimension == 0)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20 * 30, 2)); 
        }
        
        if (!par2World.isRemote && par3EntityPlayer.dimension == -1)
        {
        	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20 * 60, 4));
            par2World.playSoundAtEntity(par3EntityPlayer, "mob.wither.death", 1F, 1F);
        }
        
        if (!par2World.isRemote && par3EntityPlayer.dimension == 1)
        {
        	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20 * 5, 0));
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

    
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
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
		if (this.itemID == Items.ghastly_brew.itemID      ) return EnumDrinkType.Nether;	
		return EnumDrinkType.Nether;
	}

	@Override
	public String getOrigin() {
		
		return "0.0.2";
	}

}
