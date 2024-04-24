package io.github.pollythepancake.stumped;

import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.items.AraucariaItems;
import io.github.pollythepancake.stumped.util.ItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModInit implements ModInitializer {

    public static final String MOD_ID = "stumped";
    public static final String MOD_VERSION = "v0.1.0";
    public static final String MINECRAFT_VERSION = "1.20.5";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {

        ItemGroups.registerItemGroups();
        AraucariaBlocks.registerAraucariaBlocks();
        AraucariaItems.registerAraucariaItems();


        LOGGER.info("Stumped " + MOD_VERSION + "-" + MINECRAFT_VERSION + " is running!");
    }
}