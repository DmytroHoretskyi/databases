package org.example.model.dao.implementation;

import org.example.model.entity.Driver;
import org.example.model.entity.Route;

import java.util.List;

public class DriverDao extends AbstractGenericImpl<Driver>{
    private final RouteDao routeDao;

    public DriverDao() {
        super(Driver.class);
        routeDao = new RouteDao();
    }

    @Override
    public void delete(Integer id) {
        List<Route> routes = routeDao.findAll();
        for (Route route: routes) {
            if (route.getDriver().getId().equals(id)) {
                routeDao.delete(route.getId());
            }
        }
        super.delete(id);
    }
}