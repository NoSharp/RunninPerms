package com.runninplugins.runninperms.databases;

import java.sql.Driver;
import java.sql.ResultSet;

public abstract class FileBasedDatabase {

    private String directory;
    private DriverUrls driverUrls;

    public FileBasedDatabase(String directory, DriverUrls driverUrl){
        this.directory = directory;
        this.driverUrls = driverUrl;

    }

    /**
     * <p>
     * This method is called when a statement is executed.
     * <p/>
     * @param statement the statement ot be executed.
     */
    public abstract void executeStatement(String statement);

    /**
     * <p>
     * This method is called when a statement is executed.
     * <p/>
     * @param statement the statement ot be executed.
     * @return ResultSet which is from the query of the statement.
     */
    public abstract ResultSet executeSelectStatement(String statement);

    /**
     * <p>
     * Returns a driver url.
     * </p>
     * @return (String) The driver url.
     */
    public DriverUrls getDriverUrls() {
        return driverUrls;
    }

    /**
     * <p>
     *  Returns a directory.
     * </p>
     * @return  (String) The directory
     */
    public String getDirectory() {
        return directory;
    }
}
