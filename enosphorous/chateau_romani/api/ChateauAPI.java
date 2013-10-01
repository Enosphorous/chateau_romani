package enosphorous.chateau_romani.api;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ChateauAPI {
	
	public static Item getChateauRomani()
	{
		return GameRegistry.findItem("chateau_romani", "chateau_romani");
	}
	
	public static Item getMilkBottle()
	{
		return GameRegistry.findItem("chateau_romani", "milk_bottle");
	}
	
	public static Item getFermentedGrain()
	{
		return GameRegistry.findItem("chateau_romani", "fermented_grain");
	}
	
	public static Item getLonLonFull()
	{
		return GameRegistry.findItem("chateau_romani", "lonlon_milk_full");
	}
	
	public static Item getLonLonHalf()
	{
		return GameRegistry.findItem("chateau_romani", "lonlon_milk_half");
	}
	
	public static Item getBottledFire()
	{
		return GameRegistry.findItem("chateau_romani", "bottled_fire");
	}
	
	public static Item getBottledGhast()
	{
		return GameRegistry.findItem("chateau_romani", "bottled_ghast");
	}
	
	public static Item getGhastlyBrew()
	{
		return GameRegistry.findItem("chateau_romani", "ghastly_brew");
	}
	
	public static Item getPotionRed()
	{
		return GameRegistry.findItem("chateau_romani", "potion_red");
	}
	
	public static Item getPotionBlue()
	{
		return GameRegistry.findItem("chateau_romani", "potion_blue");
	}
	
	public static Item getPotionGreen()
	{
		return GameRegistry.findItem("chateau_romani", "potion_green");
	}
	
	public static Item getBottledFairy()
	{
		return GameRegistry.findItem("chateau_romani", "bottled_fairy");
	}

}
