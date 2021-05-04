package com.T_Lyon.controller;

import com.T_Lyon.pojo.User;
import com.T_Lyon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/getAllUser")
    public String getAllUser(Model model) {
        User userByName = userService.getUserByName("1");
        Model username = model.addAttribute("username", userByName);
        return "getAllUser";
    }

    @RequestMapping("/login")
    public String login(Model model, String username) {
        User users = userService.getUserByName(username);
        Model model1 = model.addAttribute("User", "users");
        return "forward:/index.jsp";
    }

}
