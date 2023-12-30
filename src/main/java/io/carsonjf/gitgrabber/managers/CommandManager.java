package io.carsonjf.gitgrabber.managers;

import io.carsonjf.gitgrabber.GitGrabber;
import io.carsonjf.gitgrabber.commands.AdminCommand;
import org.bukkit.command.CommandSender;

public class CommandManager {

    public static void sendCommandMessage(CommandSender player, String[] args) {
//        player.sendMessage(Text.colorize("&8&m----------=====&5&l Lumine&d&lCore &8&m=====----------"));
//        player.sendMessage(" ");
//        player.sendMessage(args);
//        player.sendMessage(" ");
//        player.sendMessage(Text.colorize("&8&m-----------------------------------------"));
    }

    public static void sendCommandMessage(CommandSender player, String[]... args) {
//        player.sendMessage(Text.colorize("&8&m----------=====&5&l Lumine&d&lCore &8&m=====----------"));
//        player.sendMessage(" ");
//        String[][] var2 = args;
//        int var3 = args.length;
//
//        for(int var4 = 0; var4 < var3; ++var4) {
//            String[] arg = var2[var4];
//            player.sendMessage(arg);
//        }
//
//        player.sendMessage(" ");
//        player.sendMessage(Text.colorize("&8&m-----------------------------------------"));
    }

    public static void sendSuccess(CommandSender sender, String message) {
       LanguageManager.getMessageOutput("header");
       LanguageManager.getMessageOutput("prefix" + "success");
       LanguageManager.getMessageOutput("footer");
    }

    public static void sendError(CommandSender sender, String message) {
    }

    public static void sendCommandHeader(CommandSender player) {
    }

    public static void sendCommandFooter(CommandSender player) {
    }
}
