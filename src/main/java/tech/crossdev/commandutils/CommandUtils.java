package tech.crossdev.commandutils;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;

public final class CommandUtils extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        /* Attempt to register the plugin as a listener to bukkit events. */
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        // TODO: Implement shutdown logic (lmao)
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {

    }
}
