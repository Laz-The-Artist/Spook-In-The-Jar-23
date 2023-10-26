package net.laz.spook_in_the_jar_23.blockentity.client;

import net.laz.spook_in_the_jar_23.SpookInTheJar23;
import net.laz.spook_in_the_jar_23.blockentity.BrainInAJarBE;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BrainJarBlockModel extends GeoModel<BrainInAJarBE> {
    @Override
    public ResourceLocation getModelResource(BrainInAJarBE animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "geo/brain_in_a_jar.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BrainInAJarBE animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "textures/block/brain_in_a_jar.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BrainInAJarBE animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "animations/brain_in_a_jar.animation.json");
    }
}
