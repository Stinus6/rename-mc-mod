package net.stinus.renamemod.event;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.stinus.renamemod.TutorialMod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup
{

    public static final Lazy<KeyMapping> EXAMPLE_MAPPING = Lazy.of(() ->
        ClientKeyMapping.OPEN_GUI_KEY
    );

    @SubscribeEvent
    public void registerBindings(RegisterKeyMappingsEvent event)
    {
        event.register(EXAMPLE_MAPPING.get());
    }
}
