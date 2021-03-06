package net.newtownia.NTAC.Utils;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vinc0682 on 21.03.2016.
 */
public class MaterialUtils
{
    private static List<Material> swords;
    private static List<Material> foods;
    private static List<Material> slowWeapons;
    private static List<Material> unsolidMaterials = Arrays.asList(Material.AIR, Material.SIGN, Material.SIGN_POST,
            Material.TRIPWIRE, Material.TRIPWIRE_HOOK, Material.SUGAR_CANE_BLOCK, Material.LONG_GRASS, Material.FLOWER_POT,
            Material.YELLOW_FLOWER);
    private static List<Material> stepableMaterials = Arrays.asList(Material.STEP, Material.ACACIA_STAIRS, Material.BIRCH_WOOD_STAIRS,
            Material.BIRCH_WOOD_STAIRS, Material.BRICK_STAIRS, Material.COBBLESTONE_STAIRS, Material.DARK_OAK_STAIRS,
            Material.JUNGLE_WOOD_STAIRS, Material.NETHER_BRICK_STAIRS, Material.PURPUR_STAIRS, Material.QUARTZ_STAIRS,
            Material.RED_SANDSTONE_STAIRS, Material.SANDSTONE_STAIRS, Material.SMOOTH_STAIRS, Material.SPRUCE_WOOD_STAIRS,
            Material.WOOD_STAIRS, Material.STONE_SLAB2, Material.PURPUR_SLAB);

    public static List<Material> getSwords()
    {
        if (swords == null)
        {
            swords = new ArrayList<>();
            swords.add(Material.WOOD_SWORD);
            swords.add(Material.GOLD_SWORD);
            swords.add(Material.STONE_SWORD);
            swords.add(Material.IRON_SWORD);
            swords.add(Material.DIAMOND_SWORD);
        }
        return swords;
    }

    public static boolean isSword(Material m) { return getSwords().contains(m); }
    public static boolean isSword(ItemStack stack)
    {
        if (stack == null)
            return false;
        return isSword(stack.getType());
    }

    public static List<Material> getFoods()
    {
        if (foods == null)
        {
            foods = new ArrayList<>();
            foods.add(Material.APPLE);
            foods.add(Material.BREAD);
            foods.add(Material.PORK);
            foods.add(Material.GRILLED_PORK);
            foods.add(Material.GOLDEN_APPLE);
            foods.add(Material.RAW_FISH);
            foods.add(Material.COOKED_FISH);
            foods.add(Material.COOKIE);
            foods.add(Material.MELON);
            foods.add(Material.RAW_BEEF);
            foods.add(Material.COOKED_BEEF);
            foods.add(Material.RAW_CHICKEN);
            foods.add(Material.COOKED_CHICKEN);
            foods.add(Material.ROTTEN_FLESH);
            foods.add(Material.SPIDER_EYE);
            foods.add(Material.CARROT_ITEM);
            foods.add(Material.POTATO_ITEM);
            foods.add(Material.BAKED_POTATO);
            foods.add(Material.POISONOUS_POTATO);
            foods.add(Material.PUMPKIN_PIE);
            foods.add(Material.RABBIT);
            foods.add(Material.COOKED_RABBIT);
            foods.add(Material.RABBIT_STEW);
            foods.add(Material.MUTTON);
            foods.add(Material.COOKED_MUTTON);
        }
        return foods;
    }

    public static boolean isFood(Material m)
    {
        return getFoods().contains(m);
    }
    public static boolean isFood(ItemStack stack)
    {
        if (stack == null)
            return false;
        return isFood(stack.getType());
    }

    public static boolean isUsable(Material m)
    {
        if (isSword(m))
            return true;
        if (isFood(m))
            return true;
        if (m == Material.BOW)
            return true;
        return false;
    }
    public static boolean isUsable(ItemStack stack)
    {
        if (stack == null)
            return false;
        return isUsable(stack.getType());
    }

    public static List<Material> getSlowWeapons()
    {
        if (slowWeapons == null)
        {
            slowWeapons = new ArrayList<>();
            slowWeapons.add(Material.WOOD_AXE);
            slowWeapons.add(Material.GOLD_AXE);
            slowWeapons.add(Material.STONE_AXE);
            slowWeapons.add(Material.IRON_AXE);
            slowWeapons.add(Material.DIAMOND_AXE);

            slowWeapons.add(Material.WOOD_SPADE);
            slowWeapons.add(Material.GOLD_SPADE);
            slowWeapons.add(Material.STONE_SPADE);
            slowWeapons.add(Material.IRON_SPADE);
            slowWeapons.add(Material.DIAMOND_SPADE);

            slowWeapons.add(Material.WOOD_PICKAXE);
            slowWeapons.add(Material.GOLD_PICKAXE);
            slowWeapons.add(Material.STONE_PICKAXE);
            slowWeapons.add(Material.IRON_PICKAXE);
            slowWeapons.add(Material.DIAMOND_PICKAXE);

            slowWeapons.add(Material.WOOD_HOE);
            slowWeapons.add(Material.GOLD_HOE);
            slowWeapons.add(Material.STONE_HOE);
            slowWeapons.add(Material.IRON_HOE);
            slowWeapons.add(Material.DIAMOND_HOE);
        }
        return slowWeapons;
    }
    public static boolean isSlowWeapon(Material m)
    {
        return getSlowWeapons().contains(m);
    }
    public static boolean isSlowWeapon(ItemStack stack)
    {
        return stack != null && isSlowWeapon(stack.getType());
    }

    public static List<Material> getUnsolidMaterials() {
        return unsolidMaterials;
    }
    public static boolean isUnsolid(Material m)
    {
        return getUnsolidMaterials().contains(m);
    }
    public static boolean isUnsolid(Block b)
    {
        return isUnsolid(b.getType());
    }

    public static List<Material> getStepableMaterials() {
        return stepableMaterials;
    }
    public static boolean isStepable(Material m)
    {
        return getStepableMaterials().contains(m);
    }
    public static boolean isStepable(Block b)
    {
        return isStepable(b.getType());
    }
}
