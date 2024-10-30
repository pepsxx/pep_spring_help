package ru.pepsxx.spring.help.v012_modelmapper;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Id
    Long id;

    String name;

    int age;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
