package com.runninplugins.runninperms.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Group {

    private List<String> permissions = new ArrayList<>();
    private String prefix;

    public Group(List<String> permissions, String prefix){
        this.permissions = permissions;
        this.prefix = prefix;

    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
