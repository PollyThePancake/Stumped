package io.github.pollythepancake.stumped.blocks.custom.solid_blocks;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomWood extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomWood(String id, boolean isFuel) {
        super(id, new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), new FabricItemSettings().group(ModGroups.STUMPED_BLOCKS));
        Item item = this.getItem();
        if (isFuel) FuelRegistry.INSTANCE.add(item, 200);
        items.add(item);
        blocks.add(this.getBlock());
    }

    public CustomWood(String id, CustomWood base, boolean isFuel) {
        super(id, new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), new FabricItemSettings().group(ModGroups.STUMPED_BLOCKS));
        Item item = this.getItem();
        if (isFuel) FuelRegistry.INSTANCE.add(item, 200);
        items.add(item);
        blocks.add(this.getBlock());
    }
}