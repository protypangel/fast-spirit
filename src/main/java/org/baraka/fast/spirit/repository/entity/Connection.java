package org.baraka.fast.spirit.repository.entity;

import java.sql.DriverManager;
import java.sql.Statement;

public class Connection {
    public Connection (String url, String username, String password) {
        try {
            Class.forName("org.postgresql.Driver");
            java.sql.Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            stmt.executeQuery("SELECT * FROM person");
            conn.close();
        } catch (Exception e) {

        }
    }
}
