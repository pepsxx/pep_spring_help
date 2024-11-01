package ru.pepsxx.spring.help.v015_life_cycle;

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
