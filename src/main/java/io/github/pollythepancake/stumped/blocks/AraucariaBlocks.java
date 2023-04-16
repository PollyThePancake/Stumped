package io.github.pollythepancake.stumped.blocks;

import io.github.pollythepancake.stumped.blocks.custom.complex.*;
import io.github.pollythepancake.stumped.blocks.custom.signs.CustomSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.signs.CustomWallSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.solid_blocks.*;
import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.mixin.SignTypeAccessorMixin;
import net.minecraft.block.sapling.OakSaplingGenerator;
import net.minecraft.util.SignType;

public class AraucariaBlocks {


    public static String path = "araucaria/";


    // Solid Blocks

    public static final CustomPlanks ARAUCARIA_PLANKS = new CustomPlanks(path + "araucaria_planks", true);
    public static final CustomLog ARAUCARIA_LOG = new CustomLog(path + "araucaria_log", true);
    public static final CustomLog STRIPPED_ARAUCARIA_LOG = new CustomLog(path + "stripped_araucaria_log", ARAUCARIA_LOG, true);
    public static final CustomWood ARAUCARIA_WOOD = new CustomWood(path + "araucaria_wood", true);
    public static final CustomWood STRIPPED_ARAUCARIA_WOOD = new CustomWood(path + "stripped_araucaria_wood", ARAUCARIA_WOOD, true);
    public static final CustomLeaves ARAUCARIA_LEAVES = new CustomLeaves(path + "araucaria_leaves", true);
    public static final CustomSlab ARAUCARIA_SLAB = new CustomSlab(path + "araucaria_slab", true);
    public static final CustomStairs ARAUCARIA_STAIRS = new CustomStairs(path + "araucaria_stairs", ARAUCARIA_PLANKS, true);

    // Complex Blocks

    public static final CustomDoor ARAUCARIA_DOOR = new CustomDoor(path + "araucaria_door", true);
    public static final CustomTrapdoor ARAUCARIA_TRAPDOOR = new CustomTrapdoor(path + "araucaria_trapdoor", true);
    public static final CustomFence ARAUCARIA_FENCE = new CustomFence(path + "araucaria_fence", true);
    public static final CustomFenceGate ARAUCARIA_FENCE_GATE = new CustomFenceGate(path + "araucaria_fence_gate", true);
    public static final CustomPressurePlate ARAUCARIA_PRESSURE_PLATE = new CustomPressurePlate(path + "araucaria_pressure_plate", true);
    public static final CustomButton ARAUCARIA_BUTTON = new CustomButton(path + "araucaria_button", true);
    public static final CustomSapling ARAUCARIA_SAPLING = new CustomSapling(path + "araucaria_sapling", new OakSaplingGenerator(), true);

    // Signs

    public static final SignType ARAUCARIA_SIGN_TYPE = SignTypeAccessorMixin.registerNew(SignTypeAccessorMixin.newSignType("araucaria"));
    public static final CustomWallSignBlock ARAUCARIA_WALL_SIGN = new CustomWallSignBlock(path + "araucaria_wall_sign", ARAUCARIA_SIGN_TYPE);
    public static final CustomSignBlock ARAUCARIA_SIGN = new CustomSignBlock(path + "araucaria_sign", ARAUCARIA_SIGN_TYPE);

    public static void registerAraucariaBlocks() {
        ModInit.LOGGER.debug("Registering Araucaria Blocks for " + ModInit.MOD_ID);
    }
}
