package be.sohael.projectadvanced.controllers;

import be.sohael.projectadvanced.model.Reservation;
import be.sohael.projectadvanced.repositories.ReservationRepository;
import be.sohael.projectadvanced.repositories.SporthallRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ReservationController {
    private Logger logger = LoggerFactory.getLogger(SporthallRepository.class);
    @Autowired
    private ReservationRepository reservatieRepositroy;


    @GetMapping("/reservationdetails")
    public String sporthallList(org.springframework.ui.Model model) {
        final Iterable<Reservation> allreservations = reservatieRepositroy.findAll();
        model.addAttribute("reservations", allreservations);


        return "reservationdetails";
    }

    @GetMapping({"/reservation/{id}", "/reservation"})
    public String reservation(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "sporthalldetails";

        Optional<Reservation> reservationfromdb = reservatieRepositroy.findById(id);
        model.addAttribute("reservations", reservationfromdb.get());
        return "reservation";
    }




    @GetMapping({"/reservationequipments/{id}","/reservationequipments"})
    public String reservationequipments(Model model, @PathVariable(required = false) Integer id ) {
        if (id == null) return "reservationequipments";

        Optional<Reservation> reservationfromdb = reservatieRepositroy.findById(id);
        model.addAttribute("reservations", reservationfromdb.get());
        return "reservationequipments";
    }

}

