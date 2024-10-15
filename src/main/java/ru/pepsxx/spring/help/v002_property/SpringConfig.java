package ru.pepsxx.spring.help.v002_property;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("myProperties.yml")
@PropertySource("myProperties.properties")
@ComponentScan("ru.pepsxx.spring.help.v002_property")
public class SpringConfig {
}
