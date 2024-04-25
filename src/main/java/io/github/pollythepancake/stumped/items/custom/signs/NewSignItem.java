package io.github.pollythepancake.stumped.items.custom.signs;

import io.github.pollythepancake.stumped.items.custom.NewItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;
import net.minecraft.registry.RegistryKey;

public class NewSignItem extends NewItem {

    public NewSignItem(String id, Block standingSign, Block wallSign, RegistryKey<ItemGroup> group) {
        super(id, new SignItem(new Item.Settings().maxCount(16), standingSign, wallSign), group);
        FuelRegistry.INSTANCE.add(this.getItem(), 200);
    }
}