package tech.crossdev.commandutils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Level;

public class MultiExecuteCommand implements CommandExecutor {

    // TODO: Clean this entire function up, it's absolutely horrible.
    // TODO: Also document this relevantly.
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if(strings.length == 0) return false;

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (player.isOp())

            Bukkit.getLogger().log(Level.INFO, "Running all commands");

            for (int i = 0; i < strings.length; i++)
            {
                String[] cmd = strings[i].split("-");

                // TODO: Run commands at the same elevation of the person running it.
                String commandToRun = "";

                for (int j = 0; j < cmd.length; j++) {
                    if(j == 0) commandToRun += cmd[j];
                    else commandToRun += " " + cmd[j];
                }

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), commandToRun);
            }
        }

        return true;
    }

}
