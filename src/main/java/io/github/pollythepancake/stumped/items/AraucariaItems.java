package io.github.pollythepancake.stumped.items;

import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import io.github.pollythepancake.stumped.items.custom.CustomSignItem;
import io.github.pollythepancake.stumped.items.custom.CustomTool;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSword;
import io.github.pollythepancake.stumped.ModInit;

public class AraucariaItems {

    public static String path = "araucaria/";

    // Weapons
    public static final CustomTool ARAUCARIA_SWORD = new CustomTool(path + "araucaria_sword", new CustomSword(), 200);
    public static final CustomTool ARAUCARIA_BOW = new CustomTool(path + "araucaria_bow", new CustomBow(), 200);
    public static final CustomTool ARAUCARIA_CROSSBOW = new CustomTool(path + "araucaria_crossbow", new CustomCrossbow(), 200);
    public static final CustomShield ARAUCARIA_SHIELD = new CustomShield(path + "araucaria_shield");

    // Tools
    public static final CustomTool ARAUCARIA_PICKAXE = new CustomTool(path + "araucaria_pickaxe", new CustomPickaxe(), 200);
    public static final CustomTool ARAUCARIA_AXE = new CustomTool(path + "araucaria_axe", new CustomAxe(), 200);
    public static final CustomTool ARAUCARIA_SHOVEL = new CustomTool(path + "araucaria_shovel", new CustomShovel(), 200);
    public static final CustomTool ARAUCARIA_HOE = new CustomTool(path + "araucaria_hoe", new CustomHoe(), 200);

    // Blocks

    public static final CustomSignItem ARAUCARIA_SIGN = new CustomSignItem(path + "araucaria_sign", AraucariaBlocks.ARAUCARIA_SIGN.getBlock(), AraucariaBlocks.ARAUCARIA_WALL_SIGN.getBlock(), 200);

    // Other

    public static void registerAraucariaItems() {
        ModInit.LOGGER.debug("Registering Araucaria Items for " + ModInit.MOD_ID);
    }
}