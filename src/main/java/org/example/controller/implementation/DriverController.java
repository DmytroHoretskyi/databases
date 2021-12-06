package org.example.controller.implementation;


import org.example.model.dao.implementation.AbstractGenericImpl;
import org.example.model.dao.implementation.DriverDao;
import org.example.model.entity.Driver;


public class DriverController extends AbstractGenericControllerImpl<Driver>{
    private final DriverDao driverDao = new DriverDao();

    @Override
    public AbstractGenericImpl<Driver> getDao(){
        return driverDao;
    }

}
