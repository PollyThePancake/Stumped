package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.BirchBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class BirchItems {

    public static String path = "birch/";

    // Weapons
    public static final CustomToolItem BIRCH_SWORD = new CustomToolItem(path + "birch_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem BIRCH_BOW = new CustomToolItem(path + "birch_bow", new CustomBowItem(), 300);
    public static final CustomToolItem BIRCH_CROSSBOW = new CustomToolItem(path + "birch_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem BIRCH_SHIELD = new CustomShieldItem(path + "birch_shield");

    // Tools
    public static final CustomToolItem BIRCH_PICKAXE = new CustomToolItem(path + "birch_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem BIRCH_AXE = new CustomToolItem(path + "birch_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem BIRCH_SHOVEL = new CustomToolItem(path + "birch_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem BIRCH_HOE = new CustomToolItem(path + "birch_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem BIRCH_TORCH = new CustomTorchItem(path + "birch_torch", BirchBlocks.BIRCH_TORCH.getBlock(), BirchBlocks.WALL_BIRCH_TORCH.getBlock());
    public static final CustomTorchItem BIRCH_SOUL_TORCH = new CustomTorchItem(path + "birch_soul_torch", BirchBlocks.BIRCH_SOUL_TORCH.getBlock(), BirchBlocks.WALL_BIRCH_SOUL_TORCH.getBlock());
    public static final CustomTorchItem BIRCH_REDSTONE_TORCH = new CustomTorchItem(path + "birch_redstone_torch", BirchBlocks.BIRCH_REDSTONE_TORCH.getBlock(), BirchBlocks.WALL_BIRCH_REDSTONE_TORCH.getBlock());

    public static void registerBirchItems() {
        ModInit.LOGGER.debug("Registering Birch Items for " + ModInit.MOD_ID);
    }
}