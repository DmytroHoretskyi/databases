package com.horetskyi.demo.service.implementation;

import com.horetskyi.demo.entity.Car;
import com.horetskyi.demo.repository.CarRepo;
import com.horetskyi.demo.service.ServiceInterface;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarService implements ServiceInterface<Car> {

    private final CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @Override
    public List<Car> findAll() {
        return carRepo.findAll();
    }

    @Override
    public Car find(Integer id) {
        return carRepo.getById(id);
    }

    @Override
    @Transactional
    public Car create(Car entity) {
        return carRepo.save(entity);
    }

    @Override
    @Transactional
    public Car update(Car entity) {
        return carRepo.save(entity);
    }

    @Override
    @Transactional
    public Car delete(Integer id) {
        Car deletedCar = carRepo.getById(id);
        carRepo.deleteById(id);
        return deletedCar;
    }
}
