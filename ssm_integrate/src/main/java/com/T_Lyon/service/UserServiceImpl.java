package com.T_Lyon.service;

import com.T_Lyon.mapper.UserMapper;
import com.T_Lyon.pojo.User;
import org.apache.ibatis.annotations.Param;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    //    set注入
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //    增加一个用户
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    //    删除一个用户
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    //    更新一个用户
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    //    查询一个用户
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    //    查询所有用户
    public User getUsers() {
        return userMapper.getUsers();
    }


}
