package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class WarpedBlocks {

    public static String path = "warped/";

    public static final CustomLadderBlock WARPED_LADDER = new CustomLadderBlock(path + "warped_ladder", true);
    public static final CustomTorchBlock WARPED_TORCH = new CustomTorchBlock(path + "warped_torch");
    public static final CustomSoulTorchBlock WARPED_SOUL_TORCH = new CustomSoulTorchBlock(path + "warped_soul_torch");
    public static final CustomRedstoneTorchBlock WARPED_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "warped_redstone_torch");
    public static final CustomWallTorchBlock WALL_WARPED_TORCH = new CustomWallTorchBlock(path + "wall_warped_torch");
    public static final CustomWallSoulTorchBlock WALL_WARPED_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_warped_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_WARPED_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_warped_redstone_torch");

    public static void registerWarpedBlocks() {
        ModInit.LOGGER.debug("Registering Warped Blocks for " + ModInit.MOD_ID);
    }
}
