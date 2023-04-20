package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class OakBlocks {

    public static String path = "oak/";

    public static final CustomLadderBlock OAK_LADDER = new CustomLadderBlock(path + "oak_ladder", true);
    public static final CustomTorchBlock OAK_TORCH = new CustomTorchBlock(path + "oak_torch");
    public static final CustomSoulTorchBlock OAK_SOUL_TORCH = new CustomSoulTorchBlock(path + "oak_soul_torch");
    public static final CustomRedstoneTorchBlock OAK_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "oak_redstone_torch");
    public static final CustomWallTorchBlock WALL_OAK_TORCH = new CustomWallTorchBlock(path + "wall_oak_torch");
    public static final CustomWallSoulTorchBlock WALL_OAK_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_oak_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_OAK_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_oak_redstone_torch");

    public static void registerOakBlocks() {
        ModInit.LOGGER.debug("Registering Oak Blocks for " + ModInit.MOD_ID);
    }
}