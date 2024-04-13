package be.sohael.projectadvanced.controllers;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
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
    private JdbcUserDetailsManager jdbcUserDetailsManager;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @GetMapping("/login")
    public String login(Model model, Principal principal) {
        if (principal != null) return "redirect:/sporthall";
        return "user/login";
    }

    @GetMapping("/logout")
    public String logout(Model model, Principal principal) {
        if (principal == null) return "redirect:/sporthall";
        return "user/logout";
    }


    @GetMapping("/register")
    public String register(Principal principal) {
        if (principal != null) return "redirect:/sporthall";
        return "user/register";
    }
    @PostMapping("/register")
    public String registerPost(Principal principal,
                               HttpServletRequest request,
                               @RequestParam String username,
                               @RequestParam String password) throws ServletException {
        if (principal != null) return "redirect:/sporthall";
        if (username == null || username.isBlank()) return "redirect:/sporthall";
        if (jdbcUserDetailsManager.userExists(username)) return "redirect:/sporthall";

        UserDetails user = org.springframework.security.core.userdetails.User
                .withUsername(username)
                .password(passwordEncoder.encode(password))
                .roles("USER")
                .build();
        jdbcUserDetailsManager.createUser(user);

        //autologin:
        request.login(username, password);

        return "redirect:/sporthall";
    }

}
