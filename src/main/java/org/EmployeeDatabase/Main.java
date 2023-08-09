package org.EmployeeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {

            CSVLoader loader = new CSVLoader(getCon());
            loader.loadCSV(System.getProperty("EmplyeeData.xls"), "Employee", true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Connection getCon() {
        Connection c= null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(("jdbc:sqlite:test.db"));

        } catch(Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}