package com.runninplugins.runninperms;

import com.runninplugins.runninperms.listeners.OnLoginEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class Runninperms extends JavaPlugin {

    public static JavaPlugin instance;
    public static HashMap<UUID, PermissionAttachment> permissions = new HashMap<UUID, PermissionAttachment>();

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new OnLoginEvent(), this);

        for (Player player: Bukkit.getServer().getOnlinePlayers()){

            PermissionAttachment attachment = player.addAttachment(Runninperms.instance);
            attachment.setPermission("essentials.help", true);



        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
