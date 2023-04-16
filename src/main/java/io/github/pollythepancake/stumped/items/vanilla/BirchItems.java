package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class BirchItems {

    public static String path = "birch/";

    // Weapons
    public static final CustomTool BIRCH_SWORD = new CustomTool(path + "birch_sword", new CustomSword(), 200);
    public static final CustomTool BIRCH_BOW = new CustomTool(path + "birch_bow", new CustomBow(), 200);
    public static final CustomTool BIRCH_CROSSBOW = new CustomTool(path + "birch_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield BIRCH_SHIELD = new CustomShield(path + "birch_shield");

    // Tools
    public static final CustomTool BIRCH_PICKAXE = new CustomTool(path + "birch_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool BIRCH_AXE = new CustomTool(path + "birch_axe", new CustomAxe(), 200);
    public static final CustomTool BIRCH_SHOVEL = new CustomTool(path + "birch_shovel", new CustomShovel(), 200);
    public static final CustomTool BIRCH_HOE = new CustomTool(path + "birch_hoe", new CustomHoe(), 200);

    public static void registerBirchItems() {
        ModInit.LOGGER.debug("Registering Birch Items for " + ModInit.MOD_ID);
    }
}