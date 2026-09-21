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
                output.accept(ModBlocks.BRICK_PITTER_TILE_SLAB);
                output.accept(ModBlocks.BRICK_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.BRICK_PITTER_TILE_WALL);
                output.accept(ModBlocks.FIRE_PITTER_TILE);
                output.accept(ModBlocks.FIRE_PITTER_TILE_SLAB);
                output.accept(ModBlocks.FIRE_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.FIRE_PITTER_TILE_WALL);
                output.accept(ModBlocks.OCHRE_PITTER_TILE);
                output.accept(ModBlocks.OCHRE_PITTER_TILE_SLAB);
                output.accept(ModBlocks.OCHRE_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.OCHRE_PITTER_TILE_WALL);
                output.accept(ModBlocks.EARTHY_PITTER_TILE);
                output.accept(ModBlocks.EARTHY_PITTER_TILE_SLAB);
                output.accept(ModBlocks.EARTHY_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.EARTHY_PITTER_TILE_WALL);
                output.accept(ModBlocks.PALE_PITTER_TILE);
                output.accept(ModBlocks.PALE_PITTER_TILE_SLAB);
                output.accept(ModBlocks.PALE_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.PALE_PITTER_TILE_WALL);
                output.accept(ModBlocks.LUSH_PITTER_TILE);
                output.accept(ModBlocks.LUSH_PITTER_TILE_SLAB);
                output.accept(ModBlocks.LUSH_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.LUSH_PITTER_TILE_WALL);
                output.accept(ModBlocks.DEEP_PITTER_TILE);
                output.accept(ModBlocks.DEEP_PITTER_TILE_SLAB);
                output.accept(ModBlocks.DEEP_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.DEEP_PITTER_TILE_WALL);
                output.accept(ModBlocks.PITCH_PITTER_TILE);
                output.accept(ModBlocks.PITCH_PITTER_TILE_SLAB);
                output.accept(ModBlocks.PITCH_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.PITCH_PITTER_TILE_WALL);
                output.accept(ModBlocks.PINK_PITTER_TILE);
                output.accept(ModBlocks.PINK_PITTER_TILE_SLAB);
                output.accept(ModBlocks.PINK_PITTER_TILE_STAIRS);
                output.accept(ModBlocks.PINK_PITTER_TILE_WALL);
                output.accept(ModBlocks.EVE_SUMMER_TILE);
                output.accept(ModBlocks.EVE_SUMMER_TILE_SLAB);
                output.accept(ModBlocks.EVE_SUMMER_TILE_STAIRS);
                output.accept(ModBlocks.EVE_SUMMER_TILE_WALL);
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
