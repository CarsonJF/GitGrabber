package io.carsonjf.gitgrabber;

import io.carsonjf.gitgrabber.commands.AdminCommand;
import io.carsonjf.gitgrabber.managers.CommandManager;
import io.lumine.mythic.bukkit.utils.plugin.LuminePlugin;
import lombok.Getter;


public class GitGrabber extends LuminePlugin {

    protected static GitGrabber plugin;

    @Getter
    protected CommandManager commandManager;

    public static GitGrabber inst() {
        return plugin;
    }
    public void Enable() {

        this.registerCommand("gitgrabber", new AdminCommand(this));
    }

    public void Disable() {

    }

    public void Load() {
    }
}
