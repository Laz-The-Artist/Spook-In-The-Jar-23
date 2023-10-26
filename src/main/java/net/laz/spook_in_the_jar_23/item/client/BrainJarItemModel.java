package net.laz.spook_in_the_jar_23.item.client;

import net.laz.spook_in_the_jar_23.SpookInTheJar23;
import net.laz.spook_in_the_jar_23.item.BrainJarItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BrainJarItemModel extends GeoModel<BrainJarItem> {

    @Override
    public ResourceLocation getModelResource(BrainJarItem animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "geo/brain_in_a_jar.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BrainJarItem animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "textures/block/brain_in_a_jar.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BrainJarItem animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "animations/brain_in_a_jar.animation.json");
    }
}
