package com.bobbbaich.service;

import com.bobbbaich.model.User;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 09.01.2016.
 */
public interface UserService {
    public User saveUser(User user);
    public User findUserById(Long id);
    public List<User> findAllUsers();
    public User deleteUser(Long id);
}
