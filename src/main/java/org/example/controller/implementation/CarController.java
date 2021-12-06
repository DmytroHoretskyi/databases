package org.example.controller.implementation;

import org.example.model.dao.implementation.AbstractGenericImpl;
import org.example.model.dao.implementation.CarDao;
import org.example.model.entity.Car;


public class CarController extends AbstractGenericControllerImpl<Car> {

    private final CarDao carDao = new CarDao();

    @Override
    public AbstractGenericImpl<Car> getDao(){
        return carDao;
    }

}
