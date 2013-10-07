package enosphorous.chateau_romani.common;

import enosphorous.chateau_romani.brewery.BlockBrewery;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CBlocks {
	
	public static Block brewery;
	
	public static void initialize(){
		
		brewery = new BlockBrewery(Configuring.breweryID, Material.iron);
		
	}

}
