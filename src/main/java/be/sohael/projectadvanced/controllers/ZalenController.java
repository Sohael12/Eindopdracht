package be.sohael.projectadvanced.controllers;
import be.sohael.projectadvanced.model.Zaal;
import be.sohael.projectadvanced.repositories.ZaalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ZalenController {
    private Logger logger = LoggerFactory.getLogger(ZaalRepository.class);
    @Autowired
    private ZaalRepository zalenRepository;
    @GetMapping("/zalen")
    public String zalen(Model model) {
        Iterable<Zaal> zalens = zalenRepository.findAll();
        model.addAttribute("zalens", zalens);
        model.addAttribute("showFilters", false);
        return "zalen";
    }
    @GetMapping({"/zalendetails/{id}","/zalendetails"})
    public String zalendetails(Model model, @PathVariable(required = false) Integer id ) {
        if (id != null) {
            Optional<Zaal> zalenfromDb = zalenRepository.findById(id);
            if (zalenfromDb.isPresent()) {
                final Zaal zalen = zalenfromDb.get();
                model.addAttribute("zalen", zalenfromDb.get());
            }
            }

            return "zalendetails";
        }

    @GetMapping(value = "/zalen", params = "kleedkamers")
    public String venueListOutdoor(Model model, @RequestParam boolean kleedkamers) {
        Iterable<Zaal> zalens = zalenRepository.findBykleedkamers(kleedkamers);
        model.addAttribute("zalens", zalens);
        model.addAttribute("filterkleedkamers", kleedkamers ? "yes" : "no");
        return "zalen";
    }

    @GetMapping("/zalen/filter")
    public String zalenfilter(Model model,
                                  @RequestParam(required = false) Integer mintarief,
                                  @RequestParam(required = false) Integer maxtarief){

        logger.info(String.format("zalenfilter -- min=%d, max=%d", mintarief, maxtarief));
        List<Zaal> allzalens = zalenRepository.findZalenByTariefRange(mintarief,maxtarief );

        model.addAttribute("mintarief", maxtarief);
        model.addAttribute("maxtarief", maxtarief);
        model.addAttribute("showFilters", true);
        return "zalen";
    }


}
