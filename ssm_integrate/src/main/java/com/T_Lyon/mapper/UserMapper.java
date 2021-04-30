package com.T_Lyon.mapper;

import com.T_Lyon.pojo.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
//    @Insert("insert into student_ide.user (username,password,login_time,grade,role) values (#{username},#{password},#{login_time},#{grade},#{role})")
//    public int addUser(User user);
//
//    @Delete("delete from student_ide.user where id = #{id}")
//    public int deleteUser(@Param("id") int id);
//
//    @Update("update student_ide.user set username=#{username},password=#{password},login_time=#{login_time},grade=#{grade},role=#{role}")
//    public int updateUser(User user);

    @Select("select * from student_ide.user where username=#{username}")
    public User getUserByName(@Param("username") String username);
}
