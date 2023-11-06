package net.DanonyThePro.hell_vs_heaven.event;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.entity.ModEntities;
import net.DanonyThePro.hell_vs_heaven.entity.custom.BaphometEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Hell_vs_Heaven.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BAPHOMET.get(), BaphometEntity.createAttributes().build());
    }

}
