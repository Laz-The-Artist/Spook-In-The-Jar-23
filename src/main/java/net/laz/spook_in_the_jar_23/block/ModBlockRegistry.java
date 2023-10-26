package net.laz.spook_in_the_jar_23.block;

import net.laz.spook_in_the_jar_23.SpookInTheJar23;
import net.laz.spook_in_the_jar_23.item.ModItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SpookInTheJar23.MODID);

    public static final RegistryObject<Block> BRAIN_JAR = BLOCKS.register("brain_in_a_jar", () -> new BrainInAJar(BlockBehaviour.Properties.of().noOcclusion()));

    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }
    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Item.Properties itemProperties){
        RegistryObject<T> ret = registerNoItem(name, block);
        ModItemRegistry.ITEMS.register(name, () -> new BlockItem(ret.get(), itemProperties));
        return ret;
    }
    private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
        return false;
    }
}
