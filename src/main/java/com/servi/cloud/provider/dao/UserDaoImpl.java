package com.servi.cloud.provider.dao;

import com.servi.cloud.provider.entry.User;
import com.servi.cloud.provider.mapper.IUserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl implements  IUserDao{

    @Resource
    private IUserMapper userMapper;

    @Override
    public void insertbatch(List<User> users) {
        userMapper.insertbatch(users);
    }

    @Override
    public void insert(User user) {
         userMapper.insert(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User find(int id) {
        return userMapper.find(id);
    }
}
