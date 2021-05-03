package com.T_Lyon.service;

import com.T_Lyon.pojo.User;
import org.apache.ibatis.annotations.*;

public interface UserService {
    public int addUser(User user);

    public int deleteUser(int id);

    public int updateUser(User user);

    public User getUserByName(String username);
}
