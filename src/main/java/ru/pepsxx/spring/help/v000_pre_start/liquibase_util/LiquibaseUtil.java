package ru.pepsxx.spring.help.v000_pre_start.liquibase_util;

import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import ru.pepsxx.spring.help.v000_pre_start.connect_util.ConnectUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class LiquibaseUtil {
    private LiquibaseUtil() {
    }

    static public void start() throws LiquibaseException, SQLException {
        try (Connection connection = ConnectUtil.getConnection()) {
            new Liquibase(
                    "db/changelog/db.changelog-master.yaml",
                    new ClassLoaderResourceAccessor(),
                    new JdbcConnection(connection)
            ).update("");
            System.out.println("Liquibase - Обновлен");
        }
    }
}
