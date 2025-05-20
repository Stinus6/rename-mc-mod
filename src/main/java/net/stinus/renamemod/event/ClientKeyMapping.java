package net.stinus.renamemod.event;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class ClientKeyMapping
{
    public static final KeyMapping OPEN_GUI_KEY = new KeyMapping (
            "key.yourmod.open_gui",  // translation key
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_G,         // default key: G
            "key.categories.yourmod" // category
    );
}
