package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.MangroveBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class MangroveItems {

    public static String path = "mangrove/";

    // Weapons
    public static final CustomToolItem MANGROVE_SWORD = new CustomToolItem(path + "mangrove_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem MANGROVE_BOW = new CustomToolItem(path + "mangrove_bow", new CustomBowItem(), 300);
    public static final CustomToolItem MANGROVE_CROSSBOW = new CustomToolItem(path + "mangrove_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem MANGROVE_SHIELD = new CustomShieldItem(path + "mangrove_shield");

    // Tools
    public static final CustomToolItem MANGROVE_PICKAXE = new CustomToolItem(path + "mangrove_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem MANGROVE_AXE = new CustomToolItem(path + "mangrove_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem MANGROVE_SHOVEL = new CustomToolItem(path + "mangrove_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem MANGROVE_HOE = new CustomToolItem(path + "mangrove_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem MANGROVE_TORCH = new CustomTorchItem(path + "mangrove_torch", MangroveBlocks.MANGROVE_TORCH.getBlock(), MangroveBlocks.WALL_MANGROVE_TORCH.getBlock());
    public static final CustomTorchItem MANGROVE_SOUL_TORCH = new CustomTorchItem(path + "mangrove_soul_torch", MangroveBlocks.MANGROVE_SOUL_TORCH.getBlock(), MangroveBlocks.WALL_MANGROVE_SOUL_TORCH.getBlock());
    public static final CustomTorchItem MANGROVE_REDSTONE_TORCH = new CustomTorchItem(path + "mangrove_redstone_torch", MangroveBlocks.MANGROVE_REDSTONE_TORCH.getBlock(), MangroveBlocks.WALL_MANGROVE_REDSTONE_TORCH.getBlock());

    public static void registerMangroveItems() {
        ModInit.LOGGER.debug("Registering Mangrove Items for " + ModInit.MOD_ID);
    }
}