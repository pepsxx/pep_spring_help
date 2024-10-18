package ru.pepsxx.spring.help.v007_environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Environment для получение настроек из файлов конфигурации
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Environment environment = context.getEnvironment();

        String s1 = environment.getProperty("yml.name");
        String s2 = environment.getProperty("name");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        context.close();

    }
}