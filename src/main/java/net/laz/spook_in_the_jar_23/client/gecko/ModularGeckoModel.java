package net.laz.spook_in_the_jar_23.client.gecko;

import net.laz.spook_in_the_jar_23.SpookInTheJar23;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class ModularGeckoModel<T extends GeoAnimatable> extends GeoModel<T> {

    private String filename;

    public ModularGeckoModel(String filename){
        this.filename = filename;
    }

    @Override
    public ResourceLocation getModelResource(T animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "geo/"+this.filename+".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(T animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "textures/block/"+this.filename+".png");
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return new ResourceLocation(SpookInTheJar23.MODID, "animations/"+this.filename+".animation.json");
    }
}
