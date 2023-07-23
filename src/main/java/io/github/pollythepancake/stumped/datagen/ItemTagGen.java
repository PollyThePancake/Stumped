package io.github.pollythepancake.stumped.datagen;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.blocks.vanilla.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemTagGen extends FabricTagProvider<Item> {
    public ItemTagGen(FabricDataGenerator dataGen) {
        super(dataGen, Registry.ITEM);
    }

    public static final TagKey<Item> ARAUCARIA_LOGS = TagKey.of(Registry.ITEM_KEY, new Identifier(ModInit.MOD_ID, "araucaria_logs"));
    public static final TagKey<Item> LADDERS = TagKey.of(Registry.ITEM_KEY, new Identifier(ModInit.MOD_ID, "ladders"));
    public static final TagKey<Item> TORCHES = TagKey.of(Registry.ITEM_KEY, new Identifier(ModInit.MOD_ID, "torches"));
    public static final TagKey<Item> SOUL_TORCHES = TagKey.of(Registry.ITEM_KEY, new Identifier(ModInit.MOD_ID, "soul_torches"));
    public static final TagKey<Item> REDSTONE_TORCHES = TagKey.of(Registry.ITEM_KEY, new Identifier(ModInit.MOD_ID, "redstone_torches"));



    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ARAUCARIA_LOGS)
                .add(AraucariaBlocks.ARAUCARIA_LOG.getItem())
                .add(AraucariaBlocks.STRIPPED_ARAUCARIA_LOG.getItem())
                .add(AraucariaBlocks.ARAUCARIA_WOOD.getItem())
                .add(AraucariaBlocks.STRIPPED_ARAUCARIA_LOG.getItem());

        getOrCreateTagBuilder(LADDERS)
                .add(Items.LADDER)
                .add(OakBlocks.OAK_LADDER.getItem())
                .add(SpruceBlocks.SPRUCE_LADDER.getItem())
                .add(BirchBlocks.BIRCH_LADDER.getItem())
                .add(JungleBlocks.JUNGLE_LADDER.getItem())
                .add(AcaciaBlocks.ACACIA_LADDER.getItem())
                .add(DarkOakBlocks.DARK_OAK_LADDER.getItem())
                .add(MangroveBlocks.MANGROVE_LADDER.getItem())
                .add(CrimsonBlocks.CRIMSON_LADDER.getItem())
                .add(WarpedBlocks.WARPED_LADDER.getItem())
                .add(AraucariaBlocks.ARAUCARIA_LADDER.getItem());

        getOrCreateTagBuilder(TORCHES)
                .add(Items.TORCH)
                .add(OakBlocks.OAK_TORCH.getItem())
                .add(SpruceBlocks.SPRUCE_TORCH.getItem())
                .add(BirchBlocks.BIRCH_TORCH.getItem())
                .add(JungleBlocks.JUNGLE_TORCH.getItem())
                .add(AcaciaBlocks.ACACIA_TORCH.getItem())
                .add(DarkOakBlocks.DARK_OAK_TORCH.getItem())
                .add(MangroveBlocks.MANGROVE_TORCH.getItem())
                .add(CrimsonBlocks.CRIMSON_TORCH.getItem())
                .add(WarpedBlocks.WARPED_TORCH.getItem())
                .add(AraucariaBlocks.ARAUCARIA_TORCH.getItem());

        getOrCreateTagBuilder(SOUL_TORCHES)
                .add(Items.SOUL_TORCH)
                .add(OakBlocks.OAK_SOUL_TORCH.getItem())
                .add(SpruceBlocks.SPRUCE_SOUL_TORCH.getItem())
                .add(BirchBlocks.BIRCH_SOUL_TORCH.getItem())
                .add(JungleBlocks.JUNGLE_SOUL_TORCH.getItem())
                .add(AcaciaBlocks.ACACIA_SOUL_TORCH.getItem())
                .add(DarkOakBlocks.DARK_OAK_SOUL_TORCH.getItem())
                .add(MangroveBlocks.MANGROVE_SOUL_TORCH.getItem())
                .add(CrimsonBlocks.CRIMSON_SOUL_TORCH.getItem())
                .add(WarpedBlocks.WARPED_SOUL_TORCH.getItem())
                .add(AraucariaBlocks.ARAUCARIA_SOUL_TORCH.getItem());

        getOrCreateTagBuilder(REDSTONE_TORCHES)
                .add(Items.REDSTONE_TORCH)
                .add(OakBlocks.OAK_REDSTONE_TORCH.getItem())
                .add(SpruceBlocks.SPRUCE_REDSTONE_TORCH.getItem())
                .add(BirchBlocks.BIRCH_REDSTONE_TORCH.getItem())
                .add(JungleBlocks.JUNGLE_REDSTONE_TORCH.getItem())
                .add(AcaciaBlocks.ACACIA_REDSTONE_TORCH.getItem())
                .add(DarkOakBlocks.DARK_OAK_REDSTONE_TORCH.getItem())
                .add(MangroveBlocks.MANGROVE_REDSTONE_TORCH.getItem())
                .add(CrimsonBlocks.CRIMSON_REDSTONE_TORCH.getItem())
                .add(WarpedBlocks.WARPED_REDSTONE_TORCH.getItem())
                .add(AraucariaBlocks.ARAUCARIA_REDSTONE_TORCH.getItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(ARAUCARIA_LOGS);

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(AraucariaBlocks.ARAUCARIA_SAPLING.getItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(AraucariaBlocks.ARAUCARIA_PLANKS.getItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(AraucariaBlocks.ARAUCARIA_BUTTON.getItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(AraucariaBlocks.ARAUCARIA_DOOR.getItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(AraucariaBlocks.ARAUCARIA_PRESSURE_PLATE.getItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(AraucariaBlocks.ARAUCARIA_SLAB.getItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(AraucariaBlocks.ARAUCARIA_STAIRS.getItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(AraucariaBlocks.ARAUCARIA_TRAPDOOR.getItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(AraucariaBlocks.ARAUCARIA_FENCE.getItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(AraucariaBlocks.ARAUCARIA_LEAVES.getItem());

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(CrimsonBlocks.CRIMSON_LADDER.getItem())
                .add(WarpedBlocks.WARPED_LADDER.getItem());

        getOrCreateTagBuilder(ItemTags.OVERWORLD_NATURAL_LOGS)
                .add(AraucariaBlocks.ARAUCARIA_LOG.getItem());

        getOrCreateTagBuilder(ItemTags.PIGLIN_REPELLENTS)
                .addTag(SOUL_TORCHES);
    }
}
