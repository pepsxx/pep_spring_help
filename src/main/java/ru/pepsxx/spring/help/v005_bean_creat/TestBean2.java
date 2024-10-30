package ru.pepsxx.spring.help.v005_bean_creat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBean2 {

    TestDependencyBean testDependencyBean1;

    TestDependencyBean testDependencyBean2;

//    @Autowired // можно не писать если есть конструктор со всеми полями
    public TestBean2(@Qualifier("testName1") TestDependencyBean testDependencyBean1, @Qualifier("testName2")TestDependencyBean testDependencyBean2) {
        this.testDependencyBean1 = testDependencyBean1;
        this.testDependencyBean2 = testDependencyBean2;
    }

    @Override
    public String toString() {
        return "TestBean2{" +
                "testDependencyBean1=" + testDependencyBean1 +
                ", testDependencyBean2=" + testDependencyBean2 +
                '}';
    }
}
