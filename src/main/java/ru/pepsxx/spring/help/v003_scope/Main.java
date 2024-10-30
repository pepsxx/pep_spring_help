package ru.pepsxx.spring.help.v003_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Scope задается аннотацией @Scope
                @Scope(BeanDefinition.SCOPE_SINGLETON) - Возвращается всё врем я один и тот же бин
                @Scope(BeanDefinition.SCOPE_PROTOTYPE) - Возвращается каждый раз новый бин
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBeanSingleton testBeanSingleton1 = context.getBean("testBeanSingleton", TestBeanSingleton.class);
        TestBeanSingleton testBeanSingleton2 = context.getBean("testBeanSingleton", TestBeanSingleton.class);
        TestBeanPrototype testBeanPrototype1 = context.getBean("testBeanPrototype", TestBeanPrototype.class);
        TestBeanPrototype testBeanPrototype2 = context.getBean("testBeanPrototype", TestBeanPrototype.class);

        System.out.println("testBeanSingleton1 = " + testBeanSingleton1);
        System.out.println("testBeanSingleton2 = " + testBeanSingleton2);
        System.out.println("-------------------------");

        System.out.println("testBeanPrototype1 = " + testBeanPrototype1);
        System.out.println("testBeanPrototype2 = " + testBeanPrototype2);
        System.out.println("-------------------------");

        context.close();

    }
}