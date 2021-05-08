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

    @RequestMapping("verifyUsername")
    @ResponseBody
    public String verifyUsername(String username) {
        User userByName = userService.getUserByName(username);
        //是否为空
        if (username.indexOf(" ") != -1) {
//            username有空格就会返回0
//            System.out.println("1".indexOf(" ") + "11111111111");
            return "blank";
        } else {
            //是否长度达标
            if (username.length() > 15)
                return "big15";
            else if (username.length() < 3)
                return "litter3";
            else {
                //是否重复
                if (userByName != null)
                    return "exist";
                else if (userByName == null)
                    return "yes";
                else return "no";
            }
        }
    }


    @RequestMapping("/register")
    public String register(String username, String pwd, String pwd2, String result) {
        if (result != null && result.equals("yes")) {
            if (username.indexOf(" ") != 0)
                System.out.println("result:" + result);
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
        } else
            return "redirect:/toRegister";
    }

    @RequestMapping("/registerSub")
    @ResponseBody
    public String registerSub(String username, String result) {
        if (result.equals("yes")) {
            User userByName = userService.getUserByName(username);
            String account = userByName.getId() + "";
            return account;
        } else
            return "exist";
    }
}
