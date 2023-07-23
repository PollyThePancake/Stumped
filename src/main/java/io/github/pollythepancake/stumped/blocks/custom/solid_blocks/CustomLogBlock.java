package io.github.pollythepancake.stumped.blocks.custom.solid_blocks;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomLogBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomLogBlock(String id, boolean isFuel) {
        super(id, new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), new FabricItemSettings().group(StumpedGroups.STUMPED_BLOCKS));
        Item item = this.getItem();
        if (isFuel) FuelRegistry.INSTANCE.add(item, 300);
        items.add(item);
        blocks.add(this.getBlock());
    }

    public CustomLogBlock(String id, CustomLogBlock base, boolean isFuel) {
        super(id, new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), new FabricItemSettings().group(StumpedGroups.STUMPED_BLOCKS));
        Item item = this.getItem();
        if (isFuel) FuelRegistry.INSTANCE.add(item, 300);
        items.add(item);
        Block block = this.getBlock();
        blocks.add(block);
        StrippableBlockRegistry.register(base.getBlock(), block);
    }
}