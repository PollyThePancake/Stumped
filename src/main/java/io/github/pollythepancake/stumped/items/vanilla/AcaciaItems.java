package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class AcaciaItems {

    public static String path = "acacia/";

    // Weapons
    public static final CustomTool ACACIA_SWORD = new CustomTool(path + "acacia_sword", new CustomSword(), 200);
    public static final CustomTool ACACIA_BOW = new CustomTool(path + "acacia_bow", new CustomBow(), 200);
    public static final CustomTool ACACIA_CROSSBOW = new CustomTool(path + "acacia_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield ACACIA_SHIELD = new CustomShield(path + "acacia_shield");

    // Tools
    public static final CustomTool ACACIA_PICKAXE = new CustomTool(path + "acacia_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool ACACIA_AXE = new CustomTool(path + "acacia_axe", new CustomAxe(), 200);
    public static final CustomTool ACACIA_SHOVEL = new CustomTool(path + "acacia_shovel", new CustomShovel(), 200);
    public static final CustomTool ACACIA_HOE = new CustomTool(path + "acacia_hoe", new CustomHoe(), 200);

    public static void registerAcaciaItems() {
        ModInit.LOGGER.debug("Registering Acacia Items for " + ModInit.MOD_ID);
    }
}