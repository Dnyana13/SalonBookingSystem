package com.salonbooking.controller;

import com.salonbooking.model.Salon;
import com.salonbooking.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class SalonController {
    @Autowired
    private SalonService salonService;

    @GetMapping("/salon/{id}")
    public String salonProfile(@PathVariable Long id, Model model) {
        Optional<Salon> salon = salonService.getSalonById(id);
        if (salon.isPresent()) {
            model.addAttribute("salon", salon.get());
            return "salon-profile";
        } else {
            return "error";
        }
    }
}
