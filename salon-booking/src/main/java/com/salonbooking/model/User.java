package com.salonbooking.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String role;  // ADMIN, USER

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
