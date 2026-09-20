package net.micomibite.tastytiles.item;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TastyTiles.MOD_ID);

    public static final Supplier<CreativeModeTab> TASTY_TILES_TAB = CREATIVE_MODE_TAB.register("tasty_tiles_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CERAMIC_MIXTURE.get()))
            .title(Component.translatable("creativetab.tasty_tiles_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.CERAMIC_MIXTURE);
                output.accept(ModBlocks.BRICK_PITTER_TILE);
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
