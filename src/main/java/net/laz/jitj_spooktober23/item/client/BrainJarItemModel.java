package net.laz.jitj_spooktober23.item.client;

import net.laz.jitj_spooktober23.JITJSpooktober23;
import net.laz.jitj_spooktober23.item.BrainJarItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BrainJarItemModel extends GeoModel<BrainJarItem> {

    @Override
    public ResourceLocation getModelResource(BrainJarItem animatable) {
        return new ResourceLocation(JITJSpooktober23.MODID, "geo/brain_in_a_jar.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BrainJarItem animatable) {
        return new ResourceLocation(JITJSpooktober23.MODID, "textures/block/brain_in_a_jar.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BrainJarItem animatable) {
        return new ResourceLocation(JITJSpooktober23.MODID, "animations/brain_in_a_jar.animation.json");
    }
}
