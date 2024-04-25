package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WoodType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewWoodenFenceGateBlock extends NewBlock {


    public NewWoodenFenceGateBlock(String id, WoodType woodType, RegistryKey<ItemGroup> group) {
        super(id, new FenceGateBlock(woodType, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 300);


    }
}