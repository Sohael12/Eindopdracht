package be.sohael.projectadvanced.controllers;
import be.sohael.projectadvanced.model.Sporthall;
import be.sohael.projectadvanced.model.User;
import be.sohael.projectadvanced.repositories.UserRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;



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
    @GetMapping("/register")
    public String register(Principal principal) {
        if (principal != null) return "redirect:/sporthalldetials";
        return "user/register";
    }


}