package ru.pepsxx.spring.help.v013_jsr330;

public class JSR330BeanForInject {

    private String name;

    public JSR330BeanForInject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JSR330BeanForInject{" +
                "name='" + name + '\'' +
                '}';
    }
}
