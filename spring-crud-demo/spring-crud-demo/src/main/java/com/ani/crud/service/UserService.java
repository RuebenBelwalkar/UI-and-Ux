package com.ani.crud.service;

import java.util.List;

import com.ani.crud.domain.User;

public interface UserService {
    Integer createUser(User user);

    List<User> readAllUser();

    Integer updateUser(User user);

    Integer deleteUser(Long id);
}
