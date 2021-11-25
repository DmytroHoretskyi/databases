package org.example.model.entity;

import java.util.Objects;

public class User {

    private Integer id;

    private Integer age;

    private String name;

    private  String surname;

    private String gender;

    public User(Integer age, String name, String surname, String gender) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public User(Integer id, Integer age, String name, String surname, String gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(age, user.age) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name, surname, gender);
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
