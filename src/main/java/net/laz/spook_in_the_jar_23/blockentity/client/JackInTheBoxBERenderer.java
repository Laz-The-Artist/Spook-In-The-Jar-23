package net.laz.spook_in_the_jar_23.blockentity.client;

import net.laz.spook_in_the_jar_23.blockentity.JackInTheBoxBE;
import net.laz.spook_in_the_jar_23.client.gecko.ModularGeckoModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class JackInTheBoxBERenderer extends GeoBlockRenderer<JackInTheBoxBE> {

    public JackInTheBoxBERenderer(BlockEntityRendererProvider.Context context) {
        super(new ModularGeckoModel<JackInTheBoxBE>("jack_in_the_box"));
    }

}
