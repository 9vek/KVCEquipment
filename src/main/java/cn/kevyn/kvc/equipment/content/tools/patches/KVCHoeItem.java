package cn.kevyn.kvc.equipment.content.tools.patches;

import cn.kevyn.kvc.equipment.content.tools.KVCToolMaterial;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class KVCHoeItem extends HoeItem {
    public KVCHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public KVCHoeItem(KVCToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, toolMaterial.getHoeAttackDamagePlus(), toolMaterial.getHoeAttackSpeed(), settings);
    }
}
