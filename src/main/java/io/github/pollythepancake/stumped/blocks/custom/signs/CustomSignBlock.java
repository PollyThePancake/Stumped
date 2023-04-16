package io.github.pollythepancake.stumped.blocks.custom.signs;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SignBlock;
import net.minecraft.item.Item;
import net.minecraft.util.SignType;

import java.util.ArrayList;

public class CustomSignBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomSignBlock(String id, SignType signType) {
        super(id, new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), signType));
        Item item = this.getItem();
        items.add(item);
        blocks.add(this.getBlock());
    }
}