package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


    @PostMapping("/user")
    public String addUser(@ModelAttribute User user) {
        return "redirect:/users";
    }

    @GetMapping("/user/add")
    public ModelAndView createUserView() {
    ModelAndView modelAndView = new ModelAndView("addUser");
        modelAndView.addObject("addUser", new User());
            return modelAndView;
        }

    }

