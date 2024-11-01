package ru.pepsxx.spring.help.v015_life_cycle;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("ru.pepsxx.spring.help.v015_life_cycle")
@PropertySource("classpath:myProperties.yml")
public class SpringConfig {

    @Bean
    TestDependencyBean testDependencyBean() {
        return new TestDependencyBean("TestDependencyBean");
    }

    @Bean
    public CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

}
