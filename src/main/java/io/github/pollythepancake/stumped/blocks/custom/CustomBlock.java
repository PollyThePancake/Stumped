package io.github.pollythepancake.stumped.blocks.custom;

import io.github.pollythepancake.stumped.ModInit;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomBlock {

    private final String id;
    private final Block block;
    private final Identifier identifier;
    private Item item;

    // For a blocks without items
    public CustomBlock(String id, Block block) {
        this.id = id;
        this.block = block;
        this.identifier = new Identifier(ModInit.MOD_ID, id);
        Registry.register(Registry.BLOCK, this.identifier, this.block);
    }

    // For blocks with items
    public CustomBlock(String id, Block block, FabricItemSettings settings) {
        this.id = id;
        this.block = block;
        this.item = new BlockItem(block, settings);
        this.identifier = new Identifier(ModInit.MOD_ID, id);
        Registry.register(Registry.BLOCK, this.identifier, this.block);
        Registry.register(Registry.ITEM, this.identifier, this.item);
    }

    public String getId() {
        return this.id;
    }

    public Block getBlock() {
        return this.block;
    }

    public Item getItem() {
        return this.item;
    }

    public Identifier getIdentifier() {
        return this.identifier;
    }
}