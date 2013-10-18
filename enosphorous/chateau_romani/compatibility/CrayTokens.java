package enosphorous.chateau_romani.compatibility;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;

public class CrayTokens {
	
	/**
	 * This class will create all compatibility items, recipes, and integral forces for
	 * playing with both this mod and Biomes o' Plenty.
	 * 
	 * Feature List
	 * 
	 * - Villagers trade items for tokens.
	 */
	
	/**
	 * Getting all applicable items for crafting and other uses in this mod. Essentially
	 * making an API for Biomes o' Plenty, for me to use.
	 */

	public static void getCompatiblity(){
	
	if (GameRegistry.findItem("ct", "copperToken") == null){
		System.out.println("[CHATEAU ROMANI] Cray Tokens not detected. Not running compatibility.");
	}
	else{
		/**
		 * Getting the items from Biomes o' Plenty using items and itemstacks.
		 */

		VillagerRegistry.instance().registerVillageTradeHandler(4, new CrayTokens_GenericTrades());
		VillagerRegistry.instance().registerVillageTradeHandler(0, new CrayTokens_GenericTrades());
		VillagerRegistry.instance().registerVillageTradeHandler(1, new CrayTokens_GenericTrades());
		VillagerRegistry.instance().registerVillageTradeHandler(2, new CrayTokens_GenericTrades());
		VillagerRegistry.instance().registerVillageTradeHandler(3, new CrayTokens_GenericTrades());
		VillagerRegistry.instance().registerVillageTradeHandler(0, new CrayTokens_GenericTrades());
		
		VillagerRegistry.instance().registerVillageTradeHandler(2, new CrayTokens_PriestTrades());
		
		
	}
	
}	

}