package ru.pepsxx.spring.help.v004_pre_post;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class TestBeanSingleton {

    @PostConstruct
    void PostConstruct() {
        System.out.println("PostConstruct: TestBeanSingleton - Выполняется один раз");
    }

    @PreDestroy
    void PreDestroy() {
        System.out.println("PreDestroy:    TestBeanSingleton - Выполняется один раз");
    }

}
