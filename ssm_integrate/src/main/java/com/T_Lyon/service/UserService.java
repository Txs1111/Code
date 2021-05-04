package com.T_Lyon.service;

import com.T_Lyon.pojo.User;
import org.apache.ibatis.annotations.*;

public interface UserService {
    //    增加一个用户
    public int addUser(User user);

    //    删除一个用户
    public int deleteUser(@Param("id") int id);

    //    更新一个用户
    public int updateUser(User user);

    //    查询一个用户
    public User getUserByName(@Param("username") String username);

    //    查询所有用户
    public User getUsers();

}
