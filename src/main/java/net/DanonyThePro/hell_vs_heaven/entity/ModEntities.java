package net.DanonyThePro.hell_vs_heaven.entity;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.entity.custom.BaphometEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Hell_vs_Heaven.MOD_ID);

    public static final RegistryObject<EntityType<BaphometEntity>> BAPHOMET =
            ENTITY_TYPES.register("baphomet", () -> EntityType.Builder.of(BaphometEntity::new, MobCategory.MONSTER)
                    .sized(1.5f,3f)
                    .build("baphomet"));

    public static void register(IEventBus eventBus)  {
        ENTITY_TYPES.register(eventBus);
    }
}
