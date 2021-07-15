package cn.kevyn.kvc.equipment.content.tools.patches;

import cn.kevyn.kvc.equipment.content.tools.KVCToolMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class KVCAxeItem extends AxeItem {

    public KVCAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public KVCAxeItem(KVCToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, toolMaterial.getAxeAttackDamagePlus(), toolMaterial.getAxeAttackSpeed(), settings);
    }
}
