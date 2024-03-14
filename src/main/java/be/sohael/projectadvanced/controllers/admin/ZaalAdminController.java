package be.sohael.projectadvanced.controllers.admin;

import be.sohael.projectadvanced.model.Zaal;
import be.sohael.projectadvanced.repositories.ZaalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RequestMapping("/admin")// geef de path erbij moet is verplicht//
@Controller

public class ZaalAdminController {

        private static final Logger logger = LoggerFactory.getLogger(ZaalAdminController.class);

        @Autowired
        private ZaalRepository zaalRepository;

        @GetMapping("/zaaledit/{id}")
        public String partyEdit(@PathVariable Integer id, Model model) {
            logger.info("Executing partyEdit method for id: {}", id);
            // Haal het Party-object op uit de database
            Zaal zalen = zaalRepository.findById(id).orElse(null);
            // Zet het Party-object klaar in het MVC-model
            model.addAttribute("zalen", zalen);
            return "admin/zaaledit";//

        }

        @ModelAttribute("zaal")
        public Zaal findParty(@PathVariable(required = false) Integer id) {
            logger.info("findParty" + id);
            Optional<Zaal> optionalZaal = zaalRepository.findById(id);
            if (optionalZaal.isPresent())
                return optionalZaal.get();
            return null;
        }


        @PostMapping("/zaaledit/{id}") // het is een post//
        public String partyEdit(@PathVariable Integer id, Zaal zalen) {
            logger.info("zaaleditpost" + id + "-- new name=" + zalen.getZaalnaam());
            zaalRepository.save(zalen);
            return "admin/zaaledit";
        }
    }



