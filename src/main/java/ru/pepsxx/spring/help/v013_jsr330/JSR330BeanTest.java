package ru.pepsxx.spring.help.v013_jsr330;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;


@Named("beanTest")
public class JSR330BeanTest {

    @Inject
    @Qualifier("beanForInject1")
    private JSR330BeanForInject name1;

    @Inject
    private JSR330BeanForInject beanForInject2;

    @Override
    public String toString() {
        return "JSR330BeanTest{" +
                "name1=" + name1 +
                ", beanForInject2=" + beanForInject2 +
                '}';
    }

}
