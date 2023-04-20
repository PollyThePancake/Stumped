package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.SpruceBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class SpruceItems {

    public static String path = "spruce/";

    // Weapons
    public static final CustomToolItem SPRUCE_SWORD = new CustomToolItem(path + "spruce_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem SPRUCE_BOW = new CustomToolItem(path + "spruce_bow", new CustomBowItem(), 300);
    public static final CustomToolItem SPRUCE_CROSSBOW = new CustomToolItem(path + "spruce_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem SPRUCE_SHIELD = new CustomShieldItem(path + "spruce_shield");

    // Tools
    public static final CustomToolItem SPRUCE_PICKAXE = new CustomToolItem(path + "spruce_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem SPRUCE_AXE = new CustomToolItem(path + "spruce_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem SPRUCE_SHOVEL = new CustomToolItem(path + "spruce_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem SPRUCE_HOE = new CustomToolItem(path + "spruce_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem SPRUCE_TORCH = new CustomTorchItem(path + "spruce_torch", SpruceBlocks.SPRUCE_TORCH.getBlock(), SpruceBlocks.WALL_SPRUCE_TORCH.getBlock());
    public static final CustomTorchItem SPRUCE_SOUL_TORCH = new CustomTorchItem(path + "spruce_soul_torch", SpruceBlocks.SPRUCE_SOUL_TORCH.getBlock(), SpruceBlocks.WALL_SPRUCE_SOUL_TORCH.getBlock());
    public static final CustomTorchItem SPRUCE_REDSTONE_TORCH = new CustomTorchItem(path + "spruce_redstone_torch", SpruceBlocks.SPRUCE_REDSTONE_TORCH.getBlock(), SpruceBlocks.WALL_SPRUCE_REDSTONE_TORCH.getBlock());

    public static void registerSpruceItems() {
        ModInit.LOGGER.debug("Registering Spruce Items for " + ModInit.MOD_ID);
    }
}