package net.laz.jitj_spooktober23.block;

import net.laz.jitj_spooktober23.blockentity.BrainInAJarBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;


public class BrainInAJar extends BaseEntityBlock {
    public static final VoxelShape JAR_BODY = Block.box(3, 0, 3, 13, 12, 13);
    public static final VoxelShape JAR_NECK = Block.box(4, 12, 4, 12, 13, 12);
    public static final VoxelShape JAR_CORK = Block.box(5, 13, 5, 11, 14, 11);
    public static final VoxelShape JAR_SHAPE_ = Shapes.or(JAR_BODY, JAR_NECK);
    public static final VoxelShape JAR_SHAPE = Shapes.or(JAR_SHAPE_, JAR_CORK);

    public BrainInAJar(Properties pProperties) {
        super(pProperties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new BrainInAJarBE(pPos, pState);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return JAR_SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }
}
