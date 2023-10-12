package net.DanonyThePro.hell_vs_heaven.block;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.block.custom.ModFlammableRotatedPillarBlock;
import net.DanonyThePro.hell_vs_heaven.item.ModItems;
import net.DanonyThePro.hell_vs_heaven.worldgen.tree.CharcoalTreeGrower;
import net.DanonyThePro.hell_vs_heaven.worldgen.tree.HolyTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Hell_vs_Heaven.MOD_ID);

    public static final RegistryObject<Block> REINFORCED_OBSIDIAN_BLOCK = registerBlock ("reinforced_obsidian_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REINFORCED_DEEPSLATE)
                    .strength(55f).requiresCorrectToolForDrops().explosionResistance(55f)));

    public static final RegistryObject<Block> NETHERACK_FIRE_STEEL_ORE = registerBlock ("netherrack_fire_steel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> ENDSTONE_ENDERITE_ORE = registerBlock ("endstone_enderite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> ENDERITE_BLOCK = registerBlock ("enderite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
                    .strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FIRE_STEEL_BLOCK = registerBlock ("fire_steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
                    .strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock ("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock ("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .strength(9f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock ("ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)
                    .strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock ("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock ("deepslate_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .strength(9f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock ("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
                    .strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHARCOAL_LOG = registerBlock ("charcoal_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)
                    .strength(2f)));
    public static final RegistryObject<Block> CHARCOAL_WOOD = registerBlock ("charcoal_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)
                    .strength(2f)));
    public static final RegistryObject<Block> STRIPPED_CHARCOAL_LOG = registerBlock ("stripped_charcoal_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG)
                    .strength(2f)));
    public static final RegistryObject<Block> STRIPPED_CHARCOAL_WOOD = registerBlock ("stripped_charcoal_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)
                    .strength(2f)));

    public static final RegistryObject<Block> CHARCOAL_PLANKS = registerBlock ("charcoal_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)));


    public static final RegistryObject<Block> CHARCOAL_STAIRS = registerBlock ("charcoal_stairs",
            () -> new StairBlock(() -> ModBlocks.CHARCOAL_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)));

    public static final RegistryObject<Block> CHARCOAL_SLAB = registerBlock ("charcoal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)));


    public static final RegistryObject<Block> CHARCOAL_BUTTON = registerBlock ("charcoal_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON)
                    .strength(2f), BlockSetType.SPRUCE, 10, true));

    public static final RegistryObject<Block> CHARCOAL_PRESSURE_PLATE = registerBlock ("charcoal_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,  BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f), BlockSetType.SPRUCE));


    public static final RegistryObject<Block> CHARCOAL_FENCE = registerBlock ("charcoal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)));

    public static final RegistryObject<Block> CHARCOAL_FENCE_GATE = registerBlock ("charcoal_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> CHARCOAL_WALL = registerBlock ("charcoal_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)));


    public static final RegistryObject<Block> CHARCOAL_DOOR = registerBlock ("charcoal_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()
                    .strength(2f), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> CHARCOAL_TRAPDOOR = registerBlock ("charcoal_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()
                    .strength(2f), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> CHARCOAL_SAPLING = registerBlock ("charcoal_sapling",
            () -> new SaplingBlock(new CharcoalTreeGrower(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)));

    public static final RegistryObject<Block> CHARCOAL_LEAVES = registerBlock ("charcoal_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES)
                    .strength(0.2f)){

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });


    public static final RegistryObject<Block> HOLY_LOG = registerBlock ("holy_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)
                    .strength(2f)));
    public static final RegistryObject<Block> HOLY_WOOD = registerBlock ("holy_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)
                    .strength(2f)));
    public static final RegistryObject<Block> STRIPPED_HOLY_LOG = registerBlock ("stripped_holy_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG)
                    .strength(2f)));
    public static final RegistryObject<Block> STRIPPED_HOLY_WOOD = registerBlock ("stripped_holy_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)
                    .strength(2f)));

    public static final RegistryObject<Block> HOLY_STAIRS = registerBlock ("holy_stairs",
            () -> new StairBlock(() -> ModBlocks.HOLY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                            .strength(2f)));

    public static final RegistryObject<Block> HOLY_SLAB = registerBlock ("holy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)));


    public static final RegistryObject<Block> HOLY_BUTTON = registerBlock ("holy_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON)
                    .strength(2f), BlockSetType.SPRUCE, 10, true));

    public static final RegistryObject<Block> HOLY_PRESSURE_PLATE = registerBlock ("holy_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,  BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f), BlockSetType.SPRUCE));


    public static final RegistryObject<Block> HOLY_FENCE = registerBlock ("holy_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)));

    public static final RegistryObject<Block> HOLY_FENCE_GATE = registerBlock ("holy_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> HOLY_WALL = registerBlock ("holy_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)));


    public static final RegistryObject<Block> HOLY_DOOR = registerBlock ("holy_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()
                    .strength(2f), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> HOLY_TRAPDOOR = registerBlock ("holy_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()
                    .strength(2f), BlockSetType.SPRUCE));


    public static final RegistryObject<Block> HOLY_PLANKS = registerBlock ("holy_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .strength(2f)){

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });


    public static final RegistryObject<Block> HOLY_LEAVES = registerBlock ("holy_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES)
                    .strength(0.2f)){

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });
    public static final RegistryObject<Block> HOLY_SAPLING = registerBlock ("holy_sapling",
            () -> new SaplingBlock(new HolyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

}
