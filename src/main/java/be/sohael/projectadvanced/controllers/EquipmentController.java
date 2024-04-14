package be.sohael.projectadvanced.controllers;


import be.sohael.projectadvanced.model.Equipment;
import be.sohael.projectadvanced.repositories.EquipmentRepository;
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
public class EquipmentController {
    private Logger logger = LoggerFactory.getLogger(EquipmentRepository.class);
    @Autowired
    private EquipmentRepository equipmentRepository;

    @GetMapping("/sportequipments")
    public String sportequipments(Model model) {
        Iterable<Equipment> equipments = equipmentRepository.findAll();
        model.addAttribute("equipments", equipments);
        model.addAttribute("showFilters", false);
        return "sportequipments";
    }


    @GetMapping({"/equipmentsdetails/{id}", "/equipmentsdetails"})
    public String equipmentsdetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "equipmentsdetails";
        Optional<Equipment> equipmentfromdb = equipmentRepository.findById(id);
        model.addAttribute("equipment", equipmentfromdb.get());

        return "equipmentsdetails";
    }


    @GetMapping("/sportequipments/filter")
    public String equipmentfilter(Model model,
                                  @RequestParam(required = false) Integer minprice,
                                  @RequestParam(required = false) Integer maxprice,
                                  @RequestParam(required = false) Boolean available ) {
        logger.info(String.format("equipmentfilter -- min=%d, max=%d ,", minprice, maxprice,available));
        List<Equipment> allequiments = equipmentRepository.findbyfilter(minprice, maxprice,available);
        model.addAttribute("minprice", minprice);
        model.addAttribute("maxprice", maxprice);
        model.addAttribute("available", available);
        model.addAttribute("equipments", allequiments);
        model.addAttribute("showFilters", true);
        return "sportequipments";
    }
}