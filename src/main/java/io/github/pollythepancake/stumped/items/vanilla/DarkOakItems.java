package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class DarkOakItems {

    public static String path = "dark_oak/";

    // Weapons
    public static final CustomTool DARK_OAK_SWORD = new CustomTool(path + "dark_oak_sword", new CustomSword(), 200);
    public static final CustomTool DARK_OAK_BOW = new CustomTool(path + "dark_oak_bow", new CustomBow(), 200);
    public static final CustomTool DARK_OAK_CROSSBOW = new CustomTool(path + "dark_oak_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield DARK_OAK_SHIELD = new CustomShield(path + "dark_oak_shield");

    // Tools
    public static final CustomTool DARK_OAK_PICKAXE = new CustomTool(path + "dark_oak_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool DARK_OAK_AXE = new CustomTool(path + "dark_oak_axe", new CustomAxe(), 200);
    public static final CustomTool DARK_OAK_SHOVEL = new CustomTool(path + "dark_oak_shovel", new CustomShovel(), 200);
    public static final CustomTool DARK_OAK_HOE = new CustomTool(path + "dark_oak_hoe", new CustomHoe(), 200);

    public static void registerDark_OakItems() {
        ModInit.LOGGER.debug("Registering Dark_Oak Items for " + ModInit.MOD_ID);
    }
}