package elex.core;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import elex.block.ElexBlockBuildingMaterial;
import elex.block.ElexBlockCentrifuge;
import elex.block.ElexBlockCompoundOre;
import elex.block.ElexBlockCompoundOreStorage;
import elex.block.ElexBlockCondensator;
import elex.block.ElexBlockGrinder;
import elex.block.ElexBlockMachineCase;
import elex.block.ElexBlockMetalStorage;
import elex.block.ElexBlockOre;
import elex.block.util.ElexItemBlockCompoundOreStorage;
import elex.block.util.ElexItemBlockCompoundOreStorage2;
import elex.block.util.ElexItemBlockCompoundOreStorage3;
import elex.block.util.ItemBlockAlloyStorage;
import elex.block.util.ItemBlockBrick;
import elex.block.util.ItemBlockBuildingMaterial;
import elex.block.util.ItemBlockElExItemOre;
import elex.block.util.ItemBlockElExItemOre2;
import elex.block.util.ItemBlockElExItemOre3;
import elex.block.util.ItemBlockElExMetalStorage;
import elex.block.util.ItemBlockElExMetalStorage2;
import elex.block.util.ItemBlockElExMetalStorage3;
import elex.block.util.ItemBlockElExMetalStorage4;
import elex.block.util.ItemBlockElExMetalStorage5;
import elex.block.util.ItemBlockElExMetalStorage6;
import elex.block.util.ItemBlockElExOre;
import elex.block.util.ItemBlockElExOre2;
import elex.block.util.ItemBlockMachineCase;

public class ModBlocks {
    public static Block centrifuge;
    public static Block grinder;
    public static Block condensator;
    public static Block blockElExOre;
    public static Block blockElExOre2;
    public static Block blockElExItemOre;
    public static Block blockElExItemOre2;
    public static Block blockElExItemOre3;
    public static Block blockElExItemOreStorage;
    public static Block blockElExItemOreStorage2;
    public static Block blockElExItemOreStorage3;
    public static Block blockElExMetalStorage;
    public static Block blockElExMetalStorage2;
    public static Block blockElExMetalStorage3;
    public static Block blockElExMetalStorage4;
    public static Block blockElExMetalStorage5;
    public static Block blockElExMetalStorage6;
    public static Block blockMachineCase;
    public static Block blockAlloyStorage;
    public static Block blockBuildingMaterial;
    public static Block blockBrick;
    
