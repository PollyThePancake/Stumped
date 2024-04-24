package io.github.pollythepancake.stumped.util;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.items.AraucariaItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final RegistryKey<ItemGroup> STUMPED_BLOCKS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(ModInit.MOD_ID, "stumped_blocks"));
    public static final RegistryKey<ItemGroup> STUMPED_ITEMS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(ModInit.MOD_ID, "stumped_items"));

    public static void registerItemGroups() {
        ModInit.LOGGER.info("Registering Item ItemGroups for " + ModInit.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, STUMPED_BLOCKS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.stumped.stumped_blocks"))
                .icon(() -> new ItemStack(AraucariaBlocks.PLANKS.getItem()))
                .build());

        Registry.register(Registries.ITEM_GROUP, STUMPED_ITEMS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.stumped.stumped_items"))
                .icon(() -> new ItemStack(AraucariaItems.SIGN.getItem()))
                .build());
    }

}