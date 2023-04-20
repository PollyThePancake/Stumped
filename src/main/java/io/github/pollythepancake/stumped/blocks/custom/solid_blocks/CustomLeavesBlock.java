package io.github.pollythepancake.stumped.blocks.custom.solid_blocks;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomLeavesBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomLeavesBlock(String id) {
        super(id, new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), new FabricItemSettings().group(ModGroups.STUMPED_BLOCKS));
        items.add(this.getItem());
        blocks.add(this.getBlock());
    }
}