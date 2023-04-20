package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.WarpedBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class WarpedItems {

    public static String path = "warped/";

    // Weapons
    public static final CustomToolItem WARPED_SWORD = new CustomToolItem(path + "warped_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem WARPED_BOW = new CustomToolItem(path + "warped_bow", new CustomBowItem(), 300);
    public static final CustomToolItem WARPED_CROSSBOW = new CustomToolItem(path + "warped_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem WARPED_SHIELD = new CustomShieldItem(path + "warped_shield");

    // Tools
    public static final CustomToolItem WARPED_PICKAXE = new CustomToolItem(path + "warped_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem WARPED_AXE = new CustomToolItem(path + "warped_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem WARPED_SHOVEL = new CustomToolItem(path + "warped_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem WARPED_HOE = new CustomToolItem(path + "warped_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem WARPED_TORCH = new CustomTorchItem(path + "warped_torch", WarpedBlocks.WARPED_TORCH.getBlock(), WarpedBlocks.WALL_WARPED_TORCH.getBlock());
    public static final CustomTorchItem WARPED_SOUL_TORCH = new CustomTorchItem(path + "warped_soul_torch", WarpedBlocks.WARPED_SOUL_TORCH.getBlock(), WarpedBlocks.WALL_WARPED_SOUL_TORCH.getBlock());
    public static final CustomTorchItem WARPED_REDSTONE_TORCH = new CustomTorchItem(path + "warped_redstone_torch", WarpedBlocks.WARPED_REDSTONE_TORCH.getBlock(), WarpedBlocks.WALL_WARPED_REDSTONE_TORCH.getBlock());

    public static void registerWarpedItems() {
        ModInit.LOGGER.debug("Registering Warped Items for " + ModInit.MOD_ID);
    }
}