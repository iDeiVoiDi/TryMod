package com.ideivoidi.kyro.item;

import com.ideivoidi.kyro.Kyro;
import com.ideivoidi.kyro.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Kyro.MOD_ID);

    public static final Supplier<CreativeModeTab> KYRITE_ITEMS_TAB = CREATIVE_MODE_TAB.register("kyrite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KYRITE_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Kyro.MOD_ID, "kyrite"))
                    .title(Component.translatable("creativetab.kyro.kyrite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KYRITE_INGOT);
                        output.accept(ModItems.RAW_KYRITE);
                        output.accept(ModItems.KYRITE_ORE);
                        output.accept(ModBlocks.KYRITE_INGOT_BLOCK);
                        output.accept(ModBlocks.KYRITE_ORE_BLOCK);
                        output.accept(ModBlocks.RAW_KYRITE_BLOCK);
                        output.accept(ModBlocks.ENDSTONE_KYRITE_ORE_BLOCK);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
