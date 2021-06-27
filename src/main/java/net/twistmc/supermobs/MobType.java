package net.twistmc.supermobs;

import net.twistmc.supermobs.utils.Heads;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public enum MobType {

    CHICKEN("Spawns with enchanted stone tools", EntityType.CHICKEN, Material.CHICKEN_SPAWN_EGG, "&f&lSuper Chicken",
            Heads.getHead("1638469a599ceef7207537603248a9ab11ff591fd378bea4735b346a7fae893")),
    PIG("Drops enchanted porkchops", EntityType.PIG, Material.PIG_SPAWN_EGG, "&d&lSuper Pig",
            Heads.getHead("621668ef7cb79dd9c22ce3d1f3f4cb6e2559893b6df4a469514e667c16aa4"));


    public final String description;
    public final EntityType entityType;
    public final Material spawnEgg;
    public final String spawnName;
    public final ItemStack head;

    MobType(String description, EntityType entityType, Material spawnEgg, String spawnName, ItemStack head) {

        this.description = description;
        this.entityType = entityType;
        this.spawnEgg = spawnEgg;
        this.spawnName = spawnName;
        this.head = head;

    }

}
