package io.github.pollythepancake.stumped.util;


import io.github.pollythepancake.stumped.ModInit;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class WoodTypes {

    public static final BlockSetType ARAUCARIA_BLOCK_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.OAK)
            .soundGroup(BlockSoundGroup.FROGLIGHT)
            .build(new Identifier(ModInit.MOD_ID, "araucaria"));

    public static final WoodType ARAUCARIA_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK)
            .build(new Identifier(ModInit.MOD_ID, "araucaria"), ARAUCARIA_BLOCK_SET_TYPE);

}
