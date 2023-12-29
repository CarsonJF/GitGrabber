package io.carsonjf.gitgrabber;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReloadCommand implements CommandExecutor {

private final GitGrabber plugin;

    public ReloadCommand(GitGrabber plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        LanguageManager languageManager = plugin.getLanguageManager();
        if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            if (sender instanceof Player) {
                // Check if the player has the gitgrabber.admin permission
                Player player = (Player) sender;
                if (!player.hasPermission("gitgrabber.admin")) {
                    player.sendMessage(languageManager.getMessage("noPermission"));
                    return true;
                }
                }
            }

            // Reload the plugin
            plugin.reloadPlugin();
            Component successMessage = languageManager.getMessage("reloaded");
            sender.sendMessage(successMessage);

            return true;
        }
    }
