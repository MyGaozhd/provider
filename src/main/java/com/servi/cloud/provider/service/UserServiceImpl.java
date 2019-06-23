package com.servi.cloud.provider.service;

import com.servi.cloud.provider.entry.User;
import com.servi.cloud.provider.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User findUserById(String id) {
        User user = new User();
        user.setId(id);
        user.setName(id + "kk");
        user.setSex(id + "man");
        return user;
    }
}
