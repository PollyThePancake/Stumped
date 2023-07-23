package io.github.pollythepancake.stumped.items.custom.tools;

import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;

import java.util.ArrayList;

public class CustomHoeItem extends HoeItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomHoeItem() {
        super(ToolMaterials.WOOD, 0, -3.0f, new FabricItemSettings().group(StumpedGroups.STUMPED_TOOLS));
        items.add(this);
    }
}
