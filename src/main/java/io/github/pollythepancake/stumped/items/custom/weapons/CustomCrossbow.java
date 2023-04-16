package io.github.pollythepancake.stumped.items.custom.weapons;

import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class CustomCrossbow extends CrossbowItem {

    public static ArrayList<Item> items = new ArrayList<>();

    public CustomCrossbow() {
        super(new FabricItemSettings().group(ModGroups.STUMPED_WEAPONS).maxCount(1).maxDamage(465));
        items.add(this);
    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        return stack.getItem() instanceof CustomCrossbow;
    }
}
