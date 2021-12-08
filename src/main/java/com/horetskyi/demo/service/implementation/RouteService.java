package com.horetskyi.demo.service.implementation;

import com.horetskyi.demo.entity.Route;
import com.horetskyi.demo.repository.RouteRepo;
import com.horetskyi.demo.service.ServiceInterface;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RouteService implements ServiceInterface<Route> {

    private final RouteRepo routeRepo;

    public RouteService(RouteRepo routeRepo) {
        this.routeRepo = routeRepo;
    }

    @Override
    public List<Route> findAll() {
        return routeRepo.findAll();
    }

    @Override
    public Route find(Integer id) {
        return routeRepo.getById(id);
    }

    @Override
    @Transactional
    public Route create(Route entity) {
        return routeRepo.save(entity);
    }

    @Override
    @Transactional
    public Route update(Route entity) {
        return routeRepo.save(entity);
    }

    @Override
    @Transactional
    public Route delete(Integer id) {
        Route deleteRoute = routeRepo.getById(id);
        routeRepo.deleteById(id);
        return deleteRoute;
    }
}
