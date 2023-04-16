package io.github.pollythepancake.stumped;

import io.github.pollythepancake.stumped.blocks.custom.complex.CustomSapling;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbow;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
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
        for (Item bow : CustomBow.items) {
            registerBowPredicates(bow);
        }

        for (Item crossbow : CustomCrossbow.items) {
            registerCrossbowPredicates(crossbow);
        }

        for (CustomShield shield : CustomShield.items) {
            shield.clientShieldInit();
            shield.RegisterModelLayer();
        }

        for (Block sapling : CustomSapling.blocks){
            BlockRenderLayerMap.INSTANCE.putBlock(sapling, RenderLayer.getCutout());
        }
    }
}