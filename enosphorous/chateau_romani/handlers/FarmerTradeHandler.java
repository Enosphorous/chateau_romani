package enosphorous.chateau_romani.handlers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;

public class FarmerTradeHandler implements IVillageTradeHandler
{

@Override
public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
{
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 3), new ItemStack(CItems.milk_bottle, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 2), new ItemStack(CItems.milk_bottle, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 4), new ItemStack(CItems.milk_bottle, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.milk_bottle, 1), new ItemStack(Item.emerald, 1, 0)));
///Item.emerald is the cost and amount
///YourMod.yourItem/Block is the item or block you wish to have sold and the amount you get

if (Reference.FORCE_DEBUG)
{
	System.out.println("[CHATEAU ROMANI] Farmer trades manipulated.");
	System.out.println("[CHATEAU ROMANI] Bottled Milk added to Farmer trade list.");
}
}

}