package net.necwo.stunmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.necwo.stunmod.StevenUniverseMod;
import net.necwo.stunmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StevenUniverseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GEM_ITEMS_TAB = CREATIVE_MODE_TABS.register("gem_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMETHYST_GEM.get()))
                    .title(Component.translatable("creativetab.necwostevenuniverse.gem_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AMETHYST_GEM.get());
                        output.accept(ModItems.BISMUTH_GEM.get());
                        output.accept(ModItems.OPAL_GEM.get());
                        output.accept(ModItems.PEARL_GEM.get());
                        output.accept(ModItems.PERIDOT_GEM.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> GEM_BLOCKS_TAB = CREATIVE_MODE_TABS.register("gem_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AMETHYST_BLOCK.get()))
                    .withTabsBefore(GEM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.necwostevenuniverse.gem_block"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.AMETHYST_BLOCK.get());

                    }).build());
    public static void register(IEventBus eventBus) {
      CREATIVE_MODE_TABS.register(eventBus);
    }
}
