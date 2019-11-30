package model;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static java.sql.Connection conn;
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_NAME = "barbershop";
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/" +  DB_NAME;
    private static final String DB_UNAME = "root";
    private static final String DB_PASS = "";
    
    public static java.sql.Connection openConnection() {
        if (conn == null) {
            try {
                Class.forName(DB_DRIVER);
                conn = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PASS);
            } catch (ClassNotFoundException e) {
                System.err.format("Class not found");
            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
    
}
