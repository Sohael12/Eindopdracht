package be.sohael.projectadvanced.controllers;

import be.sohael.projectadvanced.model.Reservatie;
import be.sohael.projectadvanced.repositories.ReservatieRepositroy;
import be.sohael.projectadvanced.repositories.SporthallRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservatieController {
    private Logger logger = LoggerFactory.getLogger(SporthallRepository.class);
    @Autowired
    private ReservatieRepositroy reservatieRepositroy;


    @GetMapping("/reservatiedetails")
    public String venueList(org.springframework.ui.Model model) {
        final Iterable<Reservatie> allreservatie = reservatieRepositroy.findAll();
        model.addAttribute("reservaties", allreservatie);


        return "reservatiedetails";
    }

}

