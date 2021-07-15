package cn.kevyn.kvc.equipment.content.tools.patches;

import cn.kevyn.kvc.equipment.content.tools.KVCToolMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class KVCSwordItem extends SwordItem {
    public KVCSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public KVCSwordItem(KVCToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, toolMaterial.getSwordAttackDamagePlus(), toolMaterial.getSwordAttackSpeed(), settings);
    }
}
