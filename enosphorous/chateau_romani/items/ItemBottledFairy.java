package enosphorous.chateau_romani.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import enosphorous.chateau_romani.common.Reference;
import enosphorous.chateau_romani.handlers.EnumDrinkType;
import enosphorous.chateau_romani.handlers.IDrinkType;

public class ItemBottledFairy extends Item implements IDrinkType{

	public ItemBottledFairy(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("bottled_fairy");
		this.func_111206_d(Reference.MOD_ID + ":" + this.getUnlocalizedName());
	}
	
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.capabilities.isCreativeMode)
        {
            return par1ItemStack;
        }
        else
        {
            --par1ItemStack.stackSize;
            par2World.playSoundAtEntity(par3EntityPlayer, "random.levelup", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!par2World.isRemote)
            {
                par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.glassBottle, 1));
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
                par3EntityPlayer.heal(1F);
            }

            return par1ItemStack;
        }
    }

	@Override
	public EnumDrinkType getDrinkType(World world, int x, int y, int z) {

		return EnumDrinkType.Inedible;
	}

	@Override
	public String getOrigin() {
	
		return "0.0.3";
	}

}
