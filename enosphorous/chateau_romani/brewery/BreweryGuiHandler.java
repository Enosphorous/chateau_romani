package enosphorous.chateau_romani.brewery;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class BreweryGuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		
		if (ID == 0){

		return new BreweryContainer(player.inventory, world.getBlockTileEntity(x, y, z));
		
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		
		if (ID == 0){
		
		return new BreweryGuiContainer(new BreweryContainer(player.inventory, world.getBlockTileEntity(x, y, z)));
	
		}
		
		return null;
	}

}
