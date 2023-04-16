package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class WarpedItems {

    public static String path = "warped/";

    // Weapons
    public static final CustomTool WARPED_SWORD = new CustomTool(path + "warped_sword", new CustomSword(), 200);
    public static final CustomTool WARPED_BOW = new CustomTool(path + "warped_bow", new CustomBow(), 200);
    public static final CustomTool WARPED_CROSSBOW = new CustomTool(path + "warped_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield WARPED_SHIELD = new CustomShield(path + "warped_shield");

    // Tools
    public static final CustomTool WARPED_PICKAXE = new CustomTool(path + "warped_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool WARPED_AXE = new CustomTool(path + "warped_axe", new CustomAxe(), 200);
    public static final CustomTool WARPED_SHOVEL = new CustomTool(path + "warped_shovel", new CustomShovel(), 200);
    public static final CustomTool WARPED_HOE = new CustomTool(path + "warped_hoe", new CustomHoe(), 200);

    public static void registerWarpedItems() {
        ModInit.LOGGER.debug("Registering Warped Items for " + ModInit.MOD_ID);
    }
}