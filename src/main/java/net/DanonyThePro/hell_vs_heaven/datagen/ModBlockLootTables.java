package net.DanonyThePro.hell_vs_heaven.datagen;

import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.DanonyThePro.hell_vs_heaven.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.REINFORCED_OBSIDIAN_BLOCK.get());
        dropSelf(ModBlocks.FIRE_STEEL_BLOCK.get());
        dropSelf(ModBlocks.ENDERITE_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.CHARCOAL_LOG.get());
        this.dropSelf(ModBlocks.CHARCOAL_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CHARCOAL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CHARCOAL_WOOD.get());
        this.dropSelf(ModBlocks.CHARCOAL_PLANKS.get());
        this.dropSelf(ModBlocks.CHARCOAL_SAPLING.get());
        this.dropSelf(ModBlocks.HOLY_LOG.get());
        this.dropSelf(ModBlocks.HOLY_WOOD.get());
        this.dropSelf(ModBlocks.HOLY_PLANKS.get());
        this.dropSelf(ModBlocks.HOLY_SAPLING.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLY_WOOD.get());
        this.add(ModBlocks.HOLY_LEAVES.get(), (block ->
                createLeavesDrops(block, ModBlocks.HOLY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)));
        this.add(ModBlocks.CHARCOAL_LEAVES.get(), (block ->
                createLeavesDrops(block, ModBlocks.CHARCOAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)));

        add(ModBlocks.RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlocks.ENDSTONE_ENDERITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_ENDERITE_ORE.get(), ModItems.RAW_ENDERITE.get()));
        add(ModBlocks.NETHERACK_FIRE_STEEL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERACK_FIRE_STEEL_ORE.get(), ModItems.RAW_FIRE_STEEL.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
