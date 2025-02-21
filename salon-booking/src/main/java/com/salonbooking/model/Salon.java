package com.salonbooking.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "salons")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private double rating;

    @OneToMany(mappedBy = "salon", cascade = CascadeType.ALL)
    private List<Service> services;
}
