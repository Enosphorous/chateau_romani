package enosphorous.chateau_romani.brewery;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;

public class BreweryContainer extends Container{
	
	public BreweryContainer(InventoryPlayer inventory, TileEntity tile){
		
		super();
		
		/**
		 * Input slots.
		 */
		addSlotToContainer(new Slot(inventory, 0, 0, 0));
		addSlotToContainer(new Slot(inventory, 1, 0, 0));
		addSlotToContainer(new Slot(inventory, 2, 0, 0));
		
		/**
		 * Output slot.
		 */
		addSlotToContainer(new Slot(inventory, 3, 0, 0));
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {

		return false;
	}
	
	protected void bindPlayerInventory(InventoryPlayer inventoryPlayer)
    {
            for (int i = 0; i < 3; i++)
                    for (int j = 0; j < 9; j++)
                    {
                            addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
                    }

            for (int i = 0; i < 9; i++)
            {
                    addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 84 + 58));
            }
    }

}
