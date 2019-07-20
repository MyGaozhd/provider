package com.servi.cloud.provider.mapper;

import com.servi.cloud.provider.entry.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserMapper {

    public void insertbatch(List<User> users);

    public void insert(User user);

    public void update(User user);

    public void delete(int id);

    public User find(int id);
}
