package io.github.pollythepancake.stumped.items.custom.tools;

import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterials;

import java.util.ArrayList;

public class CustomShovelItem extends ShovelItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomShovelItem() {
        super(ToolMaterials.WOOD, 1.5f, -3.0f, new FabricItemSettings().group(StumpedGroups.STUMPED_TOOLS));
        items.add(this);
    }
}
