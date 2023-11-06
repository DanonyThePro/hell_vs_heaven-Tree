package net.DanonyThePro.hell_vs_heaven;

import com.mojang.logging.LogUtils;
import net.DanonyThePro.hell_vs_heaven.block.ModBlocks;
import net.DanonyThePro.hell_vs_heaven.entity.ModEntities;
import net.DanonyThePro.hell_vs_heaven.entity.client.BaphometRenderer;
import net.DanonyThePro.hell_vs_heaven.item.ModCreativeModeTabs;
import net.DanonyThePro.hell_vs_heaven.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Hell_vs_Heaven.MOD_ID)
public class Hell_vs_Heaven {
    public static final String MOD_ID = "hell_vs_heaven";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Hell_vs_Heaven() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.HEARTCLEAVER);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.ENDERITE_BLOCK);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.CHARCOAL_DOOR);
            event.accept(ModBlocks.CHARCOAL_BUTTON);
            event.accept(ModBlocks.CHARCOAL_TRAPDOOR);
            event.accept(ModBlocks.CHARCOAL_FENCE);
            event.accept(ModBlocks.CHARCOAL_FENCE_GATE);
            event.accept(ModBlocks.CHARCOAL_PRESSURE_PLATE);
            event.accept(ModBlocks.CHARCOAL_SLAB);
            event.accept(ModBlocks.CHARCOAL_STAIRS);
            event.accept(ModBlocks.CHARCOAL_WALL);
            event.accept(ModBlocks.HOLY_DOOR);
            event.accept(ModBlocks.HOLY_BUTTON);
            event.accept(ModBlocks.HOLY_TRAPDOOR);
            event.accept(ModBlocks.HOLY_FENCE);
            event.accept(ModBlocks.HOLY_FENCE_GATE);
            event.accept(ModBlocks.HOLY_PRESSURE_PLATE);
            event.accept(ModBlocks.HOLY_SLAB);
            event.accept(ModBlocks.HOLY_STAIRS);
            event.accept(ModBlocks.HOLY_WALL);
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.CHARCOAL_LOG);
            event.accept(ModBlocks.CHARCOAL_WOOD);
            event.accept(ModBlocks.CHARCOAL_SAPLING);
            event.accept(ModBlocks.CHARCOAL_LEAVES);
            event.accept(ModBlocks.CHARCOAL_PLANKS);
            event.accept(ModBlocks.STRIPPED_CHARCOAL_LOG);
            event.accept(ModBlocks.STRIPPED_CHARCOAL_WOOD);
            event.accept(ModBlocks.HOLY_LOG);
            event.accept(ModBlocks.HOLY_WOOD);
            event.accept(ModBlocks.HOLY_PLANKS);
            event.accept(ModBlocks.HOLY_LEAVES);
            event.accept(ModBlocks.HOLY_SAPLING);
            event.accept(ModBlocks.STRIPPED_CHARCOAL_LOG);
            event.accept(ModBlocks.STRIPPED_HOLY_WOOD);
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RUBY);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.ENDERITE);
            event.accept(ModItems.RAW_ENDERITE);
            event.accept(ModItems.RAW_FIRE_STEEL);
            event.accept(ModItems.FIRE_STEEL);
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlocks.ENDSTONE_ENDERITE_ORE);
            event.accept(ModBlocks.NETHERACK_FIRE_STEEL_ORE);
            event.accept(ModBlocks.CHARCOAL_LOG);
            event.accept(ModBlocks.CHARCOAL_WOOD);
            event.accept(ModBlocks.CHARCOAL_SAPLING);
            event.accept(ModBlocks.CHARCOAL_LEAVES);
            event.accept(ModBlocks.CHARCOAL_PLANKS);
            event.accept(ModBlocks.STRIPPED_CHARCOAL_LOG);
            event.accept(ModBlocks.STRIPPED_CHARCOAL_WOOD);
            event.accept(ModBlocks.HOLY_LOG);
            event.accept(ModBlocks.HOLY_WOOD);
            event.accept(ModBlocks.HOLY_PLANKS);
            event.accept(ModBlocks.HOLY_LEAVES);
            event.accept(ModBlocks.HOLY_SAPLING);
            event.accept(ModBlocks.STRIPPED_CHARCOAL_LOG);
            event.accept(ModBlocks.STRIPPED_HOLY_WOOD);
        }

        if (event.getTab() == ModCreativeModeTabs.CM_TAB.get()) {
            event.accept(ModItems.HEARTCLEAVER);
            event.accept(ModItems.BAPHOMET_SPAWN_EGG);
            event.accept(ModItems.RUBY);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModItems.FIRE_STEEL);
            event.accept(ModItems.RAW_FIRE_STEEL);
            event.accept(ModBlocks.NETHERACK_FIRE_STEEL_ORE);
            event.accept(ModBlocks.FIRE_STEEL_BLOCK);
            event.accept(ModItems.ENDERITE);
            event.accept(ModItems.RAW_ENDERITE);
            event.accept(ModBlocks.ENDSTONE_ENDERITE_ORE);
            event.accept(ModBlocks.ENDERITE_BLOCK);
            event.accept(ModBlocks.CHARCOAL_LOG);
            event.accept(ModBlocks.CHARCOAL_WOOD);
            event.accept(ModBlocks.CHARCOAL_SAPLING);
            event.accept(ModBlocks.CHARCOAL_LEAVES);
            event.accept(ModBlocks.CHARCOAL_PLANKS);
            event.accept(ModBlocks.STRIPPED_CHARCOAL_LOG);
            event.accept(ModBlocks.STRIPPED_CHARCOAL_WOOD);
            event.accept(ModBlocks.HOLY_LOG);
            event.accept(ModBlocks.HOLY_WOOD);
            event.accept(ModBlocks.HOLY_PLANKS);
            event.accept(ModBlocks.HOLY_LEAVES);
            event.accept(ModBlocks.HOLY_SAPLING);
            event.accept(ModBlocks.STRIPPED_HOLY_LOG);
            event.accept(ModBlocks.STRIPPED_HOLY_WOOD);
            event.accept(ModBlocks.CHARCOAL_DOOR);
            event.accept(ModBlocks.CHARCOAL_BUTTON);
            event.accept(ModBlocks.CHARCOAL_TRAPDOOR);
            event.accept(ModBlocks.CHARCOAL_FENCE);
            event.accept(ModBlocks.CHARCOAL_FENCE_GATE);
            event.accept(ModBlocks.CHARCOAL_PRESSURE_PLATE);
            event.accept(ModBlocks.CHARCOAL_SLAB);
            event.accept(ModBlocks.CHARCOAL_STAIRS);
            event.accept(ModBlocks.CHARCOAL_WALL);
            event.accept(ModBlocks.HOLY_DOOR);
            event.accept(ModBlocks.HOLY_BUTTON);
            event.accept(ModBlocks.HOLY_TRAPDOOR);
            event.accept(ModBlocks.HOLY_FENCE);
            event.accept(ModBlocks.HOLY_FENCE_GATE);
            event.accept(ModBlocks.HOLY_PRESSURE_PLATE);
            event.accept(ModBlocks.HOLY_SLAB);
            event.accept(ModBlocks.HOLY_STAIRS);
            event.accept(ModBlocks.HOLY_WALL);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.BAPHOMET.get(), BaphometRenderer::new);
        }
    }
}