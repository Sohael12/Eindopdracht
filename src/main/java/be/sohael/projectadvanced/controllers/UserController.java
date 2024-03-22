package be.sohael.projectadvanced.controllers;
import be.sohael.projectadvanced.model.Sporthall;
import be.sohael.projectadvanced.model.User;
import be.sohael.projectadvanced.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Optional;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping({"/login"})
    public String login(Model model) {
        Iterable<User> logins = userRepository.findAll();
        model.addAttribute("logins", logins);
        return "login";
    }

    @GetMapping("/login")
    public String login(Model model, Principal principal) {
        if (principal != null) return "redirect:/sporthalldetials";
        return "user/login";
    }

    @GetMapping("/logout")
    public String logout(Model model, Principal principal) {
        if (principal == null) return "redirect:/sporthalldetials";
        return "user/logout";
    }


    @GetMapping({"/userdetails/{id}", "/userdetails"})
    public String userdetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "userdetails";
        Optional<User> userfromdb = userRepository.findById(id);
        model.addAttribute("user", userfromdb.get());

        return "userdetails";
    }



}