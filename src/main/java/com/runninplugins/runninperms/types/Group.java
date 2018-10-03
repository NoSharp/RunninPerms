package com.runninplugins.runninperms.types;

import java.util.HashSet;

public class Group {

    private HashSet<String> permissions = new HashSet<>();
    private int tier;

    public Group(HashSet<String> permissions, int tier){
        this.permissions = permissions;
        this.tier = tier;

    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public HashSet<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(HashSet<String> permissions) {
        this.permissions = permissions;
    }
}
