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
        if (id == null) return "venuedetails";

        Optional<Zaal> zalenfromdb = zalenRepository.findById(id);
        //noinspection OptionalIsPresent
        if (zalenfromdb.isPresent()) {
            Optional<Zaal> prevZaalfromdb = zalenRepository.findFirstByIdLessThanOrderByIdDesc(id);
            if (prevZaalfromdb.isEmpty())
                prevZaalfromdb = zalenRepository.findFirstByOrderByIdDesc();
            Optional<Zaal> nextZaalfromdb = zalenRepository.findFirstByIdGreaterThanOrderByIdAsc(id);
            if (nextZaalfromdb.isEmpty())
                nextZaalfromdb = zalenRepository.findFirstByOrderByIdAsc();

            model.addAttribute("zalen", zalenfromdb.get());
            model.addAttribute("prevId", prevZaalfromdb.get().getId());
            model.addAttribute("nextId", nextZaalfromdb.get().getId());

        }
        return "zalendetails";
    }



    @GetMapping("/zalen/filter")
    public String zalenfilter(Model model,
                                  @RequestParam(required = false) Integer mintarief,
                                  @RequestParam(required = false) Integer maxtarief,
                                  @RequestParam(required = false) Integer capaciteit,
                                  @RequestParam(required = false) Boolean kleedkamers ){

        logger.info(String.format("zalenfilter -- min=%d, max=%d , cap=%d" , mintarief, maxtarief,capaciteit ,kleedkamers ));
        List<Zaal> allzalens = zalenRepository.findZalenByTariefRange(mintarief,maxtarief,capaciteit,kleedkamers);

        model.addAttribute("mintarief", maxtarief);
        model.addAttribute("maxtarief", maxtarief);
        model.addAttribute("capaciteit", capaciteit);
        model.addAttribute("kleedkamers", kleedkamers);
        model.addAttribute("showFilters", true);
        model.addAttribute("zalens", allzalens);
        model.addAttribute("totalZalen", allzalens.size());
        return "zalen";
    }


}
