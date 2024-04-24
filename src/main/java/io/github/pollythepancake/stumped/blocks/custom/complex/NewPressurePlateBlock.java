package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewPressurePlateBlock extends NewBlock {


    public NewPressurePlateBlock(String id, BlockSetType blockSetType, RegistryKey<ItemGroup> group) {
        super(id, new PressurePlateBlock(blockSetType, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 300);


    }
}