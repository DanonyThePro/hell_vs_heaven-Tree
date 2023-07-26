package net.DanonyThePro.hell_vs_heaven.datagen;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Hell_vs_Heaven.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.NETHERACK_FIRE_STEEL_ORE);
        blockWithItem(ModBlocks.FIRE_STEEL_BLOCK);
        blockWithItem(ModBlocks.ENDSTONE_ENDERITE_ORE);
        blockWithItem(ModBlocks.ENDERITE_BLOCK);
        blockWithItem(ModBlocks.REINFORCED_OBSIDIAN_BLOCK);
        blockWithItem(ModBlocks.CHARCOAL_PLANKS);
        blockWithItem(ModBlocks.HOLY_PLANKS);
        blockWithItem(ModBlocks.HOLY_LEAVES);
        blockWithItem(ModBlocks.CHARCOAL_LEAVES);
        saplingBlock(ModBlocks.CHARCOAL_SAPLING);
        saplingBlock(ModBlocks.HOLY_SAPLING);

        logBlock(((RotatedPillarBlock) ModBlocks.CHARCOAL_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.CHARCOAL_WOOD.get(), blockTexture(ModBlocks.CHARCOAL_LOG.get()), blockTexture(ModBlocks.CHARCOAL_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CHARCOAL_LOG.get(), new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/stripped_charcoal_log"),
                new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/stripped_charcoal_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CHARCOAL_WOOD.get(), new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/stripped_charcoal_log"),
                new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/stripped_charcoal_log"));

        simpleBlockItem(ModBlocks.CHARCOAL_LOG.get(), models().withExistingParent("hell_vs_heaven:charcoal_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.CHARCOAL_WOOD.get(), models().withExistingParent("hell_vs_heaven:charcoal_wood", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_CHARCOAL_LOG.get(), models().withExistingParent("hell_vs_heaven:stripped_charcoal_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_CHARCOAL_WOOD.get(), models().withExistingParent("hell_vs_heaven:stripped_charcoal_wood", "minecraft:block/cube_column"));


        logBlock(((RotatedPillarBlock) ModBlocks.HOLY_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.HOLY_WOOD.get(), blockTexture(ModBlocks.HOLY_LOG.get()), blockTexture(ModBlocks.HOLY_LOG.get()));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_HOLY_LOG.get(), new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/stripped_holy_log"),
                new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/stripped_holy_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_HOLY_WOOD.get(), new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/stripped_holy_log"),
                new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/stripped_holy_log"));


        simpleBlockItem(ModBlocks.HOLY_LOG.get(), models().withExistingParent("hell_vs_heaven:holy_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.HOLY_WOOD.get(), models().withExistingParent("hell_vs_heaven:holy_wood", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_HOLY_LOG.get(), models().withExistingParent("hell_vs_heaven:stripped_holy_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_HOLY_WOOD.get(), models().withExistingParent("hell_vs_heaven:stripped_holy_wood", "minecraft:block/cube_column"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
