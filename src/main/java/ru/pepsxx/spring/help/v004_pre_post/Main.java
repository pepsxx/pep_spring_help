package ru.pepsxx.spring.help.v004_pre_post;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Чтобы заработали аннотации @PostConstruct и @PreDestroy
                нужны зависимости, в данном примере:
                1:  jakarta.annotation-api
                2:  jakarta.activation-api
                
                Использовать jakarta или javax  зависит от версии JDK и Spring
                
                Spring | JDK              | Namespace
                -------------------------------------
                6.0.x  | JDK 17 to JDK 21 | jakarta
                5.3.x  | JDK 8  to JDK 21 | javax
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBeanSingleton testBeanSingleton1 = context.getBean("testBeanSingleton", TestBeanSingleton.class);
        TestBeanSingleton testBeanSingleton2 = context.getBean("testBeanSingleton", TestBeanSingleton.class);
        TestBeanPrototype testBeanPrototype1 = context.getBean("testBeanPrototype", TestBeanPrototype.class);
        TestBeanPrototype testBeanPrototype2 = context.getBean("testBeanPrototype", TestBeanPrototype.class);

        System.out.println("-------------------------");
        System.out.println("testBeanSingleton1 = " + testBeanSingleton1);
        System.out.println("testBeanSingleton2 = " + testBeanSingleton2);
        System.out.println("testBeanPrototype1 = " + testBeanPrototype1);
        System.out.println("testBeanPrototype2 = " + testBeanPrototype2);
        System.out.println("-------------------------");

        context.close();

    }
}