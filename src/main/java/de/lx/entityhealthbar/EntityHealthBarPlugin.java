package de.lx.entityhealthbar;

import org.bukkit.plugin.java.JavaPlugin;

import de.lx.entitytags.EntityTagsPlugin;

public class EntityHealthBarPlugin extends JavaPlugin {

    private static final String ENTITY_TAGS_PLUGIN_NAME = "EntityTags";

    private EntityTagsPlugin entityTagsPlugin;

    @Override
    public void onEnable() {
        this.entityTagsPlugin = (EntityTagsPlugin) this.getServer().getPluginManager().getPlugin(ENTITY_TAGS_PLUGIN_NAME);
    }

    @Override
    public void onDisable() {
        
    }
}