package io.github.pollythepancake.stumped.blocks.custom;

import io.github.pollythepancake.stumped.ModInit;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class NewBlock {

    private final Block block;
    private final Identifier id;
    private Item item;

    // For a blocks without items
    public NewBlock(String id, Block block) {
        this.block = block;
        this.id = new Identifier(ModInit.MOD_ID, id);
        Registry.register(Registries.BLOCK, this.id, this.block);
    }

    // For blocks with items
    public NewBlock(String id, Block block, Item.Settings settings, RegistryKey<ItemGroup> group) {
        this.block = block;
        this.item = new BlockItem(block, settings);
        this.id = new Identifier(ModInit.MOD_ID, id);
        Registry.register(Registries.BLOCK, this.id, this.block);
        Registry.register(Registries.ITEM, this.id, this.item);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public Block getBlock() {
        return this.block;
    }

    public Item getItem() {
        return this.item;
    }

    public Identifier getId() {
        return this.id;
    }
}
