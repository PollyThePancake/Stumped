package io.github.pollythepancake.stumped;

import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(AraucariaBlocks.LEAVES.getBlock(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AraucariaBlocks.SAPLING.getBlock(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AraucariaBlocks.POTTED_SAPLING.getBlock(), RenderLayer.getCutout());
    }
}
