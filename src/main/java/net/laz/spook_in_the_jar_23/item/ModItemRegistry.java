package net.laz.spook_in_the_jar_23.item;

import net.laz.spook_in_the_jar_23.SpookInTheJar23;
import net.laz.spook_in_the_jar_23.block.ModBlockRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpookInTheJar23.MODID);

    public static final RegistryObject<Item> BRAIN_JAR = ITEMS.register("brain_in_a_jar", () -> new BrainJarItem(ModBlockRegistry.BRAIN_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACK_IN_THE_BOX = ITEMS.register("jack_in_the_box", () -> new JackInTheBoxItem(ModBlockRegistry.JACK_IN_THE_BOX.get(), new Item.Properties()));


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpookInTheJar23.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("spook_in_the_jar_23_creative_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(BRAIN_JAR.get()))
            .title(Component.translatable("creativetab.spook_in_the_jar_23_creative_tab_label"))
            .displayItems((parameters, output) -> {
                output.accept(BRAIN_JAR.get());
                output.accept(JACK_IN_THE_BOX.get());
            }).build());

    public static void register(IEventBus bus){
        ITEMS.register(bus);
        CREATIVE_MODE_TABS.register(bus);
    }
}
