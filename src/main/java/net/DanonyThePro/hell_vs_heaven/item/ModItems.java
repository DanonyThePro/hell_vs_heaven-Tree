package net.DanonyThePro.hell_vs_heaven.item;

import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Hell_vs_Heaven.MOD_ID);

    public static final RegistryObject<Item> HEARTCLEAVER = ITEMS.register("heartcleaver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ENDERITE = ITEMS.register("raw_enderite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_FIRE_STEEL = ITEMS.register("raw_fire_steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FIRE_STEEL = ITEMS.register("fire_steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
