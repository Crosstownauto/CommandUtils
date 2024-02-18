package tech.crossdev.commandutils;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandUtils extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        super.onEnable();

        // Get current version
        VersionCheck.Check(this.getPluginMeta().getVersion());

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
