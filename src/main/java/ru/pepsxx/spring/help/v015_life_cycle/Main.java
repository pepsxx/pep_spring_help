package ru.pepsxx.spring.help.v015_life_cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("""

                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println("--------------------------------------------------");

        TestBean bean = context.getBean("testBean", TestBean.class);
        System.out.println("bean.getName() = " + bean.getName());
        System.out.println("bean.getTestDependencyBeanForConstructor() = " + bean.getTestDependencyBeanForConstructor());
        System.out.println("bean.getTestDependencyBeanForSetter() = " + bean.getTestDependencyBeanForSetter());
        System.out.println("bean.getTestDependencyBeanForField() = " + bean.getTestDependencyBeanForField());
        System.out.println("--------------------------------------------------");

        context.close();

    }
}
