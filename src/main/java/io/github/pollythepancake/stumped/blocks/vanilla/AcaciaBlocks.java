package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class AcaciaBlocks {

    public static String path = "acacia/";

    public static final CustomLadderBlock ACACIA_LADDER = new CustomLadderBlock(path + "acacia_ladder", true);
    public static final CustomTorchBlock ACACIA_TORCH = new CustomTorchBlock(path + "acacia_torch");
    public static final CustomSoulTorchBlock ACACIA_SOUL_TORCH = new CustomSoulTorchBlock(path + "acacia_soul_torch");
    public static final CustomRedstoneTorchBlock ACACIA_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "acacia_redstone_torch");
    public static final CustomWallTorchBlock WALL_ACACIA_TORCH = new CustomWallTorchBlock(path + "wall_acacia_torch");
    public static final CustomWallSoulTorchBlock WALL_ACACIA_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_acacia_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_ACACIA_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_acacia_redstone_torch");

    public static void registerAcaciaBlocks() {
        ModInit.LOGGER.debug("Registering Acacia Blocks for " + ModInit.MOD_ID);
    }
}
