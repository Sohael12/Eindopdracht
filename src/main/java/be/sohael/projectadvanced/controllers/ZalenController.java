package be.sohael.projectadvanced.controllers;
import be.sohael.projectadvanced.model.Zaal;
import be.sohael.projectadvanced.repositories.ZaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
