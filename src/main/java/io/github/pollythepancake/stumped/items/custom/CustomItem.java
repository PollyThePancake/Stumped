package io.github.pollythepancake.stumped.items.custom;

import io.github.pollythepancake.stumped.ModInit;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomItem {

    private final String id;
    private final Item item;
    private final Identifier identifier;

    public CustomItem(String id, Item item) {
        this.id = id;
        this.item = item;
        this.identifier = new Identifier(ModInit.MOD_ID, id);
        Registry.register(Registry.ITEM, this.identifier, this.item);
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
