package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.CustomBlock;
import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomTrapdoorBlock extends CustomBlock {

    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Block> blocks = new ArrayList<>();

    public CustomTrapdoorBlock(String id, boolean isFuel) {
        super(id, new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)), new FabricItemSettings().group(StumpedGroups.STUMPED_ITEMS));
        Item item = this.getItem();
        if (isFuel) FuelRegistry.INSTANCE.add(item, 300);
        items.add(item);
        blocks.add(this.getBlock());
    }
}