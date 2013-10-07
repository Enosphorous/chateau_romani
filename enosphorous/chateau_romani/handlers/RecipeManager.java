package enosphorous.chateau_romani.handlers;

import biomesoplenty.api.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.chateau_romani.common.Reference;

public class RecipeManager {
	
	public static void add_recipes() {
		
		//Fermented Grain Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.fermented_grain), new Object[]{Item.wheat, Block.mushroomBrown, Item.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.fermented_grain), new Object[]{Item.wheat, Block.mushroomRed, Item.sugar});
		
		//Chateau Romani Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.chateau_romani), new Object[]{CItems.milk_bottle, CItems.fermented_grain, Item.sugar});

		//Lon Lon Milk
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.lonlon_milk_full), new Object[]{CItems.milk_bottle, Item.sugar});
		
		//Ghastly Brew
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.ghastly_brew), new Object[]{CItems.bottled_fire, CItems.bottled_ghast, Item.netherStalkSeeds});
		
		/**
		 * Biomes O' Plenty stuff.
		 */

		GameRegistry.addShapelessRecipe(new ItemStack(CItems.fermented_grain), new Object[]{new ItemStack(Items.food.get(), 1, 6), Block.mushroomBrown, Item.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.fermented_grain), new Object[]{new ItemStack(Items.food.get(), 1, 6), Block.mushroomRed, Item.sugar});
	
		if (Reference.FORCE_DEBUG){
			System.out.println("[CHATEAU ROMANI] Found and added " + Reference.RECIPE_COUNT + " recipes.");
		}
		
	}

}
