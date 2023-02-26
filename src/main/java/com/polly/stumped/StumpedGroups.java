package com.polly.stumped;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class StumpedGroups {
    public static final ItemGroup STUMPED_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Stumped.MOD_ID, "stumped_blocks"),
            () -> new ItemStack(Blocks.OAK_PLANKS));
    public static final ItemGroup STUMPED_ITEMS = FabricItemGroupBuilder.build(new Identifier(Stumped.MOD_ID, "stumped_items"),
            () -> new ItemStack(Items.WOODEN_AXE));
}
