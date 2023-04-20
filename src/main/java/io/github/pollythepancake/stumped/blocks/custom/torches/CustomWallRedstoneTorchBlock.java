package io.github.pollythepancake.stumped.blocks.custom.torches;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallRedstoneTorchBlock;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomWallRedstoneTorchBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomWallRedstoneTorchBlock(String id) {
        super(id, new WallRedstoneTorchBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_WALL_TORCH).nonOpaque().noCollision()));
        Item item = this.getItem();
        items.add(item);
        blocks.add(this.getBlock());
    }
}