package org.example.service.implementation;

import org.example.model.dao.implementation.CarDao;
import org.example.model.entity.Car;
import org.example.service.AbstractService;

import java.util.List;

public class CarService implements AbstractService<Car> {

    CarDao carDao = new CarDao();

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }

    @Override
    public Car findOne(Integer id) {
        return carDao.findOne(id);
    }

    @Override
    public void create(Car car) {
        carDao.create(car);
    }

    @Override
    public void update(Integer id, Car object) {
        carDao.update(id,object);
    }

    @Override
    public void delete(Integer id) {
        carDao.delete(id);
    }
}
