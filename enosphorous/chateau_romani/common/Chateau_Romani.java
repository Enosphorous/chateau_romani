package enosphorous.chateau_romani.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import enosphorous.chateau_romani.brewery.BreweryGuiHandler;
import enosphorous.chateau_romani.handlers.CowHandler;
import enosphorous.chateau_romani.handlers.FireHandler;
import enosphorous.chateau_romani.handlers.GhastHandler;
import enosphorous.chateau_romani.handlers.LocalizationHandler;
import enosphorous.chateau_romani.handlers.LootHandler;
import enosphorous.chateau_romani.handlers.RecipeManager;
import enosphorous.chateau_romani.handlers.TradeRegistryHandler;
import enosphorous.chateau_romani.handlers.WitchDropHandler;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Chateau_Romani {

	@Instance(Reference.MOD_INSTANCE)
	public static Chateau_Romani instance;
	
    @SidedProxy(clientSide = Reference.CLIENT_PATH, serverSide = Reference.SERVER_PATH)
    public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		if (Reference.FORCE_DEBUG) {
			System.out.println("[CHATEAU ROMANI] Debug mode is true. Beginning debug. . .");
		}
		else if (Reference.FORCE_DEBUG == false)
		{
			System.out.println("[CHATEAU ROMANI] Debug mode is false. Release environment detected.");
		}
		
		CItems.initialize();
		
		if (Configuring.dungeonLoots){
		LootHandler.generate_loot();
		}
		
		LocalizationHandler.init();
		MinecraftForge.EVENT_BUS.register(new WitchDropHandler());
		
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        Configuring.load(config);
        
        RecipeManager.add_recipes();
        MinecraftForge.EVENT_BUS.register(new CowHandler());
        MinecraftForge.EVENT_BUS.register(new GhastHandler());
        MinecraftForge.EVENT_BUS.register(new FireHandler());
        NetworkRegistry.instance().registerGuiHandler(this, new BreweryGuiHandler());
	}

	@Mod.EventHandler
	public void load(FMLInitializationEvent event) {		
		
		Item.glassBottle.setMaxStackSize(1);
		Item.ghastTear.setMaxStackSize(16);
		TradeRegistryHandler.manipulate();
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
	}
}
