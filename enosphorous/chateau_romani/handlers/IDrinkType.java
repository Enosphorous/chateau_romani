package enosphorous.chateau_romani.handlers;

import net.minecraft.world.World;

public interface IDrinkType {
	
	/**
	 * getDrinkType - Returns a drink type.
	 * getOrigin - Gets the first version of this mod that the drink was in.
	 * isBottled - Returns true if the item should have a container item of a glass bottle.
	 */
	
	    public EnumDrinkType getDrinkType(World world, int x, int y, int z);
	    
	    public String getOrigin();
	    
	    public boolean isBottled();

}
