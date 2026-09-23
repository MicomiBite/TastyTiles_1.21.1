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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DARK_FULL_PRETTI_TILE_WALL = registerBlock("dark_full_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //CRISP TILE
    public static final DeferredBlock<Block> CRISP_APPLE_TILE = registerBlock("crisp_apple_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_APPLE_TILE_SLAB = registerBlock("crisp_apple_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_APPLE_TILE_STAIRS = registerBlock("crisp_apple_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_APPLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_APPLE_TILE_WALL = registerBlock("crisp_apple_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_APPLE_TILE = registerBlock("crisp_ripe_apple_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_APPLE_TILE_SLAB = registerBlock("crisp_ripe_apple_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_APPLE_TILE_STAIRS = registerBlock("crisp_ripe_apple_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_APPLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_APPLE_TILE_WALL = registerBlock("crisp_ripe_apple_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_ORANGE_TILE = registerBlock("crisp_orange_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_ORANGE_TILE_SLAB = registerBlock("crisp_orange_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_ORANGE_TILE_STAIRS = registerBlock("crisp_orange_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_ORANGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_ORANGE_TILE_WALL = registerBlock("crisp_orange_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_ORANGE_TILE = registerBlock("crisp_ripe_orange_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_ORANGE_TILE_SLAB = registerBlock("crisp_ripe_orange_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_ORANGE_TILE_STAIRS = registerBlock("crisp_ripe_orange_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_ORANGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_ORANGE_TILE_WALL = registerBlock("crisp_ripe_orange_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_LEMON_TILE = registerBlock("crisp_lemon_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_LEMON_TILE_SLAB = registerBlock("crisp_lemon_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_LEMON_TILE_STAIRS = registerBlock("crisp_lemon_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_LEMON_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_LEMON_TILE_WALL = registerBlock("crisp_lemon_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_LEMON_TILE = registerBlock("crisp_ripe_lemon_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_LEMON_TILE_SLAB = registerBlock("crisp_ripe_lemon_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_LEMON_TILE_STAIRS = registerBlock("crisp_ripe_lemon_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_LEMON_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_LEMON_TILE_WALL = registerBlock("crisp_ripe_lemon_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_LIME_TILE = registerBlock("crisp_lime_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_LIME_TILE_SLAB = registerBlock("crisp_lime_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_LIME_TILE_STAIRS = registerBlock("crisp_lime_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_LIME_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_LIME_TILE_WALL = registerBlock("crisp_lime_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_LIME_TILE = registerBlock("crisp_ripe_lime_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_LIME_TILE_SLAB = registerBlock("crisp_ripe_lime_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_LIME_TILE_STAIRS = registerBlock("crisp_ripe_lime_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_LIME_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_LIME_TILE_WALL = registerBlock("crisp_ripe_lime_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_BLUEBERRY_TILE = registerBlock("crisp_blueberry_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_BLUEBERRY_TILE_SLAB = registerBlock("crisp_blueberry_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_BLUEBERRY_TILE_STAIRS = registerBlock("crisp_blueberry_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_BLUEBERRY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_BLUEBERRY_TILE_WALL = registerBlock("crisp_blueberry_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_BLUEBERRY_TILE = registerBlock("crisp_ripe_blueberry_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_BLUEBERRY_TILE_SLAB = registerBlock("crisp_ripe_blueberry_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_BLUEBERRY_TILE_STAIRS = registerBlock("crisp_ripe_blueberry_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_BLUEBERRY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_BLUEBERRY_TILE_WALL = registerBlock("crisp_ripe_blueberry_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_GRAPE_TILE = registerBlock("crisp_grape_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_GRAPE_TILE_SLAB = registerBlock("crisp_grape_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_GRAPE_TILE_STAIRS = registerBlock("crisp_grape_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_GRAPE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_GRAPE_TILE_WALL = registerBlock("crisp_grape_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_GRAPE_TILE = registerBlock("crisp_ripe_grape_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_GRAPE_TILE_SLAB = registerBlock("crisp_ripe_grape_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_GRAPE_TILE_STAIRS = registerBlock("crisp_ripe_grape_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_GRAPE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_GRAPE_TILE_WALL = registerBlock("crisp_ripe_grape_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_PEACH_TILE = registerBlock("crisp_peach_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_PEACH_TILE_SLAB = registerBlock("crisp_peach_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_PEACH_TILE_STAIRS = registerBlock("crisp_peach_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_PEACH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_PEACH_TILE_WALL = registerBlock("crisp_peach_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_PEACH_TILE = registerBlock("crisp_ripe_peach_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_PEACH_TILE_SLAB = registerBlock("crisp_ripe_peach_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_PEACH_TILE_STAIRS = registerBlock("crisp_ripe_peach_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_PEACH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_PEACH_TILE_WALL = registerBlock("crisp_ripe_peach_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_COCONUT_TILE = registerBlock("crisp_coconut_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_COCONUT_TILE_SLAB = registerBlock("crisp_coconut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_COCONUT_TILE_STAIRS = registerBlock("crisp_coconut_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_COCONUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_COCONUT_TILE_WALL = registerBlock("crisp_coconut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_COCONUT_TILE = registerBlock("crisp_ripe_coconut_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_COCONUT_TILE_SLAB = registerBlock("crisp_ripe_coconut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> CRISP_RIPE_COCONUT_TILE_STAIRS = registerBlock("crisp_ripe_coconut_tile_stairs",
            () -> new StairBlock(ModBlocks.CRISP_RIPE_COCONUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> CRISP_RIPE_COCONUT_TILE_WALL = registerBlock("crisp_ripe_coconut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    //GRID TILES
    public static final DeferredBlock<Block> GRID_RED_TILE = registerBlock("grid_red_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_RED_TILE_SLAB = registerBlock("grid_red_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_RED_TILE_STAIRS = registerBlock("grid_red_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_RED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_RED_TILE_WALL = registerBlock("grid_red_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_PURPLE_TILE = registerBlock("grid_purple_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_PURPLE_TILE_SLAB = registerBlock("grid_purple_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_PURPLE_TILE_STAIRS = registerBlock("grid_purple_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_PURPLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_PURPLE_TILE_WALL = registerBlock("grid_purple_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_TEAL_TILE = registerBlock("grid_teal_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_TEAL_TILE_SLAB = registerBlock("grid_teal_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_TEAL_TILE_STAIRS = registerBlock("grid_teal_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_TEAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_TEAL_TILE_WALL = registerBlock("grid_teal_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_POOL_TILE = registerBlock("grid_pool_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_POOL_TILE_SLAB = registerBlock("grid_pool_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_POOL_TILE_STAIRS = registerBlock("grid_pool_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_POOL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_POOL_TILE_WALL = registerBlock("grid_pool_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_SAGE_TILE = registerBlock("grid_sage_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_SAGE_TILE_SLAB = registerBlock("grid_sage_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_SAGE_TILE_STAIRS = registerBlock("grid_sage_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_SAGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_SAGE_TILE_WALL = registerBlock("grid_sage_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_MIXED_TILE = registerBlock("grid_mixed_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_MIXED_TILE_SLAB = registerBlock("grid_mixed_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_MIXED_TILE_STAIRS = registerBlock("grid_mixed_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_MIXED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_MIXED_TILE_WALL = registerBlock("grid_mixed_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_WHITE_TILE = registerBlock("grid_white_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_WHITE_TILE_SLAB = registerBlock("grid_white_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_WHITE_TILE_STAIRS = registerBlock("grid_white_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_WHITE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_WHITE_TILE_WALL = registerBlock("grid_white_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_BLACK_TILE = registerBlock("grid_black_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_BLACK_TILE_SLAB = registerBlock("grid_black_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_BLACK_TILE_STAIRS = registerBlock("grid_black_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_BLACK_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_BLACK_TILE_WALL = registerBlock("grid_black_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_SEWER_TILE = registerBlock("grid_sewer_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_SEWER_TILE_SLAB = registerBlock("grid_sewer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<StairBlock> GRID_SEWER_TILE_STAIRS = registerBlock("grid_sewer_tile_stairs",
            () -> new StairBlock(ModBlocks.GRID_SEWER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> GRID_SEWER_TILE_WALL = registerBlock("grid_sewer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    //SPRING TILE
    public static final DeferredBlock<Block> PINK_SPRING_TILE = registerBlock("pink_spring_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_SPRING_TILE_SLAB = registerBlock("pink_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_SPRING_TILE_STAIRS = registerBlock("pink_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_SPROUT_SPRING_TILE_WALL = registerBlock("pink_sprout_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> PINK_BLOOM_SPRING_TILE = registerBlock("pink_bloom_spring_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_BLOOM_SPRING_TILE_SLAB = registerBlock("pink_bloom_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_BLOOM_SPRING_TILE_STAIRS = registerBlock("pink_bloom_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_BLOOM_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

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
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_CORNER_SPRING_TILE_WALL = registerBlock("pink_corner_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> PINK_FLOWER_SPRING_TILE = registerBlock("pink_flower_spring_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_FLOWER_SPRING_TILE_SLAB = registerBlock("pink_flower_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> PINK_FLOWER_SPRING_TILE_STAIRS = registerBlock("pink_flower_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.PINK_FLOWER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> PINK_FLOWER_SPRING_TILE_WALL = registerBlock("pink_flower_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_SPRING_TILE = registerBlock("yellow_spring_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_SPRING_TILE_SLAB = registerBlock("yellow_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> YELLOW_SPRING_TILE_STAIRS = registerBlock("yellow_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_SPRING_TILE_WALL = registerBlock("yellow_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_VINE_SPRING_TILE = registerBlock("yellow_vine_spring_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_VINE_SPRING_TILE_SLAB = registerBlock("yellow_vine_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> YELLOW_VINE_SPRING_TILE_STAIRS = registerBlock("yellow_vine_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_VINE_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_VINE_SPRING_TILE_WALL = registerBlock("yellow_vine_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> YELLOW_SPROUT_SPRING_TILE = registerBlock("yellow_sprout_spring_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final DeferredBlock<Block> YELLOW_SPROUT_SPRING_TILE_SLAB = registerBlock("yellow_sprout_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> YELLOW_SPROUT_SPRING_TILE_STAIRS = registerBlock("yellow_sprout_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_SPROUT_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_SPROUT_SPRING_TILE_WALL = registerBlock("yellow_sprout_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> YELLOW_BLOOM_SPRING_TILE = registerBlock("yellow_bloom_spring_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_BLOOM_SPRING_TILE_SLAB = registerBlock("yellow_bloom_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> YELLOW_BLOOM_SPRING_TILE_STAIRS = registerBlock("yellow_bloom_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_BLOOM_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_BLOOM_SPRING_TILE_WALL = registerBlock("yellow_bloom_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_CORNER_SPRING_TILE = registerBlock("yellow_corner_spring_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_CORNER_SPRING_TILE_SLAB = registerBlock("yellow_corner_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> YELLOW_CORNER_SPRING_TILE_STAIRS = registerBlock("yellow_corner_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_CORNER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_CORNER_SPRING_TILE_WALL = registerBlock("yellow_corner_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> YELLOW_FLOWER_SPRING_TILE = registerBlock("yellow_flower_spring_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_FLOWER_SPRING_TILE_SLAB = registerBlock("yellow_flower_spring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> YELLOW_FLOWER_SPRING_TILE_STAIRS = registerBlock("yellow_flower_spring_tile_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_FLOWER_SPRING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> YELLOW_FLOWER_SPRING_TILE_WALL = registerBlock("yellow_flower_spring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //CUT TILE
    public static final DeferredBlock<SixDirectionBlock> CHOCO_CUT_TILE = registerBlock("choco_cut_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_TILE_SLAB = registerBlock("choco_cut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CHOCO_CUT_TILE_STAIRS = registerBlock("choco_cut_tile_stairs",
            () -> new StairBlock(ModBlocks.CHOCO_CUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_TILE_WALL = registerBlock("choco_cut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> CHOCO_CUT_SPLIT_TILE = registerBlock("choco_cut_split_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_SPLIT_TILE_SLAB = registerBlock("choco_cut_split_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CHOCO_CUT_SPLIT_TILE_STAIRS = registerBlock("choco_cut_split_tile_stairs",
            () -> new StairBlock(ModBlocks.CHOCO_CUT_SPLIT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_SPLIT_TILE_WALL = registerBlock("choco_cut_split_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> CHOCO_CUT_DIAMOND_TILE = registerBlock("choco_cut_diamond_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final DeferredBlock<Block> CHOCO_CUT_DIAMOND_TILE_SLAB = registerBlock("choco_cut_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CHOCO_CUT_DIAMOND_TILE_STAIRS = registerBlock("choco_cut_diamond_tile_stairs",
            () -> new StairBlock(ModBlocks.CHOCO_CUT_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_DIAMOND_TILE_WALL = registerBlock("choco_cut_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> CHOCO_CUT_HEART_TILE = registerBlock("choco_cut_heart_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_HEART_TILE_SLAB = registerBlock("choco_cut_heart_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CHOCO_CUT_HEART_TILE_STAIRS = registerBlock("choco_cut_heart_tile_stairs",
            () -> new StairBlock(ModBlocks.CHOCO_CUT_HEART_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_HEART_TILE_WALL = registerBlock("choco_cut_heart_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> CHOCO_CUT_CIRCLE_TILE = registerBlock("choco_cut_circle_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_CIRCLE_TILE_SLAB = registerBlock("choco_cut_circle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CHOCO_CUT_CIRCLE_TILE_STAIRS = registerBlock("choco_cut_circle_tile_stairs",
            () -> new StairBlock(ModBlocks.CHOCO_CUT_CIRCLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_CIRCLE_TILE_WALL = registerBlock("choco_cut_circle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> CHOCO_CUT_TRIANGLE_TILE = registerBlock("choco_cut_triangle_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_TRIANGLE_TILE_SLAB = registerBlock("choco_cut_triangle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CHOCO_CUT_TRIANGLE_TILE_STAIRS = registerBlock("choco_cut_triangle_tile_stairs",
            () -> new StairBlock(ModBlocks.CHOCO_CUT_TRIANGLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_TRIANGLE_TILE_WALL = registerBlock("choco_cut_triangle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> CHOCO_CUT_SQUARE_TILE = registerBlock("choco_cut_square_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_SQUARE_TILE_SLAB = registerBlock("choco_cut_square_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> CHOCO_CUT_SQUARE_TILE_STAIRS = registerBlock("choco_cut_square_tile_stairs",
            () -> new StairBlock(ModBlocks.CHOCO_CUT_SQUARE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> CHOCO_CUT_SQUARE_TILE_WALL = registerBlock("choco_cut_square_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> VERDANT_CUT_TILE = registerBlock("verdant_cut_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_TILE_SLAB = registerBlock("verdant_cut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> VERDANT_CUT_TILE_STAIRS = registerBlock("verdant_cut_tile_stairs",
            () -> new StairBlock(ModBlocks.VERDANT_CUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> VERDANT_CUT_TILE_WALL = registerBlock("verdant_cut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> VERDANT_CUT_SPLIT_TILE = registerBlock("verdant_cut_split_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_SPLIT_TILE_SLAB = registerBlock("verdant_cut_split_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> VERDANT_CUT_SPLIT_TILE_STAIRS = registerBlock("verdant_cut_split_tile_stairs",
            () -> new StairBlock(ModBlocks.VERDANT_CUT_SPLIT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_SPLIT_TILE_WALL = registerBlock("verdant_cut_split_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> VERDANT_CUT_DIAMOND_TILE = registerBlock("verdant_cut_diamond_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final DeferredBlock<Block> VERDANT_CUT_DIAMOND_TILE_SLAB = registerBlock("verdant_cut_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> VERDANT_CUT_DIAMOND_TILE_STAIRS = registerBlock("verdant_cut_diamond_tile_stairs",
            () -> new StairBlock(ModBlocks.VERDANT_CUT_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_DIAMOND_TILE_WALL = registerBlock("verdant_cut_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> VERDANT_CUT_HEART_TILE = registerBlock("verdant_cut_heart_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_HEART_TILE_SLAB = registerBlock("verdant_cut_heart_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> VERDANT_CUT_HEART_TILE_STAIRS = registerBlock("verdant_cut_heart_tile_stairs",
            () -> new StairBlock(ModBlocks.VERDANT_CUT_HEART_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_HEART_TILE_WALL = registerBlock("verdant_cut_heart_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> VERDANT_CUT_CIRCLE_TILE = registerBlock("verdant_cut_circle_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_CIRCLE_TILE_SLAB = registerBlock("verdant_cut_circle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> VERDANT_CUT_CIRCLE_TILE_STAIRS = registerBlock("verdant_cut_circle_tile_stairs",
            () -> new StairBlock(ModBlocks.VERDANT_CUT_CIRCLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_CIRCLE_TILE_WALL = registerBlock("verdant_cut_circle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> VERDANT_CUT_TRIANGLE_TILE = registerBlock("verdant_cut_triangle_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_TRIANGLE_TILE_SLAB = registerBlock("verdant_cut_triangle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> VERDANT_CUT_TRIANGLE_TILE_STAIRS = registerBlock("verdant_cut_triangle_tile_stairs",
            () -> new StairBlock(ModBlocks.VERDANT_CUT_TRIANGLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_TRIANGLE_TILE_WALL = registerBlock("verdant_cut_triangle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> VERDANT_CUT_SQUARE_TILE = registerBlock("verdant_cut_square_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_SQUARE_TILE_SLAB = registerBlock("verdant_cut_square_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> VERDANT_CUT_SQUARE_TILE_STAIRS = registerBlock("verdant_cut_square_tile_stairs",
            () -> new StairBlock(ModBlocks.VERDANT_CUT_SQUARE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VERDANT_CUT_SQUARE_TILE_WALL = registerBlock("verdant_cut_square_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> JET_CUT_TILE = registerBlock("jet_cut_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_TILE_SLAB = registerBlock("jet_cut_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> JET_CUT_TILE_STAIRS = registerBlock("jet_cut_tile_stairs",
            () -> new StairBlock(ModBlocks.JET_CUT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_TILE_WALL = registerBlock("jet_cut_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> JET_CUT_SPLIT_TILE = registerBlock("jet_cut_split_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_SPLIT_TILE_SLAB = registerBlock("jet_cut_split_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> JET_CUT_SPLIT_TILE_STAIRS = registerBlock("jet_cut_split_tile_stairs",
            () -> new StairBlock(ModBlocks.JET_CUT_SPLIT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_SPLIT_TILE_WALL = registerBlock("jet_cut_split_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> JET_CUT_DIAMOND_TILE = registerBlock("jet_cut_diamond_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final DeferredBlock<Block> JET_CUT_DIAMOND_TILE_SLAB = registerBlock("jet_cut_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> JET_CUT_DIAMOND_TILE_STAIRS = registerBlock("jet_cut_diamond_tile_stairs",
            () -> new StairBlock(ModBlocks.JET_CUT_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_DIAMOND_TILE_WALL = registerBlock("jet_cut_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> JET_CUT_HEART_TILE = registerBlock("jet_cut_heart_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_HEART_TILE_SLAB = registerBlock("jet_cut_heart_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> JET_CUT_HEART_TILE_STAIRS = registerBlock("jet_cut_heart_tile_stairs",
            () -> new StairBlock(ModBlocks.JET_CUT_HEART_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_HEART_TILE_WALL = registerBlock("jet_cut_heart_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> JET_CUT_CIRCLE_TILE = registerBlock("jet_cut_circle_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_CIRCLE_TILE_SLAB = registerBlock("jet_cut_circle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> JET_CUT_CIRCLE_TILE_STAIRS = registerBlock("jet_cut_circle_tile_stairs",
            () -> new StairBlock(ModBlocks.JET_CUT_CIRCLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_CIRCLE_TILE_WALL = registerBlock("jet_cut_circle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> JET_CUT_TRIANGLE_TILE = registerBlock("jet_cut_triangle_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_TRIANGLE_TILE_SLAB = registerBlock("jet_cut_triangle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> JET_CUT_TRIANGLE_TILE_STAIRS = registerBlock("jet_cut_triangle_tile_stairs",
            () -> new StairBlock(ModBlocks.JET_CUT_TRIANGLE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_TRIANGLE_TILE_WALL = registerBlock("jet_cut_triangle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> JET_CUT_SQUARE_TILE = registerBlock("jet_cut_square_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_SQUARE_TILE_SLAB = registerBlock("jet_cut_square_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> JET_CUT_SQUARE_TILE_STAIRS = registerBlock("jet_cut_square_tile_stairs",
            () -> new StairBlock(ModBlocks.JET_CUT_SQUARE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> JET_CUT_SQUARE_TILE_WALL = registerBlock("jet_cut_square_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //AZULEJO TILE
    public static final DeferredBlock<Block> WHITE_AZULEJO_TILE = registerBlock("white_azulejo_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_TILE_SLAB = registerBlock("white_azulejo_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_TILE_STAIRS = registerBlock("white_azulejo_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_TILE_WALL = registerBlock("white_azulejo_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_FLORAL_TILE = registerBlock("white_azulejo_floral_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_FLORAL_TILE_SLAB = registerBlock("white_azulejo_floral_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_FLORAL_TILE_STAIRS = registerBlock("white_azulejo_floral_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_FLORAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_FLORAL_TILE_WALL = registerBlock("white_azulejo_floral_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_REFINED_TILE = registerBlock("white_azulejo_refined_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_REFINED_TILE_SLAB = registerBlock("white_azulejo_refined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_REFINED_TILE_STAIRS = registerBlock("white_azulejo_refined_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_REFINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_REFINED_TILE_WALL = registerBlock("white_azulejo_refined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_SQUARED_TILE = registerBlock("white_azulejo_squared_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_SQUARED_TILE_SLAB = registerBlock("white_azulejo_squared_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_SQUARED_TILE_STAIRS = registerBlock("white_azulejo_squared_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_SQUARED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_SQUARED_TILE_WALL = registerBlock("white_azulejo_squared_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_FISHY_TILE = registerBlock("white_azulejo_fishy_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_FISHY_TILE_SLAB = registerBlock("white_azulejo_fishy_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_FISHY_TILE_STAIRS = registerBlock("white_azulejo_fishy_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_FISHY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_FISHY_TILE_WALL = registerBlock("white_azulejo_fishy_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_SHELL_TILE = registerBlock("white_azulejo_shell_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_SHELL_TILE_SLAB = registerBlock("white_azulejo_shell_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_SHELL_TILE_STAIRS = registerBlock("white_azulejo_shell_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_SHELL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_SHELL_TILE_WALL = registerBlock("white_azulejo_shell_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_CROSS_TILE = registerBlock("white_azulejo_cross_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_CROSS_TILE_SLAB = registerBlock("white_azulejo_cross_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_CROSS_TILE_STAIRS = registerBlock("white_azulejo_cross_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_CROSS_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_CROSS_TILE_WALL = registerBlock("white_azulejo_cross_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_DIAMOND_TILE = registerBlock("white_azulejo_diamond_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_DIAMOND_TILE_SLAB = registerBlock("white_azulejo_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_DIAMOND_TILE_STAIRS = registerBlock("white_azulejo_diamond_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_DIAMOND_TILE_WALL = registerBlock("white_azulejo_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_LINED_TILE = registerBlock("white_azulejo_lined_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_LINED_TILE_SLAB = registerBlock("white_azulejo_lined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WHITE_AZULEJO_LINED_TILE_STAIRS = registerBlock("white_azulejo_lined_tile_stairs",
            () -> new StairBlock(ModBlocks.WHITE_AZULEJO_LINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WHITE_AZULEJO_LINED_TILE_WALL = registerBlock("white_azulejo_lined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_TILE = registerBlock("blue_azulejo_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_TILE_SLAB = registerBlock("blue_azulejo_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_TILE_STAIRS = registerBlock("blue_azulejo_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_TILE_WALL = registerBlock("blue_azulejo_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_FLORAL_TILE = registerBlock("blue_azulejo_floral_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_FLORAL_TILE_SLAB = registerBlock("blue_azulejo_floral_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_FLORAL_TILE_STAIRS = registerBlock("blue_azulejo_floral_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_FLORAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_FLORAL_TILE_WALL = registerBlock("blue_azulejo_floral_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_REFINED_TILE = registerBlock("blue_azulejo_refined_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_REFINED_TILE_SLAB = registerBlock("blue_azulejo_refined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_REFINED_TILE_STAIRS = registerBlock("blue_azulejo_refined_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_REFINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_REFINED_TILE_WALL = registerBlock("blue_azulejo_refined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_SQUARED_TILE = registerBlock("blue_azulejo_squared_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_SQUARED_TILE_SLAB = registerBlock("blue_azulejo_squared_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_SQUARED_TILE_STAIRS = registerBlock("blue_azulejo_squared_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_SQUARED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_SQUARED_TILE_WALL = registerBlock("blue_azulejo_squared_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_FISHY_TILE = registerBlock("blue_azulejo_fishy_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_FISHY_TILE_SLAB = registerBlock("blue_azulejo_fishy_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_FISHY_TILE_STAIRS = registerBlock("blue_azulejo_fishy_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_FISHY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_FISHY_TILE_WALL = registerBlock("blue_azulejo_fishy_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_SHELL_TILE = registerBlock("blue_azulejo_shell_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_SHELL_TILE_SLAB = registerBlock("blue_azulejo_shell_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_SHELL_TILE_STAIRS = registerBlock("blue_azulejo_shell_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_SHELL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_SHELL_TILE_WALL = registerBlock("blue_azulejo_shell_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_CROSS_TILE = registerBlock("blue_azulejo_cross_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_CROSS_TILE_SLAB = registerBlock("blue_azulejo_cross_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_CROSS_TILE_STAIRS = registerBlock("blue_azulejo_cross_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_CROSS_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_CROSS_TILE_WALL = registerBlock("blue_azulejo_cross_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_DIAMOND_TILE = registerBlock("blue_azulejo_diamond_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_DIAMOND_TILE_SLAB = registerBlock("blue_azulejo_diamond_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_DIAMOND_TILE_STAIRS = registerBlock("blue_azulejo_diamond_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_DIAMOND_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_DIAMOND_TILE_WALL = registerBlock("blue_azulejo_diamond_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_LINED_TILE = registerBlock("blue_azulejo_lined_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_LINED_TILE_SLAB = registerBlock("blue_azulejo_lined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> BLUE_AZULEJO_LINED_TILE_STAIRS = registerBlock("blue_azulejo_lined_tile_stairs",
            () -> new StairBlock(ModBlocks.BLUE_AZULEJO_LINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> BLUE_AZULEJO_LINED_TILE_WALL = registerBlock("blue_azulejo_lined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //SANDY TILE
    public static final DeferredBlock<SixDirectionBlock> SANDY_TILE = registerBlock("sandy_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_TILE_SLAB = registerBlock("sandy_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> SANDY_TILE_STAIRS = registerBlock("sandy_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDY_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_TILE_WALL = registerBlock("sandy_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> SANDY_MOROCCAN_TILE = registerBlock("sandy_moroccan_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_MOROCCAN_TILE_SLAB = registerBlock("sandy_moroccan_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> SANDY_MOROCCAN_TILE_STAIRS = registerBlock("sandy_moroccan_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDY_MOROCCAN_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_MOROCCAN_TILE_WALL = registerBlock("sandy_moroccan_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> SANDY_SQUARED_TILE = registerBlock("sandy_squared_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final DeferredBlock<Block> SANDY_SQUARED_TILE_SLAB = registerBlock("sandy_squared_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> SANDY_SQUARED_TILE_STAIRS = registerBlock("sandy_squared_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDY_SQUARED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_SQUARED_TILE_WALL = registerBlock("sandy_squared_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> SANDY_RING_TILE = registerBlock("sandy_ring_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_RING_TILE_SLAB = registerBlock("sandy_ring_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> SANDY_RING_TILE_STAIRS = registerBlock("sandy_ring_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDY_RING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_RING_TILE_WALL = registerBlock("sandy_ring_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_LINED_TILE = registerBlock("sandy_lined_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_LINED_TILE_SLAB = registerBlock("sandy_lined_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> SANDY_LINED_TILE_STAIRS = registerBlock("sandy_lined_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDY_LINED_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_LINED_TILE_WALL = registerBlock("sandy_lined_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_STRIKE_TILE = registerBlock("sandy_strike_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_STRIKE_TILE_SLAB = registerBlock("sandy_strike_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> SANDY_STRIKE_TILE_STAIRS = registerBlock("sandy_strike_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDY_STRIKE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_STRIKE_TILE_WALL = registerBlock("sandy_strike_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> SANDY_WAVE_TILE = registerBlock("sandy_wave_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_WAVE_TILE_SLAB = registerBlock("sandy_wave_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> SANDY_WAVE_TILE_STAIRS = registerBlock("sandy_wave_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDY_WAVE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_WAVE_TILE_WALL = registerBlock("sandy_wave_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<SixDirectionBlock> SANDY_SHELL_TILE = registerBlock("sandy_shell_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_SHELL_TILE_SLAB = registerBlock("sandy_shell_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> SANDY_SHELL_TILE_STAIRS = registerBlock("sandy_shell_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDY_SHELL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> SANDY_SHELL_TILE_WALL = registerBlock("sandy_shell_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_TILE = registerBlock("warm_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_TILE_SLAB = registerBlock("warm_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_TILE_STAIRS = registerBlock("warm_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_TILE_WALL = registerBlock("warm_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_PATTERN_TILE = registerBlock("warm_pattern_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_PATTERN_TILE_SLAB = registerBlock("warm_pattern_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_PATTERN_TILE_STAIRS = registerBlock("warm_pattern_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_PATTERN_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_PATTERN_TILE_WALL = registerBlock("warm_pattern_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_KNIT_TILE = registerBlock("warm_knit_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_KNIT_TILE_SLAB = registerBlock("warm_knit_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_KNIT_TILE_STAIRS = registerBlock("warm_knit_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_KNIT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_KNIT_TILE_WALL = registerBlock("warm_knit_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CROSS_TILE = registerBlock("warm_cross_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CROSS_TILE_SLAB = registerBlock("warm_cross_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_CROSS_TILE_STAIRS = registerBlock("warm_cross_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_CROSS_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CROSS_TILE_WALL = registerBlock("warm_cross_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CHECKER_TILE = registerBlock("warm_checker_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CHECKER_TILE_SLAB = registerBlock("warm_checker_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_CHECKER_TILE_STAIRS = registerBlock("warm_checker_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_CHECKER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CHECKER_TILE_WALL = registerBlock("warm_checker_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_STEP_TILE = registerBlock("warm_step_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_STEP_TILE_SLAB = registerBlock("warm_step_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_STEP_TILE_STAIRS = registerBlock("warm_step_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_STEP_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_STEP_TILE_WALL = registerBlock("warm_step_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CRISS_TILE = registerBlock("warm_criss_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CRISS_TILE_SLAB = registerBlock("warm_criss_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_CRISS_TILE_STAIRS = registerBlock("warm_criss_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_CRISS_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_CRISS_TILE_WALL = registerBlock("warm_criss_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_FLAKE_TILE = registerBlock("warm_flake_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_FLAKE_TILE_SLAB = registerBlock("warm_flake_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_FLAKE_TILE_STAIRS = registerBlock("warm_flake_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_FLAKE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_FLAKE_TILE_WALL = registerBlock("warm_flake_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_EDGE_TILE = registerBlock("warm_edge_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_EDGE_TILE_SLAB = registerBlock("warm_edge_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> WARM_EDGE_TILE_STAIRS = registerBlock("warm_edge_tile_stairs",
            () -> new StairBlock(ModBlocks.WARM_EDGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> WARM_EDGE_TILE_WALL = registerBlock("warm_edge_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_TILE = registerBlock("lavender_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_TILE_SLAB = registerBlock("lavender_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_TILE_STAIRS = registerBlock("lavender_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_TILE_WALL = registerBlock("lavender_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_PATTERN_TILE = registerBlock("lavender_pattern_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_PATTERN_TILE_SLAB = registerBlock("lavender_pattern_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_PATTERN_TILE_STAIRS = registerBlock("lavender_pattern_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_PATTERN_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_PATTERN_TILE_WALL = registerBlock("lavender_pattern_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_KNIT_TILE = registerBlock("lavender_knit_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_KNIT_TILE_SLAB = registerBlock("lavender_knit_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_KNIT_TILE_STAIRS = registerBlock("lavender_knit_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_KNIT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_KNIT_TILE_WALL = registerBlock("lavender_knit_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CROSS_TILE = registerBlock("lavender_cross_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CROSS_TILE_SLAB = registerBlock("lavender_cross_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_CROSS_TILE_STAIRS = registerBlock("lavender_cross_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_CROSS_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CROSS_TILE_WALL = registerBlock("lavender_cross_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CHECKER_TILE = registerBlock("lavender_checker_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CHECKER_TILE_SLAB = registerBlock("lavender_checker_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_CHECKER_TILE_STAIRS = registerBlock("lavender_checker_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_CHECKER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CHECKER_TILE_WALL = registerBlock("lavender_checker_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_STEP_TILE = registerBlock("lavender_step_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_STEP_TILE_SLAB = registerBlock("lavender_step_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_STEP_TILE_STAIRS = registerBlock("lavender_step_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_STEP_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_STEP_TILE_WALL = registerBlock("lavender_step_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CRISS_TILE = registerBlock("lavender_criss_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CRISS_TILE_SLAB = registerBlock("lavender_criss_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_CRISS_TILE_STAIRS = registerBlock("lavender_criss_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_CRISS_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_CRISS_TILE_WALL = registerBlock("lavender_criss_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_FLAKE_TILE = registerBlock("lavender_flake_tile",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_FLAKE_TILE_SLAB = registerBlock("lavender_flake_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_FLAKE_TILE_STAIRS = registerBlock("lavender_flake_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_FLAKE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_FLAKE_TILE_WALL = registerBlock("lavender_flake_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_EDGE_TILE = registerBlock("lavender_edge_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_EDGE_TILE_SLAB = registerBlock("lavender_edge_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<StairBlock> LAVENDER_EDGE_TILE_STAIRS = registerBlock("lavender_edge_tile_stairs",
            () -> new StairBlock(ModBlocks.LAVENDER_EDGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> LAVENDER_EDGE_TILE_WALL = registerBlock("lavender_edge_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    //ENDLELINE TILE
    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_TILE = registerBlock("endleline_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_TILE_SLAB = registerBlock("endleline_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_TILE_STAIRS = registerBlock("endleline_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_TILE_WALL = registerBlock("endleline_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_CENTRA_TILE = registerBlock("endleline_centra_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_CENTRA_TILE_SLAB = registerBlock("endleline_centra_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_CENTRA_TILE_STAIRS = registerBlock("endleline_centra_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_CENTRA_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_CENTRA_TILE_WALL = registerBlock("endleline_centra_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_FIGURE_TILE = registerBlock("endleline_figure_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.BONE_BLOCK)) {
            });

    public static final DeferredBlock<Block> ENDLELINE_FIGURE_TILE_SLAB = registerBlock("endleline_figure_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_FIGURE_TILE_STAIRS = registerBlock("endleline_figure_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_FIGURE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_FIGURE_TILE_WALL = registerBlock("endleline_figure_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_FLOWARD_TILE = registerBlock("endleline_floward_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_FLOWARD_TILE_SLAB = registerBlock("endleline_floward_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_FLOWARD_TILE_STAIRS = registerBlock("endleline_floward_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_FLOWARD_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_FLOWARD_TILE_WALL = registerBlock("endleline_floward_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_INWARD_TILE = registerBlock("endleline_inward_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_INWARD_TILE_SLAB = registerBlock("endleline_inward_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_INWARD_TILE_STAIRS = registerBlock("endleline_inward_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_INWARD_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_INWARD_TILE_WALL = registerBlock("endleline_inward_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_RECT_TILE = registerBlock("endleline_rect_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_RECT_TILE_SLAB = registerBlock("endleline_rect_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_RECT_TILE_STAIRS = registerBlock("endleline_rect_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_RECT_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_RECT_TILE_WALL = registerBlock("endleline_rect_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_SEEPING_TILE = registerBlock("endleline_seeping_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_SEEPING_TILE_SLAB = registerBlock("endleline_seeping_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_SEEPING_TILE_STAIRS = registerBlock("endleline_seeping_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_SEEPING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_SEEPING_TILE_WALL = registerBlock("endleline_seeping_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_SWIRL_TILE = registerBlock("endleline_swirl_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_SWIRL_TILE_SLAB = registerBlock("endleline_swirl_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_SWIRL_TILE_STAIRS = registerBlock("endleline_swirl_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_SWIRL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_SWIRL_TILE_WALL = registerBlock("endleline_swirl_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_TOWER_TILE = registerBlock("endleline_tower_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA).sound(SoundType.BONE_BLOCK)) {
            });

    public static final DeferredBlock<Block> ENDLELINE_TOWER_TILE_SLAB = registerBlock("endleline_tower_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_TOWER_TILE_STAIRS = registerBlock("endleline_tower_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_TOWER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_TOWER_TILE_WALL = registerBlock("endleline_tower_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_TURN_TILE = registerBlock("endleline_turn_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_TURN_TILE_SLAB = registerBlock("endleline_turn_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_TURN_TILE_STAIRS = registerBlock("endleline_turn_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_TURN_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_TURN_TILE_WALL = registerBlock("endleline_turn_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_ZING_TILE = registerBlock("endleline_zing_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_ZING_TILE_SLAB = registerBlock("endleline_zing_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_ZING_TILE_STAIRS = registerBlock("endleline_zing_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_ZING_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_ZING_TILE_WALL = registerBlock("endleline_zing_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<SixDirectionBlock> ENDLELINE_ZUNE_TILE = registerBlock("endleline_zune_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_ZUNE_TILE_SLAB = registerBlock("endleline_zune_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_SLAB)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<StairBlock> ENDLELINE_ZUNE_TILE_STAIRS = registerBlock("endleline_zune_tile_stairs",
            () -> new StairBlock(ModBlocks.ENDLELINE_ZUNE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_STAIRS).strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    public static final DeferredBlock<Block> ENDLELINE_ZUNE_TILE_WALL = registerBlock("endleline_zune_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK)));

    //GLIST TILE
    public static final DeferredBlock<SixDirectionBlock> GLIST_TILE = registerBlock("glist_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_TILE_SLAB = registerBlock("glist_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_TILE_STAIRS = registerBlock("glist_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_TILE_WALL = registerBlock("glist_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_FANCIFUL_TILE = registerBlock("glist_fanciful_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_FANCIFUL_TILE_SLAB = registerBlock("glist_fanciful_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_FANCIFUL_TILE_STAIRS = registerBlock("glist_fanciful_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_FANCIFUL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_FANCIFUL_TILE_WALL = registerBlock("glist_fanciful_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_FAN_TILE = registerBlock("glist_fan_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_FAN_TILE_SLAB = registerBlock("glist_fan_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_FAN_TILE_STAIRS = registerBlock("glist_fan_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_FAN_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_FAN_TILE_WALL = registerBlock("glist_fan_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_FLORAL_TILE = registerBlock("glist_floral_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_FLORAL_TILE_SLAB = registerBlock("glist_floral_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_FLORAL_TILE_STAIRS = registerBlock("glist_floral_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_FLORAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_FLORAL_TILE_WALL = registerBlock("glist_floral_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_STAR_TILE = registerBlock("glist_star_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_STAR_TILE_SLAB = registerBlock("glist_star_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_STAR_TILE_STAIRS = registerBlock("glist_star_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_STAR_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_STAR_TILE_WALL = registerBlock("glist_star_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_LINK_TILE = registerBlock("glist_link_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_LINK_TILE_SLAB = registerBlock("glist_link_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_LINK_TILE_STAIRS = registerBlock("glist_link_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_LINK_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_LINK_TILE_WALL = registerBlock("glist_link_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_SCRATCH_TILE = registerBlock("glist_scratch_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_SCRATCH_TILE_SLAB = registerBlock("glist_scratch_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_SCRATCH_TILE_STAIRS = registerBlock("glist_scratch_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_SCRATCH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_SCRATCH_TILE_WALL = registerBlock("glist_scratch_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_NEUTRAL_TILE = registerBlock("glist_neutral_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_TILE_SLAB = registerBlock("glist_neutral_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_NEUTRAL_TILE_STAIRS = registerBlock("glist_neutral_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_NEUTRAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_TILE_WALL = registerBlock("glist_neutral_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_NEUTRAL_FANCIFUL_TILE = registerBlock("glist_neutral_fanciful_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_FANCIFUL_TILE_SLAB = registerBlock("glist_neutral_fanciful_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_NEUTRAL_FANCIFUL_TILE_STAIRS = registerBlock("glist_neutral_fanciful_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_NEUTRAL_FANCIFUL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_FANCIFUL_TILE_WALL = registerBlock("glist_neutral_fanciful_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_NEUTRAL_FAN_TILE = registerBlock("glist_neutral_fan_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_FAN_TILE_SLAB = registerBlock("glist_neutral_fan_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_NEUTRAL_FAN_TILE_STAIRS = registerBlock("glist_neutral_fan_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_NEUTRAL_FAN_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_FAN_TILE_WALL = registerBlock("glist_neutral_fan_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_NEUTRAL_FLORAL_TILE = registerBlock("glist_neutral_floral_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_FLORAL_TILE_SLAB = registerBlock("glist_neutral_floral_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_NEUTRAL_FLORAL_TILE_STAIRS = registerBlock("glist_neutral_floral_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_NEUTRAL_FLORAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_FLORAL_TILE_WALL = registerBlock("glist_neutral_floral_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_NEUTRAL_STAR_TILE = registerBlock("glist_neutral_star_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_STAR_TILE_SLAB = registerBlock("glist_neutral_star_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_NEUTRAL_STAR_TILE_STAIRS = registerBlock("glist_neutral_star_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_NEUTRAL_STAR_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_STAR_TILE_WALL = registerBlock("glist_neutral_star_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_NEUTRAL_LINK_TILE = registerBlock("glist_neutral_link_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_LINK_TILE_SLAB = registerBlock("glist_neutral_link_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_NEUTRAL_LINK_TILE_STAIRS = registerBlock("glist_neutral_link_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_NEUTRAL_LINK_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_LINK_TILE_WALL = registerBlock("glist_neutral_link_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_NEUTRAL_SCRATCH_TILE = registerBlock("glist_neutral_scratch_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_SCRATCH_TILE_SLAB = registerBlock("glist_neutral_scratch_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_NEUTRAL_SCRATCH_TILE_STAIRS = registerBlock("glist_neutral_scratch_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_NEUTRAL_SCRATCH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_NEUTRAL_SCRATCH_TILE_WALL = registerBlock("glist_neutral_scratch_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_COLD_TILE = registerBlock("glist_cold_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_TILE_SLAB = registerBlock("glist_cold_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_COLD_TILE_STAIRS = registerBlock("glist_cold_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_COLD_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_TILE_WALL = registerBlock("glist_cold_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_COLD_FANCIFUL_TILE = registerBlock("glist_cold_fanciful_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_FANCIFUL_TILE_SLAB = registerBlock("glist_cold_fanciful_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_COLD_FANCIFUL_TILE_STAIRS = registerBlock("glist_cold_fanciful_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_COLD_FANCIFUL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_FANCIFUL_TILE_WALL = registerBlock("glist_cold_fanciful_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_COLD_FAN_TILE = registerBlock("glist_cold_fan_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_FAN_TILE_SLAB = registerBlock("glist_cold_fan_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_COLD_FAN_TILE_STAIRS = registerBlock("glist_cold_fan_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_COLD_FAN_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_FAN_TILE_WALL = registerBlock("glist_cold_fan_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_COLD_FLORAL_TILE = registerBlock("glist_cold_floral_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_FLORAL_TILE_SLAB = registerBlock("glist_cold_floral_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_COLD_FLORAL_TILE_STAIRS = registerBlock("glist_cold_floral_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_COLD_FLORAL_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_FLORAL_TILE_WALL = registerBlock("glist_cold_floral_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_COLD_STAR_TILE = registerBlock("glist_cold_star_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_STAR_TILE_SLAB = registerBlock("glist_cold_star_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_COLD_STAR_TILE_STAIRS = registerBlock("glist_cold_star_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_COLD_STAR_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_STAR_TILE_WALL = registerBlock("glist_cold_star_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_COLD_LINK_TILE = registerBlock("glist_cold_link_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_LINK_TILE_SLAB = registerBlock("glist_cold_link_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_COLD_LINK_TILE_STAIRS = registerBlock("glist_cold_link_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_COLD_LINK_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_LINK_TILE_WALL = registerBlock("glist_cold_link_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<SixDirectionBlock> GLIST_COLD_SCRATCH_TILE = registerBlock("glist_cold_scratch_tile",
            () -> new SixDirectionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_SCRATCH_TILE_SLAB = registerBlock("glist_cold_scratch_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<StairBlock> GLIST_COLD_SCRATCH_TILE_STAIRS = registerBlock("glist_cold_scratch_tile_stairs",
            () -> new StairBlock(ModBlocks.GLIST_COLD_SCRATCH_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLIST_COLD_SCRATCH_TILE_WALL = registerBlock("glist_cold_scratch_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
