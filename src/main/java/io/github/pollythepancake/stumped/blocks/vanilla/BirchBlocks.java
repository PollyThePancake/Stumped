package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class BirchBlocks {

    public static String path = "birch/";

    public static final CustomLadderBlock BIRCH_LADDER = new CustomLadderBlock(path + "birch_ladder", true);
    public static final CustomTorchBlock BIRCH_TORCH = new CustomTorchBlock(path + "birch_torch");
    public static final CustomSoulTorchBlock BIRCH_SOUL_TORCH = new CustomSoulTorchBlock(path + "birch_soul_torch");
    public static final CustomRedstoneTorchBlock BIRCH_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "birch_redstone_torch");
    public static final CustomWallTorchBlock WALL_BIRCH_TORCH = new CustomWallTorchBlock(path + "wall_birch_torch");
    public static final CustomWallSoulTorchBlock WALL_BIRCH_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_birch_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_BIRCH_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_birch_redstone_torch");

    public static void registerBirchBlocks() {
        ModInit.LOGGER.debug("Registering Birch Blocks for " + ModInit.MOD_ID);
    }
}