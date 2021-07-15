package cn.kevyn.kvc.equipment.content.tools;

import cn.kevyn.kvc.equipment.content.tools.patches.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static cn.kevyn.kvc.equipment.content.KVCGroups.KVC_COMBAT;
import static cn.kevyn.kvc.equipment.content.KVCGroups.KVC_TOOLS;

public class KVCTools {

    /** 绿宝石工具 */
    public static final KVCToolMaterial EMERALD_TOOL_MATERIAL = new KVCToolMaterial("emerald", Ingredient.ofItems(Items.EMERALD));
    public static final Item EMERALD_AXE = new KVCAxeItem(EMERALD_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item EMERALD_HOE = new KVCHoeItem(EMERALD_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item EMERALD_PICKAXE = new KVCPickaxeItem(EMERALD_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item EMERALD_SHOVEL = new KVCShovelItem(EMERALD_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item EMERALD_SWORD = new KVCSwordItem(EMERALD_TOOL_MATERIAL, new FabricItemSettings().group(KVC_COMBAT));
    /** 红石工具 */
    public static final KVCToolMaterial REDSTONE_TOOL_MATERIAL = new KVCToolMaterial("redstone", Ingredient.ofItems(Items.REDSTONE));
    public static final Item REDSTONE_AXE = new KVCAxeItem(REDSTONE_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item REDSTONE_HOE = new KVCHoeItem(REDSTONE_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item REDSTONE_PICKAXE = new KVCPickaxeItem(REDSTONE_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item REDSTONE_SHOVEL = new KVCShovelItem(REDSTONE_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item REDSTONE_SWORD = new KVCSwordItem(REDSTONE_TOOL_MATERIAL, new FabricItemSettings().group(KVC_COMBAT));
    /** 青金石工具 */
    public static final KVCToolMaterial LAPIS_TOOL_MATERIAL = new KVCToolMaterial("lapis", Ingredient.ofItems(Items.LAPIS_LAZULI));
    public static final Item LAPIS_AXE = new KVCAxeItem(LAPIS_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item LAPIS_HOE = new KVCHoeItem(LAPIS_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item LAPIS_PICKAXE = new KVCPickaxeItem(LAPIS_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item LAPIS_SHOVEL = new KVCShovelItem(LAPIS_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item LAPIS_SWORD = new KVCSwordItem(LAPIS_TOOL_MATERIAL, new FabricItemSettings().group(KVC_COMBAT));
    /** 铜工具 */
    public static final KVCToolMaterial COPPER_TOOL_MATERIAL = new KVCToolMaterial("copper", Ingredient.ofItems(Items.COPPER_INGOT));
    public static final Item COPPER_AXE = new KVCAxeItem(COPPER_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item COPPER_HOE = new KVCHoeItem(COPPER_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item COPPER_PICKAXE = new KVCPickaxeItem(COPPER_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item COPPER_SHOVEL = new KVCShovelItem(COPPER_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item COPPER_SWORD = new KVCSwordItem(COPPER_TOOL_MATERIAL, new FabricItemSettings().group(KVC_COMBAT));
    /** 紫水晶工具 */
    public static final KVCToolMaterial AMETHYST_TOOL_MATERIAL = new KVCToolMaterial("amethyst", Ingredient.ofItems(Items.AMETHYST_SHARD));
    public static final Item AMETHYST_AXE = new KVCAxeItem(AMETHYST_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item AMETHYST_HOE = new KVCHoeItem(AMETHYST_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item AMETHYST_PICKAXE = new KVCPickaxeItem(AMETHYST_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item AMETHYST_SHOVEL = new KVCShovelItem(AMETHYST_TOOL_MATERIAL, new FabricItemSettings().group(KVC_TOOLS));
    public static final Item AMETHYST_SWORD = new KVCSwordItem(AMETHYST_TOOL_MATERIAL, new FabricItemSettings().group(KVC_COMBAT));


    public static void doRegister() {

        /** 绿宝石工具 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_shovel"), EMERALD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_pickaxe"), EMERALD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_axe"), EMERALD_AXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_hoe"), EMERALD_HOE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_sword"), EMERALD_SWORD);
        /** 红石工具 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_shovel"), REDSTONE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_pickaxe"), REDSTONE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_axe"), REDSTONE_AXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_hoe"), REDSTONE_HOE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_sword"), REDSTONE_SWORD);
        /** 青金石工具 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_shovel"), LAPIS_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_pickaxe"), LAPIS_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_axe"), LAPIS_AXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_hoe"), LAPIS_HOE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_sword"), LAPIS_SWORD);
        /** 铜工具 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_hoe"), COPPER_HOE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_sword"), COPPER_SWORD);
        /** 紫水晶工具 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_shovel"), AMETHYST_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_pickaxe"), AMETHYST_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_axe"), AMETHYST_AXE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_hoe"), AMETHYST_HOE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_sword"), AMETHYST_SWORD);

    }

}
