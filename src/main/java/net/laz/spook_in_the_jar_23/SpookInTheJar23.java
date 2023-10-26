package net.laz.spook_in_the_jar_23;

import com.mojang.logging.LogUtils;
import net.laz.spook_in_the_jar_23.block.ModBlockRegistry;
import net.laz.spook_in_the_jar_23.blockentity.JackInTheBoxBE;
import net.laz.spook_in_the_jar_23.blockentity.ModBlockEntityRegistry;
import net.laz.spook_in_the_jar_23.blockentity.client.BrainJarBERenderer;
import net.laz.spook_in_the_jar_23.blockentity.client.JackInTheBoxBERenderer;
import net.laz.spook_in_the_jar_23.item.ModItemRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

@Mod(SpookInTheJar23.MODID)
public class SpookInTheJar23 {

    public static final String MODID = "spook_in_the_jar_23";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpookInTheJar23()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);

        ModBlockRegistry.register(modEventBus);
        ModItemRegistry.register(modEventBus);
        ModBlockEntityRegistry.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event){
        //if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
          //  event.accept(EXAMPLE_BLOCK_ITEM);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            BlockEntityRenderers.register(ModBlockEntityRegistry.BRAIN_JAR_BE.get(), BrainJarBERenderer::new);
            BlockEntityRenderers.register(ModBlockEntityRegistry.JACK_IN_THE_BOX_BE.get(), JackInTheBoxBERenderer::new);
        }

    }


}
