package io.carsonjf.gitgrabber.managers;

import io.carsonjf.gitgrabber.GitGrabber;
import io.lumine.mythic.bukkit.utils.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.Component;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import io.papermc.paper.text.PaperComponents;

import java.io.File;

public class LanguageManager {

    private final GitGrabber plugin;
    private static FileConfiguration langConfig;
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

    public static Component getMessageOutput(String key) {
        String rawMessage = langConfig.getString("messages." + key, "Message not found: " + key);
        return (Component) MiniMessage.miniMessage().deserialize(rawMessage);

    }
}