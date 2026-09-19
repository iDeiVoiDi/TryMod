package com.ideivoidi.kyro.item;

import com.ideivoidi.kyro.Kyro;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kyro.MOD_ID);

    public  static final DeferredItem<Item> KYRITE_INGOT = ITEMS.register("kyrite_ingot",
            () -> new Item(new Item.Properties()));
    public  static final DeferredItem<Item> RAW_KYRITE = ITEMS.register("raw_kyrite",
            () -> new Item(new Item.Properties()));
    public  static final DeferredItem<Item> KYRITE_ORE = ITEMS.register("kyrite_ore",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
