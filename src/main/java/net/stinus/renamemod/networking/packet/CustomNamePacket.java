package net.stinus.renamemod.networking.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.network.CustomPayloadEvent;

public class CustomNamePacket
{
    private final String customName;

    public CustomNamePacket(String customName) {
        this.customName = customName;
    }

    public static void encode(CustomNamePacket packet, FriendlyByteBuf buf) {
        buf.writeUtf(packet.customName);
    }

    public static CustomNamePacket decode(FriendlyByteBuf buf) {
        return new CustomNamePacket(buf.readUtf());
    }

    public static void handle(CustomNamePacket packet, CustomPayloadEvent.Context context) {
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();
            player.setCustomName(Component.literal(packet.customName));
            player.setCustomNameVisible(true);
            player.refreshTabListName();

            // Handle packet, possibly display message in chat
            System.out.println("Received message, CustomName:" + packet.customName);
        });
        context.setPacketHandled(true);
    }
}
