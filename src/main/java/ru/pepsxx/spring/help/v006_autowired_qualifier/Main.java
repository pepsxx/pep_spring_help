package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Для автоматического внедрение бина на место которого подходит несколько экземпляров
                Требуется указать конкретный @Qualifier
                
                @Autowired может стоять над:
                1:  Полем
                2:  Сеттером
                3:  Конструктором
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        PlayerField playerField = context.getBean("playerField", PlayerField.class);
        PlayerSeter playerSeter = context.getBean("playerSeter", PlayerSeter.class);
        PlayerConst playerConst = context.getBean("playerConst", PlayerConst.class);

        playerField.playMusic();
        playerSeter.playMusic();
        playerConst.playMusic();

        context.close();

    }
}