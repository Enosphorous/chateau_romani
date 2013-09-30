package enosphorous.chateau_romani.handlers;

import cpw.mods.fml.common.registry.VillagerRegistry;
import enosphorous.chateau_romani.common.Configuring;

public class TradeRegistryHandler {
	
	public static void manipulate() {
		if (Configuring.newTrades){
		VillagerRegistry.instance().registerVillageTradeHandler(2, new PriestTradeHandler());
		VillagerRegistry.instance().registerVillageTradeHandler(0, new FarmerTradeHandler());
		VillagerRegistry.instance().registerVillageTradeHandler(0, new GenericTradeHandler());
		VillagerRegistry.instance().registerVillageTradeHandler(1, new GenericTradeHandler());
		VillagerRegistry.instance().registerVillageTradeHandler(2, new GenericTradeHandler());
		VillagerRegistry.instance().registerVillageTradeHandler(3, new GenericTradeHandler());
		VillagerRegistry.instance().registerVillageTradeHandler(4, new GenericTradeHandler());
		}
	}

}
