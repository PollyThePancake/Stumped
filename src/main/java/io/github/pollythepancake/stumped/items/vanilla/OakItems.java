package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.OakBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class OakItems {

    public static String path = "oak/";

    // Weapons
    public static final CustomToolItem OAK_SWORD = new CustomToolItem(path + "oak_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem OAK_BOW = new CustomToolItem(path + "oak_bow", new CustomBowItem(), 300);
    public static final CustomToolItem OAK_CROSSBOW = new CustomToolItem(path + "oak_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem OAK_SHIELD = new CustomShieldItem(path + "oak_shield");

    // Tools
    public static final CustomToolItem OAK_PICKAXE = new CustomToolItem(path + "oak_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem OAK_AXE = new CustomToolItem(path + "oak_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem OAK_SHOVEL = new CustomToolItem(path + "oak_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem OAK_HOE = new CustomToolItem(path + "oak_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem OAK_TORCH = new CustomTorchItem(path + "oak_torch", OakBlocks.OAK_TORCH.getBlock(), OakBlocks.WALL_OAK_TORCH.getBlock());
    public static final CustomTorchItem OAK_SOUL_TORCH = new CustomTorchItem(path + "oak_soul_torch", OakBlocks.OAK_SOUL_TORCH.getBlock(), OakBlocks.WALL_OAK_SOUL_TORCH.getBlock());
    public static final CustomTorchItem OAK_REDSTONE_TORCH = new CustomTorchItem(path + "oak_redstone_torch", OakBlocks.OAK_REDSTONE_TORCH.getBlock(), OakBlocks.WALL_OAK_REDSTONE_TORCH.getBlock());

    public static void registerOakItems() {
        ModInit.LOGGER.debug("Registering Oak Items for " + ModInit.MOD_ID);
    }
}