package com.example.demo4.controller;

import com.example.demo4.entity.User;
import com.example.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
//@RestController
//@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String index(Model model) {
       List<User> users = userService.getAllUser();

       model.addAttribute("users", users);

        return "index";
    }
    @RequestMapping(value = "add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editUser(@RequestParam("id") Long userId, Model model) {
        Optional<User> userEdit = userService.findUserById(userId);
        userEdit.ifPresent(user -> model.addAttribute("user", user));
        return "editUser";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") Long userId, Model model) {
        userService.deleteUser(userId);
        return "redirect:/";
    }

}
