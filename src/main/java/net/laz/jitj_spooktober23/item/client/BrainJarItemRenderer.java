package net.laz.jitj_spooktober23.item.client;

import net.laz.jitj_spooktober23.item.BrainJarItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BrainJarItemRenderer extends GeoItemRenderer<BrainJarItem> {

    public BrainJarItemRenderer() {
        super(new BrainJarItemModel());
    }

}
