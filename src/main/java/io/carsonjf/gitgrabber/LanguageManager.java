package io.carsonjf.gitgrabber;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.logging.Level;

public class LanguageManager {

    private final GitGrabber plugin;
    private FileConfiguration langConfig;
    private File langFile;

    public LanguageManager(GitGrabber plugin) {
        this.plugin = plugin;
        this.langFile = new File(plugin.getDataFolder(), "lang.yml");
    }

    public FileConfiguration loadLangConfig() {
        if (!langFile.exists()) {
            plugin.saveResource("lang.yml", false);
            plugin.getLogger().info("Created default lang.yml");
        }

        langConfig = YamlConfiguration.loadConfiguration(langFile);
        plugin.getLogger().info("Loaded lang.yml");

        return langConfig;
    }

    public FileConfiguration getLangConfig() {
        return langConfig;
    }

    // Rest of the class...



    public Component getMessage(String key) {
        String rawMessage = langConfig.getString("messages." + key, "Message not found: " + key);
        return MiniMessage.miniMessage().deserialize(rawMessage);

    }
}
