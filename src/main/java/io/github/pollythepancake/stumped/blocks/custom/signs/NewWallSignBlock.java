package io.github.pollythepancake.stumped.blocks.custom.signs;

import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class NewWallSignBlock extends NewBlock {

    public NewWallSignBlock(String id, Identifier texture) {
        super(id, new TerraformWallSignBlock(texture, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
    }
}