package com.lcwd.user.service.impl;

import com.lcwd.user.service.Exceptions.ResourceNotFoundException;
import com.lcwd.user.service.Repositories.UserRepository;
import com.lcwd.user.service.Services.UserService;
import com.lcwd.user.service.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
       String randomUserId = UUID.randomUUID().toString();
       user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return  userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user with given id is not found in server !! :"+userId));
    }
}
