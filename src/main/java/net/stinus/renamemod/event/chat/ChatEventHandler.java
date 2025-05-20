package net.stinus.renamemod.event.chat;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;

public class ChatEventHandler
{
    public static void register()
    {
        MinecraftForge.EVENT_BUS.addListener(ChatEventHandler::onPlayerChat);
    }

    private static void onPlayerChat(ServerChatEvent event)
    {
        ServerPlayer player = event.getPlayer();
        String originalMessage = event.getMessage().getString();
        String customName = player.getCustomName().getString();

        if(customName != null && customName.length() > 0)
        {
            String modifiedMessage = "<" + customName + "> " + originalMessage;

            event.setCanceled(true);

            player.getServer().getPlayerList().broadcastSystemMessage(Component.literal(modifiedMessage), false);
        }
    }
}
