package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewWoodenButtonBlock extends NewBlock {

    public NewWoodenButtonBlock(String id, BlockSetType blockSetType, RegistryKey<ItemGroup> group) {
        super(id, new ButtonBlock(blockSetType, 10, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 100);
    }
}