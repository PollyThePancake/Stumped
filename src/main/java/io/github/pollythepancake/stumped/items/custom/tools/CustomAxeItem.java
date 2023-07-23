package io.github.pollythepancake.stumped.items.custom.tools;

import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;

import java.util.ArrayList;

public class CustomAxeItem extends AxeItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomAxeItem() {
        super(ToolMaterials.WOOD, 6.0f, -3.2f, new FabricItemSettings().group(StumpedGroups.STUMPED_TOOLS));
        items.add(this);
    }
}
