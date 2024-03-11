package be.sohael.projectadvanced.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservatieController {
    @GetMapping({"/reservatiedetails"})
    public String reservatiedetails(Model model) {

        return "reservatiedetails";
    }
}
