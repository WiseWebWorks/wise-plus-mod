package net.wisefam.materials;

import net.wisefam.meta.ModItems;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class TitaniumMaterial extends Material {

    // TODO: when updated to 1.9, change damage to 2.0f and lower the reload time
    public static final Item.ToolMaterial TOOL = EnumHelper.addToolMaterial("titanium", 2, 50, 6.0F, 2.0F, 30);
    public static final ItemArmor.ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("titanium", "titanium", 7, new int[]{2, 6, 5, 2}, 30);

    public TitaniumMaterial() {
        super(MapColor.ironColor);

        TOOL.setRepairItem(new ItemStack(ModItems.titaniumIngot));

        setRequiresTool();
    }
}
