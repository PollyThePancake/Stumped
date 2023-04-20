package io.github.pollythepancake.stumped.items.custom.other;

import io.github.pollythepancake.stumped.items.custom.CustomItem;
import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.WallStandingBlockItem;

import java.util.ArrayList;

public class CustomTorchItem extends CustomItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomTorchItem(String id, Block standingSign, Block wallSign) {
        super(id, new WallStandingBlockItem(standingSign, wallSign, new FabricItemSettings().group(ModGroups.STUMPED_ITEMS)));
        items.add(this.getItem());
    }
}
