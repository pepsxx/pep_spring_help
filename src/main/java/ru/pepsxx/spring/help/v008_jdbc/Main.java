package ru.pepsxx.spring.help.v008_jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("""
                Для использования Jdbc требуются зависимости:
                1:  JDBC Driver (postgresql).
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        String url = "jdbc:postgresql://localhost:40554/postgres";
        String user = "admin";
        String password = "qQ111111";

        Connection connection = DriverManager.getConnection(url, user, password);

        String SQL = """
                SELECT *
                FROM person
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + " " +
                    resultSet.getString("name") + " " +
                    resultSet.getString("age"));
        }
        System.out.println("--------------------------------------------------");

        SQL = """
                SELECT p.id, p.name, p.age
                FROM item AS i
                JOIN person AS p ON i.person_id = p.id
                WHERE i.description = 'Books'
                """;
        preparedStatement = connection.prepareStatement(SQL);
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + " " +
                            resultSet.getString("name") + " " +
                            resultSet.getString("age"));
        }
        System.out.println("--------------------------------------------------");

        SQL = """
                SELECT DISTINCT i.description
                FROM item AS i
                """;
        preparedStatement = connection.prepareStatement(SQL);
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("description"));
        }
        System.out.println("--------------------------------------------------");

        context.close();

    }
}