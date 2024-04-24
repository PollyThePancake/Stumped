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

    private final String id;
    private final Block block;
    private final Identifier identifier;
    private Item item;

    // For a blocks without items
    public NewBlock(String id, Block block) {
        this.id = id;
        this.block = block;
        this.identifier = new Identifier(ModInit.MOD_ID, id);
        Registry.register(Registries.BLOCK, this.identifier, this.block);
    }

    // For blocks with items
    public NewBlock(String id, Block block, Item.Settings settings, RegistryKey<ItemGroup> group) {
        this.id = id;
        this.block = block;
        this.item = new BlockItem(block, settings);
        this.identifier = new Identifier(ModInit.MOD_ID, id);
        Registry.register(Registries.BLOCK, this.identifier, this.block);
        Registry.register(Registries.ITEM, this.identifier, this.item);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
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
