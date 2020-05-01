package de.lx.entityhealthbar.listeners;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import de.lx.entityhealthbar.tags.EntityHealthTag;
import de.lx.entitytags.EntityTagsPlugin;
import de.lx.entitytags.api.EntityTags;

public class EntityDamageListener implements Listener {

    private final EntityTagsPlugin entityTagsPlugin;

    public EntityDamageListener(EntityTagsPlugin entityTagsPlugin) {
        this.entityTagsPlugin = entityTagsPlugin;
    }

    @EventHandler
    private void onEntityDamage(EntityDamageEvent event) {
        if (!(event.getEntity() instanceof LivingEntity))
            return;

        LivingEntity livingEntity = (LivingEntity) event.getEntity();

        EntityTags tags = this.entityTagsPlugin.ofEntity(livingEntity);
        tags.addTag(new EntityHealthTag(livingEntity));
    }

}