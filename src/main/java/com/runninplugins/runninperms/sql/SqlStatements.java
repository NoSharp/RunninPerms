package com.runninplugins.runninperms.sql;

import org.bukkit.entity.Player;

public  class SqlStatements {

    public static String createTable(){

        return "CREATE TABLE IF NOT EXISTS " + "permissions" + " (\n" +
                "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `group` MEDIUMTEXT CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NOT NULL,\n" +
                "  `playeruuid` MEDIUMTEXT NOT NULL,\n" +
                "  PRIMARY KEY (`id`));";

    }

    public static String insertPlayer(Player player, String groupName){

        return "INSERT INTO permissions (group, playeruuid) VALUES (" + groupName +", " +
                "" + player.getUniqueId().toString() + ");";

    }

    public static String retrievePlayerInfo(Player player){
        return "SELECT * FROM permissions WHERE playeruuid = " +player.getUniqueId().toString() + ";";

    }

    public static String getAllPlayerInfo(Player player){
        return "SELECT * FROM permissions ;";

    }

    public static String removePlayerInfo(Player player, String group){
        return "DELETE FROM permissions\n" +
                "WHERE playeruuid = " + player.getUniqueId().toString() + ";";

    }

}
