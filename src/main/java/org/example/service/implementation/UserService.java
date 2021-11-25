package org.example.service.implementation;

import org.example.model.dao.implementation.UserDao;
import org.example.model.entity.User;
import org.example.service.AbstractService;

import java.util.List;

public class UserService implements AbstractService<User> {

    UserDao userDao = new UserDao();

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public void create(User object) {
        userDao.create(object);
    }

    @Override
    public void update(Integer id, User object) {
        userDao.update(id,object);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }
}
