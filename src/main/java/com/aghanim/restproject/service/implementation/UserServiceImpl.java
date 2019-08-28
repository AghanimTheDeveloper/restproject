package com.aghanim.restproject.service.implementation;

import com.aghanim.restproject.dao.UserDao;
import com.aghanim.restproject.model.User;
import com.aghanim.restproject.service.abstraction.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User addUser(User user) {
        return userDao.saveAndFlush(user);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getOne(id);
    }

    @Override
    public User updateUser(User user) {
        User currentUser = userDao.getOne(user.getId());
        currentUser.setName(user.getName());
        currentUser.setLogin(user.getLogin());
        currentUser.setPassword(user.getPassword());
        userDao.saveAndFlush(currentUser);
        return currentUser;
    }

    @Override
    public void deleteUser(long id) {
        userDao.delete(userDao.getOne(id));
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }
}
