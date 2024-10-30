package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Для автоматического внедрение зависимости(другого бина) на место которого подходит несколько экземпляров
                Требуется указать конкретный @Qualifier
                Либо должен существовать бин с @Primary
                
                @Qualifier - можно не писать если имя поля совпадает с именем бина
                
                @Autowired может стоять над:
                1:  Полем
                2:  Сеттером
                3:  Конструктором
                
                @Autowired - можно не писать если есть конструктор со всеми полями
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        PlayerField playerField = context.getBean("playerField", PlayerField.class);
        PlayerSeter playerSeter = context.getBean("playerSeter", PlayerSeter.class);
        PlayerConst playerConst = context.getBean("playerConst", PlayerConst.class);
        TestBean1 testBean1 = context.getBean("testBean1", TestBean1.class);
        TestBean2 testBean2 = context.getBean("testBean2", TestBean2.class);

        playerField.playMusic();
        playerSeter.playMusic();
        playerConst.playMusic();
        System.out.println("testBean1 = " + testBean1);
        System.out.println("testBean2 = " + testBean2);

        context.close();

    }
}