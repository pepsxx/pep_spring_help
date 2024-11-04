package ru.pepsxx.spring.help.v000_pre_start.docker_compose_util;

import java.io.IOException;

public class DockerComposeUtil {
    private DockerComposeUtil() {

    }

    static public void start() throws IOException, InterruptedException {
        new ProcessBuilder("docker-compose", "-f", "compose.yml", "up", "-d")
                .start()
                .waitFor();
        System.out.println("Docker-compose - Запущен");
    }
}
