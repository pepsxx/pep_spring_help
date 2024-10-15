package ru.pepsxx.spring.help.v004_post_construct_and_pre_destroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
