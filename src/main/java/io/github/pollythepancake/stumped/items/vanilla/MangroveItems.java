package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class MangroveItems {

    public static String path = "mangrove/";

    // Weapons
    public static final CustomTool MANGROVE_SWORD = new CustomTool(path + "mangrove_sword", new CustomSword(), 200);
    public static final CustomTool MANGROVE_BOW = new CustomTool(path + "mangrove_bow", new CustomBow(), 200);
    public static final CustomTool MANGROVE_CROSSBOW = new CustomTool(path + "mangrove_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield MANGROVE_SHIELD = new CustomShield(path + "mangrove_shield");

    // Tools
    public static final CustomTool MANGROVE_PICKAXE = new CustomTool(path + "mangrove_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool MANGROVE_AXE = new CustomTool(path + "mangrove_axe", new CustomAxe(), 200);
    public static final CustomTool MANGROVE_SHOVEL = new CustomTool(path + "mangrove_shovel", new CustomShovel(), 200);
    public static final CustomTool MANGROVE_HOE = new CustomTool(path + "mangrove_hoe", new CustomHoe(), 200);

    public static void registerMangroveItems() {
        ModInit.LOGGER.debug("Registering Mangrove Items for " + ModInit.MOD_ID);
    }
}