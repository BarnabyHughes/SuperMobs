package net.twistmc.supermobs.listeners;

import net.twistmc.supermobs.MobType;
import net.twistmc.supermobs.SuperMobs;
import net.twistmc.supermobs.utils.Heads;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class EntityKillEvent implements Listener {

    @EventHandler
    public void onKill(EntityDeathEvent e) {
        MobType type = SuperMobs.getInstance().getMobTypeFromEntity(e.getEntityType());
        if (e.getEntity().getKiller() != null && type != null) {

            List<ItemStack> drops = e.getDrops();

            drops.clear();
            drops.add(Heads.getSkullFromBase64(type.base64));



        }
    }
}
