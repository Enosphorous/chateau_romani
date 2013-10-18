package enosphorous.chateau_romani.compatibility;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import enosphorous.chateau_romani.common.CItems;
import enosphorous.pumpkins.common.ConfigLoader;
import enosphorous.pumpkins.item.ItemCarvingKnife;
import enosphorous.pumpkins.item.ToolMaterial;

public class Thaumcraft {
	
	/**
	 * This class will create all compatibility items, recipes, and integral forces for
	 * playing with both this mod and Thaumcraft.
	 * 
	 * Feature List
	 * 
	 * - ???
	 */
	
	/**
	 * Getting all applicable items for crafting and other uses in this mod. Essentially
	 * making an API for Thaumcraft, for me to use.
	 */

	public static void getCompatiblity(){
	
	if (GameRegistry.findItem("Thaumcraft", "ItemResource") == null){
		System.out.println("[CHATEAU ROMANI] Thaumcraft not detected. Not running compatibility.");
	}
	else{
		/**
		 * Getting the items from Thaumcraft using items and itemstacks.
		 */

	}
	
}	

}