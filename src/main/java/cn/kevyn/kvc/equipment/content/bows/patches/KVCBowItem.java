package cn.kevyn.kvc.equipment.content.bows.patches;

import cn.kevyn.kvc.equipment.KVCEquipment;
import cn.kevyn.kvc.equipment.content.KVCGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;


public class KVCBowItem extends BowItem {

    public static float getPullProgress(float useTicks) {
        float f = useTicks / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
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

    public KVCBowItem(String materialName, Ingredient repairIngredient) {
        super(new FabricItemSettings().maxDamage((int) KVCEquipment.CONFIG.getOfType("int", materialName+"-bow-durability")).group(materialName.equals("wooden") ? ItemGroup.COMBAT : KVCGroups.KVC_COMBAT));
        durability = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-bow-durability");
        drawingSpeed = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-bow-drawing-speed");
        enchantability = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-bow-enchantability");
        this.repairIngredient = repairIngredient;
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (user instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)user;
            boolean bl = playerEntity.getAbilities().creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0;
            ItemStack itemStack = playerEntity.getArrowType(stack);
            if (!itemStack.isEmpty() || bl) {
                if (itemStack.isEmpty()) {
                    itemStack = new ItemStack(Items.ARROW);
                }

                int i = this.getMaxUseTime(stack) - remainingUseTicks;
                float f = getPullProgress(i*getDrawingSpeed());
                if (!((double)f < 0.1D)) {
                    boolean bl2 = bl && itemStack.isOf(Items.ARROW);
                    if (!world.isClient) {
                        ArrowItem arrowItem = (ArrowItem)(itemStack.getItem() instanceof ArrowItem ? itemStack.getItem() : Items.ARROW);
                        PersistentProjectileEntity persistentProjectileEntity = arrowItem.createArrow(world, itemStack, playerEntity);
                        persistentProjectileEntity.setProperties(playerEntity, playerEntity.getPitch(), playerEntity.getYaw(), 0.0F, f * 3.0F, 1.0F);
                        if (f == 1.0F) {
                            persistentProjectileEntity.setCritical(true);
                        }

                        checkEnchantPower(persistentProjectileEntity, stack);
                        checkEnchantPunch(persistentProjectileEntity, stack);
                        checkEnchantFlame(persistentProjectileEntity, stack);

                        stack.damage(1, playerEntity, (p) -> {
                            p.sendToolBreakStatus(playerEntity.getActiveHand());
                        });

                        if (bl2 || playerEntity.getAbilities().creativeMode && (itemStack.isOf(Items.SPECTRAL_ARROW) || itemStack.isOf(Items.TIPPED_ARROW))) {
                            persistentProjectileEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                        }

                        world.spawnEntity(persistentProjectileEntity);
                    }

                    world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F / (world.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F);
                    if (!bl2 && !playerEntity.getAbilities().creativeMode) {
                        itemStack.decrement(1);
                        if (itemStack.isEmpty()) {
                            playerEntity.getInventory().removeOne(itemStack);
                        }
                    }

                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
                }
            }
        }
    }

    public void checkEnchantPower(PersistentProjectileEntity persistentProjectileEntity, ItemStack stack) {
        int value = EnchantmentHelper.getLevel(Enchantments.POWER, stack);
        if (value > 0) {
            persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() + (double)value * 0.5D + 0.5D);
        }
    }

    public void checkEnchantPunch(PersistentProjectileEntity persistentProjectileEntity, ItemStack stack) {
        int value = EnchantmentHelper.getLevel(Enchantments.PUNCH, stack);
        if (value > 0) {
            persistentProjectileEntity.setPunch(value);
        }
    }

    public void checkEnchantFlame(PersistentProjectileEntity persistentProjectileEntity, ItemStack stack) {
        if (EnchantmentHelper.getLevel(Enchantments.FLAME, stack) > 0) {
            persistentProjectileEntity.setOnFireFor(100);
        }
    }

    public String getMaterialName() {
        return materialName;
    }

    public int getDurability() {
        return durability;
    }

    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }

    public float getDrawingSpeed() {
        return drawingSpeed;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        if (Ingredient.ofItems(ingredient.getItem()) == getRepairIngredient())
            return true;
        return false;
    }

}
