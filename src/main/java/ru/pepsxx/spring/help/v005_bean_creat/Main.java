package ru.pepsxx.spring.help.v005_bean_creat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Автоматическое создание бина:
                @Component
                Есть 3 способа ручного создания бина:
                1:  С помощью конструктора (свойства объекта задаются в конструкторе).
                2:  С помощью сеттеров (свойства объекта задаются через сеттеры).
                3:  С помощью фабричного метода (объект с свойствами создаётся через фабричный метод).
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Music music = context.getBean("music", Music.class);
        MusicCon musicCon = context.getBean("musicCon", MusicCon.class);
        MusicSet musicSet = context.getBean("musicSet", MusicSet.class);
        MusicFab muFabCon = context.getBean("muFabCon", MusicFab.class);
        MusicFab muFabSet = context.getBean("muFabSet", MusicFab.class);
        TestBean1 testBean1 = context.getBean("testBean1", TestBean1.class);
        TestBean2 testBean2 = context.getBean("testBean2", TestBean2.class);

        System.out.println("music    = " + music.getName());
        System.out.println("musicCon = " + musicCon.getName());
        System.out.println("musicSet = " + musicSet.getName());
        System.out.println("muFabCon = " + muFabCon.getName());
        System.out.println("muFabSet = " + muFabSet.getName());
        System.out.println("testBean1 = " + testBean1);
        System.out.println("testBean2 = " + testBean2);

        context.close();

    }
}