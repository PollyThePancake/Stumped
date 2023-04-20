package io.github.pollythepancake.stumped;

import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.blocks.vanilla.*;
import io.github.pollythepancake.stumped.items.AraucariaItems;
import io.github.pollythepancake.stumped.items.vanilla.*;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.TerraBlenderApi;

// Very important comment
public class ModInit implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "stumped";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        // Items
        OakItems.registerOakItems();
        SpruceItems.registerSpruceItems();
        BirchItems.registerBirchItems();
        JungleItems.registerJungleItems();
        AcaciaItems.registerAcaciaItems();
        DarkOakItems.registerDarkOakItems();
        CrimsonItems.registerCrimsonItems();
        WarpedItems.registerWarpedItems();
        MangroveItems.registerMangroveItems();

        AraucariaItems.registerAraucariaItems();


        // Blocks
        OakBlocks.registerOakBlocks();
        SpruceBlocks.registerSpruceBlocks();
        BirchBlocks.registerBirchBlocks();
        JungleBlocks.registerJungleBlocks();
        AcaciaBlocks.registerAcaciaBlocks();
        DarkOakBlocks.registerDarkOakBlocks();
        CrimsonBlocks.registerCrimsonBlocks();
        WarpedBlocks.registerWarpedBlocks();
        MangroveBlocks.registerMangroveBlocks();

        AraucariaBlocks.registerAraucariaBlocks();

    }

    @Override
    public void onTerraBlenderInitialized() {

    }
}
