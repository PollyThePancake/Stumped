package io.github.pollythepancake.stumped.items.custom;

import io.github.pollythepancake.stumped.items.custom.CustomItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;

public class CustomTool extends CustomItem {

    public CustomTool(String id, Item item) {
        super(id, item);
    }

    public CustomTool(String id, Item item, int burnTime) {
        super(id, item);
        FuelRegistry.INSTANCE.add(item, burnTime);
    }
}