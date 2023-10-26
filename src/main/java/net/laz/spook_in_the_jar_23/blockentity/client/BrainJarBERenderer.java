package net.laz.spook_in_the_jar_23.blockentity.client;

import net.laz.spook_in_the_jar_23.blockentity.BrainInAJarBE;
import net.laz.spook_in_the_jar_23.client.gecko.ModularGeckoModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BrainJarBERenderer extends GeoBlockRenderer<BrainInAJarBE> {

    public BrainJarBERenderer(BlockEntityRendererProvider.Context context) {
        super(new ModularGeckoModel<BrainInAJarBE>("brain_in_a_jar"));
    }

}
