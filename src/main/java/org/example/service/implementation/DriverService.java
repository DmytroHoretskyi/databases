package org.example.service.implementation;

import org.example.model.dao.implementation.DriverDao;
import org.example.model.entity.Driver;
import org.example.service.AbstractService;

import java.util.List;

public class DriverService implements AbstractService<Driver> {

    DriverDao driverDao = new DriverDao();

    @Override
    public List<Driver> findAll() {
        return driverDao.findAll();
    }

    @Override
    public Driver findOne(Integer id) {
        return driverDao.findOne(id);
    }

    @Override
    public void create(Driver object) {
        driverDao.create(object);
    }

    @Override
    public void update(Integer id, Driver object) {
        driverDao.update(id, object);
    }

    @Override
    public void delete(Integer id) {
        driverDao.delete(id);
    }
}
