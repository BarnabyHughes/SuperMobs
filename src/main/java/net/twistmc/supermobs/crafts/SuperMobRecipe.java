package net.twistmc.supermobs.crafts;

import lombok.Getter;
import net.twistmc.supermobs.SuperMobs;
import net.twistmc.supermobs.utils.Strings;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class SuperMobRecipe {

    @Getter
    private static ShapedRecipe recipe;

    public static void registerRecipe() {
        System.out.println("hhsuh");

        ItemStack i = new ItemStack(Material.SPAWNER);
        ItemMeta meta = i.getItemMeta();
        assert meta != null;

        meta.setDisplayName("Spawner");
        i.setItemMeta(meta);
        NamespacedKey key = new NamespacedKey(SuperMobs.getInstance(), "newSpawnerRecipe");

        recipe = new ShapedRecipe(key, i);
        recipe.shape("CCC", "CSC", "CCC");
        recipe.setIngredient('C', Material.COAL_ORE);
        recipe.setIngredient('S', Material.GOLD_INGOT);

        if (Bukkit.getRecipe(key) == null) Bukkit.addRecipe(recipe);
    }


}
