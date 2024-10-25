package ru.pepsxx.spring.help.v008_jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Для использования JdbcTemplate требуются зависимости:
                1: spring-jdbc.
                2:  JDBC Driver (postgresql)
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:40554/postgres");
        driverManagerDataSource.setUsername("admin");
        driverManagerDataSource.setPassword("qQ111111");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);

        String SQL = """
                SELECT *
                FROM person
                """;
        List<Person> personList = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Person.class));
        personList.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        SQL = """
                SELECT p.id, p.name, p.age
                FROM item AS i
                JOIN person AS p ON i.person_id = p.id
                WHERE i.description = 'Books'
                """;
        personList = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Person.class));
        personList.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        context.close();

    }
}