package cn.kevyn.kvc.equipment.content.crossbows.patches;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import static cn.kevyn.kvc.equipment.KVCEquipment.CONFIG;
import static cn.kevyn.kvc.equipment.content.KVCGroups.KVC_COMBAT;

public class KVCCrossbowItem extends CrossbowItem {

    private static boolean loadProjectiles(LivingEntity shooter, ItemStack projectile) {
        int i = EnchantmentHelper.getLevel(Enchantments.MULTISHOT, projectile);
        int j = i == 0 ? 1 : 3;
        boolean bl = shooter instanceof PlayerEntity && ((PlayerEntity)shooter).getAbilities().creativeMode;
        ItemStack itemStack = shooter.getArrowType(projectile);
        ItemStack itemStack2 = itemStack.copy();

        for(int k = 0; k < j; ++k) {
            if (k > 0) {
                itemStack = itemStack2.copy();
            }

            if (itemStack.isEmpty() && bl) {
                itemStack = new ItemStack(Items.ARROW);
                itemStack2 = itemStack.copy();
            }

            if (!loadProjectile(shooter, projectile, itemStack, k > 0, bl)) {
                return false;
            }
        }

        return true;
    }

    private static boolean loadProjectile(LivingEntity shooter, ItemStack crossbow, ItemStack projectile, boolean simulated, boolean creative) {
        if (projectile.isEmpty()) {
            return false;
        } else {
            boolean bl = creative && projectile.getItem() instanceof ArrowItem;
            ItemStack itemStack2;
            if (!bl && !creative && !simulated) {
                itemStack2 = projectile.split(1);
                if (projectile.isEmpty() && shooter instanceof PlayerEntity) {
                    ((PlayerEntity)shooter).getInventory().removeOne(projectile);
                }
            } else {
                itemStack2 = projectile.copy();
            }

            putProjectile(crossbow, itemStack2);
            return true;
        }
    }

    private static void putProjectile(ItemStack crossbow, ItemStack projectile) {
        NbtCompound nbtCompound = crossbow.getOrCreateTag();
        NbtList nbtList2;
        if (nbtCompound.contains("ChargedProjectiles", 9)) {
            nbtList2 = nbtCompound.getList("ChargedProjectiles", 10);
        } else {
            nbtList2 = new NbtList();
        }

        NbtCompound nbtCompound2 = new NbtCompound();
        projectile.writeNbt(nbtCompound2);
        nbtList2.add(nbtCompound2);
        nbtCompound.put("ChargedProjectiles", nbtList2);
    }

    private static float getPullProgress(float useTicks, ItemStack stack) {
        float f = (float)useTicks / (float)getPullTime(stack);
        if (f > 1.0F) {
            f = 1.0F;
        }
        return f;
    }

    private String materialName;
    private int durability;
    private float drawingSpeed;
    private int enchantability;
    private Ingredient repairIngredient;

    public KVCCrossbowItem(String materialName, Ingredient repairIngredient) {
        super(new FabricItemSettings().maxDamage((int) CONFIG.getOfType("int", materialName+"-crossbow-durability")).group(materialName.equals("wooden") ? ItemGroup.COMBAT : KVC_COMBAT));
        durability = (int) CONFIG.getOfType("int", materialName+"-crossbow-durability");
        drawingSpeed = (float) CONFIG.getOfType("float", materialName+"-crossbow-drawing-speed");
        enchantability = (int) CONFIG.getOfType("int", materialName+"-crossbow-enchantability");
        this.repairIngredient = repairIngredient;
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        int i = this.getMaxUseTime(stack) - remainingUseTicks;
        float f = getPullProgress(i*getDrawingSpeed(), stack);
        if (f >= 1.0F && !isCharged(stack) && loadProjectiles(user, stack)) {
            setCharged(stack, true);
            SoundCategory soundCategory = user instanceof PlayerEntity ? SoundCategory.PLAYERS : SoundCategory.HOSTILE;
            world.playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_CROSSBOW_LOADING_END, soundCategory, 1.0F, 1.0F / (world.getRandom().nextFloat() * 0.5F + 1.0F) + 0.2F);
        }
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        int buff = EnchantmentHelper.getLevel(Enchantments.QUICK_CHARGE, stack);
        int time = (int)(25 / getDrawingSpeed()) + 3;
        time = buff == 0 ? time : time - 5 * buff;
        return time > 0 ? time : 0;
    }

    public String getMaterialName() {
        return materialName;
    }

    public int getDurability() {
        return durability;
    }

    public float getDrawingSpeed() {
        return drawingSpeed;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }
}
