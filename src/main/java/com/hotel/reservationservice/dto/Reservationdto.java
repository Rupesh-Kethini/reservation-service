package com.hotel.reservationservice.dto;

import com.hotel.reservationservice.enums.ReservationStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Reservationdto {
    private Long id;
    private Customer customer;
    private Room room;
    private LocalDateTime checkInDate;
    private LocalDateTime checkOutDate;
    private BigDecimal totalPrice;
    private LocalDateTime reservationDate;
    private ReservationStatus status;
}
