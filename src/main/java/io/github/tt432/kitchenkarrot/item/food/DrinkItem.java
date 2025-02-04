package io.github.tt432.kitchenkarrot.item.food;

import io.github.tt432.kitchenkarrot.item.EffectEntry;
import io.github.tt432.kitchenkarrot.item.IndexItem;
import io.github.tt432.kitchenkarrot.item.ModItems;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import org.jetbrains.annotations.NotNull;

public class DrinkItem extends IndexItem {
    public DrinkItem(float pSaturationModifier) {
        super(ModItems.defaultProperties().food(new FoodProperties.Builder().saturationMod(pSaturationModifier).build()).stacksTo(16));
    }
    public DrinkItem(int nutrition, float saturation, EffectEntry... effectEntries){
        super(FoodUtil.effectFood(ModItems.defaultProperties(),nutrition,saturation,true,effectEntries));
    }

    @Override
    public DrinkItem setIndex(int index) {
        super.setIndex(index);
        return this;
    }

    @Override
    @NotNull
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }
}
