package cn.kevyn.kvc.equipment.content.tools;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

public class VanillaToolMaterialsOverride {

    /** 木制工具 */
    private static final KVCToolMaterial WOOD_TOOL_MATERIAL = new KVCToolMaterial("wood", Ingredient.fromTag(ItemTags.PLANKS));
    /** 石制工具 */
    private static final KVCToolMaterial STONE_TOOL_MATERIAL = new KVCToolMaterial("stone", Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS));
    /** 铁制工具 */
    private static final KVCToolMaterial IRON_TOOL_MATERIAL = new KVCToolMaterial("iron", Ingredient.ofItems(Items.IRON_INGOT));
    /** 金制工具 */
    private static final KVCToolMaterial GOLD_TOOL_MATERIAL = new KVCToolMaterial("gold", Ingredient.ofItems(Items.GOLD_INGOT));
    /** 钻石工具 */
    private static final KVCToolMaterial DIAMOND_TOOL_MATERIAL = new KVCToolMaterial("diamond", Ingredient.ofItems(Items.DIAMOND));
    /** 下界合金工具 */
    private static final KVCToolMaterial NETHERITE_TOOL_MATERIAL = new KVCToolMaterial("netherite", Ingredient.ofItems(Items.NETHERITE_INGOT));

    public static KVCToolMaterial getMaterialByIngredient(Ingredient ingredient) {
        KVCToolMaterial material = null;
        if (ingredient == Ingredient.fromTag(ItemTags.PLANKS)) {
            material = WOOD_TOOL_MATERIAL;
        }
        else if (ingredient == Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)) {
            material = STONE_TOOL_MATERIAL;
        }
        else if (ingredient == Ingredient.ofItems(Items.IRON_INGOT)) {
            material = IRON_TOOL_MATERIAL;
        }
        else if (ingredient == Ingredient.ofItems(Items.GOLD_INGOT)) {
            material = GOLD_TOOL_MATERIAL;
        }
        else if (ingredient == Ingredient.ofItems(Items.DIAMOND)) {
            material = DIAMOND_TOOL_MATERIAL;
        }
        else if (ingredient == Ingredient.ofItems(Items.NETHERITE_INGOT)) {
            material = NETHERITE_TOOL_MATERIAL;
        }

        return material;
    }

}
