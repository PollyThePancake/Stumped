package io.github.pollythepancake.stumped.blocks.custom.signs;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class NewHangingSignBlock extends NewBlock {

    public NewHangingSignBlock(String id, Identifier texture, Identifier guiTexture) {
        super(id, new TerraformHangingSignBlock(texture, guiTexture, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    }
}
