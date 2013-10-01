package enosphorous.chateau_romani.handlers;

import java.util.Random;

import net.minecraft.world.World;

public interface ICategorization {
	
		/**
		 * Gets the specified drink type.
		 * 
		 * Calls from EnumDrinkType.
		 */
	    public EnumDrinkType getDrinkType(World world, int x, int y, int z);
	    
	    /**
	     * First version of this mod the item was included in.
	     * 
	     * Begins with 0.0.1.
	     * 
	     * Something I've been wanting in vanilla for a while.
	     */
	    public String getOrigin();
	    
	    /**
	     * Gets if the item is bottled or not.
	     * 
	     * This sets the container item.
	     * 
	     * The container item is written in the declaration of any class that implements this.
	     * 
	     * It should be set to Item.glassBottle if the item is bottled.
	     */
	    public boolean isBottled();
	    
	    


}
