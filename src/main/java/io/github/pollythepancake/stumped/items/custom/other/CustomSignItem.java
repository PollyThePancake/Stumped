package io.github.pollythepancake.stumped.items.custom.other;

import io.github.pollythepancake.stumped.items.custom.CustomItem;
import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;

import java.util.ArrayList;

public class CustomSignItem extends CustomItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomSignItem(String id, Block standingSign, Block wallSign, int burnTime) {
        super(id, new SignItem(new FabricItemSettings().group(StumpedGroups.STUMPED_ITEMS).maxCount(16), standingSign, wallSign));
        FuelRegistry.INSTANCE.add(this.getItem(), burnTime);
        items.add(this.getItem());
    }

    public CustomSignItem(String id, Block standingSign, Block wallSign) {
        super(id, new SignItem(new FabricItemSettings().group(StumpedGroups.STUMPED_ITEMS).maxCount(16), standingSign, wallSign));
        items.add(this.getItem());
    }
}
