package net.wisefam.materials;

import net.wisefam.meta.ModItems;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class TitaniumMaterial extends Material {

    public static final Item.ToolMaterial TOOL = EnumHelper.addToolMaterial("titanium", 3, 1561, 6.0F, 3.0F, 30);
    public static final ItemArmor.ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("titanium", "titanium", 33, new int[]{3, 8, 6, 3}, 30);

    public TitaniumMaterial() {
        super(MapColor.ironColor);

        TOOL.setRepairItem(new ItemStack(ModItems.titaniumIngot));

        setRequiresTool();
    }
}
