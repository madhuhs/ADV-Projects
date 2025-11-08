package com.jspiders.ems.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

    private static final String dbUrl= "jdbc:mysql://localhost:3306/ems";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection con = null;
    public static Connection getDbConnection()
    {
        try
        {
            con = DriverManager.getConnection(dbUrl,user,password);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return con;
    }
}
