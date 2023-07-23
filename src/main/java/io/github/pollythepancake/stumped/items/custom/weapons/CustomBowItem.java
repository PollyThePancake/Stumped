package io.github.pollythepancake.stumped.items.custom.weapons;

import io.github.pollythepancake.stumped.util.StumpedGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CustomBowItem extends BowItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomBowItem() {
        super(new FabricItemSettings().group(StumpedGroups.STUMPED_WEAPONS).maxDamage(384));
        items.add(this);
    }
}
