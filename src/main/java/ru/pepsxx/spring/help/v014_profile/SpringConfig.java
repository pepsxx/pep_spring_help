package ru.pepsxx.spring.help.v014_profile;

import org.springframework.context.annotation.*;
import ru.pepsxx.spring.help.v013_jsr330.JSR330BeanForInject;

@Configuration
@ComponentScan("ru.pepsxx.spring.help.v014_profile")
@PropertySource("classpath:myProperties.yml")
public class SpringConfig {

    @Bean
    @Profile("pep")
    TestBean testBean1() {
        return new TestBean("TB1");
    }

    @Bean
    @Profile("web")
    TestBean testBean2() {
        return new TestBean("TB1");
    }

    @Bean
    TestBean testBean3() {
        return new TestBean("TB3");
    }

}
