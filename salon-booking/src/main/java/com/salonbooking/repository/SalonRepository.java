package com.salonbooking.repository;

import com.salonbooking.model.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonRepository extends JpaRepository<Salon, Long> {
}

