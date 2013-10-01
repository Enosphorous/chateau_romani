/* Don't modify anything here as it will break other mods that use this api */

package com.mrcrayfish.craytokens.api;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class CrayTokensAPI 
{
	/** Returns Copper Token Item. Will return null if Cray Tokens Mod doesn't exist **/
	public static Item getCopperToken()
	{
		return GameRegistry.findItem("ct", "copperToken");
	}
	
	/** Returns Silver Token Item. Will return null if Cray Tokens Mod doesn't exist **/
	public static Item getSilverToken()
	{
		return GameRegistry.findItem("ct", "silverToken");
	}
	
	/** Returns Gold Token Item. Will return null if Cray Tokens Mod doesn't exist **/
	public static Item getGoldToken()
	{
		return GameRegistry.findItem("ct", "goldToken");
	}
	
	/** Returns Platinum Token Item. Will return null if Cray Tokens Mod doesn't exist **/
	public static Item getPlatinumToken()
	{
		return GameRegistry.findItem("ct", "platinumToken");
	}

}
