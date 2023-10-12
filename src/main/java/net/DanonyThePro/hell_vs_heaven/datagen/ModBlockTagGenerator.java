package net.DanonyThePro.hell_vs_heaven.datagen;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
        public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
                super(output, lookupProvider, Hell_vs_Heaven.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider p_256380_) {

                this.tag(BlockTags.LOGS)
                        .add(ModBlocks.CHARCOAL_LOG.get())
                        .add(ModBlocks.CHARCOAL_WOOD.get())
                        .add(ModBlocks.STRIPPED_CHARCOAL_LOG.get())
                        .add(ModBlocks.STRIPPED_CHARCOAL_WOOD.get())
                        .add(ModBlocks.HOLY_LOG.get())
                        .add(ModBlocks.HOLY_WOOD.get())
                        .add(ModBlocks.STRIPPED_HOLY_LOG.get())
                        .add(ModBlocks.STRIPPED_HOLY_WOOD.get());

                this.tag(BlockTags.NEEDS_IRON_TOOL)
                        .add(ModBlocks.NETHERACK_FIRE_STEEL_ORE.get())
                        .add(ModBlocks.ENDSTONE_ENDERITE_ORE.get())
                        .add(ModBlocks.ENDERITE_BLOCK.get())
                        .add(ModBlocks.FIRE_STEEL_BLOCK.get());

                this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                        .add(ModBlocks.RUBY_ORE.get())
                        .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                        .add(ModBlocks.RUBY_BLOCK.get())
                        .add(ModBlocks.SAPPHIRE_ORE.get())
                        .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                        .add(ModBlocks.SAPPHIRE_BLOCK.get());

                this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

                this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                        .add(ModBlocks.RUBY_ORE.get())
                        .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                        .add(ModBlocks.RUBY_BLOCK.get())
                        .add(ModBlocks.SAPPHIRE_ORE.get())
                        .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                        .add(ModBlocks.SAPPHIRE_BLOCK.get())
                        .add(ModBlocks.NETHERACK_FIRE_STEEL_ORE.get())
                        .add(ModBlocks.ENDSTONE_ENDERITE_ORE.get())
                        .add(ModBlocks.ENDERITE_BLOCK.get())
                        .add(ModBlocks.FIRE_STEEL_BLOCK.get());

                this.tag(BlockTags.MINEABLE_WITH_AXE)
                        .add(ModBlocks.CHARCOAL_LOG.get())
                        .add(ModBlocks.CHARCOAL_WOOD.get())
                        .add(ModBlocks.CHARCOAL_PLANKS.get())
                        .add(ModBlocks.STRIPPED_CHARCOAL_LOG.get())
                        .add(ModBlocks.STRIPPED_CHARCOAL_WOOD.get())
                        .add(ModBlocks.CHARCOAL_DOOR.get())
                        .add(ModBlocks.CHARCOAL_TRAPDOOR.get())
                        .add(ModBlocks.CHARCOAL_BUTTON.get())
                        .add(ModBlocks.CHARCOAL_STAIRS.get())
                        .add(ModBlocks.CHARCOAL_SLAB.get())
                        .add(ModBlocks.CHARCOAL_PRESSURE_PLATE.get())
                        .add(ModBlocks.CHARCOAL_FENCE.get())
                        .add(ModBlocks.CHARCOAL_FENCE_GATE.get())
                        .add(ModBlocks.CHARCOAL_WALL.get())

                        .add(ModBlocks.HOLY_LOG.get())
                        .add(ModBlocks.HOLY_WOOD.get())
                        .add(ModBlocks.HOLY_PLANKS.get())
                        .add(ModBlocks.STRIPPED_HOLY_LOG.get())
                        .add(ModBlocks.STRIPPED_HOLY_WOOD.get())
                        .add(ModBlocks.HOLY_DOOR.get())
                        .add(ModBlocks.HOLY_TRAPDOOR.get())
                        .add(ModBlocks.HOLY_BUTTON.get())
                        .add(ModBlocks.HOLY_STAIRS.get())
                        .add(ModBlocks.HOLY_SLAB.get())
                        .add(ModBlocks.HOLY_PRESSURE_PLATE.get())
                        .add(ModBlocks.HOLY_FENCE.get())
                        .add(ModBlocks.HOLY_FENCE_GATE.get())
                        .add(ModBlocks.HOLY_WALL.get());


                this.tag(BlockTags.FENCES)
                        .add(ModBlocks.CHARCOAL_FENCE.get())
                        .add(ModBlocks.HOLY_FENCE.get());

                this.tag(BlockTags.FENCE_GATES)
                        .add(ModBlocks.CHARCOAL_FENCE_GATE.get())
                        .add(ModBlocks.HOLY_FENCE_GATE.get());

                this.tag(BlockTags.WALLS)
                        .add(ModBlocks.CHARCOAL_WALL.get())
                        .add(ModBlocks.HOLY_WALL.get());
    }
}
