package io.github.pollythepancake.stumped.blocks.custom.solid;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewLeavesBlock extends NewBlock {


    public NewLeavesBlock(String id, RegistryKey<ItemGroup> group) {
        super(id, new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)), new Item.Settings(), group);


    }
}