package cn.kevyn.kvc.equipment.content.tools;

import cn.kevyn.kvc.equipment.content.tools.patches.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.registry.Registry;


public class VanillaToolItemsOverride {

    /** 木制工具 */
    public static final KVCToolMaterial WOODEN_TOOL_MATERIAL = new KVCToolMaterial("wood", Ingredient.fromTag(ItemTags.PLANKS));
    public static final Item WOODEN_AXE = new KVCAxeItem(WOODEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item WOODEN_HOE = new KVCHoeItem(WOODEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item WOODEN_PICKAXE = new KVCPickaxeItem(WOODEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item WOODEN_SHOVEL = new KVCShovelItem(WOODEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item WOODEN_SWORD = new KVCSwordItem(WOODEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.COMBAT));
    /** 石制工具 */
    public static final KVCToolMaterial STONE_TOOL_MATERIAL = new KVCToolMaterial("stone", Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS));
    public static final Item STONE_AXE = new KVCAxeItem(STONE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item STONE_HOE = new KVCHoeItem(STONE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item STONE_PICKAXE = new KVCPickaxeItem(STONE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item STONE_SHOVEL = new KVCShovelItem(STONE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item STONE_SWORD = new KVCSwordItem(STONE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.COMBAT));
    /** 铁制工具 */
    public static final KVCToolMaterial IRON_TOOL_MATERIAL = new KVCToolMaterial("iron", Ingredient.ofItems(Items.IRON_INGOT));
    public static final Item IRON_AXE = new KVCAxeItem(IRON_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item IRON_HOE = new KVCHoeItem(IRON_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item IRON_PICKAXE = new KVCPickaxeItem(IRON_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item IRON_SHOVEL = new KVCShovelItem(IRON_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item IRON_SWORD = new KVCSwordItem(IRON_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.COMBAT));
    /** 金制工具 */
    public static final KVCToolMaterial GOLDEN_TOOL_MATERIAL = new KVCToolMaterial("gold", Ingredient.ofItems(Items.GOLD_INGOT));
    public static final Item GOLDEN_AXE = new KVCAxeItem(GOLDEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item GOLDEN_HOE = new KVCHoeItem(GOLDEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item GOLDEN_PICKAXE = new KVCPickaxeItem(GOLDEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item GOLDEN_SHOVEL = new KVCShovelItem(GOLDEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item GOLDEN_SWORD = new KVCSwordItem(GOLDEN_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.COMBAT));
    /** 钻石工具 */
    public static final KVCToolMaterial DIAMOND_TOOL_MATERIAL = new KVCToolMaterial("diamond", Ingredient.ofItems(Items.DIAMOND));
    public static final Item DIAMOND_AXE = new KVCAxeItem(DIAMOND_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item DIAMOND_HOE = new KVCHoeItem(DIAMOND_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item DIAMOND_PICKAXE = new KVCPickaxeItem(DIAMOND_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item DIAMOND_SHOVEL = new KVCShovelItem(DIAMOND_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item DIAMOND_SWORD = new KVCSwordItem(DIAMOND_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.COMBAT));
    /** 下界合金工具 */
    public static final KVCToolMaterial NETHERITE_TOOL_MATERIAL = new KVCToolMaterial("netherite", Ingredient.ofItems(Items.NETHERITE_INGOT));
    public static final Item NETHERITE_AXE = new KVCAxeItem(NETHERITE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item NETHERITE_HOE = new KVCHoeItem(NETHERITE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item NETHERITE_PICKAXE = new KVCPickaxeItem(NETHERITE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item NETHERITE_SHOVEL = new KVCShovelItem(NETHERITE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item NETHERITE_SWORD = new KVCSwordItem(NETHERITE_TOOL_MATERIAL, new FabricItemSettings().group(ItemGroup.COMBAT));

    public static void doOverride() {

        /** 木制工具 */
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.WOODEN_AXE), "wooden_axe", WOODEN_AXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.WOODEN_HOE), "wooden_hoe", WOODEN_HOE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.WOODEN_PICKAXE), "wooden_pickaxe", WOODEN_PICKAXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.WOODEN_SHOVEL), "wooden_shovel", WOODEN_SHOVEL);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.WOODEN_SWORD), "wooden_sword", WOODEN_SWORD);
        /** 石制工具 */
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.STONE_AXE), "stone_axe", STONE_AXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.STONE_HOE), "stone_hoe", STONE_HOE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.STONE_PICKAXE), "stone_pickaxe", STONE_PICKAXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.STONE_SHOVEL), "stone_shovel", STONE_SHOVEL);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.STONE_SWORD), "stone_sword", STONE_SWORD);
        /** 铁制工具 */
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.IRON_AXE), "iron_axe", IRON_AXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.IRON_HOE), "iron_hoe", IRON_HOE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.IRON_PICKAXE), "iron_pickaxe", IRON_PICKAXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.IRON_SHOVEL), "iron_shovel", IRON_SHOVEL);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.IRON_SWORD), "iron_sword", IRON_SWORD);
        /** 金制工具 */
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.GOLDEN_AXE), "golden_axe", GOLDEN_AXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.GOLDEN_HOE), "golden_hoe", GOLDEN_HOE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.GOLDEN_PICKAXE), "golden_pickaxe", GOLDEN_PICKAXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.GOLDEN_SHOVEL), "golden_shovel", GOLDEN_SHOVEL);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.GOLDEN_SWORD), "golden_sword", GOLDEN_SWORD);
        /** 钻石工具 */
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.DIAMOND_AXE), "diamond_axe", DIAMOND_AXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.DIAMOND_HOE), "diamond_hoe", DIAMOND_HOE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.DIAMOND_PICKAXE), "diamond_pickaxe", DIAMOND_PICKAXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.DIAMOND_SHOVEL), "diamond_shovel", DIAMOND_SHOVEL);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.DIAMOND_SWORD), "diamond_sword", DIAMOND_SWORD);
        /** 下界合金工具 */
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.NETHERITE_AXE), "netherite_axe", NETHERITE_AXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.NETHERITE_HOE), "netherite_hoe", NETHERITE_HOE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.NETHERITE_PICKAXE), "netherite_pickaxe", NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.NETHERITE_SHOVEL), "netherite_shovel", NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.NETHERITE_SWORD), "netherite_sword", NETHERITE_SWORD);

    }

}
