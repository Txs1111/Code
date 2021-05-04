package com.T_Lyon.service;

import com.T_Lyon.pojo.User;
import org.apache.ibatis.annotations.*;

public interface UserService {
    //    ����һ���û�
    public int addUser(User user);

    //    ɾ��һ���û�
    public int deleteUser(@Param("id") int id);

    //    ����һ���û�
    public int updateUser(User user);

    //    ��ѯһ���û�
    public User getUserByName(@Param("username") String username);

    //    ��ѯ�����û�
    public User getUsers();

}
