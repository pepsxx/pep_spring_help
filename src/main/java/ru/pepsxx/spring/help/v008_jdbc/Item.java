package ru.pepsxx.spring.help.v008_jdbc;

public class Item {

    public Item(String description, Person person) {
        this.description = description;
        this.person = person;
    }

    //
    private long id;

    private String description;

    private Person person;

    // get

    public String getDescription() {
        return description;
    }

    public Person getPerson() {
        return person;
    }

    // set

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // toString

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", person=" + person.getName() +
                '}';
    }
}
