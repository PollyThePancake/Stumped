package io.github.pollythepancake.stumped.items.custom;

import io.github.pollythepancake.stumped.ModInit;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class NewItem {

    private final String id;
    private final Item item;
    private final Identifier identifier;

    public NewItem(String id, Item item, RegistryKey<ItemGroup> group) {
        this.id = id;
        this.item = item;
        this.identifier = new Identifier(ModInit.MOD_ID, this.id);
        Registry.register(Registries.ITEM, this.identifier, this.item);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public String getId() {
        return this.id;
    }

    public Item getItem() {
        return this.item;
    }

    public Identifier getIdentifier() {
        return this.identifier;
    }

}
