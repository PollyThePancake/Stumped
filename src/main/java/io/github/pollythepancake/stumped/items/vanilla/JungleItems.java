package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.JungleBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class JungleItems {

    public static String path = "jungle/";

    // Weapons
    public static final CustomToolItem JUNGLE_SWORD = new CustomToolItem(path + "jungle_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem JUNGLE_BOW = new CustomToolItem(path + "jungle_bow", new CustomBowItem(), 300);
    public static final CustomToolItem JUNGLE_CROSSBOW = new CustomToolItem(path + "jungle_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem JUNGLE_SHIELD = new CustomShieldItem(path + "jungle_shield");

    // Tools
    public static final CustomToolItem JUNGLE_PICKAXE = new CustomToolItem(path + "jungle_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem JUNGLE_AXE = new CustomToolItem(path + "jungle_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem JUNGLE_SHOVEL = new CustomToolItem(path + "jungle_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem JUNGLE_HOE = new CustomToolItem(path + "jungle_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem JUNGLE_TORCH = new CustomTorchItem(path + "jungle_torch", JungleBlocks.JUNGLE_TORCH.getBlock(), JungleBlocks.WALL_JUNGLE_TORCH.getBlock());
    public static final CustomTorchItem JUNGLE_SOUL_TORCH = new CustomTorchItem(path + "jungle_soul_torch", JungleBlocks.JUNGLE_SOUL_TORCH.getBlock(), JungleBlocks.WALL_JUNGLE_SOUL_TORCH.getBlock());
    public static final CustomTorchItem JUNGLE_REDSTONE_TORCH = new CustomTorchItem(path + "jungle_redstone_torch", JungleBlocks.JUNGLE_REDSTONE_TORCH.getBlock(), JungleBlocks.WALL_JUNGLE_REDSTONE_TORCH.getBlock());

    public static void registerJungleItems() {
        ModInit.LOGGER.debug("Registering Jungle Items for " + ModInit.MOD_ID);
    }
}