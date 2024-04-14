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

        Optional<Sporthall> optionalSporthall  = sporthallRepository.findById(id);
        //noinspection OptionalIsPresent
        if (optionalSporthall.isPresent()) {
            Optional<Sporthall> prevSporthallfromdb = sporthallRepository.findFirstByIdLessThanOrderByIdDesc(id);
            if (prevSporthallfromdb.isEmpty())
                prevSporthallfromdb = sporthallRepository.findFirstByOrderByIdDesc();
            Optional<Sporthall> nextSporthallfromdb = sporthallRepository.findFirstByIdGreaterThanOrderByIdAsc(id);
            if (nextSporthallfromdb.isEmpty())
                nextSporthallfromdb = sporthallRepository.findFirstByOrderByIdAsc();

            model.addAttribute("sporthall", optionalSporthall.get());
            model.addAttribute("prevId", prevSporthallfromdb.get().getId());
            model.addAttribute("nextId", nextSporthallfromdb.get().getId());

        }


        return "sporthalldetails";
    }



    @GetMapping("/sporthall/filter")
    public String sporthallfilter(Model model,
                                  @RequestParam(required = false) Integer minrate,
                                  @RequestParam(required = false) Integer maxrate,
                                  @RequestParam(required = false) Boolean dressingroom,
                                  @RequestParam(required = false) Integer mincapacity,
                                  @RequestParam(required = false) Integer maxcapacity){

        logger.info(String.format("sporthallfilter -- minrate=%d, maxrate=%d, dressingroom=%s, mincapacity=%d, maxcapacity=%d" , minrate, maxrate,dressingroom,mincapacity ,maxcapacity));
        List<Sporthall> allsporthalls = sporthallRepository.findbyfilter(minrate,maxrate,dressingroom,mincapacity,maxcapacity);

        model.addAttribute("minrate", minrate);
        model.addAttribute("maxrate", maxrate);
        model.addAttribute("dressingroom", dressingroom);
        model.addAttribute("mincapacity", mincapacity);
        model.addAttribute("maxcapacity", maxcapacity);
        model.addAttribute("showFilters", true);
        model.addAttribute("sporthalls", allsporthalls);

        return "sporthall";
    }


}
