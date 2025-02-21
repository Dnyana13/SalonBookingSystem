package com.salonbooking.service;

import com.salonbooking.model.Salon;
import com.salonbooking.repository.SalonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SalonService {
    @Autowired
    private SalonRepository salonRepository;

    public List<Salon> getAllSalons() {
        return salonRepository.findAll();
    }

    public Optional<Salon> getSalonById(Long id) {
        return salonRepository.findById(id);
    }

    public Salon addSalon(Salon salon) {
        return salonRepository.save(salon);
    }
}
