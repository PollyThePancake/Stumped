package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewSaplingBlock extends NewBlock {


    public NewSaplingBlock(String id, SaplingGenerator saplingGenerator, RegistryKey<ItemGroup> group) {
        super(id, new SaplingBlock(saplingGenerator, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 100);
    }
}