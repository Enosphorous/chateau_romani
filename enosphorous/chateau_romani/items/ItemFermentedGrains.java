package enosphorous.chateau_romani.items;

import java.util.Random;

import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;
import enosphorous.chateau_romani.handlers.EnumDrinkType;
import enosphorous.chateau_romani.handlers.ICategorization;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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


}
