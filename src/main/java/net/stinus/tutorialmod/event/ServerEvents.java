package net.stinus.tutorialmod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.stinus.tutorialmod.TutorialMod;
import net.stinus.tutorialmod.menu.custom.TestScreen;
import net.stinus.tutorialmod.networking.TutorialModPacketHandler;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerEvents
{
    @SubscribeEvent
    public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event)
    {
        if (event.getEntity() instanceof ServerPlayer player)
        {
            Minecraft.getInstance().execute(() -> Minecraft.getInstance().setScreen(new TestScreen()));
        }
    }
}
