package com.jspiders.ems.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

    private final String dbUrl= "jdbc:mysql://localhost:3306/ems";
    private final String user = "root";
    private final String password = "root";

    public void save()
    {
      String insertSql = "Insert into ems.emp values(0,?,?,?,?,?,?,?);";
        try
        {
          Connection con = DriverManager.getConnection(dbUrl,user,password);
            PreparedStatement psm1 = con.prepareStatement(insertSql);

            //set data

            psm1.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
