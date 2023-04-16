package io.github.pollythepancake.stumped.items.custom.tools;

import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;

import java.util.ArrayList;

public class CustomHoe extends HoeItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomHoe() {
        super(ToolMaterials.WOOD, 0, -3.0f, new FabricItemSettings().group(ModGroups.STUMPED_TOOLS));
        items.add(this);
    }
}
