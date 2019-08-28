package com.aghanim.restproject.service.abstraction;

import com.aghanim.restproject.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User getUserById(long id);

    User updateUser(User user);

    void deleteUser(long id);

    List<User> getUsers();
}
