package io.github.tt432.kitchenkarrot.dependencies.jei.category;

import com.mojang.blaze3d.vertex.PoseStack;
import io.github.tt432.kitchenkarrot.Kitchenkarrot;
import io.github.tt432.kitchenkarrot.dependencies.jei.JeiPlugin;
import io.github.tt432.kitchenkarrot.item.ModBlockItems;
import io.github.tt432.kitchenkarrot.recipes.recipe.AirCompressorRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.Objects;

/**
 * @author DustW
 **/
public class AirCompressorRecipeCategory extends BaseRecipeCategory<AirCompressorRecipe> {
    protected final IDrawableAnimated arrow;
    protected static final ResourceLocation BACKGROUND =
            new ResourceLocation(Kitchenkarrot.MOD_ID, "textures/gui/jei.png");

    public AirCompressorRecipeCategory(IGuiHelper helper) {
        super(JeiPlugin.AIR_COMPRESSOR,
                helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlockItems.AIR_COMPRESSOR.get())),
                helper.createDrawable(BACKGROUND, 0, 141, 104, 78));
        arrow = helper.drawableBuilder(BACKGROUND, 176 ,0, 20, 19).buildAnimated(40, IDrawableAnimated.StartDirection.LEFT, false);
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AirCompressorRecipe recipe, IFocusGroup focuses) {
        var ingredient = recipe.getIngredient();

        builder.addSlot(RecipeIngredientRole.INPUT, 28, 32).addIngredients(ingredient.get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 49, 32).addIngredients(ingredient.get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 28, 53).addIngredients(ingredient.get(2));
        builder.addSlot(RecipeIngredientRole.INPUT, 49, 53).addIngredients(ingredient.get(3));
        builder.addSlot(RecipeIngredientRole.INPUT, 28, 9).addIngredients(Ingredient.of(Items.REDSTONE));

        var container = Objects.requireNonNullElse(recipe.getContainer(), Ingredient.EMPTY);
        builder.addSlot(RecipeIngredientRole.INPUT, 49, 9).addIngredients(container);

        builder.addSlot(RecipeIngredientRole.OUTPUT, 75, 32).addItemStack(recipe.getResultItem());
    }

    @Override
    public void draw(AirCompressorRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        arrow.draw(stack, 70, 53);
    }
}
