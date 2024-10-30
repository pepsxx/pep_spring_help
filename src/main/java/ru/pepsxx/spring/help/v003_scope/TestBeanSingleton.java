package ru.pepsxx.spring.help.v003_scope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope(BeanDefinition.SCOPE_SINGLETON) // Такая запись предпочтительнее
public class TestBeanSingleton {
}
