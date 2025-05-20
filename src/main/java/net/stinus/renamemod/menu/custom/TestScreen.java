package net.stinus.renamemod.menu.custom;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.MultiLineTextWidget;
import net.minecraft.client.gui.screens.Screen;

import net.minecraft.network.chat.Component;
import net.minecraftforge.network.PacketDistributor;
import net.stinus.renamemod.networking.TutorialModPacketHandler;
import net.stinus.renamemod.networking.packet.CustomNamePacket;

public class TestScreen extends Screen
{
    private static final Component TITLE = Component.translatable("screen.tutorialmod.title");
    private static final Component BUTTON_TEXT = Component.translatable("screen.tutorialmod.button");
    private static final Component BUTTON_TEXT_SUCCEED = Component.translatable("screen.tutorialmod.button.succeed");
    private static final Component BOX_LABEL = Component.translatable("screen.tutorialmod.label");

    private static String customName;
    private EditBox nameInput;

    public TestScreen()
    {
        super(TITLE);
    }

    @Override
    protected void init()
    {
        int centerx = width / 2;
        int centery = height / 2;

        this.nameInput = new EditBox(this.font,centerx - 125, centery - 12,250,24, BUTTON_TEXT);

        Button succeedButton = new Button.Builder(BUTTON_TEXT_SUCCEED, btn ->
        {
            if (minecraft.player != null)
            {
                customName = nameInput.getValue();
                minecraft.player.sendSystemMessage(Component.literal("Name Successfully Changed"));
                minecraft.player.setCustomName(Component.literal(customName));
                minecraft.player.setCustomNameVisible(true);

                sendMessageToServer(customName);
            }
            this.onClose();
        })
                .bounds(centerx - 38, centery + 25, 76, 25)
                .build();

        MultiLineTextWidget title = new MultiLineTextWidget(centerx - 35, centery - 25, BOX_LABEL, font);

        this.addRenderableWidget(nameInput);
        this.addRenderableWidget(succeedButton);
        this.addRenderableWidget(title);
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick)
    {
        // Background is typically rendered first
        this.renderBackground(graphics, mouseX, mouseY, partialTick);

        // Render things here before widgets (background textures)

        // Then the widgets if this is a direct child of the Screen
        super.render(graphics, mouseX, mouseY, partialTick);

        // Render things after widgets (tooltips)
    }

    @Override
    public void onClose()
    {
        // Stop any handlers here

        // Call last in case it interferes with the override
        super.onClose();
    }

    @Override
    public void removed()
    {
        // Reset initial states here

        // Call last in case it interferes with the override
        super.removed();
    }

    private void sendMessageToServer(String message) {
        // Send the custom packet to the server
        TutorialModPacketHandler.INSTANCE.send(new CustomNamePacket(message), PacketDistributor.SERVER.noArg());

    }
}
