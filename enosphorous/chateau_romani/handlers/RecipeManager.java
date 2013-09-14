package enosphorous.chateau_romani.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import enosphorous.chateau_romani.common.Items;
import enosphorous.chateau_romani.common.Reference;

public class RecipeManager {
	
	public static void add_recipes() {
		
		//Fermented Grain Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fermented_grain), new Object[]{Item.wheat, Block.mushroomBrown, Item.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fermented_grain), new Object[]{Item.wheat, Block.mushroomRed, Item.sugar});
		
		//Chateau Romani Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Items.chateau_romani), new Object[]{Items.milk_bottle, Items.fermented_grain, Item.sugar});

		//Lon Lon Milk
		GameRegistry.addShapelessRecipe(new ItemStack(Items.lonlon_milk_full), new Object[]{Items.milk_bottle, Item.sugar});
		
		//Ghastly Brew
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ghastly_brew), new Object[]{Items.bottled_fire, Items.bottled_ghast, Item.netherStalkSeeds});

		if (Reference.FORCE_DEBUG){
			System.out.println("[CHATEAU ROMANI] Found and added " + Reference.RECIPE_COUNT + " recipes.");
		}
		
	}

}
