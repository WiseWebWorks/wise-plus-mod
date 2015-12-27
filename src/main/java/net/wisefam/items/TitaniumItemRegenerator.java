package net.wisefam.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TitaniumItemRegenerator {

    private final static double REGENERATION_TICKS = 20 * 60 * 7; // 7 minutes

    private Map<ItemStack, AtomicInteger> stackUpdateCountMap;

    private int regenerateTickCount;

    public TitaniumItemRegenerator(Item item) {
        stackUpdateCountMap = new HashMap<ItemStack, AtomicInteger>();
        int maxDamage = item.getMaxDamage();
        regenerateTickCount = (int) Math.floor(REGENERATION_TICKS / maxDamage);
    }

    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn) {
        if (stack.isItemDamaged() && !worldIn.isRemote && entityIn instanceof EntityPlayerMP) {
            if (tickCountMatches(stack)) {
                stack.damageItem(-1, (EntityPlayerMP) entityIn);
            }
        }
    }

    private boolean tickCountMatches(ItemStack stack) {
        AtomicInteger updateCounter = stackUpdateCountMap.get(stack);
        if (updateCounter == null) {
            updateCounter = new AtomicInteger();
            stackUpdateCountMap.put(stack, updateCounter);
        }
        int updateCount = updateCounter.incrementAndGet();
        return updateCount % regenerateTickCount == 0;
    }

}
