package be.sohael.projectadvanced.controllers;
import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class ZalenController {
        @GetMapping({ "/zalen"})
        public String zalen(Model model) {

            return "zalen";
        }
}
