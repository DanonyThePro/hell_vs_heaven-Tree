package net.DanonyThePro.hell_vs_heaven.item;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Hell_vs_Heaven.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab CM_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
    CM_TAB = event.registerCreativeModeTab(new ResourceLocation(Hell_vs_Heaven.MOD_ID, "cm_tab"),
            builder -> builder.icon(() -> new ItemStack(ModItems.HEARTCLEAVER.get()))
                    .title(Component.translatable("creativemodetab.cm_tab")));
    }
}
