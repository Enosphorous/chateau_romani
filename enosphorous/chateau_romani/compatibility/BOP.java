package enosphorous.chateau_romani.compatibility;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.pumpkins.common.ConfigLoader;
import enosphorous.pumpkins.item.ItemCarvingKnife;
import enosphorous.pumpkins.item.ToolMaterial;

public class BOP {
	
	/**
	 * This class will create all compatibility items, recipes, and integral forces for
	 * playing with both this mod and Biomes o' Plenty.
	 * 
	 * Feature List
	 * 
	 * - Barley for Fermented Grains.
	 * - Mushrooms instead of vanilla mushrooms.
	 * - Wither Wart in the Ghastly Brew.
	 */
	
	/**
	 * Getting all applicable items for crafting and other uses in this mod. Essentially
	 * making an API for Biomes o' Plenty, for me to use.
	 * 
	 * *An easy-to-use API, considering I couldn't figure out the real one.
	 */

	public static void getCompatiblity(){
	
	if (GameRegistry.findItem("BiomesOPlenty", "mudSword") == null){
		System.out.println("[CHATEAU ROMANI] Biomes o' Plenty not detected. Not running compatibility.");
	}
	else{
		/**
		 * Getting the items from Biomes o' Plenty using items and itemstacks.
		 */
		Item barley = Allocator.getBarley();
		ItemStack barley_stack = new ItemStack(barley, 1, 6);
		Block mushrooms = Allocator.getMushrooms();
		Block plants = Allocator.getWitherwart();
		ItemStack wart_stack = new ItemStack(plants, 1, 13);
		
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.fermented_grain), new Object[]{barley_stack, Block.mushroomBrown, Item.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.fermented_grain), new Object[]{barley_stack, Block.mushroomRed, Item.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.fermented_grain), new Object[]{barley_stack, mushrooms, Item.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.fermented_grain), new Object[]{Item.wheat, mushrooms, Item.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(CItems.ghastly_brew), new Object[]{CItems.bottled_fire, CItems.bottled_ghast, wart_stack});
		
		
	}
	
}	

}