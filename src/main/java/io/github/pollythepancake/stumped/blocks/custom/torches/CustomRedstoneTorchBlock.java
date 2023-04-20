package io.github.pollythepancake.stumped.blocks.custom.torches;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomRedstoneTorchBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomRedstoneTorchBlock(String id) {
        super(id, new RedstoneTorchBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_TORCH).nonOpaque().noCollision()));
        Item item = this.getItem();
        items.add(item);
        blocks.add(this.getBlock());
    }
}
