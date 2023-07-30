/*
 * This class contains MYSQL methods
 */

package com.baieee.projectmysql;

// Importing all SQL classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class ProjectMYSQL {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public static Connection createConnection(
            String theSQL,
            String theHost,
            String thePort,
            String theDBName,
            String theUserName,
            String thePassword) throws IllegalStateException {
        String url = (
            "jdbc:" + theSQL +
            "://" + theHost +
            ":" + thePort +
            "/" + theDBName);
        System.out.println("url: " + url);
        //String url = "jdbc:mysql://localhost:3306/sakila";
        
        System.out.println("Connecting database...");
        
        Connection connection;
        try {
            connection = DriverManager.getConnection(
                url,
                theUserName,
                thePassword);
        } catch (SQLException e) {
            throw new IllegalStateException(
                "Cannot connect to the database!",
                e);
        }
        
        System.out.println("Database connected!");
        return connection;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public static ResultSet createQuery(
            String theSQL,
            String theHost,
            String thePort,
            String theDBName,
            String theUserName,
            String thePassword,
            String theQuery) throws IllegalStateException, SQLException {
        /*
            Use this method if the connection is intended to be used only once'
            as this method
                creates a connection,
                executes the query and
                deletes the connection.
            Hence, an SQL connection is ccreated and deleted at the end
            everytime this method is called.
            Create a connection and execute queries
            if a number of queries will be executed
            in order for the runtime.
        */
        
        // Create an SQL connection
        Connection connection;
        try {
            connection = ProjectMYSQL.createConnection(
                theSQL,
                theHost,
                thePort,
                theDBName,
                theUserName,
                thePassword);
        } catch (IllegalStateException e) {
            throw e;
        }
        
        // Create an SQL statement
        Statement statement;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new IllegalStateException(
                "Cannot create a statement for the database!",
                e);
        }
        
        // Execute the query
        //String theQuery = "SELECT id, first, last, age FROM Employees";
        ResultSet rs;
        try {
            rs = statement.executeQuery(theQuery);
        } catch (SQLException e) {
            throw e;
        }
        return rs;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public static ResultSet createQuery(
            Connection theConnection,
            String theQuery) throws SQLException {
        // Create an SQL statement
        Statement statement;
        try {
            statement = theConnection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
        // Execute the query
        //String theQuery = "SELECT id, first, last, age FROM Employees";
        ResultSet rs;
        try {
            rs = statement.executeQuery(theQuery);
        } catch (SQLException e) {
            throw e;
        }
        return rs;
    }
}
