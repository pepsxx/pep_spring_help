package ru.pepsxx.spring.help.v005_bean_creat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBean1 {

    @Autowired
    @Qualifier("testName1")
    TestDependencyBean testDependencyBean1;

    @Autowired
    TestDependencyBean testName2; // Qualifier Можно не писать если имя поля совпадает с именем бина


    public void setTestDependencyBean(TestDependencyBean testDependencyBean1) {
        this.testDependencyBean1 = testDependencyBean1;
    }

    public void setTestName2(TestDependencyBean testName2) {
        this.testName2 = testName2;
    }

    @Override
    public String toString() {
        return "TestBean1{" +
                "testDependencyBean1=" + testDependencyBean1 +
                ", testName2=" + testName2 +
                '}';
    }
}
