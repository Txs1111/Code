package com.T_Lyon.service;

import com.T_Lyon.mapper.UserMapper;
import com.T_Lyon.pojo.User;
import org.apache.ibatis.annotations.Param;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    //    setע��
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //    ����һ���û�
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    //    ɾ��һ���û�
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    //    ����һ���û�
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    //    ��ѯһ���û�
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    //    ��ѯ�����û�
    public User getUsers() {
        return userMapper.getUsers();
    }


}
