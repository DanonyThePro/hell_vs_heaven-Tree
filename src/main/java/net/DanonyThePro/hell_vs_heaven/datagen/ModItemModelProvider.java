package net.DanonyThePro.hell_vs_heaven.datagen;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.DanonyThePro.hell_vs_heaven.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
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
        simpleItem(ModItems.ENDERITE_BOOTS);
        simpleItem(ModItems.RAW_ENDERITE);
        simpleItem(ModItems.HEARTCLEAVER);
        saplingItem(ModBlocks.HOLY_SAPLING);
        saplingItem(ModBlocks.CHARCOAL_SAPLING);
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
}
