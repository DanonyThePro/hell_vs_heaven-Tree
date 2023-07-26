package net.DanonyThePro.hell_vs_heaven.datagen;

import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.DanonyThePro.hell_vs_heaven.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModItems.RAW_ENDERITE.get()), RecipeCategory.MISC,
                ModItems.ENDERITE.get(), 0.7f, 100, "enderite");
        oreSmelting(consumer, List.of(ModBlocks.ENDSTONE_ENDERITE_ORE.get()), RecipeCategory.MISC,
                ModItems.ENDERITE.get(), 0.7f, 100, "enderite");
        oreSmelting(consumer, List.of(ModItems.RAW_FIRE_STEEL.get()), RecipeCategory.MISC,
                ModItems.FIRE_STEEL.get(), 0.7f, 100, "fire_steel");
        oreSmelting(consumer, List.of(ModBlocks.NETHERACK_FIRE_STEEL_ORE.get()), RecipeCategory.MISC,
                ModItems.FIRE_STEEL.get(), 0.7f, 100, "fire_steel");
        oreSmelting(consumer, List.of(ModBlocks.RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 0.7f, 100, "ruby");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 0.7f, 100, "ruby");
        oreSmelting(consumer, List.of(ModBlocks.SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 0.7f, 100, "sapphire");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 0.7f, 100, "sapphire");

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(), RecipeCategory.MISC,
                ModBlocks.RUBY_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(), RecipeCategory.MISC,
                ModBlocks.SAPPHIRE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERITE.get(), RecipeCategory.MISC,
                ModBlocks.ENDERITE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.FIRE_STEEL.get(), RecipeCategory.MISC,
                ModBlocks.FIRE_STEEL_BLOCK.get());

        planksFromLogs(consumer,  ModBlocks.CHARCOAL_LOG.get(), ModBlocks.CHARCOAL_PLANKS.get(), ModBlocks.STRIPPED_CHARCOAL_LOG.get(), 4);
        planksFromLogs(consumer,  ModBlocks.HOLY_LOG.get(), ModBlocks.HOLY_PLANKS.get(), ModBlocks.STRIPPED_HOLY_LOG.get(),4);
        woodFromLogs(consumer, ModBlocks.CHARCOAL_LOG.get(), ModBlocks.CHARCOAL_WOOD.get());
        woodFromLogs(consumer, ModBlocks.HOLY_LOG.get(), ModBlocks.HOLY_WOOD.get());
        woodFromLogs(consumer, ModBlocks.STRIPPED_CHARCOAL_LOG.get(), ModBlocks.STRIPPED_CHARCOAL_WOOD.get());
        woodFromLogs(consumer, ModBlocks.STRIPPED_HOLY_LOG.get(), ModBlocks.STRIPPED_HOLY_WOOD.get());
        sticksFromPlanks(consumer, ModBlocks.CHARCOAL_PLANKS.get(), Items.STICK);
        ctFromPlanks(consumer, ModBlocks.CHARCOAL_PLANKS.get(), Blocks.CRAFTING_TABLE);
    }
    protected void planksFromLogs(Consumer<FinishedRecipe> consumer, ItemLike logInput, ItemLike plankOutput, ItemLike strippedLogInput, int planksCount) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, plankOutput, planksCount)
                .requires(strippedLogInput)
                .unlockedBy("has_stripped_logs", has(strippedLogInput))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, plankOutput, planksCount)
                .requires(logInput)
                .unlockedBy("has_logs", has(logInput))
                .save(consumer);

    }
    protected static void woodFromLogs(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .define('#', input)
                .pattern("##")
                .pattern("##")
                .group("bark")
                .unlockedBy("has_log", has(input))
                .save(consumer);
    }
    protected static void ctFromPlanks(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output)
                .define('#', input)
                .pattern("##")
                .pattern("##")
                .group("ct")
                .unlockedBy("has_planks", has(input))
                .save(consumer);
    }
    protected static void sticksFromPlanks(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 4)
                .define('#', input)
                .pattern("#")
                .pattern("#")
                .group("bark")
                .unlockedBy("has_planks", has(input))
                .save(consumer);
    }
}