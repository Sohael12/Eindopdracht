package be.sohael.projectadvanced.controllers;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new SecurityProperties.User());
        return "login";
    }

    @PostMapping("/login")
    public String processLoginForm(SecurityProperties.User user) {

        return "login";
    }
}
