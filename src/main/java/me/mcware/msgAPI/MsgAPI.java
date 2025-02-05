package me.mcware.msgAPI;

import org.bukkit.ChatColor;

public final class MsgAPI {
    private MsgAPI() {
        // Private constructor to prevent instantiation
    }

    /**
     * Translates '&' color codes in a string
     * @param text The text to translate
     * @return Translated text with color codes
     */
    public static String translate(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}