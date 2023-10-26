package net.laz.spook_in_the_jar_23.blockentity;

import net.laz.spook_in_the_jar_23.SpookInTheJar23;
import net.laz.spook_in_the_jar_23.block.ModBlockRegistry;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntityRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SpookInTheJar23.MODID);

    public static final RegistryObject<BlockEntityType<BrainInAJarBE>> BRAIN_JAR_BE = BLOCK_ENTITIES.register("brain_in_a_jar", () -> BlockEntityType.Builder.of(BrainInAJarBE::new, ModBlockRegistry.BRAIN_JAR.get()).build(null));
    public static final RegistryObject<BlockEntityType<JackInTheBoxBE>> JACK_IN_THE_BOX_BE = BLOCK_ENTITIES.register("jack_in_the_box", () -> BlockEntityType.Builder.of(JackInTheBoxBE::new, ModBlockRegistry.JACK_IN_THE_BOX.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }

}
