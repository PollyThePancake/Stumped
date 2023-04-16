package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class SpruceItems {

    public static String path = "spruce/";

    // Weapons
    public static final CustomTool SPRUCE_SWORD = new CustomTool(path + "spruce_sword", new CustomSword(), 200);
    public static final CustomTool SPRUCE_BOW = new CustomTool(path + "spruce_bow", new CustomBow(), 200);
    public static final CustomTool SPRUCE_CROSSBOW = new CustomTool(path + "spruce_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield SPRUCE_SHIELD = new CustomShield(path + "spruce_shield");

    // Tools
    public static final CustomTool SPRUCE_PICKAXE = new CustomTool(path + "spruce_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool SPRUCE_AXE = new CustomTool(path + "spruce_axe", new CustomAxe(), 200);
    public static final CustomTool SPRUCE_SHOVEL = new CustomTool(path + "spruce_shovel", new CustomShovel(), 200);
    public static final CustomTool SPRUCE_HOE = new CustomTool(path + "spruce_hoe", new CustomHoe(), 200);

    public static void registerSpruceItems() {
        ModInit.LOGGER.debug("Registering Spruce Items for " + ModInit.MOD_ID);
    }
}