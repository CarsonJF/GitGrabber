package io.carsonjf.gitgrabber;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GitGrabberCommand implements CommandExecutor {

private final GitGrabber plugin;

    public GitGrabberCommand(GitGrabber plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        LanguageManager languageManager = plugin.getLanguageManager();
        // Check if the command sender is a player
        if (!(sender instanceof Player)) {
            sender.sendMessage(languageManager.getMessage("onlyPlayer"));
            return true;
        }

        // Check if the player has the gitgrabber.admin permission
        Player player = (Player) sender;
        if (!player.hasPermission("gitgrabber.admin")) {
            player.sendMessage(languageManager.getMessage("noPermission"));
            return true;
        }

        // Execute command logic
        Component successMessage = languageManager.getMessage("success");
        player.sendMessage(successMessage);

        return true;
    }
}
