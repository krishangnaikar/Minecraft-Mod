package com.kaupenjoe.mccourse.item;

import com.kaupenjoe.mccourse.MCCourseMod;
import com.kaupenjoe.mccourse.block.ModBlocks;
import com.kaupenjoe.mccourse.util.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> HARCADUIM =
            Registration.ITEMS.register("harcaduim",
                    () -> new Item(new Item.Properties().group(MCCourseMod.HARCADUIM)));
    public static final RegistryObject<Item> HARCADUIM_WIRE =
            Registration.ITEMS.register("harcaduim_wire",
                    () -> new Item(new Item.Properties().group(MCCourseMod.HARCADUIM)));

    public static final RegistryObject HARCADUIM_APPLE =
            Registration.ITEMS.register("harcaduim_apple",
                    () -> new HarcaduimApple());

    public static final RegistryObject<Item> LIGHTNING_BOLT =
            Registration.ITEMS.register("lightning_bolt",
                    () -> new Item(new Item.Properties().group(MCCourseMod.HARCADUIM)));

    public static final RegistryObject<Item> CORUPTED_HARCADUIM =
            Registration.ITEMS.register("corupted_harcaduim",
                    () -> new Item(new Item.Properties().group(MCCourseMod.HARCADUIM)));


    // Tools

    public static final RegistryObject<Item> HARCADUIM_SHOVEL =
            Registration.ITEMS.register("harcaduim_shovel",
                    () -> new ShovelItem(ModItemTier.HARCADUIM, 5f, 1f,
                            new Item.Properties()
                                    .defaultMaxDamage(10000)
                                    .addToolType(ToolType.SHOVEL, 10)
                                    .group(MCCourseMod.HARCADUIM)));

    public static final RegistryObject<Item> HARCADUIM_SWORD =
            Registration.ITEMS.register("harcaduim_sword",
                    () -> new SwordItem(ModItemTier.HARCADUIM, 100, 100f,
                            new Item.Properties()
                                    .defaultMaxDamage(10000)
                                    .group(MCCourseMod.HARCADUIM)));

    public static final RegistryObject<Item> HARCADUIM_PICKAXE =
            Registration.ITEMS.register("harcaduim_pickaxe",
                    () -> new PickaxeItem(ModItemTier.HARCADUIM, 5, 1f,
                            new Item.Properties()
                                    .defaultMaxDamage(10000)
                                    .addToolType(ToolType.PICKAXE, 10)
                                    .group(MCCourseMod.HARCADUIM)));

    public static final RegistryObject<Item> HARCADUIM_AXE =
            Registration.ITEMS.register("harcaduim_axe",
                    () -> new AxeItem(ModItemTier.HARCADUIM, 100f, 100f,
                            new Item.Properties()
                                    .defaultMaxDamage(10000)
                                    .addToolType(ToolType.AXE, 10)
                                    .group(MCCourseMod.HARCADUIM)));

    // ARMOUR

    public static final RegistryObject<Item> HARCADUIM_HELMET =
            Registration.ITEMS.register("harcaduim_helmet",
            () -> new ArmorItem(ModArmourMaterial.HARCADUIM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(MCCourseMod.HARCADUIM)));
    public static final RegistryObject<Item> HARCADUIM_CHESTPLATE =
            Registration.ITEMS.register("harcaduim_chestplate",
                    () -> new ArmorItem(ModArmourMaterial.HARCADUIM, EquipmentSlotType.CHEST,
                            new Item.Properties().group(MCCourseMod.HARCADUIM)));
    public static final RegistryObject<Item> HARCADUIM_LEGGINGS =
            Registration.ITEMS.register("harcaduim_leggings",
                    () -> new ArmorItem(ModArmourMaterial.HARCADUIM, EquipmentSlotType.LEGS,
                            new Item.Properties().group(MCCourseMod.HARCADUIM)));
    public static final RegistryObject<Item> HARCADUIM_BOOTS =
            Registration.ITEMS.register("harcaduim_boots",
                    () -> new ArmorItem(ModArmourMaterial.HARCADUIM, EquipmentSlotType.FEET,
                            new Item.Properties().group(MCCourseMod.HARCADUIM)));




    public static void register() {

    }

    public enum ModArmourMaterial implements IArmorMaterial {
        HARCADUIM(10000, new int[] { 5000, 10000, 10000, 2000 }, 100, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                Ingredient.fromStacks(new ItemStack(ModItems.CORUPTED_HARCADUIM.get())),
                MCCourseMod.MOD_ID + ":harcaduim", 100, 100f);

        private final int durability;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final  Ingredient repairMaterial;
        private final String name;
        private final float toughness;
        private final float knockbackResistance;

        ModArmourMaterial(int durability, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
            this.durability = durability;
            this.damageReductionAmountArray = damageReductionAmountArray;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.repairMaterial = repairMaterial;
            this.name = name;
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
        }

        @Override
        public int getDurability(EquipmentSlotType equipmentSlotType) {
            return durability;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType equipmentSlotType) {
            return damageReductionAmountArray[equipmentSlotType.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public float getToughness() {
            return toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return knockbackResistance;
        }
    }

    public enum ModItemTier implements IItemTier {


        HARCADUIM(10, 10000, 100f, 100f, 100,
                Ingredient.fromStacks(new ItemStack(ModItems.HARCADUIM.get())));

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getMaxUses() {
            return maxUses;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }
    }







}
