package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class JungleBlocks {

    public static String path = "jungle/";

    public static final CustomLadderBlock JUNGLE_LADDER = new CustomLadderBlock(path + "jungle_ladder", true);
    public static final CustomTorchBlock JUNGLE_TORCH = new CustomTorchBlock(path + "jungle_torch");
    public static final CustomSoulTorchBlock JUNGLE_SOUL_TORCH = new CustomSoulTorchBlock(path + "jungle_soul_torch");
    public static final CustomRedstoneTorchBlock JUNGLE_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "jungle_redstone_torch");
    public static final CustomWallTorchBlock WALL_JUNGLE_TORCH = new CustomWallTorchBlock(path + "wall_jungle_torch");
    public static final CustomWallSoulTorchBlock WALL_JUNGLE_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_jungle_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_JUNGLE_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_jungle_redstone_torch");

    public static void registerJungleBlocks() {
        ModInit.LOGGER.debug("Registering Jungle Blocks for " + ModInit.MOD_ID);
    }
}