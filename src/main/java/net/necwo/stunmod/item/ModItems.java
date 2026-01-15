package net.necwo.stunmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.necwo.stunmod.StevenUniverseMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StevenUniverseMod.MOD_ID);

    public static final RegistryObject<Item> PEARL_GEM = ITEMS.register("pearl_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_GEM = ITEMS.register("peridot_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_GEM = ITEMS.register("bismuth_gem",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
