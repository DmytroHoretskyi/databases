package org.example.model.dao.implementation;

import org.example.model.entity.Car;

public class CarDao extends AbstractGenericImpl<Car>{
    public CarDao() {
        super(Car.class);
    }
}