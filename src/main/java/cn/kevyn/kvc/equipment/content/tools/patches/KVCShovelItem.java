package cn.kevyn.kvc.equipment.content.tools.patches;

import cn.kevyn.kvc.equipment.content.tools.KVCToolMaterial;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class KVCShovelItem extends ShovelItem {
    public KVCShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public KVCShovelItem(KVCToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, toolMaterial.getShovelAttackDamagePlus(), toolMaterial.getShovelAttackSpeed(), settings);
    }
}
