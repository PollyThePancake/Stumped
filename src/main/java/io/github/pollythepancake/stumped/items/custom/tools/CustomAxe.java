package io.github.pollythepancake.stumped.items.custom.tools;

import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;

import java.util.ArrayList;

public class CustomAxe extends AxeItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomAxe() {
        super(ToolMaterials.WOOD, 6.0f, -3.2f, new FabricItemSettings().group(ModGroups.STUMPED_TOOLS));
        items.add(this);
    }
}
