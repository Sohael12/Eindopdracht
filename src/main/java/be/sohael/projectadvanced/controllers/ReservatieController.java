package be.sohael.projectadvanced.controllers;

import be.sohael.projectadvanced.model.Reservatie;
import be.sohael.projectadvanced.repositories.ReservatieRepositroy;
import be.sohael.projectadvanced.repositories.ZaalRepository;
import ch.qos.logback.core.model.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ReservatieController {
    private Logger logger = LoggerFactory.getLogger(ZaalRepository.class);
    @Autowired
    private ReservatieRepositroy reservatieRepositroy;


    @GetMapping("/reservatiedetails")
    public String venueList(org.springframework.ui.Model model) {
        final Iterable<Reservatie> allreservatie = reservatieRepositroy.findAll();
        model.addAttribute("reservaties", allreservatie);


        return "reservatiedetails";
    }

}

