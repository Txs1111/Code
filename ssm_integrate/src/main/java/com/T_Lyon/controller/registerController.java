package com.T_Lyon.controller;

import com.T_Lyon.pojo.User;
import com.T_Lyon.service.UserService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("verifyAccount")
    @ResponseBody
    public String verifyAccount(String username) {
        User userByName = userService.getUserByName(username);
        if (userByName == null)
            return "yes";
        else return "no";
    }

    @RequestMapping("/register")
    public String register(String username, String pwd, String username2, String pwd2) {

        if (username2 == null && username2.equals("no")) {
            return "redirect:/toRegister";
        } else if (username == null || pwd == null || pwd2 == null) {
            return "redirect:/toRegister";
        } else if (username.indexOf(" ") + pwd.indexOf(" ") + pwd2.indexOf(" ") > 0) {
            return "redirect:/toRegister";
        } else {
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
            return "redirect:/index.jsp";
        }
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(String username, String username2) {
        User userByName = userService.getUserByName(username);
        String account = userByName.getId() + "";
        return account;
    }
}
