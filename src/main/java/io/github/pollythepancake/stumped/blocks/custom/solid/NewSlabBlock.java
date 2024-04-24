package io.github.pollythepancake.stumped.blocks.custom.solid;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewSlabBlock extends NewBlock {


    public NewSlabBlock(String id, RegistryKey<ItemGroup> group) {
        super(id, new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 300);


    }
}