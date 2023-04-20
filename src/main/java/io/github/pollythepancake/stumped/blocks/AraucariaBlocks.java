package io.github.pollythepancake.stumped.blocks;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.complex.*;
import io.github.pollythepancake.stumped.blocks.custom.signs.CustomSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.signs.CustomWallSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.solid_blocks.*;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;
import io.github.pollythepancake.stumped.mixin.SignTypeMixin;
import net.minecraft.block.sapling.OakSaplingGenerator;
import net.minecraft.util.SignType;

public class AraucariaBlocks {


    public static String path = "araucaria/";


    // Solid Blocks

    public static final CustomPlanksBlock ARAUCARIA_PLANKS = new CustomPlanksBlock(path + "araucaria_planks", true);
    public static final CustomLogBlock ARAUCARIA_LOG = new CustomLogBlock(path + "araucaria_log", true);
    public static final CustomLogBlock STRIPPED_ARAUCARIA_LOG = new CustomLogBlock(path + "stripped_araucaria_log", ARAUCARIA_LOG, true);
    public static final CustomWoodBlock ARAUCARIA_WOOD = new CustomWoodBlock(path + "araucaria_wood", true);
    public static final CustomWoodBlock STRIPPED_ARAUCARIA_WOOD = new CustomWoodBlock(path + "stripped_araucaria_wood", ARAUCARIA_WOOD, true);
    public static final CustomLeavesBlock ARAUCARIA_LEAVES = new CustomLeavesBlock(path + "araucaria_leaves");
    public static final CustomSlabBlock ARAUCARIA_SLAB = new CustomSlabBlock(path + "araucaria_slab", true);
    public static final CustomStairsBlock ARAUCARIA_STAIRS = new CustomStairsBlock(path + "araucaria_stairs", ARAUCARIA_PLANKS, true);

    // Complex Blocks

    public static final CustomDoorBlock ARAUCARIA_DOOR = new CustomDoorBlock(path + "araucaria_door", true);
    public static final CustomTrapdoorBlock ARAUCARIA_TRAPDOOR = new CustomTrapdoorBlock(path + "araucaria_trapdoor", true);
    public static final CustomFenceBlock ARAUCARIA_FENCE = new CustomFenceBlock(path + "araucaria_fence", true);
    public static final CustomFenceGateBlock ARAUCARIA_FENCE_GATE = new CustomFenceGateBlock(path + "araucaria_fence_gate", true);
    public static final CustomPressurePlateBlock ARAUCARIA_PRESSURE_PLATE = new CustomPressurePlateBlock(path + "araucaria_pressure_plate", true);
    public static final CustomButtonBlock ARAUCARIA_BUTTON = new CustomButtonBlock(path + "araucaria_button", true);
    public static final CustomSaplingBlock ARAUCARIA_SAPLING = new CustomSaplingBlock(path + "araucaria_sapling", new OakSaplingGenerator(), true);
    public static final CustomPottedSaplingBlock POTTED_ARAUCARIA_SAPLING = new CustomPottedSaplingBlock(path + "potted_araucaria_sapling", ARAUCARIA_SAPLING.getBlock());
    public static final CustomLadderBlock ARAUCARIA_LADDER = new CustomLadderBlock(path + "araucaria_ladder", true);

    // Torches
    public static final CustomTorchBlock ARAUCARIA_TORCH = new CustomTorchBlock(path + "araucaria_torch");
    public static final CustomSoulTorchBlock ARAUCARIA_SOUL_TORCH = new CustomSoulTorchBlock(path + "araucaria_soul_torch");
    public static final CustomRedstoneTorchBlock ARAUCARIA_REDSTONE_TORCH = new CustomRedstoneTorchBlock(path + "araucaria_redstone_torch");
    public static final CustomWallTorchBlock WALL_ARAUCARIA_TORCH = new CustomWallTorchBlock(path + "wall_araucaria_torch");
    public static final CustomWallSoulTorchBlock WALL_ARAUCARIA_SOUL_TORCH = new CustomWallSoulTorchBlock(path + "wall_araucaria_soul_torch");
    public static final CustomWallRedstoneTorchBlock WALL_ARAUCARIA_REDSTONE_TORCH = new CustomWallRedstoneTorchBlock(path + "wall_araucaria_redstone_torch");

    // Signs

    public static final SignType ARAUCARIA_SIGN_TYPE = SignTypeMixin.registerNew(SignTypeMixin.newSignType("araucaria"));
    public static final CustomWallSignBlock ARAUCARIA_WALL_SIGN = new CustomWallSignBlock(path + "araucaria_wall_sign", ARAUCARIA_SIGN_TYPE);
    public static final CustomSignBlock ARAUCARIA_SIGN = new CustomSignBlock(path + "araucaria_sign", ARAUCARIA_SIGN_TYPE);

    public static void registerAraucariaBlocks() {
        ModInit.LOGGER.debug("Registering Araucaria Blocks for " + ModInit.MOD_ID);
    }
}
