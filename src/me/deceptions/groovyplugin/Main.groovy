package me.deceptions.groovyplugin

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main extends JavaPlugin implements Listener {

    /*
    I'm just testing out new languages.
    Just ignore the projects that are made in random languages.
     */


    void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer()
        p.sendMessage(col("&7Hi, your name is &c" + p.getName()))
    }

    String col(String text) {
        return ChatColor.translateAlternateColorCodes('&', text)
    }

}