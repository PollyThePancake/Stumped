package io.github.pollythepancake.stumped;

import io.github.pollythepancake.stumped.blocks.custom.complex.CustomLadderBlock;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomPottedSaplingBlock;
import io.github.pollythepancake.stumped.blocks.custom.complex.CustomSaplingBlock;
import io.github.pollythepancake.stumped.blocks.custom.torches.*;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShieldItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;

import static io.github.pollythepancake.stumped.renderer.CustomModelPredicateProvider.registerBowPredicates;
import static io.github.pollythepancake.stumped.renderer.CustomModelPredicateProvider.registerCrossbowPredicates;


@Environment(EnvType.CLIENT)
public class ModClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        // Shield Texture Registry
        for (CustomShieldItem shield : CustomShieldItem.items) {
            shield.clientShieldInit();
            shield.RegisterModelLayer();
        }

        // Bow Texture Predicates
        for (Item bow : CustomBowItem.items) registerBowPredicates(bow);

        // Crossbow Texture Predicates
        for (Item crossbow : CustomCrossbowItem.items) registerCrossbowPredicates(crossbow);

        // Sapling Texture Cut Out
        for (Block sapling : CustomSaplingBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(sapling, RenderLayer.getCutout());

        // Potted Sapling Texture Cut Out
        for (Block pottedSapling : CustomPottedSaplingBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(pottedSapling, RenderLayer.getCutout());

        // Ladder Texture Cut Out
        for (Block ladder : CustomLadderBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(ladder, RenderLayer.getCutout());

        // Torch Texture Cut Out
        for (Block torch : CustomTorchBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(torch, RenderLayer.getCutout());

        // Soul Torch Texture Cut Out
        for (Block torch : CustomSoulTorchBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(torch, RenderLayer.getCutout());

        // Redstone Torch Texture Cut Out
        for (Block torch : CustomRedstoneTorchBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(torch, RenderLayer.getCutout());

        // Wall Torch Texture Cut Out
        for (Block torch : CustomWallTorchBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(torch, RenderLayer.getCutout());

        // Wall Soul Torch Texture Cut Out
        for (Block torch : CustomWallSoulTorchBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(torch, RenderLayer.getCutout());

        // Wall Redstone Torch Texture Cut Out
        for (Block torch : CustomWallRedstoneTorchBlock.blocks)
            BlockRenderLayerMap.INSTANCE.putBlock(torch, RenderLayer.getCutout());
    }
}