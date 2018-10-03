package com.runninplugins.runninperms.listeners;

import com.runninplugins.runninperms.Runninperms;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.PermissionAttachment;

public class OnLoginEvent implements Listener{


    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerLogin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        PermissionAttachment attachment = player.addAttachment(Runninperms.instance);
        attachment.setPermission("", true);


    }

}
