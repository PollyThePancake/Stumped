package io.github.pollythepancake.stumped.datagen;

import io.github.pollythepancake.stumped.blocks.AraucariaBlocks;
import io.github.pollythepancake.stumped.blocks.vanilla.*;
import io.github.pollythepancake.stumped.items.AraucariaItems;
import io.github.pollythepancake.stumped.items.vanilla.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataGenerator dataGen) {
        super(dataGen);
    }

    public static void offerStairsRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item input) {
        ShapedRecipeJsonBuilder
                .create(output,4)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .group("wooden_stairs")
                .criterion("has_plank", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerDoorRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item input) {
        ShapedRecipeJsonBuilder
                .create(output,3)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .group("wooden_door")
                .criterion("has_plank", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerTrapdoorRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item input) {
        ShapedRecipeJsonBuilder
                .create(output,2)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .group("wooden_trapdoor")
                .criterion("has_plank", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerFenceRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item input) {
        ShapedRecipeJsonBuilder
                .create(output,3)
                .input('#', input)
                .input('I', Items.STICK)
                .pattern("#I#")
                .pattern("#I#")
                .group("wooden_fence")
                .criterion("has_plank", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerFenceGateRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item input) {
        ShapedRecipeJsonBuilder
                .create(output)
                .input('#', input)
                .input('I', Items.STICK)
                .pattern("I#I")
                .pattern("I#I")
                .group("wooden_fence_gate")
                .criterion("has_plank", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerButtonRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item input) {
        offerShapelessRecipe(exporter, output, input,"wooden_button",1);
    }

    public static void offerSignRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item input) {
        ShapedRecipeJsonBuilder
                .create(output,3)
                .input('#', input)
                .input('I', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" I ")
                .group("sign")
                .criterion("has_plank", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerShieldRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item input) {
        ShapedRecipeJsonBuilder
                .create(output)
                .input('#', input)
                .input('I', Items.IRON_INGOT)
                .pattern("#I#")
                .pattern("###")
                .pattern(" # ")
                .group("shield")
                .criterion("has_plank", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerConvertRecipe(Consumer<RecipeJsonProvider> exporter, Item output, Item base, Item woodtype, String group) {
        ShapelessRecipeJsonBuilder
                .create(output)
                .input(base)
                .input(woodtype)
                .group(group)
                .criterion("has_stick", conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }


    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

        Item ARAUCARIA_PLANKS = AraucariaBlocks.ARAUCARIA_PLANKS.getItem();
        String group;

        // Planks
        offerPlanksRecipe(exporter, ARAUCARIA_PLANKS, ItemTagGen.ARAUCARIA_LOGS);

        // Wood
        offerBarkBlockRecipe(exporter, AraucariaBlocks.ARAUCARIA_WOOD.getItem(), AraucariaBlocks.ARAUCARIA_LOG.getItem());

        // Stripped Wood
        offerBarkBlockRecipe(exporter, AraucariaBlocks.STRIPPED_ARAUCARIA_WOOD.getItem(), AraucariaBlocks.STRIPPED_ARAUCARIA_LOG.getItem());

        // Slabs
        offerSlabRecipe(exporter, AraucariaBlocks.ARAUCARIA_SLAB.getItem(), ARAUCARIA_PLANKS);

        // Stairs
        offerStairsRecipe(exporter, AraucariaBlocks.ARAUCARIA_STAIRS.getItem(), ARAUCARIA_PLANKS);

        // Doors
        offerDoorRecipe(exporter, AraucariaBlocks.ARAUCARIA_DOOR.getItem(), ARAUCARIA_PLANKS);

        // Trapdoors
        offerTrapdoorRecipe(exporter, AraucariaBlocks.ARAUCARIA_TRAPDOOR.getItem(), ARAUCARIA_PLANKS);

        // Fences
        offerFenceRecipe(exporter, AraucariaBlocks.ARAUCARIA_FENCE.getItem(), ARAUCARIA_PLANKS);

        // Fence Gates
        offerFenceGateRecipe(exporter, AraucariaBlocks.ARAUCARIA_FENCE_GATE.getItem(), ARAUCARIA_PLANKS);

        // Pressure Plates
        offerPressurePlateRecipe(exporter, AraucariaBlocks.ARAUCARIA_PRESSURE_PLATE.getItem(), ARAUCARIA_PLANKS);

        // Buttons
        offerButtonRecipe(exporter, AraucariaBlocks.ARAUCARIA_BUTTON.getItem(), ARAUCARIA_PLANKS);

        // Ladders
        group = "ladders";
        offerConvertRecipe(exporter, AraucariaBlocks.ARAUCARIA_LADDER.getItem(), Items.LADDER, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakBlocks.OAK_LADDER.getItem(), Items.LADDER, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceBlocks.SPRUCE_LADDER.getItem(), Items.LADDER, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchBlocks.BIRCH_LADDER.getItem(), Items.LADDER, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleBlocks.JUNGLE_LADDER.getItem(), Items.LADDER, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaBlocks.ACACIA_LADDER.getItem(), Items.LADDER, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakBlocks.DARK_OAK_LADDER.getItem(), Items.LADDER, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveBlocks.MANGROVE_LADDER.getItem(), Items.LADDER, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonBlocks.CRIMSON_LADDER.getItem(), Items.LADDER, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedBlocks.WARPED_LADDER.getItem(), Items.LADDER, Items.WARPED_PLANKS, group);


        // Swords
        group = "sword";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_SWORD.getItem(), Items.WOODEN_SWORD, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_SWORD.getItem(), Items.WOODEN_SWORD, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_SWORD.getItem(), Items.WOODEN_SWORD, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_SWORD.getItem(), Items.WOODEN_SWORD, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_SWORD.getItem(), Items.WOODEN_SWORD, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_SWORD.getItem(), Items.WOODEN_SWORD, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_SWORD.getItem(), Items.WOODEN_SWORD, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_SWORD.getItem(), Items.WOODEN_SWORD, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_SWORD.getItem(), Items.WOODEN_SWORD, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_SWORD.getItem(), Items.WOODEN_SWORD, Items.WARPED_PLANKS, group);

        // Bows
        group = "bow";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_BOW.getItem(), Items.BOW, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_BOW.getItem(), Items.BOW, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_BOW.getItem(), Items.BOW, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_BOW.getItem(), Items.BOW, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_BOW.getItem(), Items.BOW, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_BOW.getItem(), Items.BOW, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_BOW.getItem(), Items.BOW, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_BOW.getItem(), Items.BOW, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_BOW.getItem(), Items.BOW, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_BOW.getItem(), Items.BOW, Items.WARPED_PLANKS, group);

        // Crossbows
        group = "crossbow";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_CROSSBOW.getItem(), Items.CROSSBOW, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_CROSSBOW.getItem(), Items.CROSSBOW, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_CROSSBOW.getItem(), Items.CROSSBOW, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_CROSSBOW.getItem(), Items.CROSSBOW, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_CROSSBOW.getItem(), Items.CROSSBOW, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_CROSSBOW.getItem(), Items.CROSSBOW, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_CROSSBOW.getItem(), Items.CROSSBOW, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_CROSSBOW.getItem(), Items.CROSSBOW, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_CROSSBOW.getItem(), Items.CROSSBOW, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_CROSSBOW.getItem(), Items.CROSSBOW, Items.WARPED_PLANKS, group);

        // Shields
        offerShieldRecipe(exporter, AraucariaItems.ARAUCARIA_SHIELD.getItem(), ARAUCARIA_PLANKS);
        offerShieldRecipe(exporter, OakItems.OAK_SHIELD.getItem(), Items.OAK_PLANKS);
        offerShieldRecipe(exporter, SpruceItems.SPRUCE_SHIELD.getItem(), Items.SPRUCE_PLANKS);
        offerShieldRecipe(exporter, BirchItems.BIRCH_SHIELD.getItem(), Items.BIRCH_PLANKS);
        offerShieldRecipe(exporter, JungleItems.JUNGLE_SHIELD.getItem(), Items.JUNGLE_PLANKS);
        offerShieldRecipe(exporter, AcaciaItems.ACACIA_SHIELD.getItem(), Items.ACACIA_PLANKS);
        offerShieldRecipe(exporter, DarkOakItems.DARK_OAK_SHIELD.getItem(), Items.DARK_OAK_PLANKS);
        offerShieldRecipe(exporter, MangroveItems.MANGROVE_SHIELD.getItem(), Items.MANGROVE_PLANKS);
        offerShieldRecipe(exporter, CrimsonItems.CRIMSON_SHIELD.getItem(), Items.CRIMSON_PLANKS);
        offerShieldRecipe(exporter, WarpedItems.WARPED_SHIELD.getItem(), Items.WARPED_PLANKS);

        // Pickaxes
        group = "pickaxe";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_PICKAXE.getItem(), Items.WOODEN_PICKAXE, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_PICKAXE.getItem(), Items.WOODEN_PICKAXE, Items.WARPED_PLANKS, group);

        // Axes
        group = "axe";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_AXE.getItem(), Items.WOODEN_AXE, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_AXE.getItem(), Items.WOODEN_AXE, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_AXE.getItem(), Items.WOODEN_AXE, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_AXE.getItem(), Items.WOODEN_AXE, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_AXE.getItem(), Items.WOODEN_AXE, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_AXE.getItem(), Items.WOODEN_AXE, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_AXE.getItem(), Items.WOODEN_AXE, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_AXE.getItem(), Items.WOODEN_AXE, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_AXE.getItem(), Items.WOODEN_AXE, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_AXE.getItem(), Items.WOODEN_AXE, Items.WARPED_PLANKS, group);

        // Shovels
        group = "shovel";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_SHOVEL.getItem(), Items.WOODEN_SHOVEL, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_SHOVEL.getItem(), Items.WOODEN_SHOVEL, Items.WARPED_PLANKS, group);

        // Hoes
        group = "hoe";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_HOE.getItem(), Items.WOODEN_HOE, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_HOE.getItem(), Items.WOODEN_HOE, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_HOE.getItem(), Items.WOODEN_HOE, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_HOE.getItem(), Items.WOODEN_HOE, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_HOE.getItem(), Items.WOODEN_HOE, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_HOE.getItem(), Items.WOODEN_HOE, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_HOE.getItem(), Items.WOODEN_HOE, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_HOE.getItem(), Items.WOODEN_HOE, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_HOE.getItem(), Items.WOODEN_HOE, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_HOE.getItem(), Items.WOODEN_HOE, Items.WARPED_PLANKS, group);

        // Signs
        offerSignRecipe(exporter, AraucariaItems.ARAUCARIA_SIGN.getItem(), AraucariaBlocks.ARAUCARIA_PLANKS.getItem());

        // Torches
        group = "torch";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_TORCH.getItem(), Items.TORCH, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_TORCH.getItem(), Items.TORCH, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_TORCH.getItem(), Items.TORCH, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_TORCH.getItem(), Items.TORCH, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_TORCH.getItem(), Items.TORCH, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_TORCH.getItem(), Items.TORCH, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_TORCH.getItem(), Items.TORCH, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_TORCH.getItem(), Items.TORCH, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_TORCH.getItem(), Items.TORCH, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_TORCH.getItem(), Items.TORCH, Items.WARPED_PLANKS, group);

        // Soul Torches
        group = "soul_torch";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_SOUL_TORCH.getItem(), Items.SOUL_TORCH, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_SOUL_TORCH.getItem(), Items.SOUL_TORCH, Items.WARPED_PLANKS, group);

        // Redstone Torches
        group = "redstone_torch";
        offerConvertRecipe(exporter, AraucariaItems.ARAUCARIA_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, ARAUCARIA_PLANKS, group);
        offerConvertRecipe(exporter, OakItems.OAK_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.OAK_PLANKS, group);
        offerConvertRecipe(exporter, SpruceItems.SPRUCE_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.SPRUCE_PLANKS, group);
        offerConvertRecipe(exporter, BirchItems.BIRCH_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.BIRCH_PLANKS, group);
        offerConvertRecipe(exporter, JungleItems.JUNGLE_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.JUNGLE_PLANKS, group);
        offerConvertRecipe(exporter, AcaciaItems.ACACIA_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.ACACIA_PLANKS, group);
        offerConvertRecipe(exporter, DarkOakItems.DARK_OAK_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.DARK_OAK_PLANKS, group);
        offerConvertRecipe(exporter, MangroveItems.MANGROVE_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.MANGROVE_PLANKS, group);
        offerConvertRecipe(exporter, CrimsonItems.CRIMSON_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.CRIMSON_PLANKS, group);
        offerConvertRecipe(exporter, WarpedItems.WARPED_REDSTONE_TORCH.getItem(), Items.REDSTONE_TORCH, Items.WARPED_PLANKS, group);

        // Boats
        offerBoatRecipe(exporter, AraucariaItems.ARAUCARIA_BOATS.getBoatItem(), ARAUCARIA_PLANKS);

        // Chest Boats
        offerChestBoatRecipe(exporter, AraucariaItems.ARAUCARIA_BOATS.getChestBoatItem(), AraucariaItems.ARAUCARIA_BOATS.getBoatItem());

    }
}