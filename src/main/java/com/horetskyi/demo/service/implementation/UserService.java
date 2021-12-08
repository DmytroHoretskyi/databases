package com.horetskyi.demo.service.implementation;

import com.horetskyi.demo.entity.User;
import com.horetskyi.demo.repository.UserRepo;
import com.horetskyi.demo.service.ServiceInterface;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService implements ServiceInterface<User> {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User find(Integer id) {
        return userRepo.getById(id);
    }

    @Override
    @Transactional
    public User create(User entity) {
        return userRepo.save(entity);
    }

    @Override
    @Transactional
    public User update(User entity) {
        return userRepo.save(entity);
    }

    @Override
    @Transactional
    public User delete(Integer id) {
        User deleteUser = userRepo.getById(id);
        userRepo.deleteById(id);
        return deleteUser;
    }
}
