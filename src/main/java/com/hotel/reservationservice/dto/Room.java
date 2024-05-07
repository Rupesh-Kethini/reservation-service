package com.hotel.reservationservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room {
    @JsonIgnore
    private Integer id;

    private Hotel hotel;

    private String roomNumber;

    private String roomType;
    @JsonIgnore
    private double price;

}