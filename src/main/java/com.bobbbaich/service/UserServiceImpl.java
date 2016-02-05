package com.bobbbaich.service;

import com.bobbbaich.model.User;
import com.bobbbaich.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 03.02.2016.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.findOne(userId);
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public User deleteUser(Long userId) {
        return null;
    }
}
