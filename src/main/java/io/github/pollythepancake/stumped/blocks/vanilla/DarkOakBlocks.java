package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class DarkOakBlocks {

    public static String path = "dark_oak/";

    public static final CustomLadderBlock DARK_OAK_LADDER = new CustomLadderBlock(path + "dark_oak_ladder", true);
    public static final CustomTorchBlock DARK_OAK_TORCH = new CustomTorchBlock(path + "dark_oak_torch");
    public static final CustomSoulTorchBlock DARK_OAK_SOUL_TORCH = new CustomSoulTorchBlock(path + "dark_oak_soul_torch");
    public static final CustomRedstoneTorchBlock DARK_OAK_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "dark_oak_redstone_torch");
    public static final CustomWallTorchBlock WALL_DARK_OAK_TORCH = new CustomWallTorchBlock(path + "wall_dark_oak_torch");
    public static final CustomWallSoulTorchBlock WALL_DARK_OAK_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_dark_oak_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_DARK_OAK_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_dark_oak_redstone_torch");

    public static void registerDarkOakBlocks() {
        ModInit.LOGGER.debug("Registering Dark Oak Blocks for " + ModInit.MOD_ID);
    }
}