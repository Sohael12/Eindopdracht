package be.sohael.projectadvanced.controllers;
import be.sohael.projectadvanced.model.Zaal;
import be.sohael.projectadvanced.repositories.ZaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ZalenController {

    @Autowired
    private ZaalRepository zalenRepository;
    @GetMapping("/zalen")
    public String zalen(Model model) {
        Iterable<Zaal> zalens = zalenRepository.findAll();
        model.addAttribute("zalens", zalens);
        return "zalen";
    }

    @GetMapping(value = "/zalen", params = "kleedkamers")
    public String venueListOutdoor(Model model, @RequestParam boolean kleedkamers) {
        Iterable<Zaal> zalens = zalenRepository.findBykleedkamers(kleedkamers);
        model.addAttribute("zalens", zalens);
        model.addAttribute("filterkleedkamers", kleedkamers ? "yes" : "no");
        return "zalen";
    }


}
