package io.github.pollythepancake.stumped.blocks.custom.signs;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallSignBlock;
import net.minecraft.item.Item;
import net.minecraft.util.SignType;

import java.util.ArrayList;

public class CustomWallSignBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomWallSignBlock(String id, SignType signType) {
        super(id, new WallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), signType));
        items.add(this.getItem());
        blocks.add(this.getBlock());
    }
}