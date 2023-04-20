package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.AcaciaBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class AcaciaItems {

    public static String path = "acacia/";

    // Weapons
    public static final CustomToolItem ACACIA_SWORD = new CustomToolItem(path + "acacia_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem ACACIA_BOW = new CustomToolItem(path + "acacia_bow", new CustomBowItem(), 300);
    public static final CustomToolItem ACACIA_CROSSBOW = new CustomToolItem(path + "acacia_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem ACACIA_SHIELD = new CustomShieldItem(path + "acacia_shield");

    // Tools
    public static final CustomToolItem ACACIA_PICKAXE = new CustomToolItem(path + "acacia_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem ACACIA_AXE = new CustomToolItem(path + "acacia_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem ACACIA_SHOVEL = new CustomToolItem(path + "acacia_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem ACACIA_HOE = new CustomToolItem(path + "acacia_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem ACACIA_TORCH = new CustomTorchItem(path + "acacia_torch", AcaciaBlocks.ACACIA_TORCH.getBlock(), AcaciaBlocks.WALL_ACACIA_TORCH.getBlock());
    public static final CustomTorchItem ACACIA_SOUL_TORCH = new CustomTorchItem(path + "acacia_soul_torch", AcaciaBlocks.ACACIA_SOUL_TORCH.getBlock(), AcaciaBlocks.WALL_ACACIA_SOUL_TORCH.getBlock());
    public static final CustomTorchItem ACACIA_REDSTONE_TORCH = new CustomTorchItem(path + "acacia_redstone_torch", AcaciaBlocks.ACACIA_REDSTONE_TORCH.getBlock(), AcaciaBlocks.WALL_ACACIA_REDSTONE_TORCH.getBlock());

    public static void registerAcaciaItems() {
        ModInit.LOGGER.debug("Registering Acacia Items for " + ModInit.MOD_ID);
    }
}