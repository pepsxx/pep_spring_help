package ru.pepsxx.spring.help.v013_jsr250_jsr330;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.pepsxx.spring.help.v013_jsr250_jsr330")
public class SpringConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
