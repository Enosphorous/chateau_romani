package enosphorous.chateau_romani.items;

import java.util.List;
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
import enosphorous.chateau_romani.api.EnumDrinkType;
import enosphorous.chateau_romani.api.ICategorization;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;

public class ItemGhastlyBrew extends Item implements ICategorization
{

    public ItemGhastlyBrew(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("ghastly_brew");
		this.setTextureName(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		this.setMaxStackSize(1);
		
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
	
		return EnumDrinkType.Special;
	}

	@Override
	public String getOrigin() {
		
		return "0.0.2";
	}

	@Override
	public boolean isBottled() {

		return true;
	}

	@Override
	public String getLoreLine1() {
		
		return "Perhaps drinking this in the";
	}

	@Override
	public String getLoreLine2() {
		
		return "Nether will yield special powers. . .";
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
    	par3List.add(this.getLoreLine2());
    }

}
