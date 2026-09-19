package net.micomibite.tastytiles.item;

import net.micomibite.tastytiles.TastyTiles;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS= DeferredRegister.createItems(TastyTiles.MOD_ID);

    public static final DeferredItem<Item> CERAMIC_MIXTURE = ITEMS.register("ceramic_mixture",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}