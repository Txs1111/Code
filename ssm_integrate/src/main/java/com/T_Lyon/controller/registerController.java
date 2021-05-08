package com.T_Lyon.controller;

import com.T_Lyon.pojo.User;
import com.T_Lyon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class registerController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("verifyUsername")
    @ResponseBody
    public String verifyUsername(String username) {
        User userByName = userService.getUserByName(username);
//        是否长度达标
        if (username.length() > 15)
            return "big15";
        else if (username.length() < 3)
            return "litter3";
        else {
//            是否有空格
            if (username.indexOf(" ") != -1) {
//            username有空格就会返回0
//            System.out.println("1".indexOf(" ") + "11111111111");
                return "blank";
            } else {
//                是否重复
                if (userByName != null)
                    return "exist";
                else if (userByName == null)
                    return "yes";
                else return "no";
            }
        }
    }


    @RequestMapping("/register")
    @ResponseBody
    public String register(String username, String pwd, String pwd2, String result) {
//        前端判断
        if (result.equals("yes")) {
            System.out.println("???????dfdfgseg????");
            String s = verifyUsername(username);
//            用户名判断
            if (s.equals("yes")) {
//                密码为空判断
                if (pwd.indexOf(" ") != 0 && pwd2.indexOf(" ") != 0) {
//                    密码长度判断
                    if (pwd.length() >= 6 && pwd2.length() >= 6) {
//                        密码重复判断
                        if (pwd.equals(pwd2)) {
                            System.out.println("8888888888");
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            Date date = new Date();
                            String format = sdf.format(date);
                            User user = new User();
                            user.setUsername(username);
                            user.setPassword(pwd);
                            user.setLogin_time(format);
                            user.setGrade("0");
                            user.setRole("0");
                            userService.addUser(user);
                            return "success成功注册";
                        } else
                            return "两次密码不同";
                    } else
                        return "密码长度不符合要求";
                } else
                    return "密码中存在空格";
            } else
                return "用户名已存在";
        } else
            return "用户信息不正确";
    }

    @RequestMapping("/registerSub")
    @ResponseBody
    public String registerSub(String username, String result) {
        if (result.equals("yes")) {
            System.out.println("//////////////////?????"+result);
            User userByName = userService.getUserByName(username);
            System.out.println("userByName:" + userByName);
            String id = userByName.getId() + "";
            return id;
        } else
            return "err";
    }
}
