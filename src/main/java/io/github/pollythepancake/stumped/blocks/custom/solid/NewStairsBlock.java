package io.github.pollythepancake.stumped.blocks.custom.solid;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewStairsBlock extends NewBlock {


    public NewStairsBlock(String id, NewBlock planks, RegistryKey<ItemGroup> group) {
        super(id, new StairsBlock(planks.getBlock().getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 300);


    }
}