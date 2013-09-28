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
import enosphorous.chateau_romani.common.Items;
import enosphorous.chateau_romani.common.Reference;
import enosphorous.chateau_romani.handlers.EnumDrinkType;
import enosphorous.chateau_romani.handlers.IDrinkType;

public class ItemBottledFire extends Item implements IDrinkType
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
    
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        int i1 = par3World.getBlockId(par4, par5, par6);

        if (i1 == Block.snow.blockID && (par3World.getBlockMetadata(par4, par5, par6) & 7) < 1)
        {
            par7 = 1;
        }
        else if (i1 != Block.vine.blockID && i1 != Block.tallGrass.blockID && i1 != Block.deadBush.blockID)
        {
            if (par7 == 0)
            {
                --par5;
            }

            if (par7 == 1)
            {
                ++par5;
            }

            if (par7 == 2)
            {
                --par6;
            }

            if (par7 == 3)
            {
                ++par6;
            }

            if (par7 == 4)
            {
                --par4;
            }

            if (par7 == 5)
            {
                ++par4;
            }
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else if (par1ItemStack.stackSize == 0)
        {
            return false;
        }
        else
        {
            if (par3World.canPlaceEntityOnSide(this.spawnID, par4, par5, par6, false, par7, (Entity)null, par1ItemStack))
            {
                Block block = Block.blocksList[this.spawnID];
                int j1 = block.onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, 0);

                if (par3World.setBlock(par4, par5, par6, this.spawnID, j1, 3))
                {
                    if (par3World.getBlockId(par4, par5, par6) == this.spawnID)
                    {
                        Block.blocksList[this.spawnID].onBlockPlacedBy(par3World, par4, par5, par6, par2EntityPlayer, par1ItemStack);
                        Block.blocksList[this.spawnID].onPostBlockPlaced(par3World, par4, par5, par6, j1);
                    }

                    par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block.stepSound.getPlaceSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
                    
                    if (par2EntityPlayer.capabilities.isCreativeMode == false){
                    par2EntityPlayer.inventory.setInventorySlotContents(par2EntityPlayer.inventory.currentItem, new ItemStack(Item.glassBottle));
                    }
                }
            }

            return true;
        }
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
		return EnumDrinkType.Harmful;
	}

	@Override
	public String getOrigin() {
		
		return "0.0.2";
	}
    
}
