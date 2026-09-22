package net.micomibite.tastytiles.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;


public class SixDirectionBlock extends DirectionalBlock {

    public SixDirectionBlock(Properties properties) { super(properties); }

    @Override
    protected MapCodec<? extends DirectionalBlock> codec() {return null;}

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction clickedFaceDirection = context.getClickedFace();
        return this.defaultBlockState().setValue(FACING, clickedFaceDirection);
    }
}
