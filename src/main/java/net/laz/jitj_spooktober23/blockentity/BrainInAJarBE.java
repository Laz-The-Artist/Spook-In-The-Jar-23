package net.laz.jitj_spooktober23.blockentity;

import net.laz.jitj_spooktober23.block.ModBlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.util.RenderUtils;

public class BrainInAJarBE extends BlockEntity implements GeoBlockEntity {


    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public BrainInAJarBE(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntityRegistry.BRAIN_JAR_BE.get(), pPos, pBlockState);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    protected <T extends GeoAnimatable> PlayState predicate(final AnimationState<T> state) {
        //return state.setAndContinue(RawAnimation.begin().thenLoop("brain_in_a_jar.idle"));
        state.getController().setAnimation(RawAnimation.begin().then("animation.brain_in_a_jar.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public double getTick(Object blockEntity) {
        return RenderUtils.getCurrentTick();
    }
}
