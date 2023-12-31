package io.carsonjf.gitgrabber.managers;

import io.lumine.mythic.bukkit.utils.adventure.text.Component;
import io.lumine.mythic.bukkit.utils.text.Text;
import org.bukkit.command.CommandSender;

import static io.carsonjf.gitgrabber.managers.LanguageManager.langConfig;

public class CommandManager {


    public static final Component COMMAND_HEADER = LanguageManager.getMessage("header");
    public static final Component COMMAND_PREFIX = LanguageManager.getMessage("prefix");
    public static final Component COMMAND_FOOTER = LanguageManager.getMessage("footer");

    public static final Component COMMAND_SUCCESS = LanguageManager.getMessage("success");
    public static void sendHeader(CommandSender sender)	{
        Text.sendMessage(sender, COMMAND_HEADER);
    }

    public static void sendFooter(CommandSender sender)    {
        Text.sendMessage(sender, COMMAND_FOOTER);
    }

    public static void send(CommandSender sender, String message)    {
        Text.sendMessage(sender, Text.parse("<white>" + message));
    }

    public static void sendSuccess(CommandSender sender, String message)	{
        Text.sendMessage(sender, COMMAND_PREFIX.append(Text.parse("<green>" + message)));
    }

    public static void sendError(CommandSender sender, String message)	{
        Text.sendMessage(sender, COMMAND_PREFIX.append(Text.parse("<red>" + message)));
    }

    public static void sendCommandMessage(CommandSender player, String[]... args) {
        sendHeader(player);
        player.sendMessage(" ");
        for(String[] s : args) {
            for(String ss : s) {
                Text.sendMessage(player, ss);
            }
        }
        player.sendMessage(" ");
        sendFooter(player);
    }

    public static void sendCommandMessage(CommandSender player, Component[]... args) {
        sendHeader(player);
        player.sendMessage(" ");
        for(Component[] s : args) {
            for(Component ss : s) {
                Text.sendMessage(player, ss);
            }
        }
        player.sendMessage(" ");
        sendFooter(player);
    }

    public static void sendEditorMessage(CommandSender player, String... args) {
        sendHeader(player);
        for(String ss : args) {
            Text.sendMessage(player, COMMAND_PREFIX.append(Text.parse("<white>" + ss)));
        }
    }

    private CommandManager() {}
}
