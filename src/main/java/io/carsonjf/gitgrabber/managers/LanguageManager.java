package io.carsonjf.gitgrabber.managers;

import io.carsonjf.gitgrabber.GitGrabber;
import io.lumine.mythic.bukkit.utils.adventure.text.Component;
import io.lumine.mythic.bukkit.utils.text.Text;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.*;

public class LanguageManager {

//    private static final GitGrabber plugin = GitGrabber;
    static FileConfiguration langConfig;
    private static GitGrabber plugin = null;
    private static File langFile;


    public LanguageManager(GitGrabber plugin) {
        LanguageManager.plugin = plugin;
        langFile = new File(plugin.getDataFolder(), "lang.yml");
    }

    public static FileConfiguration loadLangConfig() {
        if (!langFile.exists()) {
            plugin.saveResource("lang.yml", false);
            plugin.getLogger().info("Created default lang.yml");
        }

        langConfig = YamlConfiguration.loadConfiguration(langFile);
        plugin.getLogger().info("Loaded lang.yml");

        return langConfig;
    }
    public static Component getMessage(String message){
        String key = langConfig.getString(message);
        if (key == null) {
            key = "<red>INVALID LANG.YML";
        }
        return Text.parse(key);
    }
}