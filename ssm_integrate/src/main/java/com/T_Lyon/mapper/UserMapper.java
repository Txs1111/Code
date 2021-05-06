package com.T_Lyon.mapper;

import com.T_Lyon.pojo.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    //    增加一个用户
    @Insert("insert into student_ide.user (username,password,login_time,grade,role) values (#{username},#{password},#{login_time},#{grade},#{role})")
    public int addUser(User user);

    //    删除一个用户
    @Delete("delete from student_ide.user where id = #{id}")
    public int deleteUser(@Param("id") int id);

    //    更新一个用户
    @Update("update student_ide.user set username=#{username},password=#{password},login_time=#{login_time},grade=#{grade},role=#{role}")
    public int updateUser(User user);

    //    查询一个用户
    @Select("select * from student_ide.user where username=#{username}")
    public User getUserByName(@Param("username") String username);

    //    查询一个用户
    @Select("select * from student_ide.user where id=#{id}")
    public User getUserByID(@Param("id") int id);

    //    查询所有用户
    @Select("select * from student_ide.user")
    public User getUsers();
}
