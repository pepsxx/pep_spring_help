package ru.pepsxx.spring.help.v004_pre_post;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBeanPrototype {

    @PostConstruct
    void PostConstruct() {
        System.out.println("PostConstruct: TestBeanPrototype - Выполняется каждый раз");
    }

    @PreDestroy
    void PreDestroy() {
        System.out.println("PreDestroy:    TestBeanPrototype - Не Выполняется ни когда");
    }

}
