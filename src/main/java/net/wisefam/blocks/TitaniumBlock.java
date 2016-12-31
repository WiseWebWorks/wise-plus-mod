package net.wisefam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wisefam.items.NamedItem;

public class TitaniumBlock extends Block implements NamedItem {

    private final String name = "titanium_block";

    public TitaniumBlock() {
        super(Material.IRON, MapColor.IRON);

        GameRegistry.register(setRegistryName(name));
        GameRegistry.register(new ItemBlock(this).setRegistryName(getRegistryName()));

        setHardness(5.0F);
        setResistance(10.0F);
        setSoundType(SoundType.METAL);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHarvestLevel("pickaxe", 1);
    }

    @Override
    public String getName() {
        return name;
    }

}
