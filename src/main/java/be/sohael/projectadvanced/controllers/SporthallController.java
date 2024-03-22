package be.sohael.projectadvanced.controllers;
import be.sohael.projectadvanced.model.Sporthall;
import be.sohael.projectadvanced.repositories.SporthallRepository;
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
public class SporthallController {
    private Logger logger = LoggerFactory.getLogger(SporthallRepository.class);
    @Autowired
    private SporthallRepository zalenRepository;
    @GetMapping("/zalen")
    public String zalen(Model model) {
        Iterable<Sporthall> zalens = zalenRepository.findAll();
        model.addAttribute("zalens", zalens);
        model.addAttribute("showFilters", false);
        return "zalen";
    }
    @GetMapping({"/sporthalldetials/{id}","/sporthalldetials"})
    public String sporthalldetials(Model model, @PathVariable(required = false) Integer id ) {
        if (id == null) return "sporthalldetials";

        Optional<Sporthall> zalenfromdb = zalenRepository.findById(id);
        //noinspection OptionalIsPresent
        if (zalenfromdb.isPresent()) {
            Optional<Sporthall> prevZaalfromdb = zalenRepository.findFirstByIdLessThanOrderByIdDesc(id);
            if (prevZaalfromdb.isEmpty())
                prevZaalfromdb = zalenRepository.findFirstByOrderByIdDesc();
            Optional<Sporthall> nextZaalfromdb = zalenRepository.findFirstByIdGreaterThanOrderByIdAsc(id);
            if (nextZaalfromdb.isEmpty())
                nextZaalfromdb = zalenRepository.findFirstByOrderByIdAsc();

            model.addAttribute("zalen", zalenfromdb.get());
            model.addAttribute("prevId", prevZaalfromdb.get().getId());
            model.addAttribute("nextId", nextZaalfromdb.get().getId());

        }
        return "sporthalldetials";
    }



    @GetMapping("/zalen/filter")
    public String zalenfilter(Model model,
                                  @RequestParam(required = false) Integer mintarief,
                                  @RequestParam(required = false) Integer maxtarief,
                                  @RequestParam(required = false) Boolean kleedkamers,
                                  @RequestParam(required = false) Integer mincapaciteit,
                                  @RequestParam(required = false) Integer maxcapaciteit){

        logger.info(String.format("zalenfilter -- min=%d, max=%d ," , mintarief, maxtarief,kleedkamers,mincapaciteit ,maxcapaciteit));
        List<Sporthall> allzalens = zalenRepository.findbyfilter(mintarief,maxtarief,kleedkamers,mincapaciteit,maxcapaciteit);

        model.addAttribute("mintarief", maxtarief);
        model.addAttribute("maxtarief", maxtarief);
        model.addAttribute("kleedkamers", kleedkamers);
        model.addAttribute("mincapaciteit", mincapaciteit);
        model.addAttribute("maxcapaciteit", maxcapaciteit);
        model.addAttribute("showFilters", true);
        model.addAttribute("zalens", allzalens);
        model.addAttribute("totalZalen", allzalens.size());
        return "zalen";
    }


}
