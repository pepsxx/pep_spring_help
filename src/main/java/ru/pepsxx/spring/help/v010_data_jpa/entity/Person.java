package ru.pepsxx.spring.help.v010_data_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import org.springframework.data.jpa.repository.Query;


@NamedQuery(
        name = "Person.findAllBy",
        query = "FROM Person p WHERE p.id = 20")

@NamedQuery(
        name = "Person.findByName",
        query = "FROM Person p WHERE p.name = :name OR p.id = 2")

@Entity
public class Person {

    @Id
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
