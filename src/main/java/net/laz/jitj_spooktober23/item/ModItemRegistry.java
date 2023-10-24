package net.laz.jitj_spooktober23.item;

import net.laz.jitj_spooktober23.JITJSpooktober23;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JITJSpooktober23.MODID);

    //public static final RegistryObject<Item> CARDBOARD = ITEMS.register("cardboard", () -> new Item(new Item.Properties()));


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JITJSpooktober23.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("jitj_spooktober23_creative_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(Items.PUMPKIN_PIE))
            .title(Component.translatable("creativetab.jitj_spooktober23_creative_tab_label"))
            .displayItems((parameters, output) -> {
                output.accept(Items.PUMPKIN_PIE);
            }).build());

    public static void register(IEventBus bus){
        ITEMS.register(bus);
        CREATIVE_MODE_TABS.register(bus);
    }
}
