package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomFence extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomFence(String id, boolean isFuel) {
        super(id, new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), new FabricItemSettings().group(ModGroups.STUMPED_ITEMS));
        Item item = this.getItem();
        if (isFuel) FuelRegistry.INSTANCE.add(item, 200);
        items.add(item);
        blocks.add(this.getBlock());
    }
}