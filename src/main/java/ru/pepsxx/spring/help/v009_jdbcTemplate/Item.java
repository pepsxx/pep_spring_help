package ru.pepsxx.spring.help.v009_jdbcTemplate;

public class Item {

    private long id;

    private String description;

    private Person person;

    // get

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Person getPerson() {
        return person;
    }

    // set

    public void setId(long id) {
        this.id = id;
    }

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
                '}';
    }
}
