package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.model.User;
import com.sda.familiada.familiada.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public String addUser(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/user/add")
    public ModelAndView createUserView() {
        ModelAndView modelAndView = new ModelAndView("addUser");
        modelAndView.addObject("addUser", new User());
        return modelAndView;
    }

    @GetMapping("/users")
    public ModelAndView showAllUsers() {
        List<User> users = userService.getUserList();
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("Users", users);
        return modelAndView;

    }
}

