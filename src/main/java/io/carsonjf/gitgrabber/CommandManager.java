package io.carsonjf.gitgrabber;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;

public class CommandManager {

    public static void registerCommands(GitGrabber plugin) {
        // Register your existing commands here
        registerCommand("gitgrabber", new GitGrabberCommand(plugin), plugin);
        // Add more commands if needed

        // Register the reload command
        registerCommand("reload", new ReloadCommand(plugin), plugin);
    }

    private static void registerCommand(String commandName, CommandExecutor command, GitGrabber plugin) {
        // Register the command with the given name and executor
        plugin.getCommand(commandName).setExecutor(command);
    }
}
