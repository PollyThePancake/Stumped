package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class JungleItems {

    public static String path = "jungle/";

    // Weapons
    public static final CustomTool JUNGLE_SWORD = new CustomTool(path + "jungle_sword", new CustomSword(), 200);
    public static final CustomTool JUNGLE_BOW = new CustomTool(path + "jungle_bow", new CustomBow(), 200);
    public static final CustomTool JUNGLE_CROSSBOW = new CustomTool(path + "jungle_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield JUNGLE_SHIELD = new CustomShield(path + "jungle_shield");

    // Tools
    public static final CustomTool JUNGLE_PICKAXE = new CustomTool(path + "jungle_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool JUNGLE_AXE = new CustomTool(path + "jungle_axe", new CustomAxe(), 200);
    public static final CustomTool JUNGLE_SHOVEL = new CustomTool(path + "jungle_shovel", new CustomShovel(), 200);
    public static final CustomTool JUNGLE_HOE = new CustomTool(path + "jungle_hoe", new CustomHoe(), 200);

    public static void registerJungleItems() {
        ModInit.LOGGER.debug("Registering Jungle Items for " + ModInit.MOD_ID);
    }
}