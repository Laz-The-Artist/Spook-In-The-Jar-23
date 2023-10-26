package net.laz.spook_in_the_jar_23.blockentity.client;

import net.laz.spook_in_the_jar_23.blockentity.BrainInAJarBE;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BrainJarBlockRenderer extends GeoBlockRenderer<BrainInAJarBE> {

    public BrainJarBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new BrainJarBlockModel());
    }

}
