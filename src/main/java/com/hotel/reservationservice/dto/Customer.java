package com.hotel.reservationservice.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long customerId;

    private String firstName;

    private String lastName;

    private String email;
    @JsonIgnore
    private String phone;

}
