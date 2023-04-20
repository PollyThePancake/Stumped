package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class CrimsonBlocks {

    public static String path = "crimson/";

    public static final CustomLadderBlock CRIMSON_LADDER = new CustomLadderBlock(path + "crimson_ladder", true);
    public static final CustomTorchBlock CRIMSON_TORCH = new CustomTorchBlock(path + "crimson_torch");
    public static final CustomSoulTorchBlock CRIMSON_SOUL_TORCH = new CustomSoulTorchBlock(path + "crimson_soul_torch");
    public static final CustomRedstoneTorchBlock CRIMSON_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "crimson_redstone_torch");
    public static final CustomWallTorchBlock WALL_CRIMSON_TORCH = new CustomWallTorchBlock(path + "wall_crimson_torch");
    public static final CustomWallSoulTorchBlock WALL_CRIMSON_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_crimson_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_CRIMSON_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_crimson_redstone_torch");

    public static void registerCrimsonBlocks() {
        ModInit.LOGGER.debug("Registering Crimson Blocks for " + ModInit.MOD_ID);
    }
}