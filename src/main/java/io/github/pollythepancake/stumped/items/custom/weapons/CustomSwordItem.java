package io.github.pollythepancake.stumped.items.custom.weapons;

import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

import java.util.ArrayList;

public class CustomSwordItem extends SwordItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomSwordItem() {
        super(ToolMaterials.WOOD, 3, -2.4f, new FabricItemSettings().group(StumpedGroups.STUMPED_WEAPONS));
        items.add(this);
    }
}
