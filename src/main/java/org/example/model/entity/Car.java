package org.example.model.entity;

import java.util.Objects;

public class Car {

    private Integer id;

    private String model;

    private String mark;

    private String color;

    private String carNumber;

    public Car() {
    }

    public Car(Integer id, String model, String mark, String color, String carNumber) {
        this.id = id;
        this.model = model;
        this.mark = mark;
        this.color = color;
        this.carNumber = carNumber;
    }

    public Car(String model, String mark, String color, String carNumber) {
        this.model = model;
        this.mark = mark;
        this.color = color;
        this.carNumber = carNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(model, car.model) && Objects.equals(mark, car.mark) && Objects.equals(color, car.color) && Objects.equals(carNumber, car.carNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, mark, color, carNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
