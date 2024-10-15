package ru.pepsxx.spring.help.v002_property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Использование файла properties
                1:  В классе @Configuration добавить аннотацию(и) @PropertySource с путем к файлу настроек
                    @PropertySource("myProperties.yml")
                    @PropertySource("myProperties.properties")
                2:  Для внедрения в поле поставить аннотацию @Value с именем настройки
                    @Value("${name}")
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBean testBean = context.getBean("testBeanSingleton", TestBean.class);// Имя бина с маленькой буквы.

        System.out.println("testBean.getNamePro() = " + testBean.getNamePro());
        System.out.println("testBean.getNameYml() = " + testBean.getNameYml());

        context.close();

    }
}