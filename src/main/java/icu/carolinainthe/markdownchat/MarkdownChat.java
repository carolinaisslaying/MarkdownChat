package icu.carolinainthe.markdownchat;
import org.bukkit.plugin.java.JavaPlugin;

public final class MarkdownChat extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        getLogger().info("Plugin loaded!");
    }

    @Override
    public void onDisable() {

    }
}
