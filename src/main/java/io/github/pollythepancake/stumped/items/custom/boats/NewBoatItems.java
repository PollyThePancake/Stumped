package io.github.pollythepancake.stumped.items.custom.boats;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import io.github.pollythepancake.stumped.ModInit;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class NewBoatItems {

    public final TerraformBoatType boatType;
    public final Identifier boatKeyID;

    public NewBoatItems(String name, Item planks, RegistryKey<ItemGroup> group) {

        boatKeyID = new Identifier(ModInit.MOD_ID, name);

        RegistryKey<TerraformBoatType> boat_key = TerraformBoatTypeRegistry.createKey(boatKeyID);

        boatType = new TerraformBoatType.Builder()
                .item(TerraformBoatItemHelper.registerBoatItem(new Identifier(ModInit.MOD_ID, name + "_boat"), boat_key, false))
                .chestItem(TerraformBoatItemHelper.registerBoatItem(new Identifier(ModInit.MOD_ID, name + "_chest_boat"), boat_key, true))
                .planks(planks)
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, boat_key, boatType);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(boatType.getItem()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(boatType.getChestItem()));
        FuelRegistry.INSTANCE.add(boatType.getItem(), 300);
        FuelRegistry.INSTANCE.add(boatType.getChestItem(), 300);
    }

    public void BoatRegisterModelLayers() {
        TerraformBoatClientHelper.registerModelLayers(boatKeyID, false);
    }
}