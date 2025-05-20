package net.stinus.renamemod.tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.stinus.renamemod.TutorialMod;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

//    public static final RegistryObject<CreativeModeTab> TUTORIAL_CREATIVE_MODE_TAB_ITEMS = CREATIVE_MODE_TABS.register("tutorial_tab_items",
//            () -> CreativeModeTab.builder()
//                    .icon(() -> new ItemStack(ModItems.TEST_ITEM.get()))
//                    .title(Component.translatable("creativetab.tutorialmod.tutorial_tab_items"))
//                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModItems.TEST_ITEM.get());
//
//                        output.accept(ModItems.CHISEL.get());
//                    })
//                    .build());

//    public static final RegistryObject<CreativeModeTab> TUTORIAL_CREATIVE_MODE_TAB_BLOCKS = CREATIVE_MODE_TABS.register("tutorial_tab_blocks",
//            () -> CreativeModeTab.builder()
//                    .withTabsBefore(TUTORIAL_CREATIVE_MODE_TAB_ITEMS.getId())
//                    .icon(() -> new ItemStack(ModBlocks.TEST_BLOCK.get()))
//                    .title(Component.translatable("creativetab.tutorialmod.tutorial_tab_blocks"))
//                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModBlocks.TEST_BLOCK.get());
//
//                        output.accept(ModBlocks.MIDAS_TOUCH_BLOCK.get());
//                        output.accept(ModBlocks.WARNING_BLOCK.get());
//                    })
//                    .build());

    public static void register(IEventBus bus)
    {
        CREATIVE_MODE_TABS.register(bus);
    }
}
