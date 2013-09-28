package enosphorous.chateau_romani.handlers;

import net.minecraft.world.World;

public interface IDrinkType {
	
	/**
	 * getDrinkType - Returns a drink type.
	 * getOrientation - Gets the first version of this mod that the drink was in.
	 * getDrinkID - Returns the item ID.
	 */
	
	    public EnumDrinkType getDrinkType(World world, int x, int y, int z);
	    
	    public String getOrigin();

}
