package com.runninplugins.runninperms;

import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class Runninperms extends JavaPlugin {

    public static JavaPlugin instance = new Runninperms();
    public static HashMap<UUID, PermissionAttachment> permisssions = new HashMap<UUID, PermissionAttachment>();

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
