package net.twistmc.supermobs.crafts;

import net.twistmc.supermobs.MobType;
import net.twistmc.supermobs.utils.Heads;
import net.twistmc.supermobs.utils.Strings;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;

public class PrepareCraftListener implements Listener {

    @EventHandler
    public void onPrepareCraft(PrepareItemCraftEvent e) {
        if (e.isRepair()) return;
        if (e.getRecipe() == null) return;

        ItemStack[] items = e.getInventory().getMatrix();

        if (e.getRecipe().getResult().getType() == Material.SPAWNER) {

            System.out.println("test");

            MobType type = Arrays.stream(MobType.values()).filter(mobType -> Heads.getSkullFromBase64(mobType.base64).getData() == items[5].getData()).findFirst().orElse(null);

            if (type == null) return;

            ItemStack i = new ItemStack(type.spawnEgg);
            ItemMeta im = i.getItemMeta();
            assert im != null;

            im.setDisplayName(Strings.format(type.spawnName));
            im.setLore(Collections.singletonList(ChatColor.GRAY + type.description));
            i.setItemMeta(im);

            e.getInventory().setResult(i);




        }

    }


}
