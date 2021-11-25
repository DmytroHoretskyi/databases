package org.example.controller.implementation;

import org.example.controller.AbstractController;
import org.example.model.entity.Car;
import org.example.service.implementation.CarService;

import java.util.List;

public class CarController implements AbstractController<Car> {

    CarService carService = new CarService();

    @Override
    public List<Car> findAll() {
        return carService.findAll();
    }

    @Override
    public Car findById(Integer id) {
        return carService.findOne(id);
    }

    @Override
    public void create(Car entity) {
        carService.create(entity);
    }

    @Override
    public void update(Integer id, Car entity) {
        carService.update(id,entity);
    }

    @Override
    public void delete(Integer id) {
        carService.delete(id);
    }
}
