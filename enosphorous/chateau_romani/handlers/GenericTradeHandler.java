package enosphorous.chateau_romani.handlers;

import java.util.Random;

import com.mrcrayfish.craytokens.api.CrayTokensAPI;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;

public class GenericTradeHandler implements IVillageTradeHandler
{
	
	public Item token = CrayTokensAPI.getSilverToken();

@Override
public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
{
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 2), new ItemStack(CItems.fermented_grain, 2, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.fermented_grain, 2), new ItemStack(Item.emerald, 1, 0)));
///Item.emerald is the cost and amount
///YourMod.yourItem/Block is the item or block you wish to have sold and the amount you get

/**
 * CrayTokens stuff.
 */
recipeList.add(new MerchantRecipe(new ItemStack(CItems.fermented_grain, 2), new ItemStack(token, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.fermented_grain, 3), new ItemStack(token, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.milk_bottle, 1), new ItemStack(token, 4, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.milk_bottle, 1), new ItemStack(token, 3, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.milk_bottle, 1), new ItemStack(token, 2, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.milk_bottle, 1), new ItemStack(token, 5, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 5), new ItemStack(CItems.milk_bottle, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 4), new ItemStack(CItems.milk_bottle, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 3), new ItemStack(CItems.milk_bottle, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 2), new ItemStack(CItems.milk_bottle, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 1), new ItemStack(CItems.fermented_grain, 2, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 1), new ItemStack(CItems.fermented_grain, 3, 0)));

if (Reference.FORCE_DEBUG)
{
	System.out.println("[CHATEAU ROMANI] Generic trades manipulated.");
	System.out.println("[CHATEAU ROMANI] Fermented Grains added to generic trade list.");
}
}

}