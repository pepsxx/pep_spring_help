package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("ru.pepsxx.spring.help.v006_autowired_qualifier")
public class SpringConfig {

    @Bean(name = "testName1")
    TestDependencyBean doubleBean1() {
        return new TestDependencyBean("T1");
    }

    @Bean(name = "testName2")
    TestDependencyBean doubleBean2() {
        return new TestDependencyBean("T2");
    }

    @Bean(name = "testName3")
    @Primary  // Бин который будет использоваться по умолчанию при конфликтной ситуации
    TestDependencyBean doubleBean3() {
        return new TestDependencyBean("T3");
    }

}
