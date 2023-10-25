package net.laz.jitj_spooktober23.blockentity;

import net.laz.jitj_spooktober23.JITJSpooktober23;
import net.laz.jitj_spooktober23.block.ModBlockRegistry;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntityRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, JITJSpooktober23.MODID);

    public static final RegistryObject<BlockEntityType<BrainInAJarBE>> BRAIN_JAR_BE = BLOCK_ENTITIES.register("brain_in_a_jar", () -> BlockEntityType.Builder.of(BrainInAJarBE::new, ModBlockRegistry.BRAIN_JAR.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }

}
