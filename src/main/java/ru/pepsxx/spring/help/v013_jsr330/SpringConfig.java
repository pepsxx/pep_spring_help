package ru.pepsxx.spring.help.v013_jsr330;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("ru.pepsxx.spring.help.v013_jsr330")
public class SpringConfig {

    @Bean("beanForInject1")
    public JSR330BeanForInject beanForInject1() {
        return new JSR330BeanForInject("bf1");
    }

    @Bean
    @Primary
    public JSR330BeanForInject beanForInject2() {
        return new JSR330BeanForInject("bf2");
    }

}
