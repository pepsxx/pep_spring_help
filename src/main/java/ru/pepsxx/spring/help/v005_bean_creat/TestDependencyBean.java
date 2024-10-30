package ru.pepsxx.spring.help.v005_bean_creat;

public class TestDependencyBean {

    private String name;

    public TestDependencyBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TestDependencyBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
