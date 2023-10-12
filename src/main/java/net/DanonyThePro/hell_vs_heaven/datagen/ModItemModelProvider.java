package net.DanonyThePro.hell_vs_heaven.datagen;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.DanonyThePro.hell_vs_heaven.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Hell_vs_Heaven.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.FIRE_STEEL);
        simpleItem(ModItems.RAW_FIRE_STEEL);
        simpleItem(ModItems.ENDERITE);
        simpleItem(ModItems.RAW_ENDERITE);
        saplingItem(ModBlocks.HOLY_SAPLING);
        saplingItem(ModBlocks.CHARCOAL_SAPLING);

        simpleBlockItem(ModBlocks.CHARCOAL_DOOR);
        simpleBlockItem(ModBlocks.HOLY_DOOR);

        fenceItem(ModBlocks.CHARCOAL_FENCE, ModBlocks.CHARCOAL_PLANKS);
        fenceItem(ModBlocks.HOLY_FENCE, ModBlocks.HOLY_PLANKS);

        buttonItem(ModBlocks.CHARCOAL_BUTTON, ModBlocks.CHARCOAL_PLANKS);
        buttonItem(ModBlocks.HOLY_BUTTON, ModBlocks.HOLY_PLANKS);

        wallItem(ModBlocks.HOLY_WALL, ModBlocks.HOLY_PLANKS);
        wallItem(ModBlocks.CHARCOAL_WALL, ModBlocks.CHARCOAL_PLANKS);

        trapdoorItem(ModBlocks.CHARCOAL_TRAPDOOR);
        trapdoorItem(ModBlocks.HOLY_TRAPDOOR);

        evenSimplerBlockItem(ModBlocks.CHARCOAL_STAIRS);
        evenSimplerBlockItem(ModBlocks.CHARCOAL_SLAB);
        evenSimplerBlockItem(ModBlocks.CHARCOAL_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.CHARCOAL_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.HOLY_STAIRS);
        evenSimplerBlockItem(ModBlocks.HOLY_SLAB);
        evenSimplerBlockItem(ModBlocks.HOLY_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.HOLY_FENCE_GATE);

    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Hell_vs_Heaven.MOD_ID,"block/" + item.getId().getPath()));

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Hell_vs_Heaven.MOD_ID,"item/" + item.getId().getPath()));

    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Hell_vs_Heaven.MOD_ID, "item/" + item.getId().getPath()));
    }
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Hell_vs_Heaven.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Hell_vs_Heaven.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Hell_vs_Heaven.MOD_ID,"item/" + item.getId().getPath()));
    }
}
