package com.T_Lyon.service;

import com.T_Lyon.pojo.User;

public class UserServiceImpl implements UserService {

    private UserService userService;

    public UserServiceImpl(UserService userService) {
        this.userService = userService;
    }
//
//    public int addUser(User user) {
//        return userService.addUser(user);
//    }
//
//    public int deleteUser(int id) {
//        return userService.deleteUser(id);
//    }
//
//    public int updateUser(User user) {
//        return userService.updateUser(user);
//    }

    public User getUserByName(String username) {
        return userService.getUserByName(username);
    }
}
