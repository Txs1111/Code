package com.T_Lyon.service;

import com.T_Lyon.mapper.UserMapper;
import com.T_Lyon.pojo.User;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;


    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

}
