package enosphorous.chateau_romani.handlers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import enosphorous.chateau_romani.common.Items;
import enosphorous.chateau_romani.common.Reference;

public class PriestTradeHandler implements IVillageTradeHandler
{

@Override
public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
{
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 9), new ItemStack(Items.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 8), new ItemStack(Items.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 10), new ItemStack(Items.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Items.chateau_romani, 1), new ItemStack(Item.emerald, 9, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Items.chateau_romani, 1), new ItemStack(Item.emerald, 10, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Items.chateau_romani, 1), new ItemStack(Item.emerald, 8, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Items.bottled_fire, 1), new ItemStack(Item.emerald, 11, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 12), new ItemStack(Items.bottled_fire, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Items.bottled_ghast, 1), new ItemStack(Item.emerald, 18, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 18), new ItemStack(Items.bottled_ghast, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Items.bottled_ghast, 1), new ItemStack(Item.emerald, 19, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 19), new ItemStack(Items.bottled_ghast, 1, 0)));
///Item.emerald is the cost and amount
///YourMod.yourItem/Block is the item or block you wish to have sold and the amount you get

if (Reference.FORCE_DEBUG)
{
	System.out.println("[CHATEAU ROMANI] Priest trades manipulated.");
	System.out.println("[CHATEAU ROMANI] Chateau Romani added to Priest trade list.");
	System.out.println("[CHATEAU ROMANI] Bottled Fire added to Priest trade list.");
	System.out.println("[CHATEAU ROMANI] Bottled Ghast added to Priest trade list.");
}

}

}