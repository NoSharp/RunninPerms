package com.runninplugins.runninperms.sql;

import com.runninplugins.runninperms.Runninperms;
import com.runninplugins.runninperms.databases.DriverUrls;
import com.runninplugins.runninperms.databases.FileBasedDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

public class Sqlite extends FileBasedDatabase{

    private Connection connectionInstance;

    public Sqlite(String directory) {
        super(directory, DriverUrls.SQLITE);
        try {
            connectionInstance = DriverManager.getConnection(this.getDriverUrls().getUrl());
            connectionInstance.prepareStatement(SqlStatements.createTable()).execute();
        } catch(SQLException exception){
            Runninperms.instance.getLogger().log(Level.SEVERE, "SQLITE CONNECTION ERROR.");
        }
    }

    @Override
    public void executeStatement(String statement) {
        try {
            connectionInstance.prepareStatement(statement).execute();
        } catch(SQLException exception){
            Runninperms.instance.getLogger().log(Level.SEVERE, "SQLITE STATEMENT ERROR.");
        }
    }

    @Override
    public ResultSet executeSelectStatement(String statement) {
        try {
            ResultSet resultSet = connectionInstance.prepareStatement(statement).executeQuery();
            return resultSet;
        } catch(SQLException exception){
            Runninperms.instance.getLogger().log(Level.SEVERE, "SQLITE STATEMENT ERROR.");
            return null;
        }
    }
}
