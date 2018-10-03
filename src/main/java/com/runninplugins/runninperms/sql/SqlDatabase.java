package com.runninplugins.runninperms.sql;

/**
 * To be used on all SQL based databases.
 * @author Harry
 */
public abstract class SqlDatabase {

    private String ipAddress;
    private String databaseName;
    private String username;
    private String password;

    /**
     * This is the constructor of the sql database.
     *
     * @param ipAddress the IP address of the server.
     * @param databaseName the name of the database which the host is connecting to on the give ip.
     * @param username the username of the account that is associated with the user on the given
     *                 database.
     * @param password the password of the account that is associated with the user on the given
     *                 database.
     */
    public SqlDatabase(String ipAddress, String databaseName, String username, String password ){
        this.ipAddress = ipAddress;
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
    }

    /**
     * <p>
     * This method is called when the connection is established with the host.
     * </p>
     *
     */
    abstract void onConnection();

    /**
     * <p>
     * This method is called when a statement is executed.
     * <p/>
     * @param statement the statement ot be executed.
     */
    abstract void executeStatement(String statement);


    /**
     * <p>
     *   This method is called when the client disconnects from the host.
     *   This could be a variety of reasons including, but not limited to,
     *   SqlDisconnect Refusal, Server being closed or restarted.
     * <p/>
     *
     */
    abstract void onDisconnect();




}
