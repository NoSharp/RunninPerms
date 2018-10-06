package com.runninplugins.runninperms.types;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Player {

    private UUID uuid;
    private List<String> permissions;

    public Player(UUID uuid, ArrayList<String> permissions){
        this.uuid = uuid;
        this.permissions = permissions;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
