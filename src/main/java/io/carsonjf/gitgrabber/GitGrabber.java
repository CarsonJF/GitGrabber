package io.carsonjf.gitgrabber;

import io.carsonjf.gitgrabber.commands.AdminCommand;
import io.carsonjf.gitgrabber.managers.CommandManager;
import io.carsonjf.gitgrabber.managers.LanguageManager;
import io.lumine.mythic.bukkit.utils.logging.Log;
import io.lumine.mythic.bukkit.utils.plugin.LuminePlugin;
import lombok.Getter;


public class GitGrabber extends LuminePlugin {

    protected static GitGrabber plugin;

    @Getter
    protected CommandManager commandManager;

    public static GitGrabber inst() {
        return plugin;
    }
    @Override
    public void enable() {

        this.registerCommand("gitgrabber", new AdminCommand(this));
        LanguageManager.loadLangConfig();

    }

    public void Disable() {

    }
    @Override
    public void load() {
        Log.good("Plugin Loaded");
    }
}
