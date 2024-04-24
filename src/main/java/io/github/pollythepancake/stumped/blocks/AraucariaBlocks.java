package io.github.pollythepancake.stumped.blocks;

import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import io.github.pollythepancake.stumped.blocks.custom.complex.*;
import io.github.pollythepancake.stumped.blocks.custom.signs.NewHangingSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.signs.NewSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.signs.NewWallHangingSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.signs.NewWallSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.solid.*;
import io.github.pollythepancake.stumped.util.ItemGroups;
import io.github.pollythepancake.stumped.util.WoodTypes;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.block.WoodType;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class AraucariaBlocks {

    public static String name = "araucaria";
    public static BlockSetType blockSetType = WoodTypes.ARAUCARIA_BLOCK_SET_TYPE;
    public static WoodType woodType = WoodTypes.ARAUCARIA_WOOD_TYPE;
    public static RegistryKey<ItemGroup> blockGroup = ItemGroups.STUMPED_BLOCKS;
    public static RegistryKey<ItemGroup> itemGroup = ItemGroups.STUMPED_ITEMS;

    // Solid Blocks
    public static final NewBlock PLANKS = new NewPlanksBlock(name + "_planks", blockGroup);
    public static final NewBlock LOG = new NewLogBlock(name + "_log", blockGroup);
    public static final NewBlock STRIPPED_LOG = new NewLogBlock("stripped_" + name + "_log", LOG, blockGroup);
    public static final NewBlock WOOD = new NewWoodBlock(name + "_wood", blockGroup);
    public static final NewBlock STRIPPED_WOOD = new NewWoodBlock("stripped_" + name + "_wood", WOOD, blockGroup);
    public static final NewBlock LEAVES = new NewLeavesBlock(name + "_leaves", blockGroup);
    public static final NewBlock SLAB = new NewSlabBlock(name + "_slab", blockGroup);
    public static final NewBlock STAIRS = new NewStairsBlock(name + "_stairs", PLANKS, blockGroup);

    // Complex Blocks
    public static final NewBlock DOOR = new NewDoorBlock(name + "_door", blockSetType, itemGroup);
    public static final NewBlock TRAPDOOR = new NewTrapdoorBlock(name + "_trapdoor", blockSetType, itemGroup);
    public static final NewBlock FENCE = new NewFenceBlock(name + "_fence", itemGroup);
    public static final NewBlock FENCE_GATE = new NewFenceGateBlock(name + "_fence_gate", woodType, itemGroup);
    public static final NewBlock PRESSURE_PLATE = new NewPressurePlateBlock(name + "_pressure_plate", blockSetType, itemGroup);
    public static final NewBlock BUTTON = new NewButtonBlock(name + "_button", blockSetType, itemGroup);
    public static final NewBlock SAPLING = new NewSaplingBlock(name + "_sapling", SaplingGenerator.OAK, itemGroup);
    public static final NewBlock POTTED_SAPLING = new NewPottedSaplingBlock("potted_" + name + "_sapling", SAPLING.getBlock());

    // Signs
    public static final Identifier SIGN_TEXTURE = new Identifier(ModInit.MOD_ID, "entity/signs/" + name);
    public static final Identifier HANGING_SIGN_TEXTURE = new Identifier(ModInit.MOD_ID, "entity/signs/hanging/" + name);
    public static final Identifier HANGING_GUI_SIGN_TEXTURE = new Identifier(ModInit.MOD_ID, "textures/gui/hanging_signs/" + name);
    public static final NewBlock SIGN = new NewSignBlock(name + "_sign", SIGN_TEXTURE);
    public static final NewBlock WALL_SIGN = new NewWallSignBlock(name + "_wall_sign", SIGN_TEXTURE);
    public static final NewBlock HANGING_SIGN = new NewHangingSignBlock(name + "_hanging_sign", HANGING_SIGN_TEXTURE, HANGING_GUI_SIGN_TEXTURE);
    public static final NewBlock WALL_HANGING_SIGN = new NewWallHangingSignBlock(name + "_wall_hanging_sign", HANGING_SIGN_TEXTURE, HANGING_GUI_SIGN_TEXTURE);

    public static final BlockFamily FAMILY = BlockFamilies.register(PLANKS.getBlock())
            .sign(SIGN.getBlock(), WALL_SIGN.getBlock())
            .group("wooden").unlockCriterionName("has_planks").build();

    public static void registerAraucariaBlocks() {
        ModInit.LOGGER.debug("Registering Araucaria Blocks for " + ModInit.MOD_ID);
    }
}
