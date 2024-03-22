package be.sohael.projectadvanced.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;




@Controller
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping({ "/", "/home"})
    public String home(Model model, Principal principal) {
        final String loginName  = principal != null ? principal.getName():null;
        model.addAttribute("loginName", loginName);
    logger.info("loginpage - logged in as " +loginName );

        return "home";
    }
    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("myName", "Sohael El Makkaou");
        model.addAttribute("myStreet", "Kerkstraat 15 2060 Antwerpen ");
        model.addAttribute("contactPhone", "+32 489 92 57 35");
        model.addAttribute("pictureLink", "/images/sohael.jpg");
        model.addAttribute("instagramLink", "https://www.instagram.com/bigshotsoso/");
        model.addAttribute("linkinLink", "https://www.linkedin.com/in/sohael-el-makkaoui/");
        model.addAttribute("facebookLink", "https://www.facebook.com/sohael.makk/");
        model.addAttribute("githubLink", "https://github.com/Sohael12");
        return "contact";
    }

}