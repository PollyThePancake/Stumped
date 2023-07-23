package io.github.pollythepancake.stumped.util;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.items.AraucariaItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class StumpedGroups {

    public static final ItemGroup STUMPED_BLOCKS = FabricItemGroupBuilder.build(new Identifier(ModInit.MOD_ID, "stumped_blocks"),
            () -> new ItemStack(AraucariaBlocks.ARAUCARIA_PLANKS.getItem()));

    public static final ItemGroup STUMPED_TOOLS = FabricItemGroupBuilder.build(new Identifier(ModInit.MOD_ID, "stumped_tools"),
            () -> new ItemStack(AraucariaItems.ARAUCARIA_PICKAXE.getItem()));

    public static final ItemGroup STUMPED_WEAPONS = FabricItemGroupBuilder.build(new Identifier(ModInit.MOD_ID, "stumped_weapons"),
            () -> new ItemStack(AraucariaItems.ARAUCARIA_SHIELD.getItem()));

    public static final ItemGroup STUMPED_ITEMS = FabricItemGroupBuilder.build(new Identifier(ModInit.MOD_ID, "stumped_items"),
            () -> new ItemStack(AraucariaItems.ARAUCARIA_SIGN.getItem()));
}