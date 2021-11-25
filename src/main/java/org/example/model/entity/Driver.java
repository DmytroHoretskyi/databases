package org.example.model.entity;

import java.util.Objects;

public class Driver {

    private Integer id;

    private String name;

    private String surname;

    private Integer age;

    private Integer numberOfCars;

    private Integer experience;

    private Integer ratingId;

    public Driver() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(Integer numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", numberOfCars=" + numberOfCars +
                ", experience=" + experience +
                ", ratingId=" + ratingId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(id, driver.id) && Objects.equals(name, driver.name) && Objects.equals(surname, driver.surname) && Objects.equals(age, driver.age) && Objects.equals(numberOfCars, driver.numberOfCars) && Objects.equals(experience, driver.experience) && Objects.equals(ratingId, driver.ratingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, numberOfCars, experience, ratingId);
    }

    public Driver(String name, String surname, Integer age, Integer numberOfCars, Integer experience, Integer ratingId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberOfCars = numberOfCars;
        this.experience = experience;
        this.ratingId = ratingId;
    }

    public Driver(Integer id, String name, String surname, Integer age, Integer numberOfCars, Integer experience, Integer ratingId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberOfCars = numberOfCars;
        this.experience = experience;
        this.ratingId = ratingId;
    }
}
