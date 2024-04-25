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

    private final Item item;
    private final Identifier id;

    public NewItem(String id, Item item, RegistryKey<ItemGroup> group) {
        this.item = item;
        this.id = new Identifier(ModInit.MOD_ID, id);
        Registry.register(Registries.ITEM, this.id, this.item);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public Item getItem() {
        return this.item;
    }

    public Identifier getId() {
        return this.id;
    }

}
