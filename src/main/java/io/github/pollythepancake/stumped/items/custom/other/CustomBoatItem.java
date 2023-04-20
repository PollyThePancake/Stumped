package io.github.pollythepancake.stumped.items.custom.other;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class CustomBoatItem {

    private static TerraformBoatType boat;
    public static ArrayList<Item> items = new ArrayList<>();

    public CustomBoatItem(String id, boolean hasChest, Item planks, int burnTime) {
        Item BOAT_ITEM = TerraformBoatItemHelper.registerBoatItem(new Identifier(ModInit.MOD_ID, id + "_boat"), () -> boat, false, new FabricItemSettings().group(ModGroups.STUMPED_ITEMS).maxCount(1));
        Item CHEST_BOAT_ITEM = TerraformBoatItemHelper.registerBoatItem(new Identifier(ModInit.MOD_ID, id + "_chest_boat"), () -> boat, true, new FabricItemSettings().group(ModGroups.STUMPED_ITEMS).maxCount(1));
        boat = new TerraformBoatType.Builder().item(BOAT_ITEM).chestItem(CHEST_BOAT_ITEM).planks(planks).build();
        FuelRegistry.INSTANCE.add(BOAT_ITEM, burnTime);
        FuelRegistry.INSTANCE.add(CHEST_BOAT_ITEM, burnTime);
        items.add(BOAT_ITEM);
        items.add(CHEST_BOAT_ITEM);
        Identifier BOAT_ID = new Identifier(ModInit.MOD_ID, id);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BOAT_ID, boat);
        TerraformBoatClientHelper.registerModelLayers(BOAT_ID);
    }
}
