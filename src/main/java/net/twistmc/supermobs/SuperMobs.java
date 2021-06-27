package net.twistmc.supermobs;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class SuperMobs extends JavaPlugin {

    @Getter private static SuperMobs instance;


    @Override
    public void onEnable() {
        instance = this;
    }

    public MobType getMobFromSpawnEgg(Material m) {
        return Arrays.stream(MobType.values()).filter(mobType -> m == mobType.spawnEgg).findFirst().orElse(null);
    }

    public MobType getMobTypeFromEntity(EntityType type) {
        return Arrays.stream(MobType.values()).filter(mobType -> type == mobType.entityType).findFirst().orElse(null);
    }
}
