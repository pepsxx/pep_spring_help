package ru.pepsxx.spring.help.v000_pre_start;

import liquibase.exception.LiquibaseException;
import ru.pepsxx.spring.help.v000_pre_start.docker_compose_util.DockerComposeUtil;
import ru.pepsxx.spring.help.v000_pre_start.liquibase_util.LiquibaseUtil;

import java.io.IOException;
import java.sql.SQLException;

public class PreStartUtil {
    private PreStartUtil() {
    }

    static public void go() {
        try {
            DockerComposeUtil.start();
            Thread.sleep(3_000);
            LiquibaseUtil.start();
        } catch (LiquibaseException | SQLException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("****************************************************************************************************");
    }
}
