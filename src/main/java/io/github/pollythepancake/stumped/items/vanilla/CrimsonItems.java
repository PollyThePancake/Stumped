package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class CrimsonItems {

    public static String path = "crimson/";

    // Weapons
    public static final CustomTool CRIMSON_SWORD = new CustomTool(path + "crimson_sword", new CustomSword(), 200);
    public static final CustomTool CRIMSON_BOW = new CustomTool(path + "crimson_bow", new CustomBow(), 200);
    public static final CustomTool CRIMSON_CROSSBOW = new CustomTool(path + "crimson_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield CRIMSON_SHIELD = new CustomShield(path + "crimson_shield");

    // Tools
    public static final CustomTool CRIMSON_PICKAXE = new CustomTool(path + "crimson_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool CRIMSON_AXE = new CustomTool(path + "crimson_axe", new CustomAxe(), 200);
    public static final CustomTool CRIMSON_SHOVEL = new CustomTool(path + "crimson_shovel", new CustomShovel(), 200);
    public static final CustomTool CRIMSON_HOE = new CustomTool(path + "crimson_hoe", new CustomHoe(), 200);

    public static void registerCrimsonItems() {
        ModInit.LOGGER.debug("Registering Crimson Items for " + ModInit.MOD_ID);
    }
}