package be.sohael.projectadvanced.controllers;

import be.sohael.projectadvanced.model.User;
import be.sohael.projectadvanced.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;
@Controller
public class CustomersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping({"/userdetails/{id}", "/userdetails"})
    public String userdetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "userdetails";
        Optional<User> userfromdb = userRepository.findById(id);
        model.addAttribute("user", userfromdb.get());

        return "userdetails";
    }
}
