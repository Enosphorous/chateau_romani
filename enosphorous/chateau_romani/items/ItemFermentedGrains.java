package enosphorous.chateau_romani.items;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import enosphorous.chateau_romani.api.EnumDrinkType;
import enosphorous.chateau_romani.api.ICategorization;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraft.world.World;

public class ItemFermentedGrains extends Item implements ICategorization
{

	public ItemFermentedGrains(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setUnlocalizedName("fermented_grains");
		this.setTextureName(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		this.setMaxStackSize(64);
		this.setPotionEffect(PotionHelper.fermentedSpiderEyeEffect);
	}

	@Override
	public EnumDrinkType getDrinkType(World world, int x, int y, int z) {

		return EnumDrinkType.Inedible;
	}

	@Override
	public String getOrigin() {
		
		return "0.0.1";
	}

	@Override
	public boolean isBottled() {
		
		return false;
	}

	@Override
	public String getLoreLine1() {
		
		return "A basic source of alcohol";
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
