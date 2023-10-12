package net.DanonyThePro.hell_vs_heaven.datagen;

import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.DanonyThePro.hell_vs_heaven.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.REINFORCED_OBSIDIAN_BLOCK.get());
        this.dropSelf(ModBlocks.FIRE_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.ENDERITE_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.CHARCOAL_LOG.get());
        this.dropSelf(ModBlocks.CHARCOAL_WOOD.get());
        this.dropSelf(ModBlocks.CHARCOAL_WALL.get());
        this.dropSelf(ModBlocks.CHARCOAL_FENCE.get());
        this.dropSelf(ModBlocks.CHARCOAL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHARCOAL_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CHARCOAL_STAIRS.get());
        this.dropSelf(ModBlocks.CHARCOAL_BUTTON.get());
        this.dropSelf(ModBlocks.CHARCOAL_TRAPDOOR.get());
        this.dropSelf(ModBlocks.STRIPPED_CHARCOAL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CHARCOAL_WOOD.get());
        this.dropSelf(ModBlocks.CHARCOAL_PLANKS.get());
        this.dropSelf(ModBlocks.CHARCOAL_SAPLING.get());
        this.dropSelf(ModBlocks.HOLY_LOG.get());
        this.dropSelf(ModBlocks.HOLY_WOOD.get());
        this.dropSelf(ModBlocks.HOLY_PLANKS.get());
        this.dropSelf(ModBlocks.HOLY_WALL.get());
        this.dropSelf(ModBlocks.HOLY_STAIRS.get());
        this.dropSelf(ModBlocks.HOLY_BUTTON.get());
        this.dropSelf(ModBlocks.HOLY_FENCE.get());
        this.dropSelf(ModBlocks.HOLY_FENCE_GATE.get());
        this.dropSelf(ModBlocks.HOLY_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.HOLY_TRAPDOOR.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_HOLY_WOOD.get());
        this.dropSelf(ModBlocks.HOLY_SAPLING.get());

        this.add(ModBlocks.CHARCOAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHARCOAL_SLAB.get()));
        this.add(ModBlocks.HOLY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.HOLY_SLAB.get()));

        this.add(ModBlocks.CHARCOAL_DOOR.get(),
                block -> createDoorTable(ModBlocks.CHARCOAL_DOOR.get()));
        this.add(ModBlocks.HOLY_DOOR.get(),
                block -> createDoorTable(ModBlocks.HOLY_DOOR.get()));

        this.add(ModBlocks.HOLY_LEAVES.get(), (block ->
                createLeavesDrops(block, ModBlocks.HOLY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)));
        this.add(ModBlocks.CHARCOAL_LEAVES.get(), (block ->
                createLeavesDrops(block, ModBlocks.CHARCOAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES)));

        this.add(ModBlocks.RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        this.add(ModBlocks.ENDSTONE_ENDERITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_ENDERITE_ORE.get(), ModItems.RAW_ENDERITE.get()));
        this.add(ModBlocks.NETHERACK_FIRE_STEEL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERACK_FIRE_STEEL_ORE.get(), ModItems.RAW_FIRE_STEEL.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
