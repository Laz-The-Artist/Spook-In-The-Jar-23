package net.laz.spook_in_the_jar_23.item.client;

import net.laz.spook_in_the_jar_23.client.gecko.ModularGeckoModel;
import net.laz.spook_in_the_jar_23.item.JackInTheBoxItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class JackInTheBoxItemRenderer extends GeoItemRenderer<JackInTheBoxItem> {

    public JackInTheBoxItemRenderer() {
        super(new ModularGeckoModel<>("jack_in_the_box"));
    }

}
