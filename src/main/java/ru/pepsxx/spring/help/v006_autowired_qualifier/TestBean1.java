package ru.pepsxx.spring.help.v006_autowired_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBean1 {

    @Autowired
    @Qualifier("testName1")
    TestDependencyBean testDependencyBean1;

    @Autowired
    TestDependencyBean testName2; // Qualifier можно не писать если имя поля совпадает с именем бина, но работать не будет если есть бин с @Primary

    @Autowired
    TestDependencyBean testDependencyBean3;

    @Override
    public String toString() {
        return "TestBean1{" +
                "testDependencyBean1=" + testDependencyBean1 +
                ", testName2=" + testName2 +
                ", testDependencyBean3=" + testDependencyBean3 +
                '}';
    }
}
