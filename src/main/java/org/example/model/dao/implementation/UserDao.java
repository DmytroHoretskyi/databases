package org.example.model.dao.implementation;

import org.example.model.entity.Route;
import org.example.model.entity.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserDao extends AbstractGenericImpl<User>{
    private final RouteDao routeDao;
    public UserDao() {
        super(User.class);
        routeDao = new RouteDao();
    }

    @Override
    public void delete(Integer id) {
        List<Route> routes = routeDao.findAll();
        for (Route route: routes) {
            if (route.getUser().getId().equals(id)) {
                routeDao.delete(route.getId());
            }
        }
        super.delete(id);
    }
}