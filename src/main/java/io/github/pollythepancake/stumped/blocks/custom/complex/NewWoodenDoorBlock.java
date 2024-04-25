package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewWoodenDoorBlock extends NewBlock {


    public NewWoodenDoorBlock(String id, BlockSetType blockSetType, RegistryKey<ItemGroup> group) {
        super(id, new DoorBlock(blockSetType, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)), new Item.Settings(), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 200);


    }
}