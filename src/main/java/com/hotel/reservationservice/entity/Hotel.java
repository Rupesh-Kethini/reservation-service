package com.hotel.reservationservice.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import lombok.*;

@Entity  //dummy entity in this service
@Table(name = "hotel")
@Getter @Setter @AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class Hotel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "noofusers")
    private Integer noOfUsers;

    // Constructors, getters, and setters
}
