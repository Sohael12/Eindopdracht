package be.sohael.projectadvanced.controllers;

import be.sohael.projectadvanced.model.User;
import be.sohael.projectadvanced.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login(Model model) {
        Iterable<User> logins = userRepository.findAll();
        model.addAttribute("logins", logins);
        return "login";
    }



}
