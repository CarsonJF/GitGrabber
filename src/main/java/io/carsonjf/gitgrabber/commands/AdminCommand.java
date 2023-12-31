package io.carsonjf.gitgrabber.commands;

import io.carsonjf.gitgrabber.GitGrabber;
import io.lumine.mythic.bukkit.utils.commands.Command;
import io.lumine.mythic.bukkit.utils.logging.Log;
import org.bukkit.command.CommandSender;

import io.carsonjf.gitgrabber.managers.CommandManager;
import java.util.List;

import static io.carsonjf.gitgrabber.managers.CommandManager.*;

public class AdminCommand extends Command<GitGrabber> {
    public AdminCommand(GitGrabber plugin) {
        super(plugin);
        this.addSubCommands(
//                new io.carsonjf.gitgrabber.commands.ReloadCommand(this)

        );
    }

    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        Log.info("run command");
        sendHeader(sender);
        sendSuccess(sender, "<green><bold>Command run successfully!");
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        return null;
    }

    @Override
    public String getPermissionNode() {
        return "gitgrabber.admin";
    }

    @Override
    public boolean isConsoleFriendly() {
        return true;
    }

    @Override
    public String getName() {
        return null;
    }
}
