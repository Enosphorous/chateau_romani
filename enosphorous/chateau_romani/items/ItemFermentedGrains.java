package enosphorous.chateau_romani.items;

import enosphorous.chateau_romani.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionHelper;

public class ItemFermentedGrains extends Item{

	public ItemFermentedGrains(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("fermented_grains");
		this.func_111206_d(Reference.MOD_ID + ":" + this.getUnlocalizedName());
		this.setMaxStackSize(64);
		this.setPotionEffect(PotionHelper.fermentedSpiderEyeEffect);
	}

}
