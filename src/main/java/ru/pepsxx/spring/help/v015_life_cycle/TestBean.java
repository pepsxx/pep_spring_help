package ru.pepsxx.spring.help.v015_life_cycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean {

    @Value("${yml.name}")
    private String name;

    private TestDependencyBean testDependencyBeanForConstructor;

    private TestDependencyBean testDependencyBeanForSetter;

    @Autowired
    private TestDependencyBean testDependencyBeanForField;

    public TestBean(TestDependencyBean testDependencyBeanForConstructor) {
        System.out.println("Работает - Constructor");
        this.testDependencyBeanForConstructor = testDependencyBeanForConstructor;
    }

    @PostConstruct
    public void postConstruct (){
        System.out.println("Работает - PostConstruct");
    }

    @PreDestroy
    public void preDestroy (){
        System.out.println("Работает - PreDestroy");
    }

    @Autowired
    public void setTestDependencyBeanForSetter(TestDependencyBean testDependencyBeanForSetter) {
        System.out.println("Работает - Setter");
        this.testDependencyBeanForSetter = testDependencyBeanForSetter;
    }

    public TestDependencyBean getTestDependencyBeanForConstructor() {
        return testDependencyBeanForConstructor;
    }

    public TestDependencyBean getTestDependencyBeanForSetter() {
        return testDependencyBeanForSetter;
    }

    public TestDependencyBean getTestDependencyBeanForField() {
        return testDependencyBeanForField;
    }

    public String getName() {
        return name;
    }
}
