package com.servi.cloud.provider.service;

import com.servi.cloud.provider.entry.User;
import com.servi.cloud.provider.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User findUserById(int  id) {
        return userDao.find(id);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void insertbatch(List<User> users) {
        userDao.insertbatch(users);
    }
}
