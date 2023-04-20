package io.github.pollythepancake.stumped.blocks.custom.torches;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;

import java.util.ArrayList;

public class CustomTorchBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomTorchBlock(String id) {
        super(id, new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH).nonOpaque().noCollision(), ParticleTypes.FLAME));
        Item item = this.getItem();
        items.add(item);
        blocks.add(this.getBlock());
    }
}