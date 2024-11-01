package ru.pepsxx.spring.help.v015_life_cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Работает - BPP -  Before для: " + beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Работает - BPP -  After  для: " + beanName);
        System.out.println();
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
