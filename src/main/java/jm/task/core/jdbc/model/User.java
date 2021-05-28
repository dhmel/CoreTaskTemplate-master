package jm.task.core.jdbc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class User {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Byte age;

    public User() { }

    public User(String name, String lastName, Byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder user = new StringBuilder();
        user.append("User: id: ")
            .append(id)
            .append(", имя: ")
            .append(name)
            .append(", фамилия: ")
            .append(lastName)
            .append(", возраст: ")
            .append(age);
        return user.toString();
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public Byte getAge() { return age; }

    public void setAge(Byte age) { this.age = age; }
}