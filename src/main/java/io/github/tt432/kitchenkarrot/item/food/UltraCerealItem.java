package io.github.tt432.kitchenkarrot.item.food;

import io.github.tt432.kitchenkarrot.item.IndexItem;
import io.github.tt432.kitchenkarrot.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class UltraCerealItem extends IndexItem {
    public UltraCerealItem(int nutrition, float saturation) {
        super(FoodUtil.food(ModItems.defaultProperties(), nutrition, saturation).rarity(Rarity.EPIC).stacksTo(16));
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

    @Override
    public UltraCerealItem setIndex(int index) {
        super.setIndex(index);
        return this;
    }
}
