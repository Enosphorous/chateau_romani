package enosphorous.chateau_romani.handlers;

import java.util.Random;

import com.mrcrayfish.craytokens.api.CrayTokensAPI;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;

public class PriestTradeHandler implements IVillageTradeHandler
{

	public Item token = CrayTokensAPI.getSilverToken();
	
@Override
public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
{
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 9), new ItemStack(CItems.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 8), new ItemStack(CItems.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 10), new ItemStack(CItems.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.chateau_romani, 1), new ItemStack(Item.emerald, 9, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.chateau_romani, 1), new ItemStack(Item.emerald, 10, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.chateau_romani, 1), new ItemStack(Item.emerald, 8, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_fire, 1), new ItemStack(Item.emerald, 11, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 12), new ItemStack(CItems.bottled_fire, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_ghast, 1), new ItemStack(Item.emerald, 18, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 18), new ItemStack(CItems.bottled_ghast, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_ghast, 1), new ItemStack(Item.emerald, 19, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 19), new ItemStack(CItems.bottled_ghast, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 7), new ItemStack(CItems.potion_blue, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_blue, 1), new ItemStack(Item.emerald, 13, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 13), new ItemStack(CItems.potion_blue, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_blue, 1), new ItemStack(Item.emerald, 14, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 14), new ItemStack(CItems.potion_blue, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_blue, 1), new ItemStack(Item.emerald, 15, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 15), new ItemStack(CItems.potion_red, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_red, 1), new ItemStack(Item.emerald, 7, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 6), new ItemStack(CItems.potion_red, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_red, 1), new ItemStack(Item.emerald, 6, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 8), new ItemStack(CItems.potion_red, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_red, 1), new ItemStack(Item.emerald, 8, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 7), new ItemStack(CItems.potion_green, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_green, 1), new ItemStack(Item.emerald, 7, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 8), new ItemStack(CItems.potion_green, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_green, 1), new ItemStack(Item.emerald, 8, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 6), new ItemStack(CItems.potion_green, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_green, 1), new ItemStack(Item.emerald, 6, 0)));

/**
 * CrayTokensAPI stuff.
 */

recipeList.add(new MerchantRecipe(new ItemStack(CItems.chateau_romani, 1), new ItemStack(token, 8, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.chateau_romani, 1), new ItemStack(token, 9, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.chateau_romani, 1), new ItemStack(token, 10, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.chateau_romani, 1), new ItemStack(token, 11, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 11), new ItemStack(CItems.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 10), new ItemStack(CItems.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 9), new ItemStack(CItems.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 8), new ItemStack(CItems.chateau_romani, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_fire, 1), new ItemStack(token, 13, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_fire, 1), new ItemStack(token, 12, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_fire, 1), new ItemStack(token, 10, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_fire, 1), new ItemStack(token, 11, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 11), new ItemStack(CItems.bottled_fire, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 12), new ItemStack(CItems.bottled_fire, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 13), new ItemStack(CItems.bottled_fire, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 10), new ItemStack(CItems.bottled_fire, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_ghast, 1), new ItemStack(token, 18, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_ghast, 1), new ItemStack(token, 17, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_ghast, 1), new ItemStack(token, 19, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.bottled_ghast, 1), new ItemStack(token, 16, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 16), new ItemStack(CItems.bottled_ghast, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 17), new ItemStack(CItems.bottled_ghast, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 18), new ItemStack(CItems.bottled_ghast, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 19), new ItemStack(CItems.bottled_ghast, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_red, 1), new ItemStack(token, 8, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_red, 1), new ItemStack(token, 7, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_red, 1), new ItemStack(token, 9, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_red, 1), new ItemStack(token, 6, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 7), new ItemStack(CItems.potion_red, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 6), new ItemStack(CItems.potion_red, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 8), new ItemStack(CItems.potion_red, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 9), new ItemStack(CItems.potion_red, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_green, 1), new ItemStack(token, 8, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_green, 1), new ItemStack(token, 7, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_green, 1), new ItemStack(token, 9, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_green, 1), new ItemStack(token, 6, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 7), new ItemStack(CItems.potion_green, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 6), new ItemStack(CItems.potion_green, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 8), new ItemStack(CItems.potion_green, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 9), new ItemStack(CItems.potion_green, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_blue, 1), new ItemStack(token, 13, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_blue, 1), new ItemStack(token, 12, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_blue, 1), new ItemStack(token, 14, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(CItems.potion_blue, 1), new ItemStack(token, 15, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 12), new ItemStack(CItems.potion_blue, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 13), new ItemStack(CItems.potion_blue, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 14), new ItemStack(CItems.potion_blue, 1, 0)));
recipeList.add(new MerchantRecipe(new ItemStack(token, 15), new ItemStack(CItems.potion_blue, 1, 0)));


///Item.emerald is the cost and amount
///YourMod.yourItem/Block is the item or block you wish to have sold and the amount you get

if (Reference.FORCE_DEBUG)
{
	System.out.println("[CHATEAU ROMANI] Priest trades manipulated.");
	System.out.println("[CHATEAU ROMANI] Chateau Romani added to Priest trade list.");
	System.out.println("[CHATEAU ROMANI] Bottled Fire added to Priest trade list.");
	System.out.println("[CHATEAU ROMANI] Bottled Ghast added to Priest trade list.");
	System.out.println("[CHATEAU ROMANI] Potions added to Priest trade list.");
}

}

}