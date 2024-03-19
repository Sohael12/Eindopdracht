package be.sohael.projectadvanced.controllers;

import be.sohael.projectadvanced.model.User;
import be.sohael.projectadvanced.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping({"/login"})
    public String login(Model model) {
        Iterable<User> logins = userRepository.findAll();
        model.addAttribute("logins", logins);
        return "login";
    }

    @GetMapping({"/userdetail"})
    public String zalendetails(Model model) {
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("user",users);
        return "userdetail";
    }
}