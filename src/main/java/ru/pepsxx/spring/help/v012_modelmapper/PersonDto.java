package ru.pepsxx.spring.help.v012_modelmapper;

public class PersonDto {

    String name;

    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
