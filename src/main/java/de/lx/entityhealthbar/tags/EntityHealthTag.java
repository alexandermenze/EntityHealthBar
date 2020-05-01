package de.lx.entityhealthbar.tags;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import de.lx.entitytags.api.EntityTag;

public class EntityHealthTag extends EntityTag {

    private final LivingEntity entity;

    public EntityHealthTag(LivingEntity entity) {
        this.entity = entity;
    }

    @Override
    public String getText(Player player) {
        return "Health: " + entity.getHealth();
    }

    @Override
    public boolean isVisible(Player player) {
        return true;
    }
    
}