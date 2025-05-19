package net.stinus.tutorialmod.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.stinus.tutorialmod.TutorialMod;
import net.stinus.tutorialmod.menu.custom.TestScreen;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, value = Dist.CLIENT)
public class ClientKeyEvents
{
    @SubscribeEvent
    public static void onKeyPress(InputEvent.Key event)
    {
        if (ClientKeyMapping.OPEN_GUI_KEY.isDown())
        {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player != null)
            {
                mc.setScreen(new TestScreen());
            }
        }
    }
}
