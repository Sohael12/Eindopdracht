package be.sohael.projectadvanced.controllers.admin;

import be.sohael.projectadvanced.model.Sporthall;
import be.sohael.projectadvanced.repositories.SporthallRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RequestMapping("/admin")// geef de path erbij moet is verplicht//
@Controller

public class SporthallAdminController {

        private static final Logger logger = LoggerFactory.getLogger(SporthallAdminController.class);

        @Autowired
        private SporthallRepository sporthallRepository;

        @GetMapping("/zaaledit/{id}")
        public String partyEdit(@PathVariable Integer id, Model model) {
            logger.info("Executing partyEdit method for id: {}", id);
            // Haal het Party-object op uit de database
            Sporthall zalen = sporthallRepository.findById(id).orElse(null);
            // Zet het Party-object klaar in het MVC-model
            model.addAttribute("sporthall", zalen);
            return "admin/zaaledit";//

        }

        @ModelAttribute("zaal")
        public Sporthall findParty(@PathVariable(required = false) Integer id) {
            logger.info("findParty" + id);
            Optional<Sporthall> optionalZaal = sporthallRepository.findById(id);
            if (optionalZaal.isPresent())
                return optionalZaal.get();
            return null;
        }


        @PostMapping("/zaaledit/{id}") // het is een post//
        public String partyEdit(@PathVariable Integer id, Sporthall zalen) {
            logger.info("zaaleditpost" + id + "-- new name=" + zalen.getZaalnaam());
            sporthallRepository.save(zalen);
            return "admin/zaaledit";
        }

    @GetMapping("/zaalnew")
    public String partyNew(Model model) {
        logger.info("zaalnew ");
        model.addAttribute("zalen", sporthallRepository.findAll());
        return "admin/partynew";
    }

    @PostMapping("/zaalnew")
    public String partyNewPost(Model model,
                               Sporthall sporthall) {
        logger.info("sporthallNewPost -- new zaalnaam=" + sporthall.getZaalnaam() + ", locatie=" + sporthall.getLocatie());
        Sporthall newSporthall = sporthallRepository.save(sporthall);
        return "redirect:/sporthalldetials/" + newSporthall.getId();
    }

}



