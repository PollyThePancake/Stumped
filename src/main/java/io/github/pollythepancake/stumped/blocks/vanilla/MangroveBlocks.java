package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class MangroveBlocks {

    public static String path = "mangrove/";

    public static final CustomLadderBlock MANGROVE_LADDER = new CustomLadderBlock(path + "mangrove_ladder", true);
    public static final CustomTorchBlock MANGROVE_TORCH = new CustomTorchBlock(path + "mangrove_torch");
    public static final CustomSoulTorchBlock MANGROVE_SOUL_TORCH = new CustomSoulTorchBlock(path + "mangrove_soul_torch");
    public static final CustomRedstoneTorchBlock MANGROVE_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "mangrove_redstone_torch");
    public static final CustomWallTorchBlock WALL_MANGROVE_TORCH = new CustomWallTorchBlock(path + "wall_mangrove_torch");
    public static final CustomWallSoulTorchBlock WALL_MANGROVE_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_mangrove_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_MANGROVE_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_mangrove_redstone_torch");

    public static void registerMangroveBlocks() {
        ModInit.LOGGER.debug("Registering Mangrove Blocks for " + ModInit.MOD_ID);
    }
}
