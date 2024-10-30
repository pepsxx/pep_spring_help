package ru.pepsxx.spring.help.v013_jsr330;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Spring     - JSR330:
                @Component - @Named
                @Autowired - @Inject
                @Qualifier - @Qualifier
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        JSR330BeanTest beanTest1 = context.getBean("beanTest", JSR330BeanTest.class);
        JSR330BeanTest beanTest2 = context.getBean("beanTest", JSR330BeanTest.class);

        System.out.println("beanTest1 = " + beanTest1);
        System.out.println("beanTest2 = " + beanTest2);
    }
}
