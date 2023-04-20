package io.github.pollythepancake.stumped.items.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.vanilla.DarkOakBlocks;
import io.github.pollythepancake.stumped.items.custom.other.CustomTorchItem;
import io.github.pollythepancake.stumped.items.custom.tools.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomSwordItem;

public class DarkOakItems {

    public static String path = "dark_oak/";

    // Weapons
    public static final CustomToolItem DARK_OAK_SWORD = new CustomToolItem(path + "dark_oak_sword", new CustomSwordItem(), 200);
    public static final CustomToolItem DARK_OAK_BOW = new CustomToolItem(path + "dark_oak_bow", new CustomBowItem(), 300);
    public static final CustomToolItem DARK_OAK_CROSSBOW = new CustomToolItem(path + "dark_oak_crossbow", new CustomCrossbowItem(), 300);
    public static final CustomShieldItem DARK_OAK_SHIELD = new CustomShieldItem(path + "dark_oak_shield");

    // Tools
    public static final CustomToolItem DARK_OAK_PICKAXE = new CustomToolItem(path + "dark_oak_pickaxe", new CustomPickaxeItem(), 200);
    public static final CustomToolItem DARK_OAK_AXE = new CustomToolItem(path + "dark_oak_axe", new CustomAxeItem(), 200);
    public static final CustomToolItem DARK_OAK_SHOVEL = new CustomToolItem(path + "dark_oak_shovel", new CustomShovelItem(), 200);
    public static final CustomToolItem DARK_OAK_HOE = new CustomToolItem(path + "dark_oak_hoe", new CustomHoeItem(), 200);

    // Other
    public static final CustomTorchItem DARK_OAK_TORCH = new CustomTorchItem(path + "dark_oak_torch", DarkOakBlocks.DARK_OAK_TORCH.getBlock(), DarkOakBlocks.WALL_DARK_OAK_TORCH.getBlock());
    public static final CustomTorchItem DARK_OAK_SOUL_TORCH = new CustomTorchItem(path + "dark_oak_soul_torch", DarkOakBlocks.DARK_OAK_SOUL_TORCH.getBlock(), DarkOakBlocks.WALL_DARK_OAK_SOUL_TORCH.getBlock());
    public static final CustomTorchItem DARK_OAK_REDSTONE_TORCH = new CustomTorchItem(path + "dark_oak_redstone_torch", DarkOakBlocks.DARK_OAK_REDSTONE_TORCH.getBlock(), DarkOakBlocks.WALL_DARK_OAK_REDSTONE_TORCH.getBlock());

    public static void registerDarkOakItems() {
        ModInit.LOGGER.debug("Registering Dark Oak Items for " + ModInit.MOD_ID);
    }
}