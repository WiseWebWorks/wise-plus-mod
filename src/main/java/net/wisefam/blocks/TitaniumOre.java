package net.wisefam.blocks;

import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wisefam.items.NamedItem;
import net.wisefam.meta.ModItems;

import java.util.Random;

public class TitaniumOre extends BlockOre implements NamedItem {

    private final String name = "titanium_ore";

    public TitaniumOre() {
        super();

        GameRegistry.register(setRegistryName(name));
        GameRegistry.register(new ItemBlock(this).setRegistryName(getRegistryName()));

        setHardness(3.0F);
        setResistance(5.0F);
        setSoundType(new SoundType(1.0F, 1.5F, SoundEvents.BLOCK_STONE_BREAK, SoundEvents.BLOCK_PISTON_CONTRACT, SoundEvents.BLOCK_STONE_PLACE, SoundEvents.BLOCK_STONE_HIT, SoundEvents.BLOCK_STONE_FALL));
        setUnlocalizedName(name);
        setHarvestLevel("pickaxe", 1);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Item getItemDropped(IBlockState p_getItemDropped_1_, Random p_getItemDropped_2_, int p_getItemDropped_3_) {
        return ModItems.TITANIUM_INGOT;
    }
}
