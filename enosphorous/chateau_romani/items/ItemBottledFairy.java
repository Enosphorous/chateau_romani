package enosphorous.chateau_romani.items;

import enosphorous.chateau_romani.common.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBottledFairy extends Item{

	public ItemBottledFairy(int par1) {
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("bottled_fairy");
		this.func_111206_d(Reference.MOD_ID + ":" + this.getUnlocalizedName());
	}

}
