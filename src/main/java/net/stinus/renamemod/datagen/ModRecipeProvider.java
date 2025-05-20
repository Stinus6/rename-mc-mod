package net.stinus.renamemod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(packOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput)
    {
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MIDAS_TOUCH_BLOCK.get())
//                .pattern("g g")
//                .pattern("GNG")
//                .pattern("GGG")
//                .define('g', Items.GOLD_INGOT)
//                .define('G', Items.GOLD_BLOCK)
//                .define('N', Items.NETHER_STAR)
//                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
//                .save(recipeOutput);

//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TEST_ITEM.get(), 9)
//                .requires(ModBlocks.TEST_BLOCK.get())
//                .unlockedBy(getHasName(ModBlocks.TEST_BLOCK.get()), has(ModBlocks.TEST_BLOCK.get()))
//                .save(recipeOutput);
    }
}
