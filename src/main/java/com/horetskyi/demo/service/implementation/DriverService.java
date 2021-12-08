package com.horetskyi.demo.service.implementation;

import com.horetskyi.demo.entity.Driver;
import com.horetskyi.demo.repository.DriverRepo;
import com.horetskyi.demo.service.ServiceInterface;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DriverService implements ServiceInterface<Driver> {

    private final DriverRepo driverRepo;

    public DriverService(DriverRepo driverRepo) {
        this.driverRepo = driverRepo;
    }


    @Override
    public List<Driver> findAll() {
        return driverRepo.findAll();
    }

    @Override
    public Driver find(Integer id) {
        return driverRepo.getById(id);
    }

    @Override
    @Transactional
    public Driver create(Driver entity) {
        return driverRepo.save(entity);
    }

    @Override
    @Transactional
    public Driver update(Driver entity) {
        return driverRepo.save(entity);
    }

    @Override
    @Transactional
    public Driver delete(Integer id) {
        Driver driverToDelete = driverRepo.getById(id);
        driverRepo.deleteById(id);
        return driverToDelete;
    }
}
