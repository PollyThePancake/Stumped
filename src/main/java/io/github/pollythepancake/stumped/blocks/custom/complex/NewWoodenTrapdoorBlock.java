package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewWoodenTrapdoorBlock extends NewBlock {


    public NewWoodenTrapdoorBlock(String id, BlockSetType blockSetType, RegistryKey<ItemGroup> group) {
        super(id, new TrapdoorBlock(blockSetType, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 300);


    }
}