package net.laz.jitj_spooktober23.blockentity.client;

import net.laz.jitj_spooktober23.JITJSpooktober23;
import net.laz.jitj_spooktober23.blockentity.BrainInAJarBE;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BrainJarBlockModel extends GeoModel<BrainInAJarBE> {
    @Override
    public ResourceLocation getModelResource(BrainInAJarBE animatable) {
        return new ResourceLocation(JITJSpooktober23.MODID, "geo/brain_in_a_jar.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BrainInAJarBE animatable) {
        return new ResourceLocation(JITJSpooktober23.MODID, "textures/block/brain_in_a_jar.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BrainInAJarBE animatable) {
        return new ResourceLocation(JITJSpooktober23.MODID, "animations/brain_in_a_jar.animation.json");
    }
}
