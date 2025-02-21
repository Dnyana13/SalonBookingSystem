package com.salonbooking.controller;

import com.salonbooking.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private SalonService salonService;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("salons", salonService.getAllSalons());
        return "home";
    }
}
