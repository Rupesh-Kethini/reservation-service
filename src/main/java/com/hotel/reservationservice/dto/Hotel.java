package com.hotel.reservationservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class Hotel {
    private String name;
    private String location;
    @JsonIgnore
    private String description;
    @JsonIgnore
    private Double rating;
    @JsonIgnore
    private Integer noOfUsers;

}
