package io.carsonjf.gitgrabber;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class GitGrabber extends JavaPlugin {

    private LanguageManager languageManager;

    @Override
    public void onEnable() {
        // Initialize the language manager
        languageManager = new LanguageManager(this);
        languageManager.loadLangConfig();

        // Register commands using the CommandManager
        CommandManager.registerCommands(this);
    }

    // Your existing methods...

    public void reloadPlugin() {
        // Reload configuration files or any other necessary reload logic

        // Example: Reload lang.yml
        languageManager.loadLangConfig();

        // Additional reload logic if needed

        getLogger().log(Level.INFO, "GitGrabber plugin reloaded!");
    }

    public LanguageManager getLanguageManager() {
        return languageManager;
    }
}
