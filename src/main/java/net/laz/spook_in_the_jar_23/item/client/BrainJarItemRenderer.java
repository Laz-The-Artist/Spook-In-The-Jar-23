package net.laz.spook_in_the_jar_23.item.client;

import net.laz.spook_in_the_jar_23.client.gecko.ModularGeckoModel;
import net.laz.spook_in_the_jar_23.item.BrainJarItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BrainJarItemRenderer extends GeoItemRenderer<BrainJarItem> {

    public BrainJarItemRenderer() {
        super(new ModularGeckoModel<>("brain_in_a_jar"));
    }

}
