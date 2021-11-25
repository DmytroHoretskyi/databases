package org.example.controller.implementation;

import org.example.controller.AbstractController;
import org.example.model.entity.User;
import org.example.service.implementation.UserService;

import java.util.List;

public class UserController implements AbstractController<User> {

    UserService userService = new UserService();

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userService.findOne(id);
    }

    @Override
    public void create(User entity) {
        userService.create(entity);
    }

    @Override
    public void update(Integer id, User entity) {
        userService.update(id,entity);
    }

    @Override
    public void delete(Integer id) {
        userService.delete(id);
    }
}
