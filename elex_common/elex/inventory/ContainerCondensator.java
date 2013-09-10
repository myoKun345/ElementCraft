package elex.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import elex.tileentity.TileEntityCondensator;

/**
 * Elemental Experimentation
 * 
 * ContainerCondensator
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ContainerCondensator extends Container {
    
    private TileEntityCondensator condensator;
    
    public ContainerCondensator(InventoryPlayer player, TileEntityCondensator te) {
        this.condensator = te;
        
        for (int x = 0; x < 9; x++) {
            addSlotToContainer(new Slot(player, x, 8 + 18 * x, 142));
        }
        
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 9; x++) {
                addSlotToContainer(new Slot(player, x + y * 9 + 9, 8 + 18 * x, 84 + y * 18));
            }
        }
        
        addSlotToContainer(new Slot(condensator, 0, 35, 35));
        addSlotToContainer(new Slot(condensator, 1, 55, 35));
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return condensator.isUseableByPlayer(player);
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotnumber) {
        return null;
    }
    
}
