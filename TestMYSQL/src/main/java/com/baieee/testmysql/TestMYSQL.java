package com.baieee.testmysql;

import java.sql.*;
import com.baieee.projectmysql.ProjectMYSQL;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestMYSQL {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Connection connection;
        String hostName = "MySQL_Server_1";
        try {
            connection = ProjectMYSQL.createConnection(
                "mysql", 
                "localhost", 
                "3306", 
                "sakila", 
                "local_aee",
                "KargaCrow01");
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return;
        }
        
        String query = "SELECT last_update FROM actor WHERE first_name = 'PENELOPE' AND last_name = 'GUINESS'";
        ResultSet rs;
        try {
            rs = ProjectMYSQL.createQuery(connection, query);
        } catch (IllegalStateException | SQLException e) {
            //Logger.getLogger(SilDB.class.getName()).log(Level.SEVERE, null, ex);
            e.printStackTrace();
            return;
        }
        
        System.out.println("rs: " + rs.toString());
        try {
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            //Logger.getLogger(SilDB.class.getName()).log(Level.SEVERE, null, ex);
            e.printStackTrace();
            return;
        }
    }
}
