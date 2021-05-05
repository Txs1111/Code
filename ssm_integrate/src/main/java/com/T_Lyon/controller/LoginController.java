package com.T_Lyon.controller;

import com.T_Lyon.pojo.User;
import com.T_Lyon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/getAllUser")
    public String getAllUser(Model model) {
        User userByName = userService.getUserByName("1");
        Model username = model.addAttribute("username", userByName);
        return "getAllUser";
    }

    @RequestMapping("/verify")
    @ResponseBody
    public String verify(String username, String pwd) {
        String Info = "";
        User users = userService.getUserByName(username);
        System.out.println(users);
        if (users != null) {
            Info = "ok";
            if (pwd.equals(users.getPassword())) {
                Info = "true";
            }
        } else {
            Info = "err";
        }
        return Info;
    }

    @RequestMapping("/login")
    public String login(Model model, String username, String pwd) {
        User userByName = userService.getUserByName(username);
        System.out.println("userByName:" + userByName);

        if (userByName != null) {
            if (pwd.equals(userByName.getPassword())) {
                System.out.println("pwd.equals(userByName.getPassword())" + pwd.equals(userByName.getPassword()));
                Model user = model.addAttribute("user", userByName);
                return "home";
            } else {
                Model user = null;
                return "redirect:/index.jsp";
            }
        } else {
            Model user = null;
            return "redirect:/index.jsp";
        }
    }
}
