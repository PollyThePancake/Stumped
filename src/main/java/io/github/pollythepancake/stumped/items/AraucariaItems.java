package io.github.pollythepancake.stumped.items;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomBoatItem;
import io.github.pollythepancake.stumped.items.custom.other.CustomSignItem;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class AraucariaItems {

    public static String path = "araucaria/";

    // Weapons
    public static final CustomToolItem ARAUCARIA_SWORD = new CustomToolItem(path + "araucaria_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem ARAUCARIA_BOW = new CustomToolItem(path + "araucaria_bow", new CustomBowItem(), 300);
    public static final CustomToolItem ARAUCARIA_CROSSBOW = new CustomToolItem(path + "araucaria_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem ARAUCARIA_SHIELD = new CustomShieldItem(path + "araucaria_shield");

    // Tools
    public static final CustomToolItem ARAUCARIA_PICKAXE = new CustomToolItem(path + "araucaria_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem ARAUCARIA_AXE = new CustomToolItem(path + "araucaria_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem ARAUCARIA_SHOVEL = new CustomToolItem(path + "araucaria_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem ARAUCARIA_HOE = new CustomToolItem(path + "araucaria_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomSignItem ARAUCARIA_SIGN = new CustomSignItem(path + "araucaria_sign", AraucariaBlocks.ARAUCARIA_SIGN.getBlock(), AraucariaBlocks.ARAUCARIA_WALL_SIGN.getBlock(), 200);
    public static final CustomTorchItem ARAUCARIA_TORCH = new CustomTorchItem(path + "araucaria_torch", AraucariaBlocks.ARAUCARIA_TORCH.getBlock(), AraucariaBlocks.WALL_ARAUCARIA_TORCH.getBlock());
    public static final CustomTorchItem ARAUCARIA_SOUL_TORCH = new CustomTorchItem(path + "araucaria_soul_torch", AraucariaBlocks.ARAUCARIA_SOUL_TORCH.getBlock(), AraucariaBlocks.WALL_ARAUCARIA_SOUL_TORCH.getBlock());
    public static final CustomTorchItem ARAUCARIA_REDSTONE_TORCH = new CustomTorchItem(path + "araucaria_redstone_torch", AraucariaBlocks.ARAUCARIA_REDSTONE_TORCH.getBlock(), AraucariaBlocks.WALL_ARAUCARIA_REDSTONE_TORCH.getBlock());

    public static final CustomBoatItem ARAUCARIA_BOATS = new CustomBoatItem(path + "araucaria", false, AraucariaBlocks.ARAUCARIA_PLANKS.getItem(), 1200);

    public static void registerAraucariaItems() {
        ModInit.LOGGER.debug("Registering Araucaria Items for " + ModInit.MOD_ID);
    }
}