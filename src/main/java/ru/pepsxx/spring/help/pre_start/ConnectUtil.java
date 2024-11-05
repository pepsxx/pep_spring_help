package ru.pepsxx.spring.help.pre_start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {

    private ConnectUtil() {
    }

    static public Connection getConnection() throws SQLException {
//        Properties properties = new Properties();
//        FileInputStream inputStream = new FileInputStream("src/main/resources/hibernate.properties");
//        properties.load(inputStream);
//        String url = properties.getProperty("hibernate.connection.url");
//        String user = properties.getProperty("hibernate.connection.username");
//        String password = properties.getProperty("hibernate.connection.password");
        String url = "jdbc:postgresql://localhost:40554/pep_db";
        String user = "admin";
        String password = "qQ111111";
        return DriverManager.getConnection(url, user, password);
    }

}
