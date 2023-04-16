package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class OakItems {

    public static String path = "oak/";

    // Weapons
    public static final CustomTool OAK_SWORD = new CustomTool(path + "oak_sword", new CustomSword(), 200);
    public static final CustomTool OAK_BOW = new CustomTool(path + "oak_bow", new CustomBow(), 200);
    public static final CustomTool OAK_CROSSBOW = new CustomTool(path + "oak_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield OAK_SHIELD = new CustomShield(path + "oak_shield");

    // Tools
    public static final CustomTool OAK_PICKAXE = new CustomTool(path + "oak_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool OAK_AXE = new CustomTool(path + "oak_axe", new CustomAxe(), 200);
    public static final CustomTool OAK_SHOVEL = new CustomTool(path + "oak_shovel", new CustomShovel(), 200);
    public static final CustomTool OAK_HOE = new CustomTool(path + "oak_hoe", new CustomHoe(), 200);

    public static void registerOakItems() {
        ModInit.LOGGER.debug("Registering Oak Items for " + ModInit.MOD_ID);
    }
}