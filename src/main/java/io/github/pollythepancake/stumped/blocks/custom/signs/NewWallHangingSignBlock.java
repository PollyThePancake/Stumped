package io.github.pollythepancake.stumped.blocks.custom.signs;

import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import io.github.pollythepancake.stumped.blocks.custom.NewBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class NewWallHangingSignBlock extends NewBlock {

    public NewWallHangingSignBlock(String id, Identifier texture, Identifier guiTexture) {
        super(id, new TerraformWallHangingSignBlock(texture, guiTexture, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
    }
}