package net.stinus.tutorialmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.stinus.tutorialmod.TutorialMod;
import net.stinus.tutorialmod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider
{
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        // Tool Needed
        tag(BlockTags.MINEABLE_WITH_AXE);

        tag(BlockTags.MINEABLE_WITH_PICKAXE);

        tag(BlockTags.MINEABLE_WITH_SHOVEL);

        tag(BlockTags.MINEABLE_WITH_HOE);

        // Material Needed
        tag(BlockTags.NEEDS_STONE_TOOL);
                // .add(ModBlocks.TEST_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}
