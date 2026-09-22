package net.micomibite.tastytiles.block;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.EventBus;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TastyTiles.MOD_ID);

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //Pitter Tiles
    public static final DeferredBlock<Block> BRICK_PITTER_TILE = registerBlock("brick_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BRICK_PITTER_TILE_SLAB = registerBlock("brick_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BRICK_PITTER_TILE_STAIRS = registerBlock("brick_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.BRICK_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BRICK_PITTER_TILE_WALL = registerBlock("brick_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> FIRE_PITTER_TILE = registerBlock("fire_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> FIRE_PITTER_TILE_SLAB = registerBlock("fire_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> FIRE_PITTER_TILE_STAIRS = registerBlock("fire_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.FIRE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> FIRE_PITTER_TILE_WALL = registerBlock("fire_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> OCHRE_PITTER_TILE = registerBlock("ochre_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> OCHRE_PITTER_TILE_SLAB = registerBlock("ochre_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> OCHRE_PITTER_TILE_STAIRS = registerBlock("ochre_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.OCHRE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> OCHRE_PITTER_TILE_WALL = registerBlock("ochre_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EARTHY_PITTER_TILE = registerBlock("earthy_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EARTHY_PITTER_TILE_SLAB = registerBlock("earthy_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EARTHY_PITTER_TILE_STAIRS = registerBlock("earthy_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.EARTHY_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EARTHY_PITTER_TILE_WALL = registerBlock("earthy_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PALE_PITTER_TILE = registerBlock("pale_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PALE_PITTER_TILE_SLAB = registerBlock("pale_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PALE_PITTER_TILE_STAIRS = registerBlock("pale_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.PALE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PALE_PITTER_TILE_WALL = registerBlock("pale_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LUSH_PITTER_TILE = registerBlock("lush_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LUSH_PITTER_TILE_SLAB = registerBlock("lush_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LUSH_PITTER_TILE_STAIRS = registerBlock("lush_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.LUSH_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LUSH_PITTER_TILE_WALL = registerBlock("lush_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DEEP_PITTER_TILE = registerBlock("deep_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DEEP_PITTER_TILE_SLAB = registerBlock("deep_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DEEP_PITTER_TILE_STAIRS = registerBlock("deep_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.DEEP_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEP_PITTER_TILE_WALL = registerBlock("deep_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PITCH_PITTER_TILE = registerBlock("pitch_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PITCH_PITTER_TILE_SLAB = registerBlock("pitch_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PITCH_PITTER_TILE_STAIRS = registerBlock("pitch_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.PITCH_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PITCH_PITTER_TILE_WALL = registerBlock("pitch_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_PITTER_TILE = registerBlock("pink_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_PITTER_TILE_SLAB = registerBlock("pink_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_PITTER_TILE_STAIRS = registerBlock("pink_pitter_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_PITTER_TILE_WALL = registerBlock("pink_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //EVE SUMMER TILE
    public static final DeferredBlock<Block> EVE_SUMMER_TILE = registerBlock("eve_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_SUMMER_TILE_SLAB = registerBlock("eve_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EVE_SUMMER_TILE_STAIRS = registerBlock("eve_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.EVE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EVE_SUMMER_TILE_WALL = registerBlock("eve_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_SPROUT_SUMMER_TILE = registerBlock("eve_sprout_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_SPROUT_SUMMER_TILE_SLAB = registerBlock("eve_sprout_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EVE_SPROUT_SUMMER_TILE_STAIRS = registerBlock("eve_sprout_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.EVE_SPROUT_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EVE_SPROUT_SUMMER_TILE_WALL = registerBlock("eve_sprout_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_BLOOM_SUMMER_TILE = registerBlock("eve_bloom_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_BLOOM_SUMMER_TILE_SLAB = registerBlock("eve_bloom_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EVE_BLOOM_SUMMER_TILE_STAIRS = registerBlock("eve_bloom_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.EVE_BLOOM_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EVE_BLOOM_SUMMER_TILE_WALL = registerBlock("eve_bloom_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_FLOWER_SUMMER_TILE = registerBlock("eve_flower_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_FLOWER_SUMMER_TILE_SLAB = registerBlock("eve_flower_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EVE_FLOWER_SUMMER_TILE_STAIRS = registerBlock("eve_flower_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.EVE_FLOWER_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EVE_FLOWER_SUMMER_TILE_WALL = registerBlock("eve_flower_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_CROSS_SUMMER_TILE = registerBlock("eve_cross_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_CROSS_SUMMER_TILE_SLAB = registerBlock("eve_cross_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EVE_CROSS_SUMMER_TILE_STAIRS = registerBlock("eve_cross_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.EVE_CROSS_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EVE_CROSS_SUMMER_TILE_WALL = registerBlock("eve_cross_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_RIDGE_SUMMER_TILE = registerBlock("eve_ridge_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_RIDGE_SUMMER_TILE_SLAB = registerBlock("eve_ridge_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EVE_RIDGE_SUMMER_TILE_STAIRS = registerBlock("eve_ridge_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.EVE_RIDGE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EVE_RIDGE_SUMMER_TILE_WALL = registerBlock("eve_ridge_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_LINED_SUMMER_TILE = registerBlock("eve_lined_summer_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> EVE_LINED_SUMMER_TILE_SLAB = registerBlock("eve_lined_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> EVE_LINED_SUMMER_TILE_STAIRS = registerBlock("eve_lined_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.EVE_LINED_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EVE_LINED_SUMMER_TILE_WALL = registerBlock("eve_lined_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //DAY SUMMER TILE
    public static final DeferredBlock<Block> DAY_SUMMER_TILE = registerBlock("day_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_SUMMER_TILE_SLAB = registerBlock("day_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DAY_SUMMER_TILE_STAIRS = registerBlock("day_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.DAY_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DAY_SUMMER_TILE_WALL = registerBlock("day_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_SPROUT_SUMMER_TILE = registerBlock("day_sprout_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_SPROUT_SUMMER_TILE_SLAB = registerBlock("day_sprout_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DAY_SPROUT_SUMMER_TILE_STAIRS = registerBlock("day_sprout_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.DAY_SPROUT_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DAY_SPROUT_SUMMER_TILE_WALL = registerBlock("day_sprout_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_BLOOM_SUMMER_TILE = registerBlock("day_bloom_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_BLOOM_SUMMER_TILE_SLAB = registerBlock("day_bloom_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DAY_BLOOM_SUMMER_TILE_STAIRS = registerBlock("day_bloom_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.DAY_BLOOM_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DAY_BLOOM_SUMMER_TILE_WALL = registerBlock("day_bloom_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_FLOWER_SUMMER_TILE = registerBlock("day_flower_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_FLOWER_SUMMER_TILE_SLAB = registerBlock("day_flower_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DAY_FLOWER_SUMMER_TILE_STAIRS = registerBlock("day_flower_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.DAY_FLOWER_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DAY_FLOWER_SUMMER_TILE_WALL = registerBlock("day_flower_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_CROSS_SUMMER_TILE = registerBlock("day_cross_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_CROSS_SUMMER_TILE_SLAB = registerBlock("day_cross_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DAY_CROSS_SUMMER_TILE_STAIRS = registerBlock("day_cross_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.DAY_CROSS_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DAY_CROSS_SUMMER_TILE_WALL = registerBlock("day_cross_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_RIDGE_SUMMER_TILE = registerBlock("day_ridge_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_RIDGE_SUMMER_TILE_SLAB = registerBlock("day_ridge_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DAY_RIDGE_SUMMER_TILE_STAIRS = registerBlock("day_ridge_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.DAY_RIDGE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DAY_RIDGE_SUMMER_TILE_WALL = registerBlock("day_ridge_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_LINED_SUMMER_TILE = registerBlock("day_lined_summer_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DAY_LINED_SUMMER_TILE_SLAB = registerBlock("day_lined_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DAY_LINED_SUMMER_TILE_STAIRS = registerBlock("day_lined_summer_tile_stairs",
            () -> new StairBlock(ModBlocks.DAY_LINED_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DAY_LINED_SUMMER_TILE_WALL = registerBlock("day_lined_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT PRETTI TILE
    public static final DeferredBlock<Block> LIGHT_PRETTI_TILE = registerBlock("light_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_PRETTI_TILE_SLAB = registerBlock("light_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LIGHT_PRETTI_TILE_STAIRS = registerBlock("light_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_PRETTI_TILE_WALL = registerBlock("light_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_ROSY_PRETTI_TILE = registerBlock("light_rosy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_ROSY_PRETTI_TILE_SLAB = registerBlock("light_rosy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LIGHT_ROSY_PRETTI_TILE_STAIRS = registerBlock("light_rosy_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_ROSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_ROSY_PRETTI_TILE_WALL = registerBlock("light_rosy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_POSY_PRETTI_TILE = registerBlock("light_posy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_POSY_PRETTI_TILE_SLAB = registerBlock("light_posy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LIGHT_POSY_PRETTI_TILE_STAIRS = registerBlock("light_posy_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_POSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_POSY_PRETTI_TILE_WALL = registerBlock("light_posy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_RING_PRETTI_TILE = registerBlock("light_ring_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_RING_PRETTI_TILE_SLAB = registerBlock("light_ring_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LIGHT_RING_PRETTI_TILE_STAIRS = registerBlock("light_ring_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_RING_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_RING_PRETTI_TILE_WALL = registerBlock("light_ring_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_SQUARED_PRETTI_TILE = registerBlock("light_squared_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_SQUARED_PRETTI_TILE_SLAB = registerBlock("light_squared_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LIGHT_SQUARED_PRETTI_TILE_STAIRS = registerBlock("light_squared_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_SQUARED_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_SQUARED_PRETTI_TILE_WALL = registerBlock("light_squared_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_FULL_PRETTI_TILE = registerBlock("light_full_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LIGHT_FULL_PRETTI_TILE_SLAB = registerBlock("light_full_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LIGHT_FULL_PRETTI_TILE_STAIRS = registerBlock("light_full_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_FULL_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_FULL_PRETTI_TILE_WALL = registerBlock("light_full_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_PRETTI_TILE = registerBlock("dark_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_PRETTI_TILE_SLAB = registerBlock("dark_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DARK_PRETTI_TILE_STAIRS = registerBlock("dark_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.DARK_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //DARK PRETTI TILE
    public static final DeferredBlock<Block> DARK_PRETTI_TILE_WALL = registerBlock("dark_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_ROSY_PRETTI_TILE = registerBlock("dark_rosy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_ROSY_PRETTI_TILE_SLAB = registerBlock("dark_rosy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DARK_ROSY_PRETTI_TILE_STAIRS = registerBlock("dark_rosy_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.DARK_ROSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DARK_ROSY_PRETTI_TILE_WALL = registerBlock("dark_rosy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_POSY_PRETTI_TILE = registerBlock("dark_posy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_POSY_PRETTI_TILE_SLAB = registerBlock("dark_posy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DARK_POSY_PRETTI_TILE_STAIRS = registerBlock("dark_posy_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.DARK_POSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DARK_POSY_PRETTI_TILE_WALL = registerBlock("dark_posy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_RING_PRETTI_TILE = registerBlock("dark_ring_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_RING_PRETTI_TILE_SLAB = registerBlock("dark_ring_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DARK_RING_PRETTI_TILE_STAIRS = registerBlock("dark_ring_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.DARK_RING_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DARK_RING_PRETTI_TILE_WALL = registerBlock("dark_ring_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_SQUARED_PRETTI_TILE = registerBlock("dark_squared_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_SQUARED_PRETTI_TILE_SLAB = registerBlock("dark_squared_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DARK_SQUARED_PRETTI_TILE_STAIRS = registerBlock("dark_squared_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.DARK_SQUARED_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DARK_SQUARED_PRETTI_TILE_WALL = registerBlock("dark_squared_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_FULL_PRETTI_TILE = registerBlock("dark_full_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> DARK_FULL_PRETTI_TILE_SLAB = registerBlock("dark_full_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> DARK_FULL_PRETTI_TILE_STAIRS = registerBlock("dark_full_pretti_tile_stairs",
            () -> new StairBlock(ModBlocks.DARK_FULL_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DARK_FULL_PRETTI_TILE_WALL = registerBlock("dark_full_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //CRISP TILE
    public static final DeferredBlock<Block> CRISP_APPLE_TILE = registerBlock("crisp_apple_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_APPLE_TILE_SLAB = registerBlock("crisp_apple_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_APPLE_TILE_STAIRS = registerBlock("crisp_apple_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_APPLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_APPLE_TILE_WALL = registerBlock("crisp_apple_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_APPLE_TILE = registerBlock("crisp_ripe_apple_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_APPLE_TILE_SLAB = registerBlock("crisp_ripe_apple_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_APPLE_TILE_STAIRS = registerBlock("crisp_ripe_apple_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_APPLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_RIPE_APPLE_TILE_WALL = registerBlock("crisp_ripe_apple_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_ORANGE_TILE = registerBlock("crisp_orange_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_ORANGE_TILE_SLAB = registerBlock("crisp_orange_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_ORANGE_TILE_STAIRS = registerBlock("crisp_orange_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_ORANGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_ORANGE_TILE_WALL = registerBlock("crisp_orange_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_ORANGE_TILE = registerBlock("crisp_ripe_orange_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_ORANGE_TILE_SLAB = registerBlock("crisp_ripe_orange_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_ORANGE_TILE_STAIRS = registerBlock("crisp_ripe_orange_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_ORANGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_RIPE_ORANGE_TILE_WALL = registerBlock("crisp_ripe_orange_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_LEMON_TILE = registerBlock("crisp_lemon_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_LEMON_TILE_SLAB = registerBlock("crisp_lemon_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_LEMON_TILE_STAIRS = registerBlock("crisp_lemon_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_LEMON_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_LEMON_TILE_WALL = registerBlock("crisp_lemon_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_LEMON_TILE = registerBlock("crisp_ripe_lemon_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_LEMON_TILE_SLAB = registerBlock("crisp_ripe_lemon_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_LEMON_TILE_STAIRS = registerBlock("crisp_ripe_lemon_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_LEMON_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_RIPE_LEMON_TILE_WALL = registerBlock("crisp_ripe_lemon_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_LIME_TILE = registerBlock("crisp_lime_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_LIME_TILE_SLAB = registerBlock("crisp_lime_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_LIME_TILE_STAIRS = registerBlock("crisp_lime_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_LIME_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_LIME_TILE_WALL = registerBlock("crisp_lime_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_LIME_TILE = registerBlock("crisp_ripe_lime_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_LIME_TILE_SLAB = registerBlock("crisp_ripe_lime_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_LIME_TILE_STAIRS = registerBlock("crisp_ripe_lime_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_LIME_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_RIPE_LIME_TILE_WALL = registerBlock("crisp_ripe_lime_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_BLUEBERRY_TILE = registerBlock("crisp_blueberry_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_BLUEBERRY_TILE_SLAB = registerBlock("crisp_blueberry_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_BLUEBERRY_TILE_STAIRS = registerBlock("crisp_blueberry_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_BLUEBERRY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_BLUEBERRY_TILE_WALL = registerBlock("crisp_blueberry_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_BLUEBERRY_TILE = registerBlock("crisp_ripe_blueberry_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_BLUEBERRY_TILE_SLAB = registerBlock("crisp_ripe_blueberry_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_BLUEBERRY_TILE_STAIRS = registerBlock("crisp_ripe_blueberry_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_RIPE_BLUEBERRY_TILE_WALL = registerBlock("crisp_ripe_blueberry_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_GRAPE_TILE = registerBlock("crisp_grape_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_GRAPE_TILE_SLAB = registerBlock("crisp_grape_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_GRAPE_TILE_STAIRS = registerBlock("crisp_grape_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_GRAPE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_GRAPE_TILE_WALL = registerBlock("crisp_grape_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_GRAPE_TILE = registerBlock("crisp_ripe_grape_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_GRAPE_TILE_SLAB = registerBlock("crisp_ripe_grape_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_GRAPE_TILE_STAIRS = registerBlock("crisp_ripe_grape_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_GRAPE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_RIPE_GRAPE_TILE_WALL = registerBlock("crisp_ripe_grape_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_PEACH_TILE = registerBlock("crisp_peach_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_PEACH_TILE_SLAB = registerBlock("crisp_peach_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_PEACH_TILE_STAIRS = registerBlock("crisp_peach_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_PEACH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_PEACH_TILE_WALL = registerBlock("crisp_peach_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_PEACH_TILE = registerBlock("crisp_ripe_peach_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_PEACH_TILE_SLAB = registerBlock("crisp_ripe_peach_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_PEACH_TILE_STAIRS = registerBlock("crisp_ripe_peach_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_PEACH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_RIPE_PEACH_TILE_WALL = registerBlock("crisp_ripe_peach_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_COCONUT_TILE = registerBlock("crisp_coconut_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_COCONUT_TILE_SLAB = registerBlock("crisp_coconut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_COCONUT_TILE_STAIRS = registerBlock("crisp_coconut_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_COCONUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_COCONUT_TILE_WALL = registerBlock("crisp_coconut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_COCONUT_TILE = registerBlock("crisp_ripe_coconut_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CRISP_RIPE_COCONUT_TILE_SLAB = registerBlock("crisp_ripe_coconut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_COCONUT_TILE_STAIRS = registerBlock("crisp_ripe_coconut_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_COCONUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRISP_RIPE_COCONUT_TILE_WALL = registerBlock("crisp_ripe_coconut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //GRID TILES
    public static final DeferredBlock<Block> GRID_RED_TILE = registerBlock("grid_red_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_RED_TILE_SLAB = registerBlock("grid_red_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_RED_TILE_STAIRS = registerBlock("grid_red_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_RED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_RED_TILE_WALL = registerBlock("grid_red_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_PURPLE_TILE = registerBlock("grid_purple_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_PURPLE_TILE_SLAB = registerBlock("grid_purple_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_PURPLE_TILE_STAIRS = registerBlock("grid_purple_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_PURPLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_PURPLE_TILE_WALL = registerBlock("grid_purple_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_TEAL_TILE = registerBlock("grid_teal_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_TEAL_TILE_SLAB = registerBlock("grid_teal_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_TEAL_TILE_STAIRS = registerBlock("grid_teal_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_TEAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_TEAL_TILE_WALL = registerBlock("grid_teal_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_POOL_TILE = registerBlock("grid_pool_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_POOL_TILE_SLAB = registerBlock("grid_pool_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_POOL_TILE_STAIRS = registerBlock("grid_pool_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_POOL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_POOL_TILE_WALL = registerBlock("grid_pool_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_SAGE_TILE = registerBlock("grid_sage_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_SAGE_TILE_SLAB = registerBlock("grid_sage_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_SAGE_TILE_STAIRS = registerBlock("grid_sage_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_SAGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_SAGE_TILE_WALL = registerBlock("grid_sage_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_MIXED_TILE = registerBlock("grid_mixed_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_MIXED_TILE_SLAB = registerBlock("grid_mixed_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_MIXED_TILE_STAIRS = registerBlock("grid_mixed_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_MIXED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_MIXED_TILE_WALL = registerBlock("grid_mixed_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_WHITE_TILE = registerBlock("grid_white_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_WHITE_TILE_SLAB = registerBlock("grid_white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_WHITE_TILE_STAIRS = registerBlock("grid_white_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_WHITE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_WHITE_TILE_WALL = registerBlock("grid_white_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_BLACK_TILE = registerBlock("grid_black_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_BLACK_TILE_SLAB = registerBlock("grid_black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_BLACK_TILE_STAIRS = registerBlock("grid_black_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_BLACK_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_BLACK_TILE_WALL = registerBlock("grid_black_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_SEWER_TILE = registerBlock("grid_sewer_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> GRID_SEWER_TILE_SLAB = registerBlock("grid_sewer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> GRID_SEWER_TILE_STAIRS = registerBlock("grid_sewer_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_SEWER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> GRID_SEWER_TILE_WALL = registerBlock("grid_sewer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //SPRING TILE
    public static final DeferredBlock<Block> PINK_SPRING_TILE = registerBlock("pink_spring_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_SPRING_TILE_SLAB = registerBlock("pink_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_SPRING_TILE_STAIRS = registerBlock("pink_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_SPRING_TILE_WALL = registerBlock("pink_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_VINE_SPRING_TILE = registerBlock("pink_vine_spring_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_VINE_SPRING_TILE_SLAB = registerBlock("pink_vine_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_VINE_SPRING_TILE_STAIRS = registerBlock("pink_vine_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_VINE_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_VINE_SPRING_TILE_WALL = registerBlock("pink_vine_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> PINK_SPROUT_SPRING_TILE = registerBlock("pink_sprout_spring_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final DeferredBlock<Block> PINK_SPROUT_SPRING_TILE_SLAB = registerBlock("pink_sprout_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_SPROUT_SPRING_TILE_STAIRS = registerBlock("pink_sprout_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_SPROUT_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_SPROUT_SPRING_TILE_WALL = registerBlock("pink_sprout_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_BLOOM_SPRING_TILE = registerBlock("pink_bloom_spring_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_BLOOM_SPRING_TILE_SLAB = registerBlock("pink_bloom_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_BLOOM_SPRING_TILE_STAIRS = registerBlock("pink_bloom_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_BLOOM_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_BLOOM_SPRING_TILE_WALL = registerBlock("pink_bloom_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_CORNER_SPRING_TILE = registerBlock("pink_corner_spring_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_CORNER_SPRING_TILE_SLAB = registerBlock("pink_corner_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_CORNER_SPRING_TILE_STAIRS = registerBlock("pink_corner_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_CORNER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_CORNER_SPRING_TILE_WALL = registerBlock("pink_corner_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_FLOWER_SPRING_TILE = registerBlock("pink_flower_spring_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_FLOWER_SPRING_TILE_SLAB = registerBlock("pink_flower_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_FLOWER_SPRING_TILE_STAIRS = registerBlock("pink_flower_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_FLOWER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PINK_FLOWER_SPRING_TILE_WALL = registerBlock("pink_flower_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
