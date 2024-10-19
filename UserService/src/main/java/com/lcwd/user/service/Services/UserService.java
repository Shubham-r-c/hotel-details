package com.lcwd.user.service.Services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //User Operation

    //Create
    User saveUser(User user);

    //getAllUser

    List<User> getAllUser();

    // get single user of given userId
    User getUser(String userId);
}
