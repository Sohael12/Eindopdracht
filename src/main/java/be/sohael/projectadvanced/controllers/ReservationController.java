package be.sohael.projectadvanced.controllers;

import be.sohael.projectadvanced.model.Reservation;
import be.sohael.projectadvanced.repositories.ReservationRepository;
import be.sohael.projectadvanced.repositories.SporthallRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationController {
    private Logger logger = LoggerFactory.getLogger(SporthallRepository.class);
    @Autowired
    private ReservationRepository reservatieRepositroy;


    @GetMapping("/reservatiedetails")
    public String sporthallList(org.springframework.ui.Model model) {
        final Iterable<Reservation> allreservatie = reservatieRepositroy.findAll();
        model.addAttribute("reservaties", allreservatie);


        return "reservatiedetails";
    }

}

