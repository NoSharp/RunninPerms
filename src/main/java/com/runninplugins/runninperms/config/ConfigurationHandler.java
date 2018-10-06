package com.runninplugins.runninperms.config;

import com.runninplugins.runninperms.Runninperms;
import com.runninplugins.runninperms.permissions.PermissionHandling;
import com.runninplugins.runninperms.types.Group;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.yaml.snakeyaml.Yaml;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Map;


public class ConfigurationHandler {

    public List<Group> groups = new ArrayList<Group>();
    public List<Player> players = new ArrayList<Player>();

    private YamlConfiguration groupPermissions;
    private YamlConfiguration playerPermissions;

    private String dataPath;


    public ConfigurationHandler(){
        this.dataPath = Runninperms.instance.getDataFolder().getAbsolutePath();
        this.dataPath = this.dataPath + File.separator + "permissions";

    }

    public void initialize(){

        YamlConfiguration playerPermissions = YamlConfiguration.loadConfiguration(
                new File(this.dataPath + File.separator + "players.yml"));
        YamlConfiguration groupPermissions = YamlConfiguration.loadConfiguration(
                new File(this.dataPath+ File.separator + "groups.yml"));

        this.playerPermissions = playerPermissions;
        this.groupPermissions = groupPermissions;

        List<String> root = this.groupPermissions.getStringList("groups");

        Group group = new Group(null,null);

        for(String element : root){

            List<String> groupElements = this.groupPermissions.getStringList("groups" + "." + element );

            for(String groupElement: groupElements){

                switch(groupElement){

                    case("permissions"):

                        List<String> groupPerms =
                                this.groupPermissions.getStringList("groups" + "." + element + "permissions");

                        group.setPermissions(groupPerms);
                        continue;

                    case("prefix"):
                        String groupPrefix =
                                this.groupPermissions.getString("groups. " + element + "prefix");

                        group.setPrefix(groupPrefix);
                        continue;

                    default:
                        ;

                }


            }

        }

    }





}
