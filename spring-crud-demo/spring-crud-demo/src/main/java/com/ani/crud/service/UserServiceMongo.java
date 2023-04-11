package com.ani.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.crud.domain.User;
import com.ani.crud.repository.UserRepository;


@Service
public class UserServiceMongo implements UserService {
    @Autowired
    private UserRepository userRepository;
    

    @Override
    public Integer createUser(User user) {
        userRepository.save(user);
        return 0;
    }

    @Override
    public List<User> readAllUser() {
        return userRepository.findAll();
        
    }

    @Override
    public Integer updateUser(User user) {
        userRepository.save(user);
        return 0;
    }

    @Override
    public Integer deleteUser(Long id) {
        userRepository.deleteById(id);
        return 0;
    }
}
    

