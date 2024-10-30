package ru.pepsxx.spring.help.v006_autowired_qualifier;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {

    TestDependencyBean testDependencyBean1;

    @Resource
    TestDependencyBean testName2;

    TestDependencyBean testDependencyBean3;

    //    @Autowired // можно не писать если есть конструктор со всеми полями
    public TestBean2(@Qualifier("testName1") TestDependencyBean testDependencyBean1,  TestDependencyBean testName2, TestDependencyBean testDependencyBean3) {
        this.testDependencyBean1 = testDependencyBean1;
        this.testName2 = testName2;
        this.testDependencyBean3 = testDependencyBean3;
    }

    @Override
    public String toString() {
        return "TestBean2{" +
                "testDependencyBean1=" + testDependencyBean1 +
                ", testName2=" + testName2 +
                ", testDependencyBean3=" + testDependencyBean3 +
                '}';
    }
}
