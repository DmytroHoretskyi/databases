package org.example.service.implementation;

import org.example.model.dao.implementation.RouteDao;
import org.example.model.entity.Route;
import org.example.service.AbstractService;

import java.util.List;

public class Routeservice implements AbstractService<Route> {

    RouteDao routeDao = new RouteDao();

    @Override
    public List<Route> findAll() {
        return routeDao.findAll();
    }

    @Override
    public Route findOne(Integer id) {
        return routeDao.findOne(id);
    }

    @Override
    public void create(Route object) {
        routeDao.create(object);
    }

    @Override
    public void update(Integer id, Route object) {
        routeDao.update(id,object);
    }

    @Override
    public void delete(Integer id) {
        routeDao.delete(id);
    }
}
