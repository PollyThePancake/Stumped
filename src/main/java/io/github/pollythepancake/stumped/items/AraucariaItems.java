package io.github.pollythepancake.stumped.items;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.items.custom.NewHangingSignItem;
import io.github.pollythepancake.stumped.items.custom.NewItem;
import io.github.pollythepancake.stumped.items.custom.NewSignItem;
import io.github.pollythepancake.stumped.util.ItemGroups;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class AraucariaItems {

    public static String name = "araucaria";
    public static RegistryKey<ItemGroup> itemGroup = ItemGroups.STUMPED_ITEMS;

    // Signs

    public static final NewItem SIGN = new NewSignItem(name + "_sign", AraucariaBlocks.SIGN.getBlock(), AraucariaBlocks.WALL_SIGN.getBlock(), itemGroup);
    public static final NewItem HANGING_SIGN = new NewHangingSignItem(name + "_hanging_sign", AraucariaBlocks.HANGING_SIGN.getBlock(), AraucariaBlocks.WALL_HANGING_SIGN.getBlock(), itemGroup);

    public static void registerAraucariaItems() {
        ModInit.LOGGER.debug("Registering Araucaria Items for " + ModInit.MOD_ID);
    }
}