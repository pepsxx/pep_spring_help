package ru.pepsxx.spring.help.v008_jdbc;



import java.util.ArrayList;
import java.util.List;


public class Person {

    public Person(){}

    private long id;

    private String name;

    private int age;

    // get

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    // set

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
