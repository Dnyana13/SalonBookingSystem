package com.salonbooking.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    private String paymentMethod;  // Credit Card, UPI, Net Banking
    private double amount;
    private String status;  // SUCCESS, FAILED
}
