package org.example.controller.implementation;

import org.example.controller.AbstractController;
import org.example.model.entity.Driver;
import org.example.service.implementation.DriverService;

import java.util.List;

public class DriverController implements AbstractController<Driver> {

    DriverService driverService = new DriverService();

    @Override
    public List<Driver> findAll() {
        return driverService.findAll();
    }

    @Override
    public Driver findById(Integer id) {
        return driverService.findOne(id);
    }

    @Override
    public void create(Driver entity) {
        driverService.create(entity);
    }

    @Override
    public void update(Integer id, Driver entity) {
        driverService.update(id,entity);
    }

    @Override
    public void delete(Integer id) {
        driverService.delete(id);
    }
}