    public static void init() {
        centrifuge = new ElexBlockCentrifuge(ElexIDs.CENTRIFUGE);
        grinder = new ElexBlockGrinder(ElexIDs.GRINDER);
        condensator = new ElexBlockCondensator(ElexIDs.CONDENSATOR);
        blockElExOre = new ElexBlockOre(ElexIDs.BLOCK_ELEX_ORE, 0);
        blockElExOre2 = new ElexBlockOre(ElexIDs.BLOCK_ELEX_ORE_2, 1);
        blockElExItemOre = new ElexBlockCompoundOre(ElexIDs.ITEM_ELEX_ORE, 0);
        blockElExItemOre2 = new ElexBlockCompoundOre(ElexIDs.ITEM_ELEX_ORE_2, 1);
        blockElExItemOre3 = new ElexBlockCompoundOre(ElexIDs.ITEM_ELEX_ORE_3, 2);
        blockElExItemOreStorage = new ElexBlockCompoundOreStorage(ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE, 0);
        blockElExItemOreStorage2 = new ElexBlockCompoundOreStorage(ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_2, 1);
        blockElExItemOreStorage3 = new ElexBlockCompoundOreStorage(ElexIDs.BLOCK_ELEX_ITEM_ORE_STORAGE_3, 2);
        blockElExMetalStorage = new ElexBlockMetalStorage(ElexIDs.BLOCK_ELEX_METAL_STORAGE, 0);
        blockElExMetalStorage2 = new ElexBlockMetalStorage(ElexIDs.BLOCK_ELEX_METAL_STORAGE_2, 1);
        blockElExMetalStorage3 = new ElexBlockMetalStorage(ElexIDs.BLOCK_ELEX_METAL_STORAGE_3, 2);
        blockElExMetalStorage4 = new ElexBlockMetalStorage(ElexIDs.BLOCK_ELEX_METAL_STORAGE_4, 3);
        blockElExMetalStorage5 = new ElexBlockMetalStorage(ElexIDs.BLOCK_ELEX_METAL_STORAGE_5, 4);
        blockElExMetalStorage6 = new ElexBlockMetalStorage(ElexIDs.BLOCK_ELEX_METAL_STORAGE_6, 5);
        blockMachineCase = new ElexBlockMachineCase(ElexIDs.BLOCK_MACHINE_CASE);
        blockAlloyStorage = new ElexBlockMetalStorage(ElexIDs.BLOCK_ALLOY_STORAGE, 6);
        blockBuildingMaterial = new ElexBlockBuildingMaterial(ElexIDs.BLOCK_BUILDING_MATERIAL, 0);
        blockBrick = new ElexBlockBuildingMaterial(ElexIDs.BLOCK_BRICK, 1);
        
        GameRegistry.registerBlock(centrifuge, "centrifugeElEx");
        GameRegistry.registerBlock(grinder, "grinderElEx");
        GameRegistry.registerBlock(condensator, "condensatorElEx");
        GameRegistry.registerBlock(blockElExItemOre, ItemBlockElExItemOre.class, "blockElExItemOre");
        GameRegistry.registerBlock(blockElExItemOre2, ItemBlockElExItemOre2.class, "blockElExItemOre2");
        GameRegistry.registerBlock(blockElExItemOre3, ItemBlockElExItemOre3.class, "blockElExItemOre3");
        GameRegistry.registerBlock(blockElExOre, ItemBlockElExOre.class, "blockElExOre");
        GameRegistry.registerBlock(blockElExOre2, ItemBlockElExOre2.class, "blockElExOre2");
        GameRegistry.registerBlock(blockElExItemOreStorage, ElexItemBlockCompoundOreStorage.class, "blockElExItemOreStorage");
        GameRegistry.registerBlock(blockElExItemOreStorage2, ElexItemBlockCompoundOreStorage2.class, "blockElExItemOreStorage2");
        GameRegistry.registerBlock(blockElExItemOreStorage3, ElexItemBlockCompoundOreStorage3.class, "blockElExItemOreStorage3");
        GameRegistry.registerBlock(blockElExMetalStorage, ItemBlockElExMetalStorage.class, "blockElExMetalStorage");
        GameRegistry.registerBlock(blockElExMetalStorage2, ItemBlockElExMetalStorage2.class, "blockElExMetalStorage2");
        GameRegistry.registerBlock(blockElExMetalStorage3, ItemBlockElExMetalStorage3.class, "blockElExMetalStorage3");
        GameRegistry.registerBlock(blockElExMetalStorage4, ItemBlockElExMetalStorage4.class, "blockElExMetalStorage4");
        GameRegistry.registerBlock(blockElExMetalStorage5, ItemBlockElExMetalStorage5.class, "blockElExMetalStorage5");
        GameRegistry.registerBlock(blockElExMetalStorage6, ItemBlockElExMetalStorage6.class, "blockElExMetalStorage6");
        GameRegistry.registerBlock(blockMachineCase, ItemBlockMachineCase.class, "blockMachineCase");
        GameRegistry.registerBlock(blockAlloyStorage, ItemBlockAlloyStorage.class, "blockAlloyStorage");
        GameRegistry.registerBlock(blockBuildingMaterial, ItemBlockBuildingMaterial.class, "blockBuildingMaterial");
        GameRegistry.registerBlock(blockBrick, ItemBlockBrick.class, "blockBrick");
    }
}
