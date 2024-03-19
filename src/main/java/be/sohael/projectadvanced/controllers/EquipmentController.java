package be.sohael.projectadvanced.controllers;


import be.sohael.projectadvanced.model.Equipment;
import be.sohael.projectadvanced.repositories.EquipmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipmentController {
    private Logger logger = LoggerFactory.getLogger(EquipmentRepository.class);
    @Autowired
    private EquipmentRepository equipmentRepository;

    @GetMapping("/sportequipments")
    public String zalen(Model model) {
        Iterable<Equipment> equipments = equipmentRepository.findAll();
        model.addAttribute("equipments", equipments);
        model.addAttribute("showFilters", false);
        return "sportequipments";
    }
}
