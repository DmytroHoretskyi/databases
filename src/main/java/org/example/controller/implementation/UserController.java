package org.example.controller.implementation;

import org.example.model.dao.implementation.AbstractGenericImpl;
import org.example.model.dao.implementation.UserDao;
import org.example.model.entity.User;


public class UserController extends AbstractGenericControllerImpl<User>{
    private final UserDao userDao = new UserDao();

    @Override
    public AbstractGenericImpl<User> getDao(){
        return userDao;
    }

}
