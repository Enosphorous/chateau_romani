package enosphorous.chateau_romani.common;


import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;



public class Configuring {

    public static int     chateau_romaniID                   = 11900;
    public static int     milk_bottleID                      = 11901;
    public static int     fermented_grainsID                 = 11902;
    public static int     lonlon_milk_fullID                 = 11903;
    public static int     lonlon_milk_halfID                 = 11904;
    public static int     bottled_fireID                     = 11905;
    public static int     bottled_ghastID                    = 11906;
    public static int     ghastly_brewID                     = 11907;
    
    public static int     potion_redID                       = 11908;
    public static int     potion_greenID                     = 11909;
    public static int     potion_blueID                      = 11910;
    public static int     bottled_fairyID                    = 11911;
    
    public static boolean dungeonLoots                       = true;
    public static boolean newTrades                          = true;

    static final String   CategoryItemIDs                = "item id customization";
    static final String   CategoryBlockIDs               = "block id customization";
    static final String   CategoryGlobal                 = "global customization";

    public static void load(Configuration config) {

        try {
            config.load();

            Configuring.chateau_romaniID = config.get(Configuring.CategoryItemIDs, "chateau romani id", 11900).getInt(11900);
            Configuring.milk_bottleID = config.get(Configuring.CategoryItemIDs, "milk bottle id", 11901).getInt(11901);
            Configuring.fermented_grainsID = config.get(Configuring.CategoryItemIDs, "fermented grains id", 11902).getInt(11902);
            Configuring.lonlon_milk_fullID = config.get(Configuring.CategoryItemIDs, "full lonlon milk id", 11903).getInt(11903);
            Configuring.lonlon_milk_halfID = config.get(Configuring.CategoryItemIDs, "half full lonlon milk id", 11904).getInt(11904);
            Configuring.bottled_fireID = config.get(Configuring.CategoryItemIDs, "bottled fire id", 11905).getInt(11905);
            Configuring.bottled_ghastID = config.get(Configuring.CategoryItemIDs, "bottled ghast id", 11906).getInt(11906);
            Configuring.ghastly_brewID = config.get(Configuring.CategoryItemIDs, "ghastly brew id", 11907).getInt(11907);
            
            Configuring.potion_redID = config.get(Configuring.CategoryItemIDs, "red potion id", 11908).getInt(11908);
            Configuring.potion_greenID = config.get(Configuring.CategoryItemIDs, "green potion id", 11909).getInt(11909);
            Configuring.potion_blueID = config.get(Configuring.CategoryItemIDs, "blue potion id", 11910).getInt(11910);
            Configuring.bottled_fairyID = config.get(Configuring.CategoryItemIDs, "bottle fairy id", 11911).getInt(11911);

            Configuring.dungeonLoots = config.get(Configuring.CategoryGlobal, "dungeon loot enabled", true).getBoolean(true);
            Configuring.newTrades = config.get(Configuring.CategoryGlobal, "edited villager trades enabled", true).getBoolean(true);
            
            if (Reference.FORCE_DEBUG){
    			System.out.println("[CHATEAU ROMANI] String printing - Item IDs");
    			System.out.println("[CHATEAU ROMANI] Chateau Romani - " + Items.chateau_romani.itemID);
    			System.out.println("[CHATEAU ROMANI] Milk Bottle - " + Items.milk_bottle.itemID);
    			System.out.println("[CHATEAU ROMANI] Fermented Grains - " + Items.fermented_grain.itemID);
    			System.out.println("[CHATEAU ROMANI] LonLon Milk - " + Items.lonlon_milk_full.itemID + ", " + Items.lonlon_milk_half.itemID);
    			System.out.println("[CHATEAU ROMANI] Bottled Fire - " + Items.bottled_fire.itemID);
    			System.out.println("[CHATEAU ROMANI] Bottled Ghast - " + Items.bottled_ghast.itemID);
    			System.out.println("[CHATEAU ROMANI] Ghastly Brew - " + Items.ghastly_brew.itemID);
    			
    			System.out.println("[CHATEAU ROMANI] Potions - " + Items.potion_red.itemID + ", " + Items.potion_green.itemID + ", " + Items.potion_blue.itemID);
    			System.out.println("[CHATEAU ROMANI] Bottled Fairy - " + Items.bottled_fairy.itemID);
            }
            
            System.out.println("[CHATEAU ROMANI] Configuration file loaded.");
            
        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, "Error loading the configuration of [CHATEAU ROMANI]. Error message: " + e.getMessage() + " / " + e.toString());
        } finally {
            config.save();
        }
        
    }

}