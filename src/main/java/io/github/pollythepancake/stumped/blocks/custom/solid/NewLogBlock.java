package io.github.pollythepancake.stumped.blocks.custom.solid;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewLogBlock extends NewBlock {


    public NewLogBlock(String id, RegistryKey<ItemGroup> group) {
        super(id, new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 300);
    }

    public NewLogBlock(String id, NewBlock base, RegistryKey<ItemGroup> group) {
        super(id, new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 300);
        StrippableBlockRegistry.register(base.getBlock(), this.getBlock());
    }
}