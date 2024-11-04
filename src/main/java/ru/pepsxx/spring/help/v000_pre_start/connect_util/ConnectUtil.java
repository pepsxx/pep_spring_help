package ru.pepsxx.spring.help.v000_pre_start.connect_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {
    private ConnectUtil() {
    }

    static public Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:40554/pep_db";
        String user = "admin";
        String password = "qQ111111";
        return DriverManager.getConnection(url, user, password);
    }
}
