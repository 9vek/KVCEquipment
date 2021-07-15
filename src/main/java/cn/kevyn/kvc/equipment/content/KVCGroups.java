package cn.kevyn.kvc.equipment.content;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class KVCGroups {

    /** 物品组 */
    public static final ItemGroup KVC_TOOLS = FabricItemGroupBuilder.build(new Identifier("minecraft", "kvc_tools"), () -> new ItemStack(Items.GOLDEN_AXE));
    public static final ItemGroup KVC_COMBAT = FabricItemGroupBuilder.build(new Identifier("minecraft", "kvc_combat"), () -> new ItemStack(Items.DIAMOND_SWORD));

}
