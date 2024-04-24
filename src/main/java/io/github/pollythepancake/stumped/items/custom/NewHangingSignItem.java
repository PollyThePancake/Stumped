package io.github.pollythepancake.stumped.items.custom;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class NewHangingSignItem extends NewItem {

    public NewHangingSignItem(String id, Block standingSign, Block wallSign, RegistryKey<ItemGroup> group) {
        super(id, new HangingSignItem(standingSign, wallSign, new Item.Settings().maxCount(16)), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 200);
    }
}