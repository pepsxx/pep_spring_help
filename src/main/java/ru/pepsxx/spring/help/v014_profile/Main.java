package ru.pepsxx.spring.help.v014_profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                С помощью @Profile("pep") и
                настройки в myProperties.yml: spring.profiles.active: pep
                Создаются бины без профилей и с профилем "pep"
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        String s = context.getEnvironment().getProperty("spring.profiles.active");

        System.out.println("Конфиг с профилем " + s);
        System.out.println("Бин с профилем  - pep - context.containsBean(\"testBean1\") = " + context.containsBean("testBean1"));
        System.out.println("Бин с профилем  - web - context.containsBean(\"testBean2\") = " + context.containsBean("testBean2"));
        System.out.println("Бин без профиля       - context.containsBean(\"testBean3\") = " + context.containsBean("testBean3"));

    }
}
