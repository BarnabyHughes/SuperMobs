package net.twistmc.supermobs;

import lombok.Getter;
import net.twistmc.supermobs.crafts.PrepareCraftListener;
import net.twistmc.supermobs.crafts.SuperMobRecipe;
import net.twistmc.supermobs.listeners.EntityKillEvent;
import net.twistmc.supermobs.listeners.SpawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class SuperMobs extends JavaPlugin {

    @Getter private static SuperMobs instance;


    @Override
    public void onEnable() {
        instance = this;

        registerListeners();

        SuperMobRecipe.registerRecipe();
    }

    public MobType getMobFromSpawnEgg(Material m) {
        return Arrays.stream(MobType.values()).filter(mobType -> m == mobType.spawnEgg).findFirst().orElse(null);
    }

    public MobType getMobTypeFromEntity(EntityType type) {
        return Arrays.stream(MobType.values()).filter(mobType -> type == mobType.entityType).findFirst().orElse(null);
    }

    public void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new EntityKillEvent(), this);
        pm.registerEvents(new SpawnEvent(), this);
        pm.registerEvents(new PrepareCraftListener(), this);

    }

}
