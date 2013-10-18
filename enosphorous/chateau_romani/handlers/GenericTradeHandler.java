package enosphorous.chateau_romani.handlers;

import java.util.Random;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;

public class GenericTradeHandler implements IVillageTradeHandler
{

@Override
public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
{
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 2), new ItemStack(CItems.fermented_grain, 2, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.fermented_grain, 2), new ItemStack(Item.emerald, 1, 0)));

if (Reference.FORCE_DEBUG)
{
	System.out.println("[CHATEAU ROMANI] Generic trades manipulated.");
	System.out.println("[CHATEAU ROMANI] Fermented Grains added to generic trade list.");
}
}

}