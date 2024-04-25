package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewWoodenFenceBlock extends NewBlock {


    public NewWoodenFenceBlock(String id, RegistryKey<ItemGroup> group) {
        super(id, new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 300);


    }
}