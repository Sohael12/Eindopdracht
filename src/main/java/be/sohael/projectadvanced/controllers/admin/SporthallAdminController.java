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

    @ModelAttribute("sporthall")
    public Sporthall findSporthall(@PathVariable(required = false) Integer id) {
        logger.info("findSporthall " + id);
        if (id == null) return new Sporthall();
        Optional<Sporthall> optionalSporthall = sporthallRepository.findById(id);
        if (optionalSporthall.isPresent())
            return optionalSporthall.get();
        return null;
    }

    @GetMapping("/sporthalledit/{id}")
    public String sporthallEdit(Model model, @PathVariable int id) {
        logger.info("Sporthalledit " + id);
        Sporthall sporthall = sporthallRepository.findById(id).orElse(new Sporthall());
        model.addAttribute("sporthall", sporthall);
        return "admin/sporthalledit";
    }


    @PostMapping("/sporthalledit/{id}")
    public String sporthallEditPost(@PathVariable int id,
                                    Sporthall sporthall) {
        logger.info("sporthallEditPost " + id + " -- new name=" + sporthall.getZaalnaam());
        sporthallRepository.save(sporthall);
        return "redirect:/sporthalldetails/" + id;
    }

    @GetMapping("/sporthallnew")
    public String sporthallNew(@RequestParam(required = false) Integer id, Model model) {
        logger.info("sporthallnew ");
        Sporthall sporthall = (id != null) ? sporthallRepository.findById(id).orElse(new Sporthall()) : new Sporthall();
        model.addAttribute("sporthall", sporthall);
        return "admin/sporthallnew";
    }


    @PostMapping("/sporthallnew")
        public String partyNewSporthall(Model model,
                                   Sporthall sporthall) {
            logger.info("sporthallNewPost -- new name=" + sporthall.getZaalnaam() + ", beschrijving=" + sporthall.getBeschrijving());
            Sporthall newSporthall = sporthallRepository.save(sporthall);
            return "redirect:/sporthalldetails/" + newSporthall.getId();
        }

}



