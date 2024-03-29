package io.github.pollythepancake.stumped.items.custom.tools;

import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;

import java.util.ArrayList;

public class CustomPickaxeItem extends PickaxeItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomPickaxeItem() {
        super(ToolMaterials.WOOD, 1, -2.8f, new FabricItemSettings().group(StumpedGroups.STUMPED_TOOLS));
        items.add(this);
    }
}
