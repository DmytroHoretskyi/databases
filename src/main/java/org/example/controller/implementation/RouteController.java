package org.example.controller.implementation;

import org.example.controller.AbstractController;
import org.example.model.entity.Route;
import org.example.service.implementation.Routeservice;

import java.util.List;

public class RouteController implements AbstractController<Route> {

    Routeservice routeservice = new Routeservice();

    @Override
    public List<Route> findAll() {
        return routeservice.findAll();
    }

    @Override
    public Route findById(Integer id) {
        return routeservice.findOne(id);
    }

    @Override
    public void create(Route entity) {
        routeservice.create(entity);
    }

    @Override
    public void update(Integer id, Route entity) {
        routeservice.update(id, entity);
    }

    @Override
    public void delete(Integer id) {
        routeservice.delete(id);
    }
}
