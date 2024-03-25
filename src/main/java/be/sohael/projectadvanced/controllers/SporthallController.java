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
    private SporthallRepository sporthallRepository;
    @GetMapping("/sporthall")
    public String sporthall(Model model) {
        Iterable<Sporthall> sporthalls = sporthallRepository.findAll();
        model.addAttribute("sporthalls", sporthalls);
        model.addAttribute("showFilters", false);
        return "sporthall";
    }
    @GetMapping({"/sporthalldetails/{id}","/sporthalldetails"})
    public String sporthalldetails(Model model, @PathVariable(required = false) Integer id ) {
        if (id == null) return "sporthalldetails";

        Optional<Sporthall> sporthallfromdb = sporthallRepository.findById(id);
        //noinspection OptionalIsPresent
        if (sporthallfromdb.isPresent()) {
            Optional<Sporthall> prevSporthallfromdb = sporthallRepository.findFirstByIdLessThanOrderByIdDesc(id);
            if (prevSporthallfromdb.isEmpty())
                prevSporthallfromdb = sporthallRepository.findFirstByOrderByIdDesc();
            Optional<Sporthall> nextSporthallfromdb = sporthallRepository.findFirstByIdGreaterThanOrderByIdAsc(id);
            if (nextSporthallfromdb.isEmpty())
                nextSporthallfromdb = sporthallRepository.findFirstByOrderByIdAsc();

            model.addAttribute("sporthall", sporthallfromdb.get());
            model.addAttribute("prevId", prevSporthallfromdb.get().getId());
            model.addAttribute("nextId", nextSporthallfromdb.get().getId());

        }


        return "sporthalldetails";
    }



    @GetMapping("/sporthall/filter")
    public String sporthallfilter(Model model,
                                  @RequestParam(required = false) Integer mintarief,
                                  @RequestParam(required = false) Integer maxtarief,
                                  @RequestParam(required = false) Boolean kleedkamers,
                                  @RequestParam(required = false) Integer mincapaciteit,
                                  @RequestParam(required = false) Integer maxcapaciteit){

        logger.info(String.format("sporthallfilter -- min=%d, max=%d ," , mintarief, maxtarief,kleedkamers,mincapaciteit ,maxcapaciteit));
        List<Sporthall> allsporthalls = sporthallRepository.findbyfilter(mintarief,maxtarief,kleedkamers,mincapaciteit,maxcapaciteit);

        model.addAttribute("mintarief", maxtarief);
        model.addAttribute("maxtarief", maxtarief);
        model.addAttribute("kleedkamers", kleedkamers);
        model.addAttribute("mincapaciteit", mincapaciteit);
        model.addAttribute("maxcapaciteit", maxcapaciteit);
        model.addAttribute("showFilters", true);
        model.addAttribute("sporthalls", allsporthalls);

        return "sporthall";
    }


}
