package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.CrimsonBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class CrimsonItems {

    public static String path = "crimson/";

    // Weapons
    public static final CustomToolItem CRIMSON_SWORD = new CustomToolItem(path + "crimson_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem CRIMSON_BOW = new CustomToolItem(path + "crimson_bow", new CustomBowItem(), 300);
    public static final CustomToolItem CRIMSON_CROSSBOW = new CustomToolItem(path + "crimson_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem CRIMSON_SHIELD = new CustomShieldItem(path + "crimson_shield");

    // Tools
    public static final CustomToolItem CRIMSON_PICKAXE = new CustomToolItem(path + "crimson_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem CRIMSON_AXE = new CustomToolItem(path + "crimson_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem CRIMSON_SHOVEL = new CustomToolItem(path + "crimson_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem CRIMSON_HOE = new CustomToolItem(path + "crimson_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem CRIMSON_TORCH = new CustomTorchItem(path + "crimson_torch", CrimsonBlocks.CRIMSON_TORCH.getBlock(), CrimsonBlocks.WALL_CRIMSON_TORCH.getBlock());
    public static final CustomTorchItem CRIMSON_SOUL_TORCH = new CustomTorchItem(path + "crimson_soul_torch", CrimsonBlocks.CRIMSON_SOUL_TORCH.getBlock(), CrimsonBlocks.WALL_CRIMSON_SOUL_TORCH.getBlock());
    public static final CustomTorchItem CRIMSON_REDSTONE_TORCH = new CustomTorchItem(path + "crimson_redstone_torch", CrimsonBlocks.CRIMSON_REDSTONE_TORCH.getBlock(), CrimsonBlocks.WALL_CRIMSON_REDSTONE_TORCH.getBlock());

    public static void registerCrimsonItems() {
        ModInit.LOGGER.debug("Registering Crimson Items for " + ModInit.MOD_ID);
    }
}