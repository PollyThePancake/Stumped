package io.github.pollythepancake.stumped.blocks.vanilla;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;

public class SpruceBlocks {

    public static String path = "spruce/";

    public static final CustomLadderBlock SPRUCE_LADDER = new CustomLadderBlock(path + "spruce_ladder", true);
    public static final CustomTorchBlock SPRUCE_TORCH = new CustomTorchBlock(path + "spruce_torch");
    public static final CustomSoulTorchBlock SPRUCE_SOUL_TORCH = new CustomSoulTorchBlock(path + "spruce_soul_torch");
    public static final CustomRedstoneTorchBlock SPRUCE_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "spruce_redstone_torch");
    public static final CustomWallTorchBlock WALL_SPRUCE_TORCH = new CustomWallTorchBlock(path + "wall_spruce_torch");
    public static final CustomWallSoulTorchBlock WALL_SPRUCE_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_spruce_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_SPRUCE_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_spruce_redstone_torch");

    public static void registerSpruceBlocks() {
        ModInit.LOGGER.debug("Registering Spruce Blocks for " + ModInit.MOD_ID);
    }
}
