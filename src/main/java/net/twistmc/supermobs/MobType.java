package net.twistmc.supermobs;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;

public enum MobType {

    CHICKEN("Spawns with enchanted stone tools", EntityType.CHICKEN, Material.CHICKEN_SPAWN_EGG, "&f&lSuper Chicken",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTYzODQ2OWE1OTljZWVmNzIwNzUzNzYwMzI0OGE5YWIxMWZmNTkxZmQzNzhiZWE0NzM1YjM0NmE3ZmFlODkzIn19fQ=="),
    PIG("Drops enchanted porkchops", EntityType.PIG, Material.PIG_SPAWN_EGG, "&d&lSuper Pig",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIxNjY4ZWY3Y2I3OWRkOWMyMmNlM2QxZjNmNGNiNmUyNTU5ODkzYjZkZjRhNDY5NTE0ZTY2N2MxNmFhNCJ9fX0=");


    public final String description;
    public final EntityType entityType;
    public final Material spawnEgg;
    public final String spawnName;
    public final String base64;

    MobType(String description, EntityType entityType, Material spawnEgg, String spawnName, String base64) {

        this.description = description;
        this.entityType = entityType;
        this.spawnEgg = spawnEgg;
        this.spawnName = spawnName;
        this.base64 = base64;

    }

}
