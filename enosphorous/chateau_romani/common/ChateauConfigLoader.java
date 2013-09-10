package enosphorous.chateau_romani.common;


import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;



public class ChateauConfigLoader {

    public static int     chateau_romaniID                   = 11900;
    public static int     milk_bottleID                      = 11901;
    public static int     fermented_grainsID                 = 11902;
    public static int     lonlon_milk_fullID                 = 11903;
    public static int     lonlon_milk_halfID                 = 11904;
    
    public static boolean dungeonLoots                       = true;
    public static boolean newTrades                          = true;

    static final String   CategoryItemIDs                = "item id customization";
    static final String   CategoryGlobal                 = "global customization";

    public static void load(Configuration config) {

        try {
            config.load();

            ChateauConfigLoader.chateau_romaniID = config.get(ChateauConfigLoader.CategoryItemIDs, "chateau romani id", 11900).getInt(11900);
            ChateauConfigLoader.milk_bottleID = config.get(ChateauConfigLoader.CategoryItemIDs, "milk bottle id", 11901).getInt(11901);
            ChateauConfigLoader.fermented_grainsID = config.get(ChateauConfigLoader.CategoryItemIDs, "fermented grains id", 11902).getInt(11902);
            ChateauConfigLoader.lonlon_milk_fullID = config.get(ChateauConfigLoader.CategoryItemIDs, "full lonlon milk id", 11903).getInt(11903);
            ChateauConfigLoader.lonlon_milk_halfID = config.get(ChateauConfigLoader.CategoryItemIDs, "half full lonlon milk id", 11904).getInt(11904);

            ChateauConfigLoader.dungeonLoots = config.get(ChateauConfigLoader.CategoryGlobal, "dungeon loot enabled", true).getBoolean(true);
            ChateauConfigLoader.newTrades = config.get(ChateauConfigLoader.CategoryGlobal, "edited villager trades enabled", true).getBoolean(true);
            
            if (Reference.FORCE_DEBUG){
    			System.out.println("[CHATEAU ROMANI] String printing - Item IDs");
    			System.out.println("[CHATEAU ROMANI] Chateau Romani - " + Items.chateau_romani.itemID);
    			System.out.println("[CHATEAU ROMANI] Milk Bottle - " + Items.milk_bottle.itemID);
    			System.out.println("[CHATEAU ROMANI] Fermented Grains - " + Items.fermented_grain.itemID);
            }
            
            System.out.println("[CHATEAU ROMANI] Configuration file loaded.");
            
        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, "Error loading the configuration of [CHATEAU ROMANI - ELEGANT DRINKS]. Error message: " + e.getMessage() + " / " + e.toString());
        } finally {
            config.save();
        }
        
    }

}