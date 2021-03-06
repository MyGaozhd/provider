package com.servi.cloud.provider.dao;

import com.servi.cloud.provider.entry.User;

import java.util.List;

public interface IUserDao {
    public void insertbatch(List<User> users);

    public void insert(User user);

    public void update(User user);

    public void delete(int id);

    public User find(int id);
}
