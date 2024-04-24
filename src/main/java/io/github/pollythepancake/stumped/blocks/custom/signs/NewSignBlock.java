package io.github.pollythepancake.stumped.blocks.custom.signs;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class NewSignBlock extends NewBlock {

    public NewSignBlock(String id, Identifier texture) {
        super(id, new TerraformSignBlock(texture, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    }
}