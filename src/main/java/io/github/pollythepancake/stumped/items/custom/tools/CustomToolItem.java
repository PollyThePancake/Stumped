package io.github.pollythepancake.stumped.items.custom.tools;

import io.github.pollythepancake.stumped.items.custom.CustomItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;

public class CustomToolItem extends CustomItem {

    public CustomToolItem(String id, Item item) {
        super(id, item);
    }

    public CustomToolItem(String id, Item item, int burnTime) {
        super(id, item);
        FuelRegistry.INSTANCE.add(item, burnTime);
    }
}