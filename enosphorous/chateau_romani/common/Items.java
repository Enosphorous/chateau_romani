package enosphorous.chateau_romani.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import enosphorous.chateau_romani.items.ItemBluePotion;
import enosphorous.chateau_romani.items.ItemBottledFairy;
import enosphorous.chateau_romani.items.ItemBottledFire;
import enosphorous.chateau_romani.items.ItemBottledGhast;
import enosphorous.chateau_romani.items.ItemChateauRomani;
import enosphorous.chateau_romani.items.ItemFermentedGrains;
import enosphorous.chateau_romani.items.ItemGhastlyBrew;
import enosphorous.chateau_romani.items.ItemGreenPotion;
import enosphorous.chateau_romani.items.ItemLonLonMilk;
import enosphorous.chateau_romani.items.ItemLonLonMilkHalf;
import enosphorous.chateau_romani.items.ItemMilkBottle;
import enosphorous.chateau_romani.items.ItemRedPotion;

public class Items {
	
	public static Item chateau_romani;
	public static Item milk_bottle;
	public static Item fermented_grain;
	public static Item lonlon_milk_full;
	public static Item lonlon_milk_half;
	public static Item bottled_fire;
	public static Item bottled_ghast;
	public static Item ghastly_brew;
	
	public static Item potion_red;
	public static Item potion_blue;
	public static Item potion_green;
	public static Item bottled_fairy;
	
	public static void initialize() {
		
		chateau_romani = new ItemChateauRomani(Configuring.chateau_romaniID);
		milk_bottle = new ItemMilkBottle(Configuring.milk_bottleID);
		fermented_grain = new ItemFermentedGrains(Configuring.fermented_grainsID);
		lonlon_milk_half = new ItemLonLonMilkHalf(Configuring.lonlon_milk_halfID, "half");
		lonlon_milk_full = new ItemLonLonMilk(Configuring.lonlon_milk_fullID, "full");
		bottled_fire = new ItemBottledFire(Configuring.bottled_fireID, Block.fire);
		bottled_ghast = new ItemBottledGhast(Configuring.bottled_ghastID);
		ghastly_brew = new ItemGhastlyBrew(Configuring.ghastly_brewID);
		
		potion_red = new ItemRedPotion(Configuring.potion_redID);
		potion_green = new ItemGreenPotion(Configuring.potion_greenID);
		potion_blue = new ItemBluePotion(Configuring.potion_blueID);
		bottled_fairy = new ItemBottledFairy(Configuring.bottled_fairyID);
		
		if (Reference.FORCE_DEBUG) {
			System.out.println("[CHATEAU ROMANI] Items beginning initialization. . .");
			System.out.println("[CHATEAU ROMANI] Chateau Romani added.");
			System.out.println("[CHATEAU ROMANI] Milk bottle added.");
			System.out.println("[CHATEAU ROMANI] Fermented grains added.");
			System.out.println("[CHATEAU ROMANI] LonLon Milk added.");
			System.out.println("[CHATEAU ROMANI] Bottled Fire added.");
			System.out.println("[CHATEAU ROMANI] Bottled Ghast added.");
			System.out.println("[CHATEAU ROMANI] Ghastly Brew added.");
			
			System.out.println("[CHATEAU ROMANI] Potions added.");
			System.out.println("[CHATEAU ROMANI] Bottled Fairy added.");


			System.out.println("[CHATEAU ROMANI] Found and added " + Reference.ITEM_COUNT + " items.");
			System.out.println("[CHATEAU ROMANI] Found and added " + Reference.BLOCK_COUNT + " blocks.");
		}
		
	}

}
