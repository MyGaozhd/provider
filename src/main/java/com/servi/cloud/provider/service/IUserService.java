package com.servi.cloud.provider.service;

import com.servi.cloud.provider.entry.User;

import java.util.List;

public interface IUserService {

    public User findUserById(int id);

    public void insert(User user);

    public void insertbatch(List<User> users);
}
