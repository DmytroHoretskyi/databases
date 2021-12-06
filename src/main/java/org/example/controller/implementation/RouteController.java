package org.example.controller.implementation;

import org.example.model.dao.implementation.AbstractGenericImpl;
import org.example.model.dao.implementation.RouteDao;
import org.example.model.entity.Route;


public class RouteController extends AbstractGenericControllerImpl<Route>{
    private final RouteDao routeDao = new RouteDao();

    @Override
    public AbstractGenericImpl<Route> getDao(){
        return routeDao;
    }
}

