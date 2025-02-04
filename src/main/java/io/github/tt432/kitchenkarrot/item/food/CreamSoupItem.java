package io.github.tt432.kitchenkarrot.item.food;

import io.github.tt432.kitchenkarrot.item.EffectEntry;
import io.github.tt432.kitchenkarrot.item.IndexItem;
import io.github.tt432.kitchenkarrot.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class CreamSoupItem extends IndexItem {

    public CreamSoupItem(int nutrition, float saturation, EffectEntry... effectEntries) {
        super(FoodUtil.effectFood(ModItems.defaultProperties(), nutrition, saturation,false, effectEntries).stacksTo(16));
    }

    @Override
    public CreamSoupItem setIndex(int index) {
        super.setIndex(index);
        return this;
    }

    @Override
    @NotNull
    public ItemStack finishUsingItem(@NotNull ItemStack itemStack, @NotNull Level level, LivingEntity livingEntity) {
        itemStack = livingEntity.eat(level, itemStack);

        if (livingEntity instanceof Player player) {
            player.getInventory().add(new ItemStack(Items.BOWL));
        }

        return itemStack;
    }
}
