package ru.pepsxx.spring.help.v009_jdbcTemplate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.pepsxx.spring.help.pre_start.PreStartUtil;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        PreStartUtil.go();
        System.out.println("""
                Для использования JdbcTemplate требуются зависимости:
                1: spring-jdbc.
                2:  JDBC Driver (postgresql).
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:40554/pep_db");
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

        SQL = """
                SELECT DISTINCT i.description
                FROM item AS i
                """;
        List<Item> itemList = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Item.class));
        itemList.forEach(i -> System.out.println(i.getDescription()));
        System.out.println("--------------------------------------------------");

        context.close();

    }
}