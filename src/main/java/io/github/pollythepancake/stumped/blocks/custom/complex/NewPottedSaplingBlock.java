package io.github.pollythepancake.stumped.blocks.custom.complex;

import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;

public class NewPottedSaplingBlock extends NewBlock {


    public NewPottedSaplingBlock(String id, Block sapling) {
        super(id, new FlowerPotBlock(sapling, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING).breakInstantly().nonOpaque()));


    }
}
