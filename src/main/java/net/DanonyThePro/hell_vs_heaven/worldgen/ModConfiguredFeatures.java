package net.DanonyThePro.hell_vs_heaven.worldgen;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLY_KEY = registerKey("holy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHARCOAL_KEY = registerKey("charcoal");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, HOLY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.HOLY_LOG.get()),
                new ForkingTrunkPlacer(8, 0, 5),
                BlockStateProvider.simple(ModBlocks.HOLY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(5, 2, 4)).build());

        register(context, CHARCOAL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHARCOAL_LOG.get().defaultBlockState()), // Replace 'yourSpruceLogBlock' with your actual Spruce log block
                new FancyTrunkPlacer(17, 7, 5), // Customize trunk placement settings (base height, random height, trunk width)
                BlockStateProvider.simple(ModBlocks.CHARCOAL_LEAVES.get().defaultBlockState()), // Replace 'yourSpruceLeavesBlock' with your actual Spruce leaves block
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(1),3), // Customize foliage placement settings (foliage height, random spread, max radius)
                new TwoLayersFeatureSize(2, 0, 3) // Customize the size of the feature (minimum height, additional random height, foliage height)
        ).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Hell_vs_Heaven.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}