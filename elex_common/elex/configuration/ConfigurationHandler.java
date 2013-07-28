package elex.configuration;

import java.io.File;

import elex.lib.BlockIds;
import elex.lib.ItemIds;

import net.minecraftforge.common.Configuration;

/**
 * Elemental Experimentation
 * 
 * ConfigurationHandler
 * 
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ConfigurationHandler {
    public static void mainConfig(File file) {
        Configuration config = new Configuration(file);
        
        config.load();
        
        BlockIds.ITEM_ELEX_ORE = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.ITEM_ELEX_ORE_KEY, BlockIds.ITEM_ELEX_ORE_DEFAULT).getInt();
        BlockIds.BLOCK_ELEX_ORE = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.BLOCK_ELEX_ORE_KEY, BlockIds.BLOCK_ELEX_ORE_DEFAULT).getInt();
        BlockIds.BLOCK_ELEX_ORE_2 = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.BLOCK_ELEX_ORE_2_KEY, BlockIds.BLOCK_ELEX_ORE_2_DEFAULT).getInt();
        BlockIds.CENTRIFUGE = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.CENTRIFUGE_KEY, BlockIds.CENTRIFUGE_DEFAULT).getInt();
        BlockIds.GRINDER = config.getBlock(BlockIds.CATEGORY_BLOCK_IDS, BlockIds.GRINDER_KEY, BlockIds.GRINDER_DEFAULT).getInt();
        
        ItemIds.ELEX_ORE = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.ELEX_ORE_KEY, ItemIds.ELEX_ORE_DEFAULT).getInt();
        ItemIds.MERCURY_INJECTOR = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.MERCURY_INJECTOR_KEY, ItemIds.MERCURY_INJECTOR_DEFAULT).getInt();
        ItemIds.ELEX_DUST = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.ELEX_DUST_KEY, ItemIds.ELEX_DUST_DEFAULT).getInt();
        ItemIds.ELEX_INGOT = config.getItem(ItemIds.CATEGORY_ITEM_IDS, ItemIds.ELEX_INGOT_KEY, ItemIds.ELEX_INGOT_DEFAULT).getInt();
        
        config.save();
    }
    
    public static void genConfig(File file) {
        Configuration config = new Configuration(file);
        
        config.load();
        
        ConfigurationSettings.ORE_GEN_MASTER_SWITCH = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ORE_GEN_MASTER_KEY, true, "This will disable ALL ore generation in the mod (theoretically)").getBoolean(true);
        
        ConfigurationSettings.COPPER_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COPPER_GEN_KEY, true, "Copper Ore Configuration").getBoolean(true);
        ConfigurationSettings.COPPER_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COPPER_VPC_KEY, 10).getInt();
        ConfigurationSettings.COPPER_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COPPER_BPV_KEY, 8).getInt();
        ConfigurationSettings.COPPER_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COPPER_TOPY_KEY, 64).getInt();
        
        ConfigurationSettings.SILVER_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SILVER_GEN_KEY, true, "Silver Ore Configuration").getBoolean(true);
        ConfigurationSettings.SILVER_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SILVER_VPC_KEY, 7).getInt();
        ConfigurationSettings.SILVER_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SILVER_BPV_KEY, 8).getInt();
        ConfigurationSettings.SILVER_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.SILVER_TOPY_KEY, 56).getInt();
        
        ConfigurationSettings.TIN_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TIN_GEN_KEY, true, "Tin Ore Configuration").getBoolean(true);
        ConfigurationSettings.TIN_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TIN_VPC_KEY, 3).getInt();
        ConfigurationSettings.TIN_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TIN_BPV_KEY, 8).getInt();
        ConfigurationSettings.TIN_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TIN_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.CHROMIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_GEN_KEY, true, "Chromium Ore Configuration").getBoolean(true);
        ConfigurationSettings.CHROMIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.CHROMIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_BPV_KEY, 6).getInt();
        ConfigurationSettings.CHROMIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_TOPY_KEY, 56).getInt();
        ConfigurationSettings.CHROMIUM_BOTY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CHROMIUM_BOTY_KEY, 24).getInt();
        
        ConfigurationSettings.OSMIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.OSMIUM_GEN_KEY, true, "Osmium Ore Configuration").getBoolean(true);
        ConfigurationSettings.OSMIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.OSMIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.OSMIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.OSMIUM_BPV_KEY, 2).getInt();
        ConfigurationSettings.OSMIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.OSMIUM_TOPY_KEY, 16).getInt();
        
        ConfigurationSettings.RUTHENIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RUTHENIUM_GEN_KEY, true, "Ruthenium Ore Configuration").getBoolean(true);
        ConfigurationSettings.RUTHENIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RUTHENIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.RUTHENIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RUTHENIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.RUTHENIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RUTHENIUM_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.RHODIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RHODIUM_GEN_KEY, true, "Rhodium Ore Configuration").getBoolean(true);
        ConfigurationSettings.RHODIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RHODIUM_VPC_KEY, 1).getInt();
        ConfigurationSettings.RHODIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RHODIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.RHODIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.RHODIUM_TOPY_KEY, 16).getInt();
        
        ConfigurationSettings.PALLADIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PALLADIUM_GEN_KEY, true, "Palladium Ore Configuration").getBoolean(true);
        ConfigurationSettings.PALLADIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PALLADIUM_VPC_KEY, 1).getInt();
        ConfigurationSettings.PALLADIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PALLADIUM_BPV_KEY, 6).getInt();
        ConfigurationSettings.PALLADIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PALLADIUM_TOPY_KEY, 20).getInt();
        
        ConfigurationSettings.IRIDIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.IRIDIUM_GEN_KEY, true, "Iridium Ore Configuration").getBoolean(true);
        ConfigurationSettings.IRIDIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.IRIDIUM_VPC_KEY, 3).getInt();
        ConfigurationSettings.IRIDIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.IRIDIUM_BPV_KEY, 2).getInt();
        ConfigurationSettings.IRIDIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.IRIDIUM_TOPY_KEY, 16).getInt();
        
        ConfigurationSettings.PLATINUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PLATINUM_GEN_KEY, true, "Platinum Ore Configuration").getBoolean(true);
        ConfigurationSettings.PLATINUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PLATINUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.PLATINUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PLATINUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.PLATINUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.PLATINUM_TOPY_KEY, 20).getInt();
        
        ConfigurationSettings.NICKEL_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.NICKEL_GEN_KEY, true, "Nickel Ore Configuration").getBoolean(true);
        ConfigurationSettings.NICKEL_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.NICKEL_VPC_KEY, 4).getInt();
        ConfigurationSettings.NICKEL_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.NICKEL_BPV_KEY, 8).getInt();
        ConfigurationSettings.NICKEL_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.NICKEL_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.COBALT_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COBALT_GEN_KEY, true, "Cobalt Ore Configuration").getBoolean(true);
        ConfigurationSettings.COBALT_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COBALT_VPC_KEY, 3).getInt();
        ConfigurationSettings.COBALT_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COBALT_BPV_KEY, 6).getInt();
        ConfigurationSettings.COBALT_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.COBALT_TOPY_KEY, 24).getInt();
        
        ConfigurationSettings.CADMIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CADMIUM_GEN_KEY, true, "Cadmium Ore Configuration").getBoolean(true);
        ConfigurationSettings.CADMIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CADMIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.CADMIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CADMIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.CADMIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.CADMIUM_TOPY_KEY, 48).getInt();
        
        ConfigurationSettings.MOLYBDENUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.MOLYBDENUM_GEN_KEY, true, "Molybdenum Ore Configuration").getBoolean(true);
        ConfigurationSettings.MOLYBDENUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.MOLYBDENUM_VPC_KEY, 3).getInt();
        ConfigurationSettings.MOLYBDENUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.MOLYBDENUM_BPV_KEY, 6).getInt();
        ConfigurationSettings.MOLYBDENUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.MOLYBDENUM_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.INDIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.INDIUM_GEN_KEY, true, "Indium Ore Configuration").getBoolean(true);
        ConfigurationSettings.INDIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.INDIUM_VPC_KEY, 1).getInt();
        ConfigurationSettings.INDIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.INDIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.INDIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.INDIUM_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.ALUMINIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ALUMINIUM_GEN_KEY, true, "Aluminium Ore Configuration").getBoolean(true);
        ConfigurationSettings.ALUMINIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ALUMINIUM_VPC_KEY, 11).getInt();
        ConfigurationSettings.ALUMINIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ALUMINIUM_BPV_KEY, 8).getInt();
        ConfigurationSettings.ALUMINIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ALUMINIUM_TOPY_KEY, 72).getInt();
        
        ConfigurationSettings.TANTALUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TANTALUM_GEN_KEY, true, "Tantalum Ore Configuration").getBoolean(true);
        ConfigurationSettings.TANTALUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TANTALUM_VPC_KEY, 3).getInt();
        ConfigurationSettings.TANTALUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TANTALUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.TANTALUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TANTALUM_TOPY_KEY, 48).getInt();
        
        ConfigurationSettings.ARSENIC_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ARSENIC_GEN_KEY, true, "Arsenic Ore Configuration").getBoolean(true);
        ConfigurationSettings.ARSENIC_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ARSENIC_VPC_KEY, 3).getInt();
        ConfigurationSettings.ARSENIC_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ARSENIC_BPV_KEY, 6).getInt();
        ConfigurationSettings.ARSENIC_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ARSENIC_TOPY_KEY, 32).getInt();
        
        ConfigurationSettings.TELLURIUM_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TELLURIUM_GEN_KEY, true, "Tellurium Ore Configuration").getBoolean(true);
        ConfigurationSettings.TELLURIUM_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TELLURIUM_VPC_KEY, 2).getInt();
        ConfigurationSettings.TELLURIUM_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TELLURIUM_BPV_KEY, 5).getInt();
        ConfigurationSettings.TELLURIUM_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.TELLURIUM_TOPY_KEY, 24).getInt();
        
        ConfigurationSettings.ANTIMONY_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ANTIMONY_GEN_KEY, true, "Antimony Ore Configuration").getBoolean(true);
        ConfigurationSettings.ANTIMONY_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ANTIMONY_VPC_KEY, 3).getInt();
        ConfigurationSettings.ANTIMONY_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ANTIMONY_BPV_KEY, 5).getInt();
        ConfigurationSettings.ANTIMONY_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.ANTIMONY_TOPY_KEY, 24).getInt();
        
        ConfigurationSettings.BISMUTH_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BISMUTH_GEN_KEY, true, "Bismuth Ore Configuration").getBoolean(true);
        ConfigurationSettings.BISMUTH_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BISMUTH_VPC_KEY, 3).getInt();
        ConfigurationSettings.BISMUTH_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BISMUTH_BPV_KEY, 4).getInt();
        ConfigurationSettings.BISMUTH_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.BISMUTH_TOPY_KEY, 24).getInt();
        
        ConfigurationSettings.LEAD_GEN = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.LEAD_GEN_KEY, true, "Lead Ore Configuration").getBoolean(true);
        ConfigurationSettings.LEAD_VPC = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.LEAD_VPC_KEY, 3).getInt();
        ConfigurationSettings.LEAD_BPV = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.LEAD_BPV_KEY, 6).getInt();
        ConfigurationSettings.LEAD_TOPY = config.get(ConfigurationSettings.ORE_GEN_CATEGORY, ConfigurationSettings.LEAD_TOPY_KEY, 32).getInt();
        
        
        config.save();
    }
}
