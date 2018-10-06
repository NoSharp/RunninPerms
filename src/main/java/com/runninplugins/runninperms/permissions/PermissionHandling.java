package com.runninplugins.runninperms.permissions;

import com.runninplugins.runninperms.Runninperms;
import com.runninplugins.runninperms.types.Group;
import com.runninplugins.runninperms.types.Player;
import org.bukkit.permissions.PermissionAttachment;

import java.util.ArrayList;
import java.util.List;

public class PermissionHandling {

    private List<Group> groups = new ArrayList<Group>();

    private List<Player> player = new ArrayList<Player>();



    public static void addAttachmentToPlayer(org.bukkit.entity.Player player, String permission){

        PermissionAttachment attachment = player.addAttachment(Runninperms.instance);
        attachment.setPermission(permission, true);

    }

}
