package io.github.pollythepancake.stumped.datagen;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.blocks.vanilla.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockTagGen extends FabricTagProvider<Block> {
    public BlockTagGen(FabricDataGenerator dataGen) {
        super(dataGen, Registry.BLOCK);
    }

    public static final TagKey<Block> ARAUCARIA_LOGS = TagKey.of(Registry.BLOCK_KEY, new Identifier(ModInit.MOD_ID, "araucaria_logs"));
    public static final TagKey<Block> LADDERS = TagKey.of(Registry.BLOCK_KEY, new Identifier(ModInit.MOD_ID, "ladders"));
    public static final TagKey<Block> TORCHES = TagKey.of(Registry.BLOCK_KEY, new Identifier(ModInit.MOD_ID, "torches"));
    public static final TagKey<Block> SOUL_TORCHES = TagKey.of(Registry.BLOCK_KEY, new Identifier(ModInit.MOD_ID, "soul_torches"));
    public static final TagKey<Block> WALL_SOUL_TORCHES = TagKey.of(Registry.BLOCK_KEY, new Identifier(ModInit.MOD_ID, "wall_soul_torches"));
    public static final TagKey<Block> REDSTONE_TORCHES = TagKey.of(Registry.BLOCK_KEY, new Identifier(ModInit.MOD_ID, "redstone_torches"));



    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ARAUCARIA_LOGS)
                .add(AraucariaBlocks.ARAUCARIA_LOG.getBlock())
                .add(AraucariaBlocks.STRIPPED_ARAUCARIA_LOG.getBlock())
                .add(AraucariaBlocks.ARAUCARIA_WOOD.getBlock())
                .add(AraucariaBlocks.STRIPPED_ARAUCARIA_LOG.getBlock());

        getOrCreateTagBuilder(LADDERS)
                .add(Blocks.LADDER)
                .add(OakBlocks.OAK_LADDER.getBlock())
                .add(SpruceBlocks.SPRUCE_LADDER.getBlock())
                .add(BirchBlocks.BIRCH_LADDER.getBlock())
                .add(JungleBlocks.JUNGLE_LADDER.getBlock())
                .add(AcaciaBlocks.ACACIA_LADDER.getBlock())
                .add(DarkOakBlocks.DARK_OAK_LADDER.getBlock())
                .add(MangroveBlocks.MANGROVE_LADDER.getBlock())
                .add(CrimsonBlocks.CRIMSON_LADDER.getBlock())
                .add(WarpedBlocks.WARPED_LADDER.getBlock())
                .add(AraucariaBlocks.ARAUCARIA_LADDER.getBlock());

        getOrCreateTagBuilder(TORCHES)
                .add(Blocks.TORCH)
                .add(OakBlocks.OAK_TORCH.getBlock())
                .add(SpruceBlocks.SPRUCE_TORCH.getBlock())
                .add(BirchBlocks.BIRCH_TORCH.getBlock())
                .add(JungleBlocks.JUNGLE_TORCH.getBlock())
                .add(AcaciaBlocks.ACACIA_TORCH.getBlock())
                .add(DarkOakBlocks.DARK_OAK_TORCH.getBlock())
                .add(MangroveBlocks.MANGROVE_TORCH.getBlock())
                .add(CrimsonBlocks.CRIMSON_TORCH.getBlock())
                .add(WarpedBlocks.WARPED_TORCH.getBlock())
                .add(AraucariaBlocks.ARAUCARIA_TORCH.getBlock());

        getOrCreateTagBuilder(SOUL_TORCHES)
                .add(Blocks.SOUL_TORCH)
                .add(OakBlocks.OAK_SOUL_TORCH.getBlock())
                .add(SpruceBlocks.SPRUCE_SOUL_TORCH.getBlock())
                .add(BirchBlocks.BIRCH_SOUL_TORCH.getBlock())
                .add(JungleBlocks.JUNGLE_SOUL_TORCH.getBlock())
                .add(AcaciaBlocks.ACACIA_SOUL_TORCH.getBlock())
                .add(DarkOakBlocks.DARK_OAK_SOUL_TORCH.getBlock())
                .add(MangroveBlocks.MANGROVE_SOUL_TORCH.getBlock())
                .add(CrimsonBlocks.CRIMSON_SOUL_TORCH.getBlock())
                .add(WarpedBlocks.WARPED_SOUL_TORCH.getBlock())
                .add(AraucariaBlocks.ARAUCARIA_SOUL_TORCH.getBlock());

        getOrCreateTagBuilder(WALL_SOUL_TORCHES)
                .add(Blocks.SOUL_WALL_TORCH)
                .add(OakBlocks.WALL_OAK_SOUL_TORCH.getBlock())
                .add(SpruceBlocks.WALL_SPRUCE_SOUL_TORCH.getBlock())
                .add(BirchBlocks.WALL_BIRCH_SOUL_TORCH.getBlock())
                .add(JungleBlocks.WALL_JUNGLE_SOUL_TORCH.getBlock())
                .add(AcaciaBlocks.WALL_ACACIA_SOUL_TORCH.getBlock())
                .add(DarkOakBlocks.WALL_DARK_OAK_SOUL_TORCH.getBlock())
                .add(MangroveBlocks.WALL_MANGROVE_SOUL_TORCH.getBlock())
                .add(CrimsonBlocks.WALL_CRIMSON_SOUL_TORCH.getBlock())
                .add(WarpedBlocks.WALL_WARPED_SOUL_TORCH.getBlock())
                .add(AraucariaBlocks.WALL_ARAUCARIA_SOUL_TORCH.getBlock());

        getOrCreateTagBuilder(REDSTONE_TORCHES)
                .add(Blocks.REDSTONE_TORCH)
                .add(OakBlocks.OAK_REDSTONE_TORCH.getBlock())
                .add(SpruceBlocks.SPRUCE_REDSTONE_TORCH.getBlock())
                .add(BirchBlocks.BIRCH_REDSTONE_TORCH.getBlock())
                .add(JungleBlocks.JUNGLE_REDSTONE_TORCH.getBlock())
                .add(AcaciaBlocks.ACACIA_REDSTONE_TORCH.getBlock())
                .add(DarkOakBlocks.DARK_OAK_REDSTONE_TORCH.getBlock())
                .add(MangroveBlocks.MANGROVE_REDSTONE_TORCH.getBlock())
                .add(CrimsonBlocks.CRIMSON_REDSTONE_TORCH.getBlock())
                .add(WarpedBlocks.WARPED_REDSTONE_TORCH.getBlock())
                .add(AraucariaBlocks.ARAUCARIA_REDSTONE_TORCH.getBlock());

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(ARAUCARIA_LOGS);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(AraucariaBlocks.ARAUCARIA_SAPLING.getBlock());

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(AraucariaBlocks.ARAUCARIA_PLANKS.getBlock());

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(AraucariaBlocks.ARAUCARIA_SIGN.getBlock());

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(AraucariaBlocks.ARAUCARIA_WALL_SIGN.getBlock());

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(AraucariaBlocks.ARAUCARIA_BUTTON.getBlock());

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(AraucariaBlocks.ARAUCARIA_DOOR.getBlock());

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(AraucariaBlocks.ARAUCARIA_PRESSURE_PLATE.getBlock());

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(AraucariaBlocks.ARAUCARIA_SLAB.getBlock());

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(AraucariaBlocks.ARAUCARIA_STAIRS.getBlock());

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(AraucariaBlocks.ARAUCARIA_TRAPDOOR.getBlock());

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(AraucariaBlocks.ARAUCARIA_FENCE.getBlock());

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(AraucariaBlocks.ARAUCARIA_FENCE_GATE.getBlock());

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .addTag(LADDERS);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(AraucariaBlocks.POTTED_ARAUCARIA_SAPLING.getBlock());

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(AraucariaBlocks.ARAUCARIA_LEAVES.getBlock());

        getOrCreateTagBuilder(BlockTags.NON_FLAMMABLE_WOOD)
                .add(CrimsonBlocks.CRIMSON_LADDER.getBlock())
                .add(WarpedBlocks.WARPED_LADDER.getBlock());

        getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(AraucariaBlocks.ARAUCARIA_LOG.getBlock());

        getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
                .addTag(SOUL_TORCHES);

        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE)
                .addTag(TORCHES)
                .addTag(SOUL_TORCHES)
                .addTag(REDSTONE_TORCHES);
    }
}