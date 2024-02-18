package tech.crossdev.commandutils;

import org.bukkit.Bukkit;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;

public class VersionCheck {

    public static void Check(String versionToCheckAgainst)
    {

        /* https://www.spigotmc.org/threads/get-string-from-web-server.138980/ */

        try {
            URL url = new URL("https://raw.githubusercontent.com/Crosstownauto/CommandUtils/master/src/version");
            Scanner s = new Scanner(url.openStream());
            if(Objects.equals(s.nextLine(), versionToCheckAgainst)){
                Bukkit.getLogger().log(Level.INFO, "[CommandUtils] Version " + versionToCheckAgainst + " Loaded.");
            }else{
                Bukkit.getLogger().log(Level.WARNING, "[CommandUtils] You have a new update available");
            }
        }
        catch(IOException ex) {
            Bukkit.getLogger().log(Level.WARNING, "[CommandUtils] Encountered an error when attempting to check plugin version. \n " + ex.getMessage());
        }
    }
}
