package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomPottedSaplingBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomPottedSaplingBlock(String id, Block sapling) {
        super(id, new FlowerPotBlock(sapling, FabricBlockSettings.copy(Blocks.POTTED_OAK_SAPLING).breakInstantly().nonOpaque()));
        items.add(this.getItem());
        blocks.add(this.getBlock());
    }
}
