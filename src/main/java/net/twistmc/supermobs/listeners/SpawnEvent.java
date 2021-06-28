package net.twistmc.supermobs.listeners;

import net.twistmc.supermobs.MobType;
import net.twistmc.supermobs.SuperMobs;
import net.twistmc.supermobs.utils.Strings;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SpawnEvent implements Listener {

    @EventHandler
    public void onSpawnEgg(PlayerInteractEvent e) {
        MobType type = SuperMobs.getInstance().getMobFromSpawnEgg(e.getMaterial());
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK && type != null) {
            if (e.getClickedBlock() == null) return;
            e.setCancelled(true);

            Location loc = e.getClickedBlock().getLocation().add(0,1,0);

            assert loc.getWorld() != null;


            Entity entity = loc.getWorld().spawnEntity(loc, type.entityType);
            entity.setCustomName(Strings.format(type.spawnName));

        }

    }

}
