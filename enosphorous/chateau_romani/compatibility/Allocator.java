package enosphorous.chateau_romani.compatibility;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Allocator {
	
	
	/**
	 * Items for Biomes o' Plenty.
	 */
	
	public static Item getBarley()
	{
		return GameRegistry.findItem("BiomesOPlenty", "miscItems");
	}
	
	public static Block getMushrooms()
	{
		return GameRegistry.findBlock("BiomesOPlenty", "mushrooms");
	}
	
	public static Block getWitherwart()
	{
		return GameRegistry.findBlock("BiomesOPlenty", "plants");
	}
	
	public static Item getSilverToken()
	{
		return GameRegistry.findItem("ct", "silverToken");
	}

}
