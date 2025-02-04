package io.github.tt432.kitchenkarrot.item;


import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

import static io.github.tt432.kitchenkarrot.block.PlateHolderMap.plateHolder;

public class IndexItem extends Item {
    private int index;
    public int getIndex() {
        return index;
    }

    public IndexItem setIndex(int index) {
        this.index = index;
        return this;
    }
    public IndexItem(Properties pProperties) {
        super(pProperties);
    }
    public IndexItem(Properties pProperties,int index) {
        super(pProperties);
        this.setIndex(index);
    }

    private boolean canPutOnPlate(){
        return plateHolder.containsKey(this);
    }


    @Override
    public void appendHoverText(ItemStack pStack, Level pLevel, List<Component> tooltip, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, tooltip, pIsAdvanced);
        if (this.canPutOnPlate()){
            tooltip.add(new TranslatableComponent("info.kitchenkarrot.can_be_dished"));
        }
    }
}
