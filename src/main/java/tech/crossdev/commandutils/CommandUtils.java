package tech.crossdev.commandutils;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class CommandUtils extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        super.onEnable();

        // Drop a startup message
        this.getLogger().log(Level.INFO, "CommandUtils has been loaded.");

        // TODO: Implement update checking...

        /* Attempt to register the plugin as a listener to bukkit events. */
        Bukkit.getPluginManager().registerEvents(this, this);

        /* Setup the delegating of commands */
        getCommand("multiexecute").setExecutor(new MultiExecuteCommand());
    }

    @Override
    public void onDisable()  { super.onDisable(); } // Simple shutdown logic

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {

    }
}
